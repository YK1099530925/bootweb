var pageIndex = 1;
var pageSize = 6;
var pageCount = 0;
// 用于调用刷新分页函数和获取分页数据接口函数的判断
var first = true;

$(function(){
	// 加载首页
	loadingHomeMasterInfo();
	loadingHomeAriticlesInfo(pageIndex);
})

/**
 * 刷新分页
 * @param {Object} totalPage
 * @param {Object} currentPage
 */
function refreshPages(totalPage, currentPage){
	if(currentPage<1 || currentPage>totalPage){
		return;
	}else{
		var paginationInfo = getPagination(totalPage, currentPage);
		document.getElementById('pagination').innerHTML=paginationInfo;
		if(!first){
			loadingHomeAriticlesInfo(currentPage)
			// 如果这里调用了获取分页数据，那么就需要返回顶部
			window.scrollTo(0,0);
		}
	}
	
}

/**
 * 返回一个文章的列
 */
function getOneArticle(articleTitle, articleType, publishDate, publishDate, author, articleCategories, articleContent, articleTags){
	// 标签可能有多个
	var articleTagsHtml = '';
	// 判断有多少个标签，标签规则定位以 | 为分界线
//	alert(articleTags)
	var articleTagsSplit = articleTags.split("|");
	for(var i = 0; i < articleTagsSplit.length; i++){
		articleTagsHtml += '<span class="glyphicon glyphicon-tags"></span>&nbsp;<a href="">' + articleTagsSplit[i] + '</a>&nbsp;&nbsp;'
	}
	var articleHtml = '<div class="border-color center-text">' 
						+ '<div class="row article-title">'
						+ '<div class="col-md-10 col-sm-10 col-xs-10">'
						+ '<div><a href="" style="color: #7f7f7f;">'
						+ articleTitle
						+ '</a></div></div></div>'
						+ '<div class="row" style="margin-left: 2%;margin-top: 1%;">'
						+ '<div class="col-md-10">'
						+ '<span class="articleType am-badge am-badge-success">'
						+ articleType
						+ '</span>&nbsp;<span class="glyphicon glyphicon-calendar"></span>&nbsp;<a href="">'
						+ publishDate
						+ '&nbsp;&nbsp;</a><span class="glyphicon glyphicon-user"></span><a href="">'
						+ author
						+ '&nbsp;&nbsp;</a><span class="glyphicon glyphicon-th"></span><a href="">'
						+ articleCategories
						+ '</a></div></div><div class="row" style="margin-left: 2%;"><div class="col-md-11" style="height: 110px;">'
						+ '<div class="article-entry">'
						+ articleContent
						+ '</div></div></div><div class="row" style="margin-left: 1%;"><div class="col-md-4" style="font-size: 18px;">'
						+ '<a href="" style="color: #7f7f7f;">阅读全文 >></a></div></div><hr />'
						+ '<div class="row" style="margin-left: 1%;"><div class="col-md-10" style="font-size: 16px;">'
						+ articleTagsHtml
						+ '</div></div></div>'
	
	return articleHtml;
}

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
					pageCount = data.pageCount;
					var data = data.data;
					// 添加到文章列表里面的html
					var articlesHtml = '';
					for(var i = 0; i < data.length; i++){
						articlesHtml += getOneArticle(data[i].articleTitle, data[i].articleType, data[i].publishDate, data[i].publishDate, 
							data[i].author, data[i].articleCategories, data[i].articleContent, data[i].articleTags);
					}
					document.getElementById("articlesList").innerHTML = articlesHtml;
//					$("#articlesList")[0].innerHTML = articlesHtml;// 这个也可以
					
					/*
					 * 需要在这里刷新分页，如果在加载函数中调用的话，就算是放在loadingHomeAriticlesInfo这个后面，分页也不会显示，
					 * 	因为是异步加载，所以当数据还没有返回回来的时候，pageCount还是默认的数据0
					 * 在这里只能首页的时候调用一次，如果不判断，点击下一页的时候可能会导致死循环，因为这两个接口是相互调用
					 */
					if(first){
						refreshPages(pageCount, pageIndex);
						first = false;
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
