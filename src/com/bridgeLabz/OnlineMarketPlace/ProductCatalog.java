package com.bridgeLabz.OnlineMarketPlace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product<?>> productList;  // Supports multiple product types

    public ProductCatalog() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product<?> product) {
        productList.add(product);
    }

    public void displayCatalog() {
        System.out.println("\n=== Product Catalog ===");
        for (Product<?> product : productList) {
            product.displayProduct();
        }
    }

    // Generic method to apply discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = (product.getPrice() * percentage) / 100;
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied: " + percentage + "% | New Price: $" + product.getPrice());
    }
}