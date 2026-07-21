package com.coforge.pms.controller;

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

import com.coforge.pms.model.Products;
import com.coforge.pms.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/pms")
public class ProductController {

	private Environment environment;
	private ProductService service;

	@Autowired
	public ProductController(Environment environment, ProductService service) {
		super();
		this.environment = environment;
		this.service = service;
	}

	@PostMapping("/products")
	public ResponseEntity<String> saveProduct(@Valid @RequestBody Products product) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.saveProducts(product);

		return new ResponseEntity(environment.getProperty("pms.save.success"), HttpStatus.OK);
	}

	@GetMapping("/products")
	public ResponseEntity<?> findAll() {
		ResponseEntity<?> responseEntity = null;

		List<Products> products = service.findAll();

		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/products/{pid}")
	public ResponseEntity<?> findByPid(@Valid @PathVariable("pid") int pid) {
		ResponseEntity<?> responseEntity = null;

		Optional<Products> products = service.findByPid(pid);

		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/products/pname/{pname}")
	public ResponseEntity<?> getByPname(@Valid @PathVariable("pname") String pname) {
		ResponseEntity<?> responseEntity = null;

		List<Products> products = service.findByPname(pname);

		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/products/price/{price}")
	public ResponseEntity<?> getByPname(@Valid @PathVariable("price") float price) {
		ResponseEntity<?> responseEntity = null;

		List<Products> products = service.findByPrice(price);

		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/products/pquantity/{pquantity}")
	public ResponseEntity<?> getByPname(@Valid @PathVariable("pquantity") int pquantity) {
		ResponseEntity<?> responseEntity = null;

		List<Products> products = service.findByPquantity(pquantity);
		if (!products.isEmpty()) {
			return new ResponseEntity<>(products, HttpStatus.OK);
		}
		return null;
	}

	@PutMapping("products/{pid}")
	public ResponseEntity<String> updateProducts(@Valid @PathVariable("pid") int pid,
			@Valid @RequestBody Products products) {

		ResponseEntity<String> responseEntity = null;
		boolean status = service.updateProducts(pid, products);

		return new ResponseEntity<>(environment.getProperty("pms.update.success"), HttpStatus.OK);

	}

	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteByPid(@Valid @PathVariable("pid") int pid) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.deleteByPid(pid);

		if (status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"), HttpStatus.OK);
		}
		return responseEntity;
	}

	@DeleteMapping("/products/pname/{pname}")
	public ResponseEntity<String> deleteByPid(@Valid @PathVariable("pname") String pname) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.deleteByPname(pname);

		responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"), HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/products/findByQuantity/{pquantity}")
	public ResponseEntity<?> findProductsByQuantity(@PathVariable("pquantity") int pquantity) {
		ResponseEntity<?> responseEntity = null;

		List<Products> products = service.findByPquantity(pquantity);
		return new ResponseEntity(products, HttpStatus.OK);
	}

	@GetMapping("/products/price/{minprice}/{maxprice}")
	public ResponseEntity<?> getProductsByPrice(@PathVariable("minprice") double minPrice,
			@PathVariable("maxprice") double maxPrice) {

		List<Products> products = service.getProductsByPrice(minPrice, maxPrice);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
}
