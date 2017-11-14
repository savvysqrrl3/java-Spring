<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Details</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<h4>Title <c:out value="${song.title}"/></h4>
	<h4>Artist <c:out value="${song.artist}"/></h4>
	<h4>Rating (1-10) <c:out value="${song.rating}"/></h4>
	<a href="/songs/delete/${song.id}">Delete</a>
</body>
</html>