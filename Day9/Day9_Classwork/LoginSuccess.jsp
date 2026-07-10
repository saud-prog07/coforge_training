<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color ='green'>Welcome <%= session.getAttribute("Username") %></font></h1>
<% 
Cookie[] cookies = request.getCookies();
out.println("<h1><font color ='green'> Welcome " + cookies[1].getValue() + "</font></h1>");
%>

</body>
</html>