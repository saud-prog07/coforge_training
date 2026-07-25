package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.pms.dto.SupplierDTO;
import com.coforge.pms.model.Products;

import jakarta.validation.Valid;

public interface ProductService {

	boolean saveProducts(Products product);

	List<Products> findAll();

	Optional<Products> findByPid(@Valid int productId);

	boolean updateProducts(@Valid int productId, @Valid Products products);

	boolean deleteByPid(@Valid int productId);
	
	
	SupplierDTO findSupplierDetails(Long supplierId);


}
