<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Table</title>
</head>
<body>

<form method="post">

    Enter Number Whose Table is to be Printed:
    <input type="number" name="number">

    <input type="submit" value="Generate Table">

</form>

<%
    String value = request.getParameter("number");

    if(value != null){

        int num = Integer.parseInt(value);
%>

<h2>Multiplication Table of <%= num %></h2>

<%
        for(int i = 1; i <= 10; i++){
%>

<p><%= num %> x <%= i %> = <%= num * i %></p>

<%
        }
    }
%>

</body>
</html>