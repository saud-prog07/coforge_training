package com.coforge.dms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.dms.model.Department;

import jakarta.validation.Valid;

public interface DepartmentService {

	public Optional<Department> findDeptById(@Valid int dno);

	public List<Department> findAllDepartment();

}
