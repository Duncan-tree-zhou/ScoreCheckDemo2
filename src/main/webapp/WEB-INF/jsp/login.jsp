<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<% String path = request.getContextPath();
 String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>请登录</title>

<script src="<%= basePath %>js/jquery-2.1.4.min.js"></script>
<!-- Bootstrap core CSS -->
<link
	href="<%= basePath %>css/bootstrap.min.css"
	rel="stylesheet">
<!-- Bootstrap theme -->
<link href="<%= basePath %>css/bootstrap-theme.min.css"
	rel="stylesheet">
<script src="<%= basePath %>js/bootstrap.min.js"></script>
<style type="text/css">
#logindev {
	position: absolute !important;
	top: 50%;
 	-webkit-transform: translateY(-50%);
	-moz-transform: translateY(-50%);
	-ms-transform: translateY(-50%);
	-o-transform: translateY(-50%);
	transform: translateY(-50%);
}
</style>
</head>
<body>

	<div class="container">
		<div
			class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2"
			id="logindev">
			<div class=" panel panel-primary">
			<div class="panel-heading">请输入您的账号</div>
			<div class="panel-body">
			<form class="form" method="post" action="<c:url value="/"/>">
				<label for="inputEmail" class="sr-only">学号</label> <input
					type="text" name="uname" class="form-control"
					placeholder="学号" required="" autofocus=""> <label
					for="inputPassword" class="sr-only">密码</label> <input
					type="password" name="upassword" class="form-control"
					placeholder="密码" required="">
					
				<c:if test="${!empty errorMsg}">
  					<div style="color:red">${errorMsg}</div>
				</c:if>
				<div class="checkbox">
					<label> <input name="remember" type="checkbox" value="记住我" >
						记住我
					</label>
				</div>
				<button class="btn btn-lg btn-primary btn-block" type="submit">进入我的查询</button>
			</form>
			</div>
  			</div>
		</div>
	</div>
</body>
</html>