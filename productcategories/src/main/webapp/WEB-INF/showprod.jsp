<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Page</title>
</head>
<body>
	
	<h1><c:out value="${product.name}"/></h1>
	
	<form:form method="POST" action="/products/addCategory" modelAttribute="catProd">
		    <form:hidden path="product" value="${product.id}"></form:hidden>
		    <h4>
		    <form:label path="category">Add Category:</form:label>
        		<form:select path="category">
        		<c:forEach items="${categoryList}" var="category">
            		<form:option value="${category}" label="${category.name}"/>
            	</c:forEach>
        		</form:select>
		   	
		   	</h4>
		    <input type="submit" value="Add"/>
	</form:form> 
	
	<h4>Category: </h4> 
	<ul>
		<c:forEach items="${product.categories}" var="cat">
			<li>
				<c:out value="${cat.name}"/>
			</li>
		</c:forEach>
	</ul> 
</body>
</html>