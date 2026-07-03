package com.coforge.day3;

public class Mobile {

    private String brand;
    private String model;
    private String ram;
    private int price;

    // Default Constructor
    public Mobile() {
        super();
    }

    // Parameterized Constructor
    public Mobile(String brand, String model, String ram, int price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.price = price;
    }

    // Getter for Brand
    public String getBrand() {
        return brand;
    }

    // Setter for Brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for Model
    public String getModel() {
        return model;
    }

    // Setter for Model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for RAM
    public String getRam() {
        return ram;
    }

    // Setter for RAM
    public void setRam(String ram) {
        this.ram = ram;
    }

    // Getter for Price
    public int getPrice() {
        return price;
    }

    // Setter for Price
    public void setPrice(int price) {
        this.price = price;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Mobile [brand=" + brand + ", model=" + model
                + ", ram=" + ram + ", price=" + price + "]";
    }

    // Main Method
    public static void main(String[] args) {

        Mobile saud = new Mobile("iPhone","iPhone 16 Pro Max","8GB",100000);

        System.out.println(saud);
    }
}