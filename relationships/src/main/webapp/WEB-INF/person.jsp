<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>New Person</h2>
	
	<p>
		<form:form method="POST" action="/people/new" modelAttribute="person">
		    <h4>
		    <form:label path="firstName">First Name: 
		    <form:errors path="firstName"/>
		    <form:input path="firstName"/></form:label>
		    </h4>
		    <h4>
		    <form:label path="lastName">Last Name: 
		    <form:errors path="lastName"/>
		    <form:input path="lastName"/></form:label>
		    </h4>
		   
		    <input type="submit" value="Create"/>
		</form:form>
	</p>
	
</body>
</html>