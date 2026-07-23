package com.coforge.ems.dto;

import com.coforge.ems.model.Employee;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class EmployeeDTO {
	
	private Employee employee;
    
    private DepartmentDTO department;

    // Default Constructor
    public EmployeeDTO() {
    }

	public EmployeeDTO(Employee employee, DepartmentDTO department) {
		super();
		this.employee = employee;
		this.department = department;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employee=" + employee + ", department=" + department + "]";
	}
    
}