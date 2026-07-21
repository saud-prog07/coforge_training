package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Products;
import com.coforge.pms.repo.ProductsRepo;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductsRepo repo;
	private Environment environment;

	@Autowired
	public ProductServiceImpl(ProductsRepo repo, Environment environment) {
		super();
		this.repo = repo;
		this.environment = environment;
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
	public Optional<Products> findByPid(@Valid int pid) {
		if (!repo.existsById(pid)) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		Optional<Products> products = repo.findById(pid);
		return products;
	}

	@Override
	public List<Products> findByPname(@Valid String pname) {
		List<Products> products = repo.findByPname(pname);
		if (products.isEmpty()) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		return products;
	}

	@Override
	public List<Products> findByPrice(@Valid float price) {
		List<Products> products = repo.findByPrice(price);
		if (products.isEmpty()) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		return products;
	}

	@Override
	public List<Products> findByPquantity(@Valid int pquantity) {
		List<Products> products = repo.findByPquantity(pquantity);
		if (products.isEmpty()) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		return products;
	}

	@Override
	public boolean updateProducts(@Valid int pid, @Valid Products products) {
		if (!repo.existsById(pid)) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		repo.save(products);
		return true;
	}

	@Override
	public boolean deleteByPid(@Valid int pid) {
		if (!repo.existsById(pid)) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		repo.deleteById(pid);
		return true;
	}

	@Transactional
	@Override
	public boolean deleteByPname(String pname) {

		List<Products> products = repo.findByPname(pname);

		if (products.isEmpty()) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}

		repo.deleteByPname(pname);
		return true;
	}

	@Override
	public List<Products> getProductsByPrice(double minPrice, double maxPrice) {

		List<Products> products = repo.getProductsByPrice(minPrice, maxPrice);

		if (products.isEmpty()) {
			throw new RuntimeException("No products found in the given price range.");
		}

		return products;
	}
}
