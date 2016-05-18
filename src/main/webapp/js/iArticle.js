$('#navigation').children('.selecter').removeClass('active');
$('#iArticles').addClass('active');
articeListInit();
function addArticle() {
	var title = $.trim($("#title").val());
	var summary = $.trim($("#summary").val());
	var content = $editor.editor('getContent');
	$.ajax({
		type : "POST",
		url : ctxPath + "/user/addarticle.do",
		data : {
			"title" : title,
			"content" : content,
			"summary" : summary
		},
		success : function(data, xhr, status) {
			location.reload();
			/* $editor.editor('initialContent'); */

		},
		error : function(xhr) {
			alert("Article加载失败！");
		}

	});
}
function alertArticle(id) {

}

function detailArticle(id) {
	$.ajax({
		type : "POST",
		url : ctxPath + "/user/detailarticle.do",/* 这个js的作用是把页面传过来的id号给后台，后台运行后查询到相应的文章内容，现在有个问题，就是我怎么，把查到的内容传递到跨页面呢 */
		data : {
			"id" : id
		},
		success : function(data, xhr, status) {
			window.location.href = ctxPath + "/user/content.do";
		},
		error : function(xhr) {
			alert("Article加载失败！");
		}

	});
}

function delectArticle(id) {
	$.ajax({
		type : "POST",
		url : ctxPath + "/user/delectarticle.do",
		data : {
			"id" : id
		},
		success : function(data, xhr, status) {
			location.reload();
		},
		error : function(xhr) {
			alert("Article加载失败！");
		}

	});
}

function articeListInit() {
	$.ajax({
		type : "GET",
		url : ctxPath + "/user/Article.do",
		success : function(data, textStatus, errorThrown) {
			$('#articlelist').html(data);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("Article加载失败！");
		}
	});
}