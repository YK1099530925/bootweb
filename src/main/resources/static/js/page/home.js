var pageIndex = 1;
var pageSize = 5;
var count = 0;

$(function(){
	// 加载首页
	loadingHomeMasterInfo();
	loadingHomeAriticlesInfo(pageIndex);
})

/**
 * 分页获取文章信息
 */
function loadingHomeAriticlesInfo(pIndex){
	var page = {
		"pageIndex":pIndex,
		"pageSize":pageSize
	}
	
	$.ajax({
		type:"post",
		url: serverUrl + "home/ariticlesInfosByPage",
		data: JSON.stringify(page),
		async:true,
		contentType:"application/json; charset=utf-8",
		success:function(data){
			if(data.state == 1){
				if(data != null){
					var data = data.data;
					for(var i = 0; i < data.size; i++){
						alert(data[i])
					}
					
					
				}else{
					
				}
			}
		}
	});
}

/**
 * 博主信息
 */
function loadingHomeMasterInfo(){
	$.ajax({
		type:"get",
		url: serverUrl + "home/blogMasterInfo",
		async:true,
		contentType:"application/json; charset=utf-8",
		success:function(data){
			if(data.state == 1){
				var data = data.data;
				$("#name").html(data.realName);
				$("#qianming").html(data.personalBrief);
				$("#phone").html(data.phone)
				$("#email").html(data.email)
				$("#avatarUrl").attr('src', data.avatarUrl);
			}
		}
	});
}
