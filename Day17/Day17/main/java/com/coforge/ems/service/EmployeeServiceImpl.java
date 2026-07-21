package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo repo;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveEmployee(Employee employee) {

		repo.save(employee);// will either return exception sql if failed and employee obj if correct we
							// need not save it because if it runs it is true if it fails it gives error and
							// terminates
		return true;
	}

	public boolean updateEmployee(int eid, Employee employee) {

		repo.save(employee);
		return true;
	}

	public boolean deleteByEid(int eid) {
		repo.deleteById(eid);
		return true;
	}

	public Optional<Employee> getByEid(int eid) {
		Optional<Employee> employee = repo.findById(eid);
		Employee emp = employee.get();
		return employee;
	}

	public List<Employee> findAll() {
		List<Employee> list = (List<Employee>) repo.findAll();
		return list;
	}

	public List<Employee> findByEname(String ename) {
		List<Employee> employees = repo.findByEname(ename);
		return employees;
	}

	@Transactional
	@Override
	public boolean deleteByEname(String ename) {
		int n = repo.deleteByEname(ename);
		return true;
	}

	@Override
	public List<Employee> findByDno(int dno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> newQuery() {
		List<String> list = repo.newQuery();
		return list;
	}

}
