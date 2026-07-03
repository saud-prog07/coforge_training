package com.coforge.day3;

public class Book {
	int prctId;
	private String prdctName;
	private int price;
	private int quantity;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int prctId, String prdctName, int price, int quantity) {
		super();
		this.prctId = prctId;
		this.prdctName = prdctName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void display() {
		System.out.println("Product Id " + prctId);
		System.out.println("Product Name " + prdctName);
		System.out.println("Product Price " + price);
		System.out.println("Product Quantity " + quantity);
	}

	public static void main(String args[]) {
		Book saud = new Book(1,"laptop",20000,1);
		saud.display();
	}
}
