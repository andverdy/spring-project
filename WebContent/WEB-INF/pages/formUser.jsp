<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login User</h1>



	<form method="post">
		<label>Username</label><br> <input id="user" type="text"
			name="username"><br> <label>Password</label><br> <input
			id="pass" type="text" name="password"> <br> <br>
		<button formaction="viewUs">visualizza</button>

	</form>
	<a href="supermarket/codice/123/view">visualizza codice</a>
</body>
</html>