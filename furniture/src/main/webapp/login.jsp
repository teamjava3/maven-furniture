<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>世尊家具综合管理系统</title>
<script language="javascript">
function login()
{
	var name=document.getElementById("name").value;
	var pwd=document.getElementById("pwd").value;
	if(name==""){
			alert("请输入用户名称！");
			document.getElementById("name").focus();
			return false;
		}
	if(pwd==""){
			alert("请输入用户密码！");
			document.getElementById("pwd").focus();
			return false;
		}
	if(name=="1" && pwd=="1")
	{	
		location.href="index.jsp";
	  return true;
	}
}
</script>
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body style="background:#aaaaaa;">

<div class="png login_logo"><img src="images/logo_03.png" alt=""></div>
<div class="login">
<div class="login_1"><input name="name" type="text"></div>
<div class="login_2"><input name="pwd" type="password"></div>
<div class="login_3"><input name="" type="checkbox" value=""></div>
<div class="login_4 png"><a href="index.jsp" ><img src="images/login_08.jpg"></a></div>
</div>




</body>
</html>
<script src="/common.js"></script>