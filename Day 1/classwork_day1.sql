create database employees;
use employees;
create table tbl_employees(eid integer,
 ename varchar(50),esalary integer); 
 select * from tbl_employees;
 INSERT INTO tbl_employees
VALUES (101, 'Valan', 2000);
describe tbl_employees;
insert into tbl_employees
values(102,'saud',10000);
select eid,esalary from  tbl_employees;
insert into tbl_employees values
(103,null,20000);
 select * from tbl_employees where eid=101;
select ename,eid from tbl_employees where ename is null;
insert into tbl_employees values
(103,20000);
select ename from tbl_employees where esalary<20000;
select * from tbl_employees where eid in(101,102);
select * from tbl_employees where eid in(101,105);
select ename,eid from tbl_employees where ename is not null;
select * from tbl_employees where esalary between 100 and 20000;
select * from tbl_employees where esalary between 20000 and 100;
select * from tbl_employees where ename like 's%';
select * from tbl_employees where ename like '_a%';
select * from tbl_employees where ename like '%e%';
update tbl_employees set esalary=0 where eid=101;
set sql_Safe_updates=0;
update tbl_employees set esalary=0 where eid=101;
select * from tbl_employees;
rollback;
select * from tbl_employees;
delete from tbl_employees where ename is null;
select * from tbl_employees;
select 'saud',100+2000 from tbl_employees;
select eid,'saud',100+2000 from tbl_employees;
select eid,sysdate(),'saud',100+2000 from tbl_employees;
select eid as "employee id",sysdate() as "current date",'saud',100+2000 from tbl_employees;
alter table tbl_employees add column dno integer;
select * from tbl_employees;
alter table tbl_employees drop column dno;
select * from tbl_employees;
alter table tbl_employees add column dno integer;
update tbl_employees set dno=10 where eid=101;
ALTER TABLE tbl_employees
RENAME COLUMN dno TO department_id;
truncate table tbl_employees;
rename table tbl_employees to tbl_employee1;
