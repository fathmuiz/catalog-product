package com.budiluhur.catalog.model;

public class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getterv& Setter
    public String getId() { return id;}
    public String getName() { return name;}
    public double getPricce() { return price;}
    @Override
     public String toString() {
         return "[" + id + "]" + name + " -Rp"  + price;
     }
}
