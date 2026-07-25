package com.coforge.sms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name = "supplier")
public class Suppliers {

    @Id
    @Column(name = "supplierId")
    private Long supplierId;

    @Column(name = "supplierName", nullable = false, length = 100)
    @NotBlank(message = "Supplier name cannot be blank")
    private String supplierName;
    
    @Column(name = "city", nullable = false, length = 100)
    @NotBlank(message = "City cannot be blank")
    private String city;

    // Default Constructor
    public Suppliers() {
    }

    // Parameterized Constructor
    public Suppliers(Long supplierId, String supplierName, String city) {
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