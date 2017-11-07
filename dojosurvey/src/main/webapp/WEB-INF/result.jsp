<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Survey Results</title>
</head>
<body>
	 
	<h3>Submitted Information:</h3>
		<h4>Name: <c:out value="${name}"/> </h4>
		<h4>Dojo Location: <c:out value="${location}"/> </h4>
		<h4>Favorite Language: <c:out value="${language}"/> </h4>
		<h4>Comment: <c:out value="${comment}"/> </h4>

		<a href="/"> Go Back </a>
</body>
</html>