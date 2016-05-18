function page(num) {
	$.ajax({
		type : "POST",
		url : ctxPath + "/user/Doctor.do",
		data : {
			"num" : num
		},
		success : function(data, xhr, status) {
			$('#doctorlist').html(data);
		},
		error : function() {
			alert("换页失败！");
		}
	});
}

function prnx(pn){
	$.ajax({
		type : "POST",
		url : ctxPath + "/user/pDoctor.do",
		data : {
			"pn" : pn
		},
		success : function(data, xhr, status) {
			$('#doctorlist').html(data);
		},
		error : function() {
			alert("换页失败！");
		}
	});
}