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
<% Course course = (Course) request.getAttribute("course");  %>

<h1><%= course.getName()%></h1>
<p>
	<ul>
		<li>This <%= course.getName()%> will cover <%= course.getProgram() %>.</li>
		<li>This <%= course.getName()%> is followed by <%= course.getNbOfStudents() %> students.</li>
	</ul>
</body>
</html>