function page(num) {
	$.ajax({
		type : "POST",
		url : ctxPath + "/user/Article.do",
		data : {
			"num" : num
		},
		success : function(data, xhr, status) {
			$('#articlelist').html(data);
		},
		error : function() {
			alert("换页失败！");
		}
	});
}

function prnx(pn){
	$.ajax({
		type : "POST",
		url : ctxPath + "/user/pArticle.do",
		data : {
			"pn" : pn
		},
		success : function(data, xhr, status) {
			$('#articlelist').html(data);
		},
		error : function() {
			alert("换页失败！");
		}
	});
}