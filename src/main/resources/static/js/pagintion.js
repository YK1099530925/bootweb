/**
 * 获取分页
 * @param totalPage  页码总量
 * @param currentPage 当前页码
 * 自己添加了一个当前页高亮
 */
function getPagination(totalPage, currentPage){
	
	var paginationInfo = "<ul class='pagination page-center'><li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+(currentPage-1)+")'>«</a></li>";
	
	if(totalPage<=5){
		for(var i=1; i<=totalPage; i++){
			if(currentPage == i){
				paginationInfo += "<li class='active'><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+i+")'>"+i+"</a></li>";
			}else{
				paginationInfo += "<li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+i+")'>"+i+"</a></li>";
			}
		}
	}else{
		if(currentPage<=3){
			for(var i=1; i<=currentPage+2; i++){
				if(currentPage == i){
					paginationInfo += "<li class='active'><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+i+")'>"+i+"</a></li>";
				}else{
					paginationInfo += "<li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+i+")'>"+i+"</a></li>";
				}
			}
			/*省略号*/
			paginationInfo += "<li><a href='javascript:void(0);' href='#'>...</a></li>";
			paginationInfo += "<li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+totalPage+")'>"+totalPage+"</a></li>";
		}else if(currentPage<=totalPage-5){
			paginationInfo += "<li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+1+")'>"+1+"</a></li>";
			/*省略号*/
			paginationInfo += "<li><a href='javascript:void(0);' href='#'>...</a></li>";
			for(var i=currentPage-1; i<=currentPage+1; i++){
				if(currentPage == i){
					paginationInfo += "<li class='active'><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+i+")'>"+i+"</a></li>";
				}else{
					paginationInfo += "<li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+i+")'>"+i+"</a></li>";
				}
			}
			paginationInfo += "<li><a href='javascript:void(0);' href='#'>...</a></li>";
			paginationInfo += "<li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+totalPage+")'>"+totalPage+"</a></li>";
		}else{
			paginationInfo += "<li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+1+")'>"+1+"</a></li>";
			/*省略号*/
			paginationInfo += "<li><a href='javascript:void(0);' href='#'>...</a></li>";
			for(var i=currentPage; i<=totalPage; i++){
				if(currentPage == i){
					paginationInfo += "<li class='active'><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+i+")'>"+i+"</a></li>";
				}else{
					paginationInfo += "<li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+i+")'>"+i+"</a></li>";
				}
			}
		}
	}
	
	paginationInfo += "<li><a href='javascript:void(0);' onclick='refreshPages("+totalPage+","+(currentPage+1)+")'"+">»</a></li>";
	
	return paginationInfo;
}