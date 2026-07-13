<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet" href="EMSStyle.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>
	<div class="Header">
		<h1>Employee Management System</h1>
	</div>
	<br>
	<form action = "EmployeeController" method = "post">
	<div class="content">
		<table>
			<tr>
			<td>Employee ID : </td>
			<td><input type = "text" name ="eid"></td>
			</tr>
			<tr>
			<td>Employee Name : </td>
			<td><input type = "text" name = "ename"></td>
			</tr>
			<tr>
			<td>Employee Salary : </td>
			<td><input type = "text" name = "esalary"></td>
			</tr>
			<tr>
			<td>Department Number : </td>
			<td><input type = "text" name="dno"></td>
			</tr>
		</table>
		<br>
		<input type = "submit" value = "Insert" class = "btn-primary" name = "emsbutton"/>
		<input type = "submit" value = "Delete" class = "btn-danger" name = "emsbutton"/>
		<input type = "submit" value = "Update" class = "btn-warning" name = "emsbutton"/>
		<input type = "submit" value = "Find" class = "btn-success" name = "emsbutton"/>
		<input type = "submit" value = "FindAll" class = "btn-info" name = "emsbutton"/><br>
	</div>
	</form>
	<div class = "alert alert-Primary">
	<center><b>
	<%= request.getParameter("result") %>
	</b>
	</center>
	</div>
</body>
</html>