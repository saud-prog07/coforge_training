package com.coforge.dms.repo;

import org.springframework.data.repository.CrudRepository;

import com.coforge.dms.model.Department;

public interface DepartmentRepo extends CrudRepository<Department,Integer>{

}
