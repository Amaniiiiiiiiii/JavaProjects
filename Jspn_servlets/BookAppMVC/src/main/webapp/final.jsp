<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bookapp.model.Book"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Book book=(Book) request.getAttribute("book");%>
Title: <%=book.getTitle() %>
Author: <%=book.getAuthor() %>
Category: <%=book.getCategory()  %>
Price: <%=book.getPrice()  %>
BookId: <%=book.getBookId()  %>

</body>
</html>