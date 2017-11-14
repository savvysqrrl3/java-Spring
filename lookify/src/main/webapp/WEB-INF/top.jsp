<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<h3>Top Ten Songs:</h3>
	
	<table>
		<c:forEach items="${songs}" var="song" begin= "0" end="9"> 
	    <tr>   
		    <td><c:out value="${song.rating}"/></td>
		    <td>
		    <a href="/songs/${song.id}"><c:out value="${song.title}"/></a> 
		    </td>
		    <td><c:out value="${song.artist}"/></td>
	    </tr>
		</c:forEach> 
	</table>
	

</body>
</html>