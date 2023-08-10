<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("myname");
	out.print("Welcome" + name + "<br>");

	String city = (String) request.getAttribute("city");
	out.print("City" + city + "<br>");

	Integer employeeId = (Integer) request.getAttribute("employeeId");
	out.print("EmployeeId" + employeeId + "<br>");

	Double salary = (Double) request.getAttribute("salary");
	out.print("Salary " + salary + "<br>");

	String language = (String) request.getAttribute("language");
	out.print("Language " + language + "<br>");

	String[] hobbies = (String[]) request.getAttribute("hobbies");
	out.print("Hobbies" + hobbies + "<br>");
	if (hobbies != null) {
		for(String hobby:hobbies){
			out.print("Hobby "+hobby+"<br>");}
	}
	%>
</body>
</html>