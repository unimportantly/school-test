<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="models.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Student student = (Student) request.getAttribute("student");  %>

<h1><%= student.getFirstName() + " " + student.getLastName()%></h1>
<p>
	<ul>
		<li> <%= student.getFirstName()%> is <%= student.getAge() %> years old.</li>
		<li> <%= student.getFirstName()%>'s average grade is <%= student.getGrade() %>.</li>
		<li> <%= student.getFirstName()%> is enrolled in the <%= student.getCourse().getName() %>.</li> 
	</ul>
</body>
</html>