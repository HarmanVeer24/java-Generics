package com.bridgeLabz.OnlineMarketPlace;

public class Book extends Product<BookCategory> {
    private String author;

    public Book(String name, double price, BookCategory category, String author) {
        super(name, price, category);
        this.author = author;
    }

    @Override
    public void displayProduct() {
        System.out.println("Book: " + getName() + " | Author: " + author + " | Category: " + getCategory() + " | Price: $" + getPrice());
    }
}
