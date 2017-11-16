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
	<h2>New License</h2>
	
	<p>
		<form:form method="POST" action="/licenses/addnew" modelAttribute="license">
		    <h4>		    
		    <form:label path="person">Person :
        		<form:errors path="person" />
        		
        		<form:select path="person">
        		<c:forEach items="${people}" var="person">
            		<form:option value="${person}" label="${person.firstName}"/>
            	</c:forEach>
        		</form:select>
        		
        		</form:label>
		    </h4>
		    <h4>
		    <form:label path="state">State
		    <form:errors path="state"/>
		    <form:input path="state"/></form:label>
		    </h4>
		    <h4>		    
		    <form:label path="expiration_date">Expiration Date
		    <form:errors path="expiration_date"/>
		    <form:input type="date" path="expiration_date" pattern="MM/dd/yyyy"/>
		    </form:label>
		    </h4>
		    <h4>
		    
		    </h4>
		    <input type="submit" value="Create"/>
		</form:form>
	</p>
	
</body>
</html>