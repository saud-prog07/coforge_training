<%@ page import="java.util.List"%>
<%@ page import="com.coforge.ems.model.Employee"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">

<title>Employee Details</title>

<style>

table{

border-collapse:collapse;
width:70%;
margin:auto;

}

th,td{

border:1px solid black;
padding:10px;
text-align:center;

}

th{

background-color:lightblue;

}

</style>

</head>

<body>

<h2 align="center">Employee Details</h2>

<%

String mode=(String)request.getAttribute("mode");

%>

<%

if(mode.equals("find")){

%>

<form action="EmployeeController" method="post" align="center">

Employee ID :

<input type="text" name="eid">

<input type="submit"
name="emsbutton"
value="FindEmployee">

</form>

<%

}


if("single".equals(mode)){

	List<Employee> employee =
	        (List<Employee>) request.getAttribute("employee");

	for(Employee emp : employee){

%>

<br>

<table>

<tr>

<th>ID</th>

<th>Name</th>

<th>Salary</th>

<th>Department</th>

</tr>

<tr>

<td><%=emp.getEid()%></td>

<td><%=emp.getEname()%></td>

<td><%=emp.getEsalary()%></td>

<td><%=emp.getDno()%></td>

</tr>

</table>

<%

}

%>
<%
}
%>

<%
if("all".equals(mode)){

List<Employee> employees=
(List<Employee>)request.getAttribute("employee");

%>

<table>

<tr>

<th>ID</th>

<th>Name</th>

<th>Salary</th>

<th>Department</th>

</tr>

<%

for(Employee emp:employees){

%>

<tr>

<td><%=emp.getEid()%></td>

<td><%=emp.getEname()%></td>

<td><%=emp.getEsalary()%></td>

<td><%=emp.getDno()%></td>

</tr>

<%

}

%>

</table>

<%

}

%>

<br><br>

<center>

<a href="index.jsp">Back</a>

</center>

</body>

</html>