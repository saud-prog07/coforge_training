package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.ems.dto.DepartmentDTO;
import com.coforge.ems.dto.EmployeeDTO;
import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;
import com.coforge.ems.service.client.DepartmentClient;

import jakarta.validation.Valid;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo repo;
	private Environment environment;
	private DepartmentClient client;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepo repo, Environment environment,DepartmentClient client) {
		super();
		this.repo = repo;
		this.environment = environment;
		this.client = client;
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		repo.save(employee);
		return true;
	}

	public boolean updateEmployee(int eid, Employee employee) throws EmployeeNotFoundException {

		if (!repo.existsById(eid)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		repo.save(employee); // save here works has update if record exist other!
		return true;
	}

	@Override
	public boolean deleteByEid(int eid) {
		if (!repo.existsById(eid)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		repo.deleteById(eid);
		return true;
	}


	@Override
	public List<Employee> findByEname(String ename) throws EmployeeNotFoundException {
		List<Employee> employees = repo.findByEname(ename);
		if (employees.isEmpty()) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		return employees;
	}

	@Override
	@Transactional
	public boolean deleteByEname(String ename) throws EmployeeNotFoundException {
		int n = repo.deleteByEname(ename);
		if (n == 0) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		return true;

	}

	@Override
	public List<Integer> getEidsList() {
		List<Integer> eids = repo.getEids();
		return eids;
	}

	@Override
	public String getInfo() {
		return  repo.getInfo();
	}

	@Override
	public Optional<Employee> findByEid(int eid) {
		if (!repo.existsById(eid)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		Optional<Employee> employee = repo.findById(eid);
		
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = (List<Employee>) repo.findAll();
		return employees;
	}

	
	//Rest end points for feign client department
	@Override
	public DepartmentDTO getDepartmentById(int id) {
			DepartmentDTO department = client.getDepartmentById(id);
		return department;
	}

	@Override
	public List<DepartmentDTO> findAllDepartment() {
		List<DepartmentDTO> department = (List<DepartmentDTO>) client.findAllDepartment();
		return department;
	}
}