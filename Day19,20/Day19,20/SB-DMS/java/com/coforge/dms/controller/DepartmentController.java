package com.coforge.dms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.dms.model.Department;
import com.coforge.dms.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/dms")
public class DepartmentController {

	private Environment environemnt;
	private DepartmentService service;

	@Autowired
	public DepartmentController(Environment environemnt, DepartmentService service) {
		super();
		this.environemnt = environemnt;
		this.service = service;
	}
	
	@GetMapping("/departments/{dno}")
	public ResponseEntity<?> findDeptById(@Valid @PathVariable("dno") int dno){
				
		Optional<Department> department = service.findDeptById(dno);
		
		return new ResponseEntity<>(department,HttpStatus.OK);
	}
	
	@GetMapping("/departments")
	public ResponseEntity<?> findAllDepartment(){
				
		List<Department> department = service.findAllDepartment();
		
		return new ResponseEntity<>(department,HttpStatus.OK);
	}

}
