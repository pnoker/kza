/*这个js负责改导航条的选框，
还要负责跳转页面，如何实现页面的跳转，用window.location.href="",进行页面的跳转
function Navigation(name) {
	$('.nav').children('.selecter').removeClass('active');
	$('#' + name).addClass('active');
}*/
/* 页面跳转函数 */
function Pageview(name) {
		$('#navigation').children('.selecter').removeClass('active');
		$('#' + name).addClass('active');
		window.location.href = ctxPath + "/user/"+name+".do";// 页面跳转
}