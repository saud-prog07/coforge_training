package com.coforge.day4.Handson;

public class Customer {

    private int customerId;
    private String customerName;

    private Cart cart;

    public Customer(int customerId, String customerName, Cart cart) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.cart = cart;
    }

    public void displayCustomer() {

        System.out.println("Customer ID : " + customerId);
        System.out.println("Customer Name : " + customerName);
    }

    public Cart getCart() {
        return cart;
    }
}