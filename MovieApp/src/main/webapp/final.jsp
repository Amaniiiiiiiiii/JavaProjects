<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String username=(String)session.getAttribute("username");
out.print("Welcome "+username);

List<String> movies=(List<String>)request.getAttribute("movies");
  for(String movie:movies)
	out.print(" "+movie);

  
  
%>
</body>
</html>