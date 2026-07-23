package com.coforge.dms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.dms.exception.DepartmentNotFoundException;
import com.coforge.dms.model.Department;
import com.coforge.dms.repo.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepo repo;
	private Environment environment;

	@Autowired
	public DepartmentServiceImpl(DepartmentRepo repo, Environment environment) {
		super();
		this.repo = repo;
		this.environment = environment;
	}

	@Override
	public Optional<Department> findDeptById(int dno) {
		Optional<Department> department = repo.findById(dno);
		if (! department.isPresent()) {
			throw new DepartmentNotFoundException(environment.getProperty("dms.get.failed"));
		}
		return department;
	}

	@Override
	public List<Department> findAllDepartment() {
		List<Department> department = (List<Department>) repo.findAll();
		return department;
	}

}
