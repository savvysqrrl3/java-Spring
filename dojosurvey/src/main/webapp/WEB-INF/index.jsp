
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dojo Survey Home</title>
</head>
<body>
	
	<form action="/process" method="post">
			<h4>Your Name: 
			<input type="text" name="name"> 
			</h4>
			<h4>Dojo Location: 
			<input list="location" name="location">
			<datalist id = "location">
				<option value="Seattle"></option>
				<option value="Los Angeles"></option>
				<option value="Mountain View"></option>
				<option value="Washington DC"></option>
				<option value="Dallas"></option>
				<option value="Chicago"></option>
				<option value="Tulsa"></option>
			</datalist> 
			</h4>
			<h4>Favorite Language:
			<input list="language" name="language">
			<datalist id = "language">
				<option value="Python"></option>
				<option value="Javascript"></option>
				<option value="C#"></option>
				<option value="Java"></option>
				<option value="Ruby"></option>
			</datalist>
			</h4>
			<h4>Comment (optional):</h4>
			<textarea rows="10" cols="75" name= "comment"></textarea>
			<p>
				<input type="submit" name="submit">
			</p>
		</form>
	
</body>
</html>