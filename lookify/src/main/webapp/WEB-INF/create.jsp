<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Song</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	
	<p>
		<form:form method="POST" action="/songs/new" modelAttribute="song">
		    <h4>
		    <form:label path="title">Title
		    <form:errors path="title"/>
		    <form:input path="title"/></form:label>
		    </h4>
		    <h4>
		    <form:label path="artist">Artist
		    <form:errors path="artist"/>
		    <form:input path="artist"/></form:label>
		    </h4>
		    <h4>
		    <form:label path="rating">Rating
		    <form:errors path="rating"/>
		    <form:select path="rating">
		    		<form:option value="1"></form:option>
		    		<form:option value="2"></form:option>
		    		<form:option value="3"></form:option>
		    		<form:option value="4"></form:option>
		    		<form:option value="5"></form:option>
		    		<form:option value="6"></form:option>
		    		<form:option value="7"></form:option>
		    		<form:option value="8"></form:option>
		    		<form:option value="9"></form:option>
		    		<form:option value="10"></form:option>
		   	</form:select>
		    </form:label>
		    </h4>
		    <input type="submit" value="Add Song"/>
		</form:form>
	</p>
	
</body>
</html>