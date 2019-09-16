<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Form</h1>
	<form action="authenticateuser">
		<label for="username">
			Username:
			<input type="text" id="username" name="username"/>
			
		</label>
		<br/><br/>
		<label for="password">
			Password: 
			<input type="password" id="password" name="password"/>
		</label>
		<br/><br/>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>