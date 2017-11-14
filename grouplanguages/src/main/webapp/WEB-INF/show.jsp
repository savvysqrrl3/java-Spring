<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><c:out value="${lang.name}"/></title>
</head>
<body>
	<a href="/languages">Dashboard</a>
	<p><c:out value="${lang.name}"/></p>
	<p><c:out value="${lang.creator}"/></p>
	<p><c:out value="${lang.version}"/></p>
	<p><a href="/languages/edit/${lang.id}">Edit</a></p>
	<p><a href="/languages/delete/${lang.id}">Delete</a></p>
</body>
</html>