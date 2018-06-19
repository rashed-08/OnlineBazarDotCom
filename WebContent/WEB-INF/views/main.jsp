<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<c:set value="${pageContext.request.contextPath}" var="contextRoot" />
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/image" />
<spring:url var="fonts" value="/resources/fonts" />

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
<!-- Custom css for body page -->
<link href="${css}/shop-item.css" rel="stylesheet">
<script>
	/* declare all global variable for js */
	window.menu = "${title}";
</script>
</head>
<body>
	<!-- Body content wrapper -->
	<div class="wrapper">
		<!-- Navigation Bar -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->
		<!-- Page content wrapper -->
		<div class="content">
			<c:if test="${userClickHome ==true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${userClickAbout ==true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userClickContact ==true}">
				<%@include file="contact.jsp"%>
			</c:if>

			<c:if test="${userClickAllProduct ==true or userClickSingleProduct == true}">
				<%@include file="product.jsp"%>
			</c:if>
		</div>
		<%@include file="./shared/footer.jsp"%>
	</div>
	<!-- Load all JS file -->
	<!-- Basic JavaScript File -->
	<script src="${js}/jQuery.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<!-- Custom JS file for page -->
	<script src="${js}/customJs.js"></script>
</body>
</html>