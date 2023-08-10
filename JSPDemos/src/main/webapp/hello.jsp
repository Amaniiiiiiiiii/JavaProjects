<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP File</title>
</head>
<body>
<h1> Hi Amani</h1>
<% String name="Amani";%>
<h6><%=" Welcome "+ name%></h6>
<% int x=10; int y=20; %>
<%="Sum = "+(x+y) %>

<%! int counter=1; %>
You are user number<%=counter++ %>
<%! String greet(){
	return "Great Day";}%>
<%= greet() %>
</body>
</html>