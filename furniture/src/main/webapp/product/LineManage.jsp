<%@page pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>无标题页</title>
<link rel="stylesheet" type="text/css" href="../css/index.css">
<script>
	function shanchu(id)
	{
		var  str = confirm("是否确定删除栏目？"); 
		if(str == true)
		{
			location.href="../product/deleteNewsLabel.do?id=" + id ;
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
<body class="mian_bj">

<div class="mian_top_c">

 <p  style="align:center;font-family:宋体;font-size:20px;">产品系列界面</p>
</div>
<div class="mian_b">
<div class="mian_b1">
<a href="${pageContext.request.contextPath }/product/toNewsLabelAdd.do" title="增加">
<p class="mian_b1_a1">
</p>
</a>



<table width="100%" border="0" cellpadding="0" cellspacing="0" class="mian_b_bg">
<tr>

<td width="10%" class="mian_b_bg_lm">
<span></span>系列编号
</td>
<td width="10%" class="mian_b_bg_lm">
<span></span>系列名称
</td>
<td width="10%" class="mian_b_bg_lm">
<span></span>系列备注
</td>

<td width="10%" class="mian_b_bg_lm">
删除操作
</td>
<td width="10%" class="mian_b_bg_lm">
编辑操作
</td>
</tr>

      <c:forEach items="${page.datas }" var="product">
      <tr>
      
        <td class="td07">${product.id}</td>
        <td class="td07">${product.name}</td>
        <td class="td07">${product.information }</td>
       
         <td class="td07"><a href="#" onClick="shanchu(${product.id})">删除</a></td>
   <td class="td07"><a href="#" onClick="openChildWindow('${pageContext.request.contextPath }/product/toNewslabelUpdatePage.do?id=${product.id}', 670, 260)">修改</a>
        </td>
      </tr>
      </c:forEach>



</table>
</div>
</div>
</body>
</html>
<script src="/common.js"></script>