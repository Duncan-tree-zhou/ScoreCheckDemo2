<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>分数查询</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
 
  <form>
  <table>
  <tr><td > <p>  欢迎您进入分数查询登录页面，请登录。</p></td></tr>
  <tr><td> <p>  用户名：</p></td><td></td></tr>
  <tr><td> <p>  密码：</p></td><td></td></tr>
  <tr><td> </td><td><button>登录</button></td></tr>
  </table>
  </form>
  </body>
</html>
