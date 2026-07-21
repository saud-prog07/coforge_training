package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.pms.model.Products;

import jakarta.validation.Valid;

public interface ProductService {

	boolean saveProducts(Products product);

	List<Products> findAll();

	Optional<Products> findByPid(@Valid int pid);

	List<Products> findByPname(@Valid String pname);

	List<Products> findByPrice(@Valid float price);

	List<Products> findByPquantity(@Valid int pquantity);

	boolean updateProducts(@Valid int pid, @Valid Products products);

	boolean deleteByPid(@Valid int pid);

	boolean deleteByPname(@Valid String pname);

	List<Products> getProductsByPrice(double minPrice, double maxPrice);

}
