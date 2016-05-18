function login() {
	var username = $.trim($("#inputusername").val());// 移除字符串两侧的空白
	var password = $.trim($("#inputpassword").val());
	$.ajax({// 异步请求
		type : "POST",
		url : ctxPath + "/user/login.do",// 连接访问，请求服务器，如果服务器有反应，表明ajax请求成功，返回success，否则失败返回error
		dataType : "json",// 定义数据类型为jason类型
		data : {/* 提交的用户信息 */
			"username" : username,
			"password" : $.md5(password)
		// 通过md5不可逆加密数据，确保信息安全
		},
		success : function(data) {// 返回的数据是Jason数据
			if (data.mes == "1000") {// 用户名为空
				alert("用户名为空！");
			}
			if (data.mes == "1001") {// 用户名不存在
				alert("用户名不存在！");
			}
			if (data.mes == "1002") {// 服务器有响应，用户名存在，密码为空
				alert("密码不能为空！");
			}
			if (data.mes == "1003") {// 服务器有响应，用户名存在，密码错误
				alert("用户名和密码不匹配，请重新输入！");
			}
			if (data.mes == "1004") {// 服务器有响应，用户名存在，密码正确
				window.location.href = ctxPath + "/user/index.do";// 页面跳转
			} else {
				return true;// 有连接的未知报错
			}
		},
		error : function() {// 服务器请求失败
			return true;
		}
	});
}