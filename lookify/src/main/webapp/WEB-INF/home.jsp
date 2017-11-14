<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lookify</title>
</head>
<body>
	<a href="/songs/new">Add New</a>
	<a href="/search/topTen">Top Songs</a>
	<br>
	<form action="/search" method="get">
	<input type="text" name="searchString">
	<input type ="submit" value="Search Artists">
	</form>
	
	
	<table class="table">
		<tr>    
		    <th>Title</th>
		    <th>Rating</th>
		    <th> Actions</th>
	    </tr>
		<c:forEach items="${songs}" var="song"> 
	    
	    <tr>    
		    <td>
		    <a href="/songs/${song.id}"> 
		    <c:out value="${song.title}"/>
		    </a> 
		    </td>
		    <td><c:out value="${song.rating}"/></td>
		    <td>
		    		<a href="/songs/delete/${song.id}"> 
		    			delete 
		    		</a> 
		    </td>
	    </tr>
		</c:forEach> 
	</table>
	
</body>
</html>