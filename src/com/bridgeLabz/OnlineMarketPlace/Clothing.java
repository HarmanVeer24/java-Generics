package com.bridgeLabz.OnlineMarketPlace;

public class Clothing extends Product<ClothingCategory> {
    private String size;

    public Clothing(String name, double price, ClothingCategory category, String size) {
        super(name, price, category);
        this.size = size;
    }

    @Override
    public void displayProduct() {
        System.out.println("Clothing: " + getName() + " | Size: " + size + " | Category: " + getCategory() + " | Price: $" + getPrice());
    }
}
