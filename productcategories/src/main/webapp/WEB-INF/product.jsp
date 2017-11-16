<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Product</title>
</head>
<body>
	<h1>New Product</h1>
	
	<form:form method="POST" action="/products/new" modelAttribute="product">
		    <h4>
		    <form:label path="name">Name: 
		    <form:errors path="name"/>
		    <form:input path="name"/></form:label>
		    </h4>
		    <h4>
		    <form:label path="description">Description: 
		    <form:errors path="description"/>
		    <form:input path="description"/></form:label>
		    </h4>
		    <h4>
		    <form:label path="price">Price: 
		    <form:errors path="price"/>
		    <form:input path="price"/></form:label>
		    </h4>
		    
		    <input type="submit" value="Create"/>
	</form:form>
	
</body>
	
</body>
</html>