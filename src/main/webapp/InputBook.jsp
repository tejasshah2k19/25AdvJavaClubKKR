<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Input Book</h2>
	<form action="BookServlet" method="post">
		BookName : <input type="text" name="bookName"/>${bookNameError }<br><br> 
		BookPrice: <input type="text" name="bookPrice"/>${bookPriceError }<br><br>
		
		<input type="submit" value="Add Book"/> 
	
	</form>
</body>
</html>