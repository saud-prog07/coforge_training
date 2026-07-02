CREATE TABLE Department (
   DeptID INT PRIMARY KEY,
   DeptName VARCHAR(50),
   Location VARCHAR(50)
);
INSERT INTO Department VALUES
(101,'HR','Hyderabad'),
(102,'Finance','Mumbai'),
(103,'IT','Bangalore'),
(104,'Sales','Chennai');

CREATE TABLE Employee (
   EmpID INT PRIMARY KEY,
   EmpName VARCHAR(50),
   Gender VARCHAR(10),
   Age INT,
   Salary DECIMAL(10,2),
   Designation VARCHAR(50),
   DeptID INT,
   HireDate DATE,
   FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);

INSERT INTO Employee VALUES
(1,'Amit','Male',28,45000,'Software Engineer',103,'2022-05-10'),
(2,'Priya','Female',30,55000,'HR Manager',101,'2021-03-15'),
(3,'Rahul','Male',27,50000,'Accountant',102,'2023-01-20'),
(4,'Sneha','Female',25,42000,'Sales Executive',104,'2022-09-12'),
(5,'Kiran','Male',31,60000,'Team Lead',103,'2020-11-18');

CREATE TABLE Attendance (
   AttendanceID INT PRIMARY KEY,
   EmpID INT,
   AttendanceDate DATE,
   Status VARCHAR(10),
   FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);

INSERT INTO Attendance VALUES
(1,1,'2026-07-01','Present'),
(2,2,'2026-07-01','Present'),
(3,3,'2026-07-01','Absent'),
(4,4,'2026-07-01','Present'),
(5,5,'2026-07-01','Present');

select Empname from Employee join Department on Employee.Deptid=Department.Deptid where Deptname ="IT";

select Empname from Employee where Gender="Female";

select salary from Employee order by salary DESC;

select Empname from Employee order by Empname;

select Empname from Employee where HireDate>"2022-01-01";

select count(Empid)as "Total Employees"from Employee;

select max(Salary) as maximum_salary from Employee;

select min(Salary) as mmin_salary from Employee;

select avg(Salary) as avg_salary from Employee;

select sum(Salary) as total_salary from Employee;

select count(Empid),DeptID from Employee group by DeptID;

select avg(salary),DeptID from Employee group by DeptID;

select max(salary),DeptID from Employee group by DeptID;

select Deptname from Employee join Department on Employee.DeptId=Department.Deptid;

select Empname,Deptname,Location from Employee join Department on Employee.DeptId=Department.Deptid;

select AttendanceID,AttendanceDate,Status,Empname from Employee join Attendance on Employee.EmpID=Attendance.EmpID;

UPDATE Employee
SET Salary = Salary + (Salary * (10 / 100))
WHERE DeptID = 103;

update Employee Set Designation="Accountant Manager" where Empid=3;

update Employee Set DeptID="102" where Empid=2;

delete from Employee where Salary<40000;

delete from Employee where Hiredate='2022-05-10';

CREATE VIEW EmployeeDetails AS
SELECT e.EmpID, e.EmpName, d.DeptName, e.Salary
FROM Employee e
JOIN Department d ON e.DeptID = d.DeptID;

DELIMITER //

CREATE PROCEDURE GetEmployees()
BEGIN
   SELECT * FROM Employee;
END //

call GetEmployees();
