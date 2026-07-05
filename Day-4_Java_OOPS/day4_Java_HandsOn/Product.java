package com.coforge.day4.Handson;

public class Product {
	private int prodId;
	private String prodName;
	private double price;
	public Product(int prodId, String prodName, double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return prodId;
	}
	public String getProductName() {
		return prodName;
	}
	public double getPrice() {
		return price;
	}
	
}
