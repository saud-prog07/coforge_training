package com.coforge.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

import jakarta.validation.Valid;

@RestController // rest full application,because it is not a web application
@RequestMapping("/api/v1/ems")
public class EmployeeController {

	private EmployeeService service;

	private Environment environment;// used because application propertirs is a .properties file not a class so this
									// helps in getting the application properties

	// field injection used for testing

	@Autowired
	public EmployeeController(EmployeeService service, Environment environment) {
		super();
		this.service = service;
		this.environment = environment;
	}

	@PostMapping("/employees")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {

		ResponseEntity<String> responseEntity = null;
		boolean status = service.saveEmployee(employee);

		responseEntity = new ResponseEntity<>(environment.getProperty("ems.save.success"), HttpStatus.CREATED);
		return responseEntity;
	}

	@PutMapping("/employees/{eid}")
	public ResponseEntity<String> updateEmployee(@Valid @PathVariable("eid") int eid, @RequestBody Employee employee) {

		ResponseEntity<String> responseEntity = null;

		boolean status = service.updateEmployee(eid, employee);

		responseEntity = new ResponseEntity<>(environment.getProperty("ems.update.success"), HttpStatus.CREATED);

		return responseEntity;
	}

	@DeleteMapping("/employees/{eid}")
	public ResponseEntity<String> deleteByEid(@PathVariable("eid") int eid) {

		ResponseEntity<String> responseEntity = null;
		boolean status = service.deleteByEid(eid);
		responseEntity = new ResponseEntity<>(environment.getProperty("ems.delete.success"), HttpStatus.CREATED);

		return responseEntity;
	}

	@GetMapping("/employees/{eid}")
	public ResponseEntity<?> getByEid(@Valid @PathVariable int eid) {

		ResponseEntity<?> responseEntity = null;

		Optional<Employee> employees = service.findByEid(eid);
		responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/employees")
	public ResponseEntity<?> findAll() {

		ResponseEntity<?> responseEntity = null;

		List<Employee> employees = service.findAll();
		responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/employees/ename/{ename}")
	public ResponseEntity<?> findByEname(@Valid @PathVariable("ename") String ename) {

		ResponseEntity<?> responseEntity = null;

		List<Employee> employees = service.findByEname(ename);

		responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/employees/ename/{ename}")
	public ResponseEntity<String> deleteByEname(@Valid @PathVariable("ename") String ename) {

		ResponseEntity<String> responseEntity = null;
		boolean status = service.deleteByEname(ename);
		responseEntity = new ResponseEntity<>(environment.getProperty("ems.delete.success"), HttpStatus.OK);

		return responseEntity;

	}

	@GetMapping("/employees/newQuery")
	public ResponseEntity<?> newQuery() {
		ResponseEntity<?> responseEntity = null;

		String string = service.getInfo();

		responseEntity = new ResponseEntity<>(string, HttpStatus.OK);

		return responseEntity;

	}
}