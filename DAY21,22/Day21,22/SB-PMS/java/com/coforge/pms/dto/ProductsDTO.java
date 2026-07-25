package com.coforge.pms.dto;

import com.coforge.pms.model.Products;

public class ProductsDTO {
	
	private Products products;
	private SupplierDTO supplier;
	
	public ProductsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductsDTO(Products products, SupplierDTO supplier) {
		super();
		this.products = products;
		this.supplier = supplier;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public SupplierDTO getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierDTO supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "ProductsDTO [products=" + products + ", supplier=" + supplier + "]";
	}
	
}
