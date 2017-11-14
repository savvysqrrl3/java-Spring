<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Language</title>
</head>
<body>
<a href="/languages">Dashboard</a>
<a href="/languages/delete/${lang.id}"> 
		    			delete 
		    		</a>
	<p>
	<form:form method="POST" action="/languages/edit/${lang.id}" modelAttribute="lang">
    <h4>
    <form:hidden path="id"/>
    <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label>
    </h4>
    <h4>
    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:textarea path="creator"/></form:label>
    </h4>
    <h4>
    <form:label path="version">Version
    <form:errors path="version"/>
    <form:input path="version"/></form:label>
    </h4>
    <input type="submit" value="Submit"/>
</form:form>
	</p>
</body>
</html>