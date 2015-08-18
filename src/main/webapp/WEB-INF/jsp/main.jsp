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
<title>分数查询</title>
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>css/bootstrap-theme.min.css" rel="stylesheet">
<link href="<%=basePath%>css/bootstrap-datetimepicker.min.css"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-bottom">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand">Education</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="MyHome.html">我的战绩</a></li>
				<li><a href="analysis.html">自我分析</a></li>
				<li><a href="compare.html">知己知彼</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row">
					<div class="col-md-3">
						<div class="panel panel-default">
							<div class="panel-body">


								<form class="form-horizontal">
									<div class="form-group">

										<img src="<%=basePath%>image/portrait.jpg" alt="更换我的形象"
											class="img-thumbnail" style="width: 140px; height: 140px;">

									</div>
									<div class="form-group">
										<label for="name" class="col-sm-4 control-label">姓名：</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="name"
												placeholder="张丽丽" readonly>
										</div>
									</div>
									<div class="form-group">
										<label for="studentNo" class="col-sm-4 control-label">学号：</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="studentNo"
												placeholder="20070103" readonly>
										</div>
									</div>
									<div class="form-group">
										<label for="class" class="col-sm-4 control-label">班级：</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="class"
												placeholder="001" readonly>
										</div>
									</div>
									<div class="form-group">
										<label for="phone" class="col-sm-4 control-label">监护人：</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="phone"
												placeholder="15133234220" readonly>
										</div>
									</div>
									<div class="form-group">
										<label for="phone" class="col-sm-4 control-label">电话：</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="phone"
												placeholder="15133234220" readonly>
										</div>
									</div>
									<div class="form-group">
										<label for="master" class="col-sm-4 control-label">班主任：</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="master"
												placeholder="王文祥" readonly>
										</div>
									</div>
									<div class="form-group">
										<label for="mphone" class="col-sm-4 control-label">班主任电话：</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="mphone"
												placeholder="13274635274" readonly>
										</div>
									</div>
								</form>
							</div>

						</div>

					</div>
					<div class="col-md-9">

						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">查询条件</h3>
							</div>
							<div class="panel-body">
								<div class="table-responsive">

									<form>
										<div class="row">
											<div class="form-group col-md-6">

												<label for="exampleInputFile">模糊匹配考试名目</label> <input
													type="email" class="form-control" id="exampleInputEmail1"
													placeholder="输入关键词">

											</div>
											<div class="form-group col-md-6">


												<button type="submit" class="btn btn-default">查询</button>

											</div>
										</div>
										<div class="row">
											<div class="form-group col-md-6">
												<label for="exampleInputEmail1">课程组</label> <select
													class="form-control">
													<option>所有</option>
													<option>2014级语文</option>
													<option>2014级数学</option>
												</select>
											</div>
											<div class="form-group col-md-6">
												<label for="exampleInputPassword1">课程</label> <select
													class="form-control">
													<option>所有</option>
													<option>语文</option>
													<option>数学</option>
												</select>
											</div>
										</div>
										<div class="row">
											<div class="form-group col-md-6">

												<label for="exampleInputFile">起始时间</label>
												<div class="input-group date form_date " data-date=""
													data-date-format="yyyy MM dd" data-link-field="dtp_input2"
													data-link-format="yyyy-mm-dd">
													<input class="form-control" size="16" type="text" value=""
														readonly> <span class="input-group-addon"><span
														class="glyphicon glyphicon-remove"></span> </span> <span
														class="input-group-addon"><span
														class="glyphicon glyphicon-calendar"></span> </span>
												</div>
												<input type="hidden" id="dtp_input2" value="" /><br />
											</div>
											<div class="form-group col-md-6">

												<label for="exampleInputFile">结束时间</label>
												<div class="input-group date form_date " data-date=""
													data-date-format="yyyy MM dd" data-link-field="dtp_input2"
													data-link-format="yyyy-mm-dd">
													<input class="form-control" size="16" type="text" value=""
														readonly> <span class="input-group-addon"><span
														class="glyphicon glyphicon-remove"></span> </span> <span
														class="input-group-addon"><span
														class="glyphicon glyphicon-calendar"></span> </span>
												</div>
												<input type="hidden" id="dtp_input2" value="" /><br />
											</div>
										</div>


									</form>


								</div>
							</div>
						</div>


						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">查询结果</h3>
							</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-condensed table-striped table-hover">
										<thead>
											<tr>
												<th>课程组</th>
												<th>课程</th>
												<th>任课老师</th>
												<th>名目</th>
												<th>分数</th>
												<th>自我分析</th>
												<th>知己知彼</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>2014级数学</td>
												<td>数学</td>
												<td>刘独秀</td>
												<td>第1次测验</td>
												<td>89</td>
												<td><button
														onclick="window.location.href='analysis.html?tabNo=1'"
														type="button" class="btn btn-default">自我分析</button></td>
												<td><button
														onclick="window.location.href='analysis.html?tabNo=1'"
														type="button" class="btn btn-default">自我分析</button></td>
											</tr>
											<tr>
												<td>2014级数学</td>
												<td>数学</td>
												<td>刘独秀</td>
												<td>第1次测验</td>
												<td>89</td>
												<td><button
														onclick="window.location.href='analysis.html?tabNo=1'"
														type="button" class="btn btn-default">自我分析</button></td>
												<td><button
														onclick="window.location.href='analysis.html?tabNo=1'"
														type="button" class="btn btn-default">自我分析</button></td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>



					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript"
		src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>js/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>js/locales/bootstrap-datetimepicker.zh-CN.js"
		charset="UTF-8"></script>
	<script type="text/javascript">
		$('.form_date').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
	</script>
</body>
</html>
