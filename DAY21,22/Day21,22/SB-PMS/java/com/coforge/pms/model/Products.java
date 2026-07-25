package com.coforge.pms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Products {
	@Id
	@Column(name = "productId")
	@NotNull
	private int productId;

	@Column(name = "productName")
	@NotBlank
	private String productName;

	@Column(name = "price")
	@NotNull
	private float price;

	@Column(name = "quantity")
	@NotNull
	private int quantity;
	
	@Column(name = "supplierId")
	@NotNull
	private Long supplierId;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(@NotNull int productId, @NotBlank String productName, @NotNull float price, @NotNull int quantity,
			@NotNull Long supplierId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.supplierId = supplierId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + ", supplierId=" + supplierId + "]";
	}
	
	

}