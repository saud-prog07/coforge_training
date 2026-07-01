create database school;
use school;
create table tbl_students(
StudentID INT Primary Key,
Name VARCHAR(50),
Age INT,
Gender VARCHAR(10),
City VARCHAR(50));
insert into tbl_students values(101,'Rahul',20,'MALE','Hyderabad');
insert into tbl_students values(102,'Priya',19,'FEMALE','Chennai');
insert into tbl_students values(103,'Arjun',21,'MALE','Bangaluru');
insert into tbl_students values(104,'Sneha',20,'FEMALE','Mumbai');
insert into tbl_students values(105,'Kiran',22,'MALE','Pune');
select * from tbl_students;
select name,city from tbl_Students;
select name from tbl_students where age>20;
select name from tbl_students where gender='Female';
select name from tbl_students where city='Hyderabad';
SELECT Name
FROM tbl_students
ORDER BY Name ASC;
SELECT Name,age
FROM tbl_students
ORDER BY age DESC;
SELECT *
FROM tbl_students
ORDER BY City ASC, Name ASC;
select * from tbl_students where age between 19 and 21;
select * from tbl_students where name  like 'R%';
select * from tbl_students where name like '%i';
select * from tbl_students where age=19 or age=21;
update tbl_Students set city ='Delhi' where name ='Rahul';
select * from tbl_Students;
update tbl_Students set age =age+1 where name ='Arjun';
select * from tbl_Students;
delete from tbl_Students where STUDENTID=105;
select * from tbl_Students;
DELETE FROM tbl_students
WHERE City = 'Chennai';
select * from tbl_Students;