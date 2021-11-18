<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="models.Course" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% for (Course course : (List<Course>) request.getAttribute("courses")) { %>
		<li>	
			<a href="/school/course?name=<%= course.getName()%>"><%= course.getName() %></a>
		</li>
		<% } %>
</body>
</html>