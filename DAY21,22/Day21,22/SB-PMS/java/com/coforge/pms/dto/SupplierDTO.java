package com.coforge.pms.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class SupplierDTO {

	    private Long supplierId;

	    @Column(name = "supplierName", nullable = false, length = 100)
	    @NotBlank(message = "Supplier name cannot be blank")
	    private String supplierName;
	    
	    @Column(name = "city", nullable = false, length = 100)
	    @NotBlank(message = "City cannot be blank")
	    private String city;

	    // Default Constructor
	    public SupplierDTO() {
	    }

	    // Parameterized Constructor
	    public SupplierDTO(Long supplierId, String supplierName, String city) {
	        this.supplierId = supplierId;
	        this.supplierName = supplierName;
	        this.city = city;
	    }

	    // Getters and Setters
	    public Long getSupplierId() {
	        return supplierId;
	    }

	    public void setSupplierId(Long supplierId) {
	        this.supplierId = supplierId;
	    }

	    public String getSupplierName() {
	        return supplierName;
	    }

	    public void setSupplierName(String supplierName) {
	        this.supplierName = supplierName;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    @Override
	    public String toString() {
	        return "Supplier [supplierId=" + supplierId +
	               ", supplierName=" + supplierName +
	               ", city=" + city + "]";
	    }
	}

