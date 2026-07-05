package com.coforge.day4.Handson;

public class Cart {

    private Product[] products;
    private int count;

    public Cart() {
        products = new Product[10];
        count = 0;
    }

    public void addProduct(Product product) {

        if (count < products.length) {
            products[count] = product;
            count++;

            System.out.println(product.getProductName() + " Added Successfully");
        } else {
            System.out.println("Cart is Full");
        }
    }

    public void removeProduct(int productId) {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (products[i].getProductId() == productId) {

                found = true;

                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }

                products[count - 1] = null;
                count--;

                System.out.println("Product Removed Successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }
    }

    public void displayProducts() {

        System.out.println("\nProducts in Cart");

        for (int i = 0; i < count; i++) {

            System.out.println(products[i].getProductId() + " "
                    + products[i].getProductName() + " ₹"
                    + products[i].getPrice());
        }
    }

    public void calculateTotalBill() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }

        System.out.println("\nTotal Bill = ₹" + total);
    }
}