$('#navigation').children('.selecter').removeClass('active');
$('#iDoctors').addClass('active');
doctorListInit();
function doctorListInit() {
	$.ajax({
		type : "GET",
		url : ctxPath + "/user/Doctor.do",
		success : function(data, textStatus, errorThrown) {
			$('#doctorlist').html(data);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("Doctor加载失败！");
		}
	});
}

function delectDoctor(userId) {
	$.ajax({
		type : "POST",
		url : ctxPath + "/user/delectDoctor.do",
		data : {
			"userId" : userId
		},
		success : function(data, xhr, status) {
			location.reload();
		},
		error : function(xhr) {
			alert("Doctor加载失败！");
		}

	});
}

function detailDoctor(userId) {
	$.ajax({
		type : "POST",
		url : ctxPath + "/user/detailDoctor.do",
		data : {
			"userId" : userId
		},
		success : function(data, xhr, status) {
			window.location.href=ctxPath+"/user/doctorcontent.do"
		},
		error : function(xhr) {
			alert("Doctor加载失败！");
		}

	});
}