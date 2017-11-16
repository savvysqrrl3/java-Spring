<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Category Page</title>
</head>
<body>
	<h1><c:out value="${category.name}"/></h1>
	
	<form:form method="POST" action="/categories/addProduct" modelAttribute="catProd">
		    <form:hidden path="category" value="${category.id}"></form:hidden>
		    <h4>
		    <form:label path="product">Add Product:</form:label>
        		<form:select path="product">
        		<c:forEach items="${productList}" var="product">
            		<form:option value="${product}" label="${product.name}"/>
            	</c:forEach>
        		</form:select>
		   	
		   	</h4>
		    <input type="submit" value="Add"/>
	</form:form> 
	
	<h4>Products: </h4> 
	<ul>
		<c:forEach items="${category.products}" var="prod">
			<li>
				<c:out value="${prod.name}"/>
			</li>
		</c:forEach>
	</ul> 
		
</body>
</html>