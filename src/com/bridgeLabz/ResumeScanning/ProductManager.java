package com.bridgeLabz.ResumeScanning;

public class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void jobDescription() {
        System.out.println("Oversees product development and strategy.");
    }
}
