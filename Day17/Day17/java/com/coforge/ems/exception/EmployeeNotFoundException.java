package com.coforge.ems.exception;

import org.jspecify.annotations.Nullable;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(@Nullable String property) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FAILED : Employee not found";
	}
	
}
