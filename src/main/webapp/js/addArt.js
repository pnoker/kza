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
			"summary":summary
		},
		success : function(data, xhr, status) {
			location.reload();
			/*$editor.editor('initialContent');*/

		},
		error : function(xhr) {
			alert("Article加载失败！");
		}

	});
}