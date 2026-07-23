package com.coforge.ems.exception;


public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException( String property) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FAILED : Employee not found";
	}
	
}
