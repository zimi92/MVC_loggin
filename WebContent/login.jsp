<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
<table>
	<tr><td>Login: <td><input type="text" name="user_id"/></td></tr>
	<tr><td>Password:<td> <input type="password" name="user_pass"/></td></tr>
	<tr><td><input type="submit" value="Sign in"/></td></tr>
</table>
</form>
</body>
</html>