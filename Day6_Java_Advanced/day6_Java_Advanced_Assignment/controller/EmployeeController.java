package com.coforge.ems.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;
import com.coforge.ems.util.ApplicationProperties;

public class EmployeeController {
	private EmployeeService service = new EmployeeService();

	public String createEmployee(Employee employee) {
		String result = "";

		try {
			int n = service.createEmployee(employee);
			if (n == 1) {
				result = ApplicationProperties.insertSuccess;
			}
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		} catch (InvalidEmployeeObjectException e) {
			result = ApplicationProperties.dbFailed;
		}
		return result;
	}

	public String findEmployee(int empid) {
		String result = "";
		try {
			result = service.findEmployee(empid).toString();
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		} catch (InvalidEmployeeObjectException e) {
			result = ApplicationProperties.dbFailed;
		}
		return result;
	}

	public String updateSalary(int empid, int salary) {
		String result = "";
		try {
			int n = service.updateSalary(empid, salary);
			if (n == 1) {
				result = "Success : Employee Record Inserted";
			}
		} catch (ClassNotFoundException e) {
			result = "1Failed : DB ERROR";
		} catch (SQLException e) {
			result = "2Failed : DB ERROR";
		} catch (InvalidEmployeeObjectException e) {
			result = "3Failed : DB ERROR";
		}
		return result;
	}

	public String updateDepartmentNumber(int empid, int deptno) {
		String result = "";
		try {
			int n = service.updateDepartmentNumber(empid, deptno);
			if (n == 1) {
				result = "Success : Employee Record Inserted";
			}
		} catch (ClassNotFoundException e) {
			result = "1Failed : DB ERROR";
		} catch (SQLException e) {
			result = "2Failed : DB ERROR";
		} catch (InvalidEmployeeObjectException e) {
			result = "3Failed : DB ERROR";
		}
		return result;
	}

	public String delete(int empid) {
		String result = "";
		try {
			int n = service.delete(empid);
			if (n == 1) {
				result = "Success : Employee Record Inserted";
			}
		} catch (ClassNotFoundException e) {
			result = "1Failed : DB ERROR";
		} catch (SQLException e) {
			result = "2Failed : DB ERROR";
		} catch (InvalidEmployeeObjectException e) {
			result = "3Failed : DB ERROR";
		}
		return result;
	}

	public String displayAll() {
		String result = "";
		try {
			result = service.displayAll().toString();
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		} catch (InvalidEmployeeObjectException e) {
			e.toString();
		}
		return result;
	}
}
