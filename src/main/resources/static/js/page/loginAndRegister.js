function login(){
	var username = $("#username").val().trim();
	var _password = $("#password").val().trim();
	var params = {
		"username": username,
		"password":_password
	}
	$.ajax({
		type:"post",
		url:serverUrl + "login",
		data: params,
//		data: JSON.stringify(params),
		contentType:"application/json; charset=utf-8",
		async:true,
		success:function(data){
			if(data.state == 1){
				window.location.href = "../index.html";
			}else{
				alert("失败")
			}
		}
	});
}

function register(){
	var username = $("#username").val().trim();
	var phone = $("#phone").val().trim();
	var _password = $("#password").val().trim();
	var confirmPassword = $("#confirmPassword").val().trim();
	if(username == ""){
		alert("请输入用户名")
		return
	}
	if(username.indexOf(" ") != -1){
		alert("用户名不能有空格")
		return
	}
	if(phone == ""){
		alert("请输入手机号")
		return
	}
	if(phone.indexOf(" ") != -1){
		alert("手机号不能有空格")
		return
	}
	if(_password == ""){
		alert("请输入密码")
		return
	}
	if(_password.indexOf(" ") != -1){
		alert("密码不能有空格")
		return
	}
	if(confirmPassword == ""){
		alert("请确认密码")
		return
	}
	if(confirmPassword.indexOf(" ") != -1){
		alert("确认密码不能有空格")
		return
	}
	if(_password.trim() != confirmPassword.trim()){
		alert("密码不一致")
		return
	}
	
	var params = {
		"username" : username,
		"phone" : phone,
		"password" : _password
	}
	$.ajax({
		type:"post",
		url:serverUrl + "register",
		data: JSON.stringify(params),
		contentType:"application/json; charset=utf-8",
		async:true,
		success:function(data){
			if(data.state == 1){
				alert("成功")
				// 返回成功页面
				window.location.href = "login.html";
			}else{
				alert("失败")
			}
		}
	});
}
