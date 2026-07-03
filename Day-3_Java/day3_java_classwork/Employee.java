package com.coforge.day3;

//Java Bean or POJO or Model
public class Employee {
	int eid;
	private String empname;
	private double esalary;
	
	public Employee(int eid,String empname,double esalary) {
		this.eid = eid;
		this.empname=empname;
		this.esalary=esalary;
	}
	
	public void setSalary(double esalary) {//setter
		this.esalary = esalary;
	}
	
	public double getSalary() {//getter
		return esalary;
	}
	
	public void display() {
		System.out.println("Employee Id " + eid);
		System.out.println("Employee Name " + empname);
		System.out.println("Employee Salary " + esalary);
	}
	
}
