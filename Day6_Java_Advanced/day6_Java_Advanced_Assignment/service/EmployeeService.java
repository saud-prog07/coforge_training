package com.coforge.ems.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.dao.EmployeeDao;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public class EmployeeService {
	private EmployeeDao dao = new EmployeeDao();

	public int createEmployee (Employee employee)
			throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		int n = 0;
		if (employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0
				&& employee.getDno() > 0) {
			n = dao.createEmployee(employee);
		} else {
			throw new InvalidEmployeeObjectException();

		}
		return n;
	}

	public List<Employee> findEmployee(int empid)
			throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		List<Employee> listemployee ;
		if (empid > 0) {
			listemployee = dao.findEmployee(empid);
		} else {
			throw new InvalidEmployeeObjectException();

		}
		return listemployee;
	}

	public int updateSalary(int empid, int salary)
			throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		int n = 0;
		if (empid > 0 && salary >= 0) {
			n = dao.updateSalary(empid, salary);
		} else {
			throw new InvalidEmployeeObjectException();
		}
		return n;
	}
	public int updateDepartmentNumber(int empid, int deptno)
			throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		int n = 0;
		if (empid > 0 && deptno > 0) {
			n = dao.updateDepartmentNumber(empid, deptno);
		} else {
			throw new InvalidEmployeeObjectException();
		}
		return n;
	}

	public int delete(int empid) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		int n = 0;
		if (empid > 0) {
			n = dao.delete(empid);
		} else {
			throw new InvalidEmployeeObjectException();
		}
		return n;
	}
	public List<Employee> displayAll()
			throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		List<Employee> employeelist = dao.displayAll();
		return employeelist;
	}
}
