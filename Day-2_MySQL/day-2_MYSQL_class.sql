create database employees;
use employees;

create table tbl_employee(eid integer,
ename varchar(50),
esalary integer,
dno integer);

describe tbl_employee;

insert into tbl_employee values(101,'saud',400000,10);
insert into tbl_employee values(102,'pranay',400000,20);
insert into tbl_employee values(103,'ronaldo',300000,10);
insert into tbl_employee values(104,'messi',100000,20);

select * from tbl_employee;

select dno,count(*) from tbl_employee group by dno;

select dno,count(*) as "total number of employees" from tbl_employee group by dno;

select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_employee group by dno;

select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_employee group by dno having min(esalary)>100000 ;

select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_employee group by dno order by dno;

select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_employee group by dno order by dno desc;

select * from tbl_employee order by eid desc;

create table tbl_department(
dno integer,
dname varchar(30));

INSERT INTO tbl_department
VALUES
(10, 'development'),
(20, 'testing');

select * from tbl_department;

select dname from tbl_department where dno= (select dno from tbl_employee where eid=101);

select * from tbl_employee where dno=(select dno from tbl_department where dname ='testing');

select dname from tbl_department where dno=(select dno from tbl_employee where ename='saud');

select dname from tbl_department where dno in (select dno from tbl_employee where eid=101 or eid=102);
drop table tbl_employee;

create table tbl_employee(
eid integer primary key,
ename varchar(30) not null,
esalary integer check(esalary>0),
email varchar(30) unique,
dno integer);

insert into tbl_employee values
(101,"saud",-0,"abc@gmail",10);
drop table tbl_employee;
drop table tbl_department;

create table tbl_department(
dno integer primary key,
dname varchar(30));

drop table tbl_employee;

CREATE TABLE tbl_employee (
    eid INT PRIMARY KEY,
    ename VARCHAR(30),
    esalary INT,
    dno INT,		  
        FOREIGN KEY (dno)
        REFERENCES tbl_department(dno)
);

insert into tbl_employee values(101,"saud",20000,10);
INSERT INTO tbl_department
VALUES (10, 'Development');
insert into tbl_department values(102,"training");

update tbl_department set dno=20 where dno=102;

select * from tbl_department;

DELIMITER //

create procedure insertEmployee(in eid integer,in ename varchar(30),in esalary integer,in dno integer)
begin 
  insert into tbl_employee
  values(eid,ename,esalary,dno);
end //

call insertEmployee(101,"ronaldo",2000,10);
call insertEmployee(103,"saud",2000,20);

select * from tbl_employee;

drop procedure insertEmployee;

delimiter //
create procedure getEmployee(in empid integer,out empname varchar(20))
begin
select ename into empname from tbl_employee where eid=empid;
end //

call getEmployee(101,@empname);

select @empname as "employee name";

DELIMITER //
create function getEmpname(empid integer) returns varchar(20) deterministic
begin
 declare empname varchar(30); 
select ename into empname from tbl_employee where eid=empid; 
return empname; 
end //

select getEmpname(102) as"employee name";

CREATE TABLE agents (
    agent_code VARCHAR(10) PRIMARY KEY,
    agent_name VARCHAR(50) NOT NULL,
    working_area VARCHAR(50)
);
INSERT INTO agents (agent_code, agent_name, working_area)
VALUES
('A101', 'agent1', 'Chennai'),
('A102', 'agent2', 'Chennai'),
('A103', 'agent3', 'Bangalore'),
('A104', 'agent4', 'Bangalore');

CREATE TABLE customers (
    customer_code VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL,
    customer_area VARCHAR(50)
);

INSERT INTO customers (customer_code, customer_name, customer_area)
VALUES
('C101', 'customer1', 'Chennai'),
('C102', 'customer2', 'Chennai'),
('C103', 'customer3', 'Chennai'),
('C104', 'customer4', 'Bangalore'),
('C105', 'customer5', 'Bangalore');

 #inner join equi
 select a.agent_name, c.customer_name, c.customer_area
 from agents a join customers c on a.working_area=c.customer_area; 
 
 #inner join no equi join
 select agents.agent_name, customers.customer_name, customers.customer_area  
 from agents join customers  on agents.working_area <> customers.customer_area; 
 
 #innerjoin
  select agents.agent_name, customers.customer_name, customers.customer_area  
  from agents inner join customers  on agents.working_area = customers.customer_area; 
  
  #left outer join
  select * from agents 
  left join customers on agents.working_area = customers.customer_area; 
  
  #right outer join
   select * from agents 
   right join customers on agents.working_area = customers.customer_area; 
   
#outer join
SELECT *
FROM agents
LEFT JOIN customers
ON agents.working_area = customers.customer_area
UNION
SELECT *
FROM agents
RIGHT JOIN customers
ON agents.working_area = customers.customer_area;

#self join
select a.agent_code, b.agent_name 
from agents a, agents b where a.working_area = b.working_area; 

#natural join
select agents.agent_name, customers.customer_name, customers.customer_area  
from agents natural join customers; 

#cross join
select agents.agent_name, customers.customer_name, customers.customer_area
  from agents cross join customers; 