﻿<%@page pageEncoding="UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>栏目管理</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script>
function tianjia()
{
	var str = confirm("是否确定添加此栏目？");
	if(str == true)
	{
		document.getElementById("form1").action="${pageContext.request.contextPath }/people/addPeopleLabel.do";
		alert("添加成功");
	}
	
}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="25" align="center" valign="bottom" class="td06"> <table width="80%"  border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td width="2%" valign="middle" background="../images/bg_03.gif">&nbsp;</td>
          <td width="2%" valign="middle" background="../images/bg_03.gif"><img src="../images/main_28.gif" width="9" height="9" align="absmiddle"></td>
          <td height="30" valign="middle" background="../images/bg_03.gif"><div align="left"><font color="#FFFFFF">栏目添加</font></div></td>
        </tr>
      </table></td>
    </tr>
  </table>
  
  <form name="form1" id="form1" method="post" action="">
    <table width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">
      <tr>
        <td colspan="2" class="td_02" align="center">增加人员信息</td>
      </tr>
     
      <tr>
        <td width="14%" class="td_02">员工姓名</td>
        <td width="86%" class="td_02"><input name="rname" type="text" class="input" style="width:99% "></td>
      </tr>
     <tr>
        <td width="14%" class="td_02">性别</td>
        <td width="86%" class="td_02"><input name="sex" type="text" class="input" style="width:99% "></td>
      </tr>
      <tr>
        <td width="14%" class="td_02">电话号码</td>
        <td width="86%" class="td_02"><input name="number" type="text" class="input" style="width:99% "></td>
      </tr>
      <tr>
        <td width="14%" class="td_02">职位</td>
        <td width="86%" class="td_02"><input name="position" type="text" class="input" style="width:99% "></td>
      </tr>
      
    </table>
    <br>
    <table width="30%"  border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td class="td_page"><div align="center">
            <input name="Submit" type="submit" class="buttonface02" value="  增 加  " onClick="tianjia()">
&nbsp;&nbsp;
        <input name="Submit" type="reset" class="buttonface02" value="  重 置  ">
&nbsp;&nbsp; 
<input name="Submit" type="submit" class="buttonface02" value="  关 闭  " onClick="window.close()">
        </div></td>
      </tr>
    </table>
    <br>
  </form>
</center>
</body>
</html>
