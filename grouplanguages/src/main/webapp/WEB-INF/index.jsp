<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Languages Dashboard</title>
</head>
<body>
	<table class="table">
		<tr>    
		    <th>Name</th>
		    <th>Creator</th>
		    <th>Version</th>
		    <th> Action</th>
	    </tr>
		<c:forEach items="${langs}" var="lang"> 
	    
	    <tr>    
		    <td>
		    <a href="/languages/${lang.id}">
		    <c:out value="${lang.name}"/>
		    </a>
		    </td>
		    <td><c:out value="${lang.creator}"/></td>
		    <td><c:out value="${lang.version}"/></td>
		    <td>
		    		<a href="/languages/delete/${lang.id}"> 
		    			delete 
		    		</a>
		    		<a href="/languages/edit/${lang.id}">  
		    		edit
		    		</a>
		    </td>
	    </tr>
		</c:forEach> 
	</table> 
	<p>
	<form:form method="POST" action="/languages/new" modelAttribute="lang">
    <h4>
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