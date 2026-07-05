package com.coforge.day4.Handson;

public class OnlineShoppingCart {
	public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 65000);
        Product p2 = new Product(102, "Mouse", 700);
        Product p3 = new Product(103, "Keyboard", 1500);

        Cart cart = new Cart();

        Customer customer = new Customer(1, "Syed Saud", cart);

        customer.displayCustomer();

        customer.getCart().addProduct(p1);
        customer.getCart().addProduct(p2);
        customer.getCart().addProduct(p3);

        customer.getCart().displayProducts();

        customer.getCart().calculateTotalBill();

        customer.getCart().removeProduct(102);

        customer.getCart().displayProducts();

        customer.getCart().calculateTotalBill();
    }
}
