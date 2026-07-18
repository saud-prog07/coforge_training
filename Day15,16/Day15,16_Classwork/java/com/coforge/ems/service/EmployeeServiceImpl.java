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
	public boolean saveEmployee(Employee employee) throws InvalidEmployeeObjectException {

		if (employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0
				&& employee.getDno() > 0) {

			repo.save(employee);// will either return exception sql if failed and employee obj if correct we
								// need not save it because if it runs it is true if it fails it gives error and
								// terminates
			return true;

		} else {
			throw new InvalidEmployeeObjectException();
		}
	}

	public boolean updateEmployee(int eid, Employee employee) throws InvalidEmployeeObjectException,EmployeeNotFoundException {

		if (eid > 0 && employee != null && employee.getEid() > 0 && employee.getEname() != null
				&& employee.getEsalary() > 0 && employee.getDno() > 0) {
			if (!repo.existsById(eid)) {
				throw new EmployeeNotFoundException();
			}
			repo.save(employee);
			return true;
		} else {
			throw new InvalidEmployeeObjectException();
		}
	}

	public boolean deleteByEid(int eid)
			throws InvalidEmployeeObjectException, EmptyResultDataAccessException, EmployeeNotFoundException {

		if (eid > 0) {
			if (!repo.existsById(eid)) {
				throw new EmployeeNotFoundException();
			}
			repo.deleteById(eid);
			return true;
		} else {
			throw new InvalidEmployeeObjectException();
		}
	}

	public Optional<Employee> getByEid(int eid) throws InvalidEmployeeObjectException,EmployeeNotFoundException {

		if (eid > 0) {
			if (!repo.existsById(eid)) {
				throw new EmployeeNotFoundException();
			}
			Optional<Employee> employee = repo.findById(eid);
			Employee emp = employee.get();
					return employee;
		} else {
			throw new InvalidEmployeeObjectException();
		}
	}
	
	public List<Employee> findAll() {
			List<Employee> list = (List<Employee>) repo.findAll();
					return list;
	}
	
	public List<Employee> findByEname(String ename) throws InvalidEmployeeObjectException, EmployeeNotFoundException{
		if(ename != null) {
			List<Employee> employees = repo.findByEname(ename);
			if(employees.isEmpty()) {
				throw new EmployeeNotFoundException();
			}
			return employees;
			
		}else {
			throw new InvalidEmployeeObjectException();
		}
	}

	@Override
	public boolean deleteByEname(int ename) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Transactional
	@Override
	public boolean deleteByEname(String ename) throws EmployeeNotFoundException {
			if(ename != null) {
				int n = repo.deleteByEname(ename);
				if(n == 0) {
					throw new EmployeeNotFoundException();
			}else {
				return true;
			}
				}
			return false;
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

