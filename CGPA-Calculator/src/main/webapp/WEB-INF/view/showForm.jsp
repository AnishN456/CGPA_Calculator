<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="calculate" modelAttribute="cgpa">
		<form:label path="subject1">Subject1</form:label>
		<form:input path="subject1" /><br><br>
		<form:label path="subject2">Subject2</form:label>
		<form:input path="subject2" /><br><br>
		<form:label path="subject3">Subject3</form:label>
		<form:input path="subject3" /><br><br>
		<form:label path="subject4">Subject4</form:label>
		<form:input path="subject4" /><br><br>
		<input type="submit" />
	</form:form>
</body>
</html>