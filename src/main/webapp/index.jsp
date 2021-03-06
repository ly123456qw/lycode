<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>在线人名单</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>

<body>
	<div class="container">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<a class="navbar-brand" href="#">人名列表</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<form action="insertPeople.do" method="POST" class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" name="iname" class="form-control"
								placeholder="请输入人名"> <input type="text" name="isex"
								class="form-control" placeholder="请输入性别"> <input
								type="number" name="iage" class="form-control"
								placeholder="请输入年龄">
						</div>
						<button type="submit" class="btn btn-default">新增</button>
					</form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		<c:if test="${result == 'SUCCESS'}">
			<div class="alert alert-success" role="alert">提示：新增成功</div>
		</c:if>
		<c:if test="${result == 'ERROR'}">
			<div class="alert alert-danger" role="alert">警告：新增失败</div>
		</c:if>
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>NAME</th>
							<th>SEX</th>
							<th>AGE</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>---</td>
							<td>---</td>
							<td>---</td>
							<td>---</td>
							<td>---</td>
						</tr>
						<tr>
							<td>---</td>
							<td>---</td>
							<td>---</td>
							<td>---</td>
							<td>---</td>
						</tr>
						<tr>
							<td>---</td>
							<td>---</td>
							<td>---</td>
							<td>---</td>
							<td>---</td>
						</tr>
						<tr>
							<td>---</td>
							<td>---</td>
							<td>---</td>
							<td>---</td>
							<td>---</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</html>