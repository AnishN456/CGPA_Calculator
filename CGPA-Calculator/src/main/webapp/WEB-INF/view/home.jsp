<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CGPA Calculator</title>
<style>
	h1{
	text-align:center;
	}
	
	a{
	display:block;
	margin-top:10px;
	text-decoration: none;
	text-align:center;
	}

</style>
</head>
<body>
	<h1>Welcome to CGPA Calculator Website</h1>
	<a href="${pageContext.request.contextPath}/cgpa/showForm">CGPA Calculation</a><br><br>
	<a href="${pageContext.request.contextPath}/cgpa/showPercentage">Percentage Calculation</a>
</body>
</html>