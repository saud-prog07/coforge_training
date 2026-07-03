package com.coforge.day3;

public class EmployeeApp {
	public static void main(String args[]) {
		Employee saud = new Employee(1,"saud",2000);
		saud.display();
		Employee ronaldo=new Employee(2,"ronaldo",3000);
		ronaldo.display();
		saud.setSalary(3000);
		saud.getSalary();
	}
}
