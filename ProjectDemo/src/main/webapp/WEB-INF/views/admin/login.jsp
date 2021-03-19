<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  uri="http://www.springframework.org/tags" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Admin login Page</h3>
	<form method="post">
	<h4 style="color:'red'">${requestScope.msg}</h4>
    <div class="container">
    <label for="email"><b>Email</b></label>
    <input type="email" name="email" required/>
	<br>
    <label for="password"><b>Password</b></label>
    <input type="password"  name="password" required/>

    <button type="submit">Login</button>
    </div>
</form>
</body>
</html>