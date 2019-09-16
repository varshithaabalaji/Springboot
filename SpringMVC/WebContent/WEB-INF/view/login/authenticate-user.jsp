<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authenticate</title>
</head>
<body>
	<%
	 String username= request.getParameter("username");
	String password = request.getParameter("password");
	if(username.equals("admin") && password.equals("admin123")){
		%>
		<h3>Login success</h3>
	<% } else {
		%>
		<h3>Login failed</h3>
		<%} %>
	
	
	

</body>
</html>