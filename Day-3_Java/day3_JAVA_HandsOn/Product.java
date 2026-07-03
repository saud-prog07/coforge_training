package com.coforge.day3;

public class Product {

    int productId;
    String productName;
    int price;
    int quantity;

    public Product() {
    }

    public Product(int productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate Total Amount
    public int calculateTotal() {
        return price * quantity;
    }

    // Display Bill
    public void displayBill() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Amount : " + calculateTotal());
        System.out.println();
    }

    public static void main(String[] args) {

        Product phone = new Product(101, "iPhone 16 Pro Max", 100000, 2);
        Product tv = new Product(102, "Sony TV", 80000, 3);

        phone.displayBill();
        tv.displayBill();
    }
}