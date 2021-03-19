<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Employee registration desk</h2>
<form method="post">  
  
<label> Firstname </label>         
<input type="text" name="firstname" size="15"/> <br> <br>  
<label> Middlename: </label>     
<input type="text" name="middlename" size="15"/> <br> <br>  
<label> Lastname: </label>         
<input type="text" name="lastname" size="15"/> <br> <br>  

<label> Salary: </label>         
<input type="number" name="salary" step="00.01"/> <br> <br>  
  
<label>   
Department :  
</label>   
<select name="department">   
<option >Quality</option>  
<option >Software Development</option>  
<option >Testing</option>  
<option >Marketing</option>  
<option >Finance</option>  
</select>  

<input type="Submit" value="Submit"/>  
</form>  
</body>
</html>