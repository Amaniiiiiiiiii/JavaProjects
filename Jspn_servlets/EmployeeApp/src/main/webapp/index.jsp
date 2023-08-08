<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EmployeeServlet">
	Name:<input type="text" name="employeeName"><br>
	EmployeeId:<input type="text" name="employeeId"><br>
	City:<input type="text" name="city"><br>
	Salary:<input type="text" name="salary"><br>
	Department:<select name="department">
	<option value="Q&A">Quality Assurance</option>
	<option value="DevOps">Developement Operations</option>
	<option value="Sols">Solutions</option>
	<option value="HR">Human Resource</option>
	</select><br>
	Hobbies:<input type="checkbox" name="hobbies" value="Playing">Playing
	<input type="checkbox" name="hobbies" value="Singing">Singing
	<input type="checkbox" name="hobbies" value="Dancing">Dancing
	<input type="checkbox" name="hobbies" value="Reading">Reading<br>
	<input type="submit" value="submit">
</form>
</body>
</html>