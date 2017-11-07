<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ninja Gold</title>
</head>
<body>
	
		<h3> Your gold:  </h3>
		<div style="outline: thin solid black; height: 200px; width: 200px; padding: 20px; display: inline-block">
		<form action="/process" method="post">
			
			<h4>Farm</h4>
			(earn 10-20 gold)
			<p>
			<input type="hidden" name="location" value="farm">
			<input type="submit" name="submit" value="Find Gold!">
			</p>
		</form>
		</div>

		<div style="outline: thin solid black; height: 200px; width: 200px; padding: 20px; display: inline-block">
		<form action="/process" method="post">
			
			<h4>Cave</h4>
			(earn 5-10 gold)
			<p>
			<input type="hidden" name="location" value="cave">
			<input type="submit" name="submit" value="Find Gold!">
			</p>
		</form>
		</div>
		<div style="outline: thin solid black; height: 200px; width: 200px; padding: 20px; display: inline-block">
		<form action="/process" method="post">
			
			<h4>House</h4>
			(earn 2-5 gold)
			<p>
			<input type="hidden" name="location" value="house">
			<input type="submit" name="submit" value="Find Gold!">
			</p>
		</form>
		</div>
		<div style="outline: thin solid black; height: 200px; width: 200px; padding: 20px; display: inline-block">
		<form action="/process" method="post">
			
			<h4>Casino</h4>
			(earn or lose 0-50 gold)
			<p>
			<input type="hidden" name="location" value="casino">
			<input type="submit" name="submit" value="Find Gold!">
			</p>
		</form>
		</div>


			<!-- {% for entry in request.session.activities %}
				<p>{{entry}}</p>
			{% endfor %} -->
			<p>
				<a href="reset"> Reset All </a>
			</p>
	</body>
</html>