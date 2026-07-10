<%@ page language="java" import="java.util.Date"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Date and Time</title>
</head>
<body>


<%
    Date currentDate = new Date();
%>

<p>Current Date and Time: <%= currentDate %></p>

</body>
</html>