$('#navigation').children('.selecter').removeClass('active');
$('#index').addClass('active');
IndexView();
function IndexView() {
			IndexStatistic();
			IndexArticle();
			IndexChart();
			IndexInformation();
}
function IndexStatistic(){
	$.ajax({
		type : "GET",
		url : ctxPath + "/user/Statistic.do",
		success : function(data, textStatus, errorThrown) {
			$('#index-view-statistic').html(data);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("statistic加载失败！");
		}
	});
}
function IndexArticle(){
	$.ajax({
		type : "GET",
		url : ctxPath + "/user/iArt.do",
		success : function(data, textStatus, errorThrown) {
			$('#index-view-article').html(data);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("article加载失败！");
		}
	});
}
function IndexChart(){
	$.ajax({
		type : "GET",
		url : ctxPath + "/user/Chart.do",
		success : function(data, textStatus, errorThrown) {
			$('#index-view-chart').html(data);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("chart加载失败！");
		}
	});
}
function IndexInformation(){
	$.ajax({
		type : "GET",
		url : ctxPath + "/user/Information.do",
		success : function(data, textStatus, errorThrown) {
			$('#index-view-information').html(data);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("sinformation加载失败！");
		}
	});
}
IndexView();
/*
 * 加载首页是页面的链接会改变成index.do，然后显示统计页面 function IndexView() {
 * 后台请求index。html页面返回页面html代码 $.ajax({ type : "GET", url : ctxPath +
 * "/user/index.do", beforeSend : function(xhr) {
 * $('.sui-nav').children('.selecter').removeClass('active');修改css样式， $('#' +
 * name).addClass('active'); }, success : function(data, textStatus, jqXHR) {
 * ShowStatistic();显示页面的内容但是没有修改页面的连接，因为后天返回的是html代码 }, error :
 * function(XMLHttpRequest, textStatus, errorThrown) { return
 * false;此处有错，每次总是先返回错误然后再返回成功 } }); }
 * 
 * function ShowStatistic() { $.ajax({ type : "GET", url : ctxPath +
 * "/user/Statistic.do",加载首页的初始化页面，显示统计信息 success : function(data, textStatus,
 * errorThrown) { $('#index-view1').html(data);将返回的信息在view1中显示 }, error :
 * function(XMLHttpRequest, textStatus, errorThrown) { return false; } }); }
 */
