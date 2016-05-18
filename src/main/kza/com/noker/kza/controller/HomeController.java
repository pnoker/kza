package com.noker.kza.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.noker.kza.auth.AuthPassport;
import com.noker.kza.bean.Doctor;
import com.noker.kza.bean.Patient;
import com.noker.kza.model.CaseRecord;
import com.noker.kza.service.CaseRecordService;
import com.noker.kza.service.UserService;

@Controller // 定义容器，MVC 中的 Ｃ
@RequestMapping("/") // 请求映射
public class HomeController extends BaseController {
	static final Logger logger = LogManager.getLogger(HomeController.class);// 日志

	@Autowired
	private UserService userService;
	@Autowired
	private CaseRecordService caseRecordService;

	/**
	 * 
	 * @Description :登录页面
	 */
	@RequestMapping("/login")
	public String login(ModelMap modelMap) {
		return "/login";
	}

	@RequestMapping("/Count")
	public String doctorCount(ModelMap modelMap) {
		Doctor doctorInfo = new Doctor();
		Patient patientInfo = new Patient();
		CaseRecord caseInfo = new CaseRecord();
		int countP = userService.countP(patientInfo);
		int countD = userService.countD(doctorInfo);
		int countC = caseRecordService.countC(caseInfo);
		return "/user/Statistic";
	}

}