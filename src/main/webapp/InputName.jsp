<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="InputNameServlet" method="post">
	
		Name : <input type="text" name="firstName"/>${firstNameError}
		<br>
		<input type="submit" value="Submit"/>
	</form>
	
<Br> 
	<Br>
	<a href="LogoutServlet">Logout</a>


</body>
</html>