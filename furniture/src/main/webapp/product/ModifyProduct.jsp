<%@page pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>栏目修改</title>
<script>
function xiugai2(id)
{
	var str = confirm("是否确定修改栏目名称？");
	if(str == true)
	{
		document.getElementById("form1").action="${pageContext.request.contextPath }/product/updateNewsLabel.do";
		
	}
}
//声明两个全局变量
var childWin;
var timer;

// 打开一个子窗口
function openChildWindow(uri, width, height) {
	// 获取到打开的子窗口对象
	childWin = window.open(uri, null, "width=" + width + ",height=" + height);
	// 定义一个定时器，每1秒钟调用一次reloadCurPage()函数
	timer = setInterval("reloadCurPage()", 1000);
}

// 当子窗口关闭时刷新当前页面
function reloadCurPage() {
	if(childWin.closed == true) {
		// 消除定时器
		clearInterval(timer);
		// 刷新当前页面
		self.location.reload(true);
	}
}

</script>
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="25" align="center" valign="bottom" class="td06"> <table width="100%"  border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td width="2%" valign="middle" background="../../images/bg_03.gif">&nbsp;</td>
          <td width="2%" valign="middle" background="../../images/bg_03.gif"><img src="../../images/main_28.gif" width="9" height="9" align="absmiddle"></td>
          <td height="30" valign="middle" background="../../images/bg_03.gif"><div align="left"><font color="#FFFFFF">栏目修改</font></div></td>
        </tr>
      </table></td>
    </tr>
  </table>
  <form name="form1" id="form1" method="post" action="">
    <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">
      <tr>
      	<input type="hidden" name="sid" value="${product.id }">
        <td class="td_02">系列名称</td>
        <td class="td_02"><input name="name" value="${product.name }" type="text" class="input" style="width:99% "></td>
      </tr>
      <tr>
        <td class="td_02">系列备注</td>
        <td class="td_02"><input name="name" value="${product.information }" type="text" class="input" style="width:99% "></td>
      </tr>
       
      
      
      
    <table width="95%"  border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td class="td_page"><div align="center">
            
            <input name="Submit" type="submit" class="buttonface02" value="  修 改  " onClick="xiugai2(${product.id })">
            &nbsp;&nbsp;
            <input name="Submit" type="reset" class="buttonface02" value="  重 置  ">
            &nbsp; 
            <input name="Submit" type="submit" class="buttonface02" value="  关 闭  " onClick="window.close()">
        </div></td>
      </tr>
    </table>  
</body>
</html>