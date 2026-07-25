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
import org.springframework.web.bind.annotation.RestController;

import com.coforge.pms.dto.ProductsDTO;
import com.coforge.pms.dto.SupplierDTO;
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

	@GetMapping("/products/{productId}")
	public ResponseEntity<?> findByPid(@Valid @PathVariable("productId") int productId) {
		ResponseEntity<?> responseEntity = null;

		Optional<Products> products = service.findByPid(productId);

		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@PutMapping("products/{pid}")
	public ResponseEntity<String> updateProducts(@Valid @PathVariable("productId") int productId,
			@Valid @RequestBody Products products) {

		ResponseEntity<String> responseEntity = null;
		boolean status = service.updateProducts(productId, products);

		return new ResponseEntity<>(environment.getProperty("pms.update.success"), HttpStatus.OK);

	}

	@DeleteMapping("/products/{productId}")
	public ResponseEntity<String> deleteByPid(@Valid @PathVariable("productId") int productId)	{
			ResponseEntity<String> responseEntity = null;
		boolean status = service.deleteByPid(productId);

		if (status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"), HttpStatus.OK);
		}
		return responseEntity;
	}



	@GetMapping("/products/suppliers/{supplierId}")
	public ResponseEntity<?> findSupplierDetails(@PathVariable("supplierId")Long supplierId){
		ResponseEntity<?> responseEntity = null;
		SupplierDTO supplier = service.findSupplierDetails(supplierId);
		return new ResponseEntity<>(supplier,HttpStatus.OK);
		
	}
	
	@GetMapping("/products/andsuppliers/{productId}")
	public ResponseEntity<?> findCompleteSupplierDetails(@Valid @PathVariable("productId")int productId){
		ResponseEntity<?> responseEntity = null;
		ProductsDTO products = new ProductsDTO();
		Products product = service.findByPid(productId).get() ;
		SupplierDTO supplier = service.findSupplierDetails(product.getSupplierId());
		products.setProducts(product);
		products.setSupplier(supplier);
		return new ResponseEntity<>(products,HttpStatus.OK);
		
	}
	
}
