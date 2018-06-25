<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<c:set value="${pageContext.request.contextPath}" var="contextRoot" />
<spring:url var="css" value="/resources/css" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}-OnlineBazarDotCom</title>
<!-- Load all css here -->
<!-- Bootstrap core css -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
<!-- Bootstrap datatable plugin -->
<link href="${css}/dataTables.bootstrap4.css" rel="stylesheet">
<!-- Custom css for body page -->
<link href="${css}/shop-item.css" rel="stylesheet">
</head>
<body>
	<!-- Body content wrapper -->
	<div class="wrapper">
		<!-- Navigation Bar -->
		<!-- Navigation -->
		<!-- Page Content -->
		<!-- Page content wrapper -->
		<div class="content">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="jumbotron">
							<h1>${errorTitle}</h1>
							<hr />
							<blockquote>${errorDescription}</blockquote>
							<a href="${contextRoot}/home" class="btn btn-primary">Back to Home</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%@include file="./shared/footer.jsp"%>
	</div>
	<!-- Load all JS file -->
	<!-- Basic JavaScript File -->
	<script src="${js}/jQuery.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<!-- datatable JS files -->
	<script src="${js}/jquery.dataTables.js"></script>
	<script src="${js}/dataTables.bootstrap4.js"></script>
	<!-- Custom JS file for page -->
	<script src="${js}/customJs.js"></script>
</body>
</html>