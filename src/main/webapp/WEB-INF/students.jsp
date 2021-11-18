<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="models.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Our students</h1>
<ul>
	<% for (Student student : (List<Student>) request.getAttribute("students")) { %>
		<li>	
			<a href="/school/student?lastName=<%= student.getLastName()%>"><%= student.getLastName() %></a>
		</li>
		<% } %>
</ul>
</body>
</html>