package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.pms.dto.SupplierDTO;
import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Products;
import com.coforge.pms.repo.ProductsRepo;
import com.coforge.pms.service.client.SupplierClient;

import jakarta.validation.Valid;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductsRepo repo;
	private Environment environment;
	private SupplierClient client;

	@Autowired
	public ProductServiceImpl(ProductsRepo repo, Environment environment,SupplierClient client) {
		super();
		this.repo = repo;
		this.environment = environment;
		this.client = client;
	}

	@Override
	public boolean saveProducts(Products product) {
		repo.save(product);
		return true;
	}

	@Override
	public List<Products> findAll() {

		List<Products> list = (List<Products>) repo.findAll();
		return list;
	}

	@Override
	public Optional<Products> findByPid(@Valid int productId) {
		if (!repo.existsById(productId)) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		Optional<Products> products = repo.findById(productId);
		return products;
	}

	@Override
	public boolean updateProducts(@Valid int productId, @Valid Products products) {
		if (!repo.existsById(productId)) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		repo.save(products);
		return true;
	}

	@Override
	public boolean deleteByPid(@Valid int productId) {
		if (!repo.existsById(productId)) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		repo.deleteById(productId);
		return true;
	}

	@Override
	public SupplierDTO findSupplierDetails(Long supplierId) {
		SupplierDTO supplier = client.findSupplierDetails(supplierId);
		return supplier;
	}

}
