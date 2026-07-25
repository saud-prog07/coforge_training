package com.coforge.sms.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.sms.model.Suppliers;
import com.coforge.sms.service.SupplierService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/sms")
public class SupplierController {

	private Environment environment;
	private SupplierService service;

	@Autowired
	public SupplierController(Environment environment, SupplierService service) {
		super();
		this.environment = environment;
		this.service = service;
	}

	@PostMapping("/suppliers")
	public ResponseEntity<String> saveProduct(@Valid @RequestBody Suppliers supplier) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.saveSupplier(supplier);

		return new ResponseEntity(environment.getProperty("pms.save.success"), HttpStatus.OK);
	}

	@GetMapping("/suppliers")
	public ResponseEntity<?> findAll() {
		ResponseEntity<?> responseEntity = null;

		List<Suppliers> supplier = service.findAll();

		return new ResponseEntity<>(supplier, HttpStatus.OK);
	}

	@GetMapping("/suppliers/{supplierId}")
	public ResponseEntity<?> findBysupplierId(@Valid @PathVariable("supplierId") Long supplierId) {
		ResponseEntity<?> responseEntity = null;

		Optional<Suppliers> supplier = service.findBysupplierId(supplierId);

		return new ResponseEntity<>(supplier, HttpStatus.OK);
	}

	@PutMapping("products/{supplierId}")
	public ResponseEntity<String> updateProducts(@Valid @PathVariable("supplierId") int supplierId,
			@Valid @RequestBody Suppliers supplier) {

		ResponseEntity<String> responseEntity = null;
		boolean status = service.updateSupplier(supplierId, supplier);

		return new ResponseEntity<>(environment.getProperty("pms.update.success"), HttpStatus.OK);

	}

	@DeleteMapping("/suppliers/{supplierId}")
	public ResponseEntity<String> deleteByPid(@Valid @PathVariable("supplierId") int supplierId) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.deleteBysupplierId(supplierId);

		if (status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"), HttpStatus.OK);
		}
		return responseEntity;
	}

}
