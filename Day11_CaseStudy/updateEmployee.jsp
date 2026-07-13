<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>

<script>
function showField() {

    var option = document.getElementById("option").value;

    if(option == "1") {
        document.getElementById("salaryDiv").style.display = "block";
        document.getElementById("deptDiv").style.display = "none";
    }
    else if(option == "2") {
        document.getElementById("salaryDiv").style.display = "none";
        document.getElementById("deptDiv").style.display = "block";
    }
}
</script>

</head>
<body>

<form action="EmployeeController" method="post">
Enter Employee ID to be updated<input type = "text" name = "eid">

Choose Option:
<select id="option" name="option" onchange="showField()">
    <option value="">--Select--</option>
    <option value="1">1. Update Salary</option>
    <option value="2">2. Update Department Number</option>
</select>

<br><br>

<div id="salaryDiv" style="display:none;">
    Enter Salary:
    <input type="text" name="salary">
</div>

<div id="deptDiv" style="display:none;">
    Enter Department Number:
    <input type="text" name="dno">
</div>

<br><br>

<input type="submit" name="emsbutton" value="UpdateEmployee">

</form>

</body>
</html>