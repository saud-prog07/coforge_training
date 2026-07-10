<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%-- Jsp Declaration Tag --%>
<body>
	<%!
	String name = "saud";
	int a = 10,b=20;

%>
<br>
<%--Jsp Scriplet Tag --%>
<%
out.println("welcome " + name);
if(a>b) {
	out.println("<br>a is bigger");
}else{
	out.println("<br>b is bigger");
}
int sum = a+b;
%>
<br>
<%-- Jsp Expression Tag--%>
sum = <%=sum %>
</body>
</html>