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
request.setAttribute("message","Great day");
session.setAttribute("message","Great day in session");
request.setAttribute("message","Fun day in applicstion");
%>

<h2>Using scripting</h2>

<%
String msg1=(String)request.getAttribute("message");//httpservletrequest
String msg2=(String)session.getAttribute("message");//http session
String msg3=(String)application.getAttribute("message");//servlet config

%>


<%=msg1 %><br>
<%=msg2 %><br>
<%=msg3 %><br>

<h2>Using El</h2>
${requestScope.message}
${sessionScope.message}
${applicationScope.message}

</body>
</html>