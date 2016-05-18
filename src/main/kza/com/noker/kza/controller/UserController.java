package com.noker.kza.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.jms.Session;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.velocity.tools.generic.DateTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.RequestPartServletServerHttpRequest;

import com.alibaba.fastjson.JSON;
import com.mysql.fabric.xmlrpc.base.Data;
import com.noker.kza.auth.AuthPassport;
import com.noker.kza.model.Article;
import com.noker.kza.model.User;
import com.noker.kza.service.ArticlesService;
import com.noker.kza.service.DoctorsService;
import com.noker.kza.service.MpUserService;
import com.noker.kza.service.PatientsService;
import com.noker.kza.service.UserService;
import com.noker.kza.service.CaseRecordService;
import com.noker.kza.util.Utils;
import com.noker.kza.util.MD5;
import com.noker.kza.service.DoctorsService;
import com.noker.kza.bean.Articles;
import com.noker.kza.bean.Doctor;
import java.util.List;
import com.noker.kza.service.PatientsService;
import com.noker.kza.bean.Patient;
import com.noker.kza.model.CaseRecord;
import com.noker.kza.model.MpUser;
import com.noker.kza.model.MpUserKey;
import com.noker.kza.bean.Page;

@Controller
@RequestMapping("/user") // 这是管理员的
public class UserController extends BaseController {
	static final Logger logger = LogManager.getLogger(UserController.class);
	@Autowired // @Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 通过
				// @Autowired的使用来消除 set ，get方法，说白了就是自动完成get和set方法
	private UserService userService;
	@Autowired
	private DoctorsService doctorsService;
	@Autowired
	private PatientsService patientsService;
	@Autowired
	private ArticlesService articlesService;
	@Autowired
	private CaseRecordService caseRecordService;
	@Autowired
	private MpUserService mpUserService;

	/**
	 * @Title :login
	 * @Description :登录页面提交用户名和密码的校验，反馈,这里使用的是responseBody给前端返回的是json格式的数据，
	 *              让前端可以做出判断
	 */
	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest request, // 接收来自http servlet请求
			String username, String password) {
		User user = userService.selectByPrimaryKey(username);
		Map<String, String> map = new HashMap<String, String>();
		if (StringUtils.isBlank(username)) {
			map.put("mes", "1000");
			return JSON.toJSONString(map);
		} else if (StringUtils.isBlank(user.getUserId())) {
			map.put("mes", "1001");
			return JSON.toJSONString(map);
		} else if (StringUtils.isBlank(password)) {
			map.put("mes", "1002");
			return JSON.toJSONString(map);
		} else if (!MD5.GetMD5Code(password).equals(user.getUserPw())) {
			map.put("mes", "1003");
			return JSON.toJSONString(map);
		} else {
			map.put("mes", "1004");
			HttpSession session = request.getSession();
			session.setAttribute("userId", user.getUserId());
			return JSON.toJSONString(map);
		}
	}

	/**
	 * @Title :index
	 * @Description :在这里返回的是一个空的首页页面，加载首页之后会自动执行js文件，然后通过js加载其他的小页面，
	 *              我感觉这种方式很合理，在后期修改局部模块时可进行单独设计，而互不影响
	 */
	@AuthPassport
	@RequestMapping("/index")
	public String index(ModelMap modelMap) {
		return "/user/index";
	}

	/**
	 * @Title :Statistic 首页统计模块的实现方法
	 * @Description :首页统计模块的实现方法,已经注册医生的人数统计，文章总数的统计，患者人数的统计
	 */
	@AuthPassport
	@RequestMapping("/Statistic")
	public String iStatistic(ModelMap modelMap) {
		return "/user/Statistic";
	}

	/**
	 * @Title :Article
	 * @Description :这个是iArticle.html中的文章列表页面Article，显示方式：按页面分页来显示 List
	 *              <Article> articles = articlesService.selectAllArticle(); int
	 *              artcount = articlesService.count(); int sh = artcount / 5; 商
	 *              int re = artcount % 5; 余数,如果余数大于0的话就表明还有一个页面但是这个页面的文章数少于5篇
	 *              if (re > 0) { int page = sh + re; 提供总的翻页页数 } else { int page
	 *              = sh; }
	 */
	@AuthPassport
	@RequestMapping("/Article")
	public String Article(HttpServletRequest request, ModelMap modelMap, Integer num) {
		Page pageinfo = new Page();/* 一个bean类，提供了set和get方法，提供页面翻页的信息nex pre */
		HttpSession session = request.getSession();
		/*
		 * 以下是实现方法的思路，大概是这样的，页面上提供三个翻页按钮，123，和前进
		 * ，后退，123post三个数值进行翻页，然后前后就提供前后翻页的功能，文章的编排顺序是按照时间来的，最新文章排在前面，
		 * 提供三个页面也就足够了，要想看之后的也就只能通过向后翻页按钮了，如何实现呢，这是个问题，123是固定的翻页就是05,55,10,5这样的，
		 * 前后按钮稍微复杂点，前后的通过当前页面的页数来进行判断，然后实现翻页，看下面代码吧！
		 */
		if (num == null) {/* 这是默认页面，也就是第一页，按时间来的最新文章列表 */
			pageinfo.setPre(0);
			pageinfo.setNex(8);
			session.setAttribute("num", 1);
		} else if (num == 1) {/* 按钮1 */
			pageinfo.setPre(0);
			pageinfo.setNex(8);
			session.setAttribute("num", num);
		} else if (num == 2) {/* 按钮2 */
			pageinfo.setPre(5);
			pageinfo.setNex(8);
			session.setAttribute("num", num);
		} else if (num == 3) {/* 按钮3 */
			pageinfo.setPre(16);
			pageinfo.setNex(8);
			session.setAttribute("num", num);
		}
		List<Article> articles = articlesService.pageArticl(pageinfo);
		pageinfo.setPage((Integer) session.getAttribute("num"));
		modelMap.addAttribute("articles", articles);
		modelMap.addAttribute("pageinfo", pageinfo);
		return "/user/Article";
	}

	/**
	 * @Description :翻页前后按钮的实现方法，不完美，待修改
	 */
	@AuthPassport
	@RequestMapping("/pArticle")
	public String pArticle(HttpServletRequest request, ModelMap modelMap, Integer pn) {
		int artcount = articlesService.count();
		Page pageinfo = new Page();
		HttpSession session = request.getSession();
		if (pn == 0) {/* 按钮1 */
			Integer num = (Integer) session.getAttribute("num");
			if (num == 1) {
				pageinfo.setPre(0);
				pageinfo.setNex(8);
				session.setAttribute("num", num);/* 刷新页面数 */
			} else {
				pageinfo.setPre((num - 2) * 8);
				pageinfo.setNex(8);
				session.setAttribute("num", num - 1);/* 刷新页面数 */
			}
		} else if (pn == 1) {
			Integer page = null;
			int sh = artcount / 8;/* 商 */
			int re = artcount % 8;/* 余数,如果余数大于0的话就表明还有一个页面但是这个页面的文章数少于5篇 */
			if (re > 0) {
				page = sh + 1;/* 提供总的翻页页数 */
			} else {
				page = sh;
			}
			Integer num = (Integer) session.getAttribute("num");
			if (num == page) {
				pageinfo.setPre((num - 1) * 8);
				pageinfo.setNex(8);
			} else {
				pageinfo.setPre(num * 8);
				pageinfo.setNex(8);
				session.setAttribute("num", num + 1);/* 刷新页面数 */
			}
		}
		List<Article> articles = articlesService.pageArticl(pageinfo);
		pageinfo.setPage((Integer) session.getAttribute("num"));
		modelMap.addAttribute("articles", articles);
		modelMap.addAttribute("pageinfo", pageinfo);
		return "/user/Article";
	}

	/**
	 * @Title :Doctor
	 * @Description :页面分页显示医生的列表通文章列表显示的方法一样，分页页面一直是个问题，有待解决，但是实在没有好的方法
	 *              不过有大致的思路就是可以通过，ajax传值的方式来代替事务，这样做的优点明显可见
	 * @Idear :大概思路是这样子的，可以在前端写一个js有三个方法翻页功能（暂时不能实现智能的页面流动），向前翻页功能和向下翻页功能
	 *        向后台传的值是当前页面,这样就可以替代事务翻页
	 */
	@AuthPassport
	@RequestMapping("/Doctor")
	public String Doctor(HttpServletRequest request, ModelMap modelMap, Integer num) {
		Page pageinfo = new Page();/* 一个bean类，提供了set和get方法，提供页面翻页的信息nex pre */
		HttpSession session = request.getSession();
		if (num == null) {/* 这是默认页面，也就是第一页，按时间注册的医生列表 */
			pageinfo.setPre(0);
			pageinfo.setNex(3);
			session.setAttribute("num", 1);
		} else if (num == 1) {/* 按钮1 */
			pageinfo.setPre(0);
			pageinfo.setNex(3);
			session.setAttribute("num", num);
		} else if (num == 2) {/* 按钮2 */
			pageinfo.setPre(3);
			pageinfo.setNex(3);
			session.setAttribute("num", num);
		} else if (num == 3) {/* 按钮3 */
			pageinfo.setPre(6);
			pageinfo.setNex(3);
			session.setAttribute("num", num);
		}
		List<Doctor> doctors = doctorsService.pageDoctor(pageinfo);
		pageinfo.setPage((Integer) session.getAttribute("num"));
		modelMap.addAttribute("doctors", doctors);
		modelMap.addAttribute("pageinfo", pageinfo);
		return "/user/Doctor";
	}

	/**
	 * @Description :翻页前后按钮的实现方法，打算修改他，把他和上面的Doctor合并，这样写代码的复用率不高，代码量大，不合理
	 */
	@AuthPassport
	@RequestMapping("/pDoctor")
	public String pDoctor(HttpServletRequest request, ModelMap modelMap, Integer pn) {
		int doccount = doctorsService.countDoctor();
		Page pageinfo = new Page();
		HttpSession session = request.getSession();
		if (pn == 0) {
			Integer num = (Integer) session.getAttribute("num");
			if (num == 1) {
				pageinfo.setPre(0);
				pageinfo.setNex(3);
				session.setAttribute("num", num);
			} else {
				pageinfo.setPre((num - 2) * 3);
				pageinfo.setNex(3);
				session.setAttribute("num", num - 1);
			}
		} else if (pn == 1) {
			Integer page = null;
			int sh = doccount / 3;/* 商 */
			int re = doccount % 3;/* 余数,如果余数大于0的话就表明还有一个页面但是这个页面的医生数少于3个 */
			if (re > 0) {
				page = sh + 1;/* 提供总的翻页页数 */
			} else {
				page = sh;
			}
			Integer num = (Integer) session.getAttribute("num");
			if (num == page) {
				pageinfo.setPre((num - 1) * 3);
				pageinfo.setNex(3);
			} else {
				pageinfo.setPre(num * 3);
				pageinfo.setNex(3);
				session.setAttribute("num", num + 1);/* 刷新页面数 */
			}
		}
		List<Doctor> doctors = doctorsService.pageDoctor(pageinfo);
		pageinfo.setPage((Integer) session.getAttribute("num"));
		modelMap.addAttribute("doctors", doctors);
		modelMap.addAttribute("pageinfo", pageinfo);
		return "/user/Doctor";
	}

	/**
	 * 
	 * @Description :网站首页的文章列表查询，后台代码具体实现方法很简单，就是查表
	 */
	@AuthPassport
	@RequestMapping("/iArt") /* 这是网站首页显示的最新文章列表 */
	public String iArt(HttpServletRequest request, ModelMap modelMap) throws FileNotFoundException {
		List<Article> articles = articlesService.selectAllArticle();
		DateTool dateTool = new DateTool();
		modelMap.addAttribute("dateTool", dateTool);/* velocity日期格式工具 */
		modelMap.addAttribute("articles", articles);
		return "/user/iArt";
	}

	/**
	 * 
	 * @Description :文章添加，插表的操作，就是很单纯的向数据表中添加文章和作者
	 *              由于采用的是文档编辑器，在文章存储的时候有点问题就是，文章的内容比较大，需要在服务器上面建一个文件夹，
	 *              把文章详情存储为html格式的文件
	 *              然后把文件存储的地址给数据表存着，在读文章的时候就可以把地址拼接起来打开相应的文章html文件
	 * 
	 */
	@AuthPassport
	@RequestMapping("/addarticle")
	public String addarticle(HttpServletRequest request, ModelMap modelMap, String title, String content,
			String summary) throws FileNotFoundException {
		Article addArt = new Article();
		Date date = new Date();/* 获取本地时间 */
		addArt.setAtTime(date);/* 设置时间 */
		addArt.setTitle(title);/* 添加标题 */
		/* addArt.setLogo(logo); 添加文章logo */
		addArt.setSummary(summary);/* 添加文章的摘由，为文章内容的前20个字 */
		addArt.setType(4);
		addArt.setAppId("wx8fc27d35102c6d2Q");/* 插入管理的APPID号码 */
		/* addArt.setAppId(appId); 添加设备的id用于查找用户名及其信息 */
		/*
		 * 此处添加一个文件写的功能，把content返回的html代码写入到文件夹main/resources中的，的一个文件中，
		 * 这个文件的命名方式为“article”+id+“。html”
		 */
		int id = articlesService.maxId() + 1;
		String serverPath = request.getSession().getServletContext().getRealPath("/");/* 此处为获取当前工程的真实路径 */
		String dirname = "/ContainerArticle";/* 文件目录名称 */
		String filename = "artcle" + id + ".html";/* 文章命名方式，这个地方用的是文章id号防止重名 */
		File dircontent = new File(serverPath + dirname);/* 目录 */
		File file = new File(dircontent, filename);/* 文件 */
		if (!dircontent.exists()) {/* 在服务器的工程目录下床架目录ContainerArticle */
			dircontent.mkdirs();
			if (!file.exists()) {
				try {
					file.createNewFile();/* 创建文件 */
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		FileOutputStream fos = new FileOutputStream(
				file);/* 输出，向文件file中写入content的HTML代码，然后存储为html格式 */
		try {
			fos.write(content.getBytes());/* 把content写入文件 */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addArt.setContent(filename);/* 这里应该直接存文件的名字而不是存文件的目录加名字因为这样在下面的文章详情中找文件比较麻烦 */
		int addArticle = articlesService.addArticle(addArt);/* 将文章添加到数据库的article表中 */
		List<Article> articles = articlesService
				.selectAllArticle();/* 添加完文章后，再查询一次文章，让后把查询完的文章，返回，相当于一次刷新 */
		modelMap.addAttribute("articles", articles);/* 把查询完的文章返回给页面 */
		return "/user/Article";
	}

	/**
	 * 
	 * @Description :文章详情页，设计文件读取，地址拼接
	 */
	@AuthPassport
	@RequestMapping("/content")
	public String addArt(HttpServletRequest request, ModelMap modelMap) throws FileNotFoundException {
		HttpSession session = request.getSession();
		Integer id = (Integer) session.getAttribute("id");/* 获取上一个页面的文章id号 */
		Article article = articlesService.detailArticle(id);/* 通过id查看该文章的全部内容 */
		MpUser mpUser = mpUserService.selectByAppId(article.getAppId());/* 通过APPID查询mpUser中是详细内容 */
		User user = userService.selectByPrimaryKey(mpUser.getUserId());/* 通过userId查询user的详细信息 */
		String serverPath = request.getSession().getServletContext().getRealPath("/");
		File dir = new File(serverPath + "/ContainerArticle");/* 找到文章文件所在的目录 */
		File file = new File(dir, article.getContent());/* 创建一个新文件 */
		FileInputStream fis = new FileInputStream(file);
		byte[] content = new byte[1024];
		StringBuffer sb = new StringBuffer();
		try {
			while (fis.read(content) != -1) {
				sb.append(new String(content));/* 获取文件内容 */
				content = new byte[1024];/* 重新分配，一面重复 */
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		article.setContent(sb.toString());
		DateTool dateTool = new DateTool();
		modelMap.addAttribute("dateTool", dateTool);/* velocity日期格式工具 */
		modelMap.addAttribute("article", article);/* 当前文章的详情 */
		modelMap.addAttribute("mpUser", mpUser);
		modelMap.addAttribute("user", user);
		return "/user/content";
	}

	/**
	 * 
	 * @Description :文章详情，这个方法有待改正，不合理之处在于打开一个页面要用到两个mapping，有点烦人，改正方法是，
	 *              其实实现的思路是这样子的，就是在前端下功夫，当前页面可以通过？id=的方式将页面传递给业务实现代码
	 */
	@AuthPassport
	@RequestMapping("/detailarticle") /* 文章详情,这个地方的功能是： 跳转到详情页面上去，提供相应的信息 */
	public String detailarticle(HttpServletRequest request, ModelMap modelMap, Integer id)
			throws FileNotFoundException {/* id是通过ajax Post上来的文章id */
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		return "/user/content";
	}

	/**
	 * 
	 * @Description :删除文章根据文章id号码删除文章
	 */
	@AuthPassport
	@RequestMapping("/delectarticle")
	public String delectArticle(HttpServletRequest request, ModelMap modelMap, Integer id) {
		int delectArticle = articlesService.deleteArticle(id);/* 通过id删除文章 */
		List<Article> articles = articlesService.selectAllArticle();/* 删除完文章详情之后就返回文章列表 */
		modelMap.addAttribute("articles", articles);
		return "/user/Article";
	}

	/**
	 * 
	 * @Description :通下面的doctorcontent同时使用
	 */
	@AuthPassport
	@RequestMapping("/detailDoctor")
	public String detailDoctor(HttpServletRequest request, ModelMap modelMap, String userId) {
		HttpSession session = request.getSession();
		session.setAttribute("userId", userId);
		return "/user/doctorcontent";
	}

	/**
	 * 
	 * @Description :医生详情页面，返回医生的相关信息
	 */
	@AuthPassport
	@RequestMapping("/doctorcontent")
	public String doctorcontent(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		Doctor doctor = userService.selectDoctor(userId);
		modelMap.addAttribute("doctor", doctor);
		return "/user/doctorcontent";
	}

	/**
	 * 
	 * @Description :删除医生
	 */
	@AuthPassport
	@RequestMapping("/delectDoctor")
	public String delectdoctor(HttpServletRequest request, ModelMap modelMap, String userId) {
		MpUserKey key = new MpUserKey();
		Doctor doctor = userService.selectDoctor(userId);
		key.setAppId(doctor.getAppId());
		key.setOpenId(doctor.getOpenId());
		int delectDoctorUser = userService.deleteByPrimaryKey(userId);/* 通过userid删除user表中的医生用户 */
		int delectDoctorMpUser = mpUserService.deleteByPrimaryKey(key);/* 从mpuser中删除医生 */
		return "/user/Doctor";
	}

	/**
	 * 
	 * @Description :首页列表，待完成
	 */
	@AuthPassport
	@RequestMapping("/Chart")
	public String iChart(ModelMap modelMap) {
		return "/user/Chart";
	}

	/**
	 * 
	 * @Description :首页详细信息待填写
	 */
	@AuthPassport
	@RequestMapping("/Information")
	public String iInformation(ModelMap modelMap) {
		return "/user/Information";
	}

	/**
	 * 
	 * @Description :空框架的文章页面，进去后会加载其他的模块
	 */
	@AuthPassport
	@RequestMapping("/iArticles")
	public String articleList(ModelMap modelMap) {
		return "/user/iArticles";
	}

	/**
	 * 
	 * @Description :空框架的病历页面，进去后会加载其他的模块
	 */
	@AuthPassport
	@RequestMapping("/iCases")
	public String cases(ModelMap modelMap) {
		return "/user/iCases";
	}

	/**
	 * 
	 * @Description :空框架的医生页面，进去后会加载其他的模块
	 */
	@AuthPassport
	@RequestMapping("/iDoctors")
	public String doctors(ModelMap modelMap) {
		return "/user/iDoctors";
	}

	/**
	 * 
	 * @Description :空框架的病人页面，进去后会加载其他的模块
	 */
	@AuthPassport
	@RequestMapping("/iPatients")
	public String patients(ModelMap modelMap) {
		Patient patientInfo = new Patient();
		List<Patient> patients = patientsService.selectPatient(patientInfo);
		modelMap.addAttribute("patients", patients);
		return "/user/iPatients";
	}

	/**
	 * 
	 * @Description :空框架的音频页面，进去后会加载其他的模块
	 */
	@AuthPassport
	@RequestMapping("/iRadios")
	public String radioList(ModelMap modelMap) {
		return "/user/iRadios";
	}

	/**
	 * 
	 * @Description :空框架的视频页面，进去后会加载其他的模块
	 */
	@AuthPassport
	@RequestMapping("/iVideos")
	public String videoList(ModelMap modelMap) {
		return "/user/iVideos";
	}

	/**
	 * 
	 * @Description :空框架的个人页面，进去后会加载其他的模块
	 */
	@AuthPassport
	@RequestMapping("/iPersonal")
	public String personal(ModelMap modelMap) {
		return "/user/iPersonal";
	}

	/**
	 * 
	 * @Description :空框架的帮助页面，进去后会加载其他的模块
	 */
	@AuthPassport
	@RequestMapping("/iHelp")
	public String help(ModelMap modelMap) {
		return "/user/iHelp";
	}

}
