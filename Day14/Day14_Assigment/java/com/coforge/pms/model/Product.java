package com.coforge.pms.model;

public class Product {
	private int ProductId;
	private String ProductName;
	private int ProductPrice;
	private int ProductQuantity;
	public Product(int productId, String productName, int productPrice, int productQuantity) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
		ProductQuantity = productQuantity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "Project [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ ", ProductQuantity=" + ProductQuantity + "]";
	}

}
