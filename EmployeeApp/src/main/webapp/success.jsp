<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="com.employeeapp.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<h2>Expression Language</h2>


Employee:${employee.employeeName}<br>
City:${employee.city}<br>
Salary:${employee.salary}<br>
Department:${employee.department}<br>
Id:${employee.employeeId}<br>






<%-- <%
Employee employee = (Employee)request.getAttribute("employee");

String name=employee.getEmployeeName();
out.print("Welcome " + name +"<br>");


String city=employee.getCity();
out.print("Welcome " + city +"<br>");

Double salary =employee.getSalary();
out.print("Welcome " + salary +"<br>");

int id=employee.getEmployeeId();
out.print("Welcome " + id +"<br>");


String dept=employee.getDepartment();
out.print("Welcome " + dept +"<br>");

String[] hobbies=employee.getHobbies();
if(hobbies!=null)
	for(String hobby:hobbies)
		out.print("Hobby"+hobby+"<br>");




%> --%>
</body>
</html>