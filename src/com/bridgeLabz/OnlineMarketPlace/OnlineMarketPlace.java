package com.bridgeLabz.OnlineMarketPlace;

class OnlineMarketplace {
    public static void main(String[] args) {
        // Creating products
        Book book1 = new Book("Java Programming", 45, BookCategory.EDUCATIONAL, "James Gosling");
        Clothing tshirt = new Clothing("T-Shirt", 20, ClothingCategory.MEN, "L");
        Gadget laptop = new Gadget("MacBook", 1200, GadgetCategory.LAPTOP, "Apple");

        // Creating Catalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book1);
        catalog.addProduct(tshirt);
        catalog.addProduct(laptop);

        // Displaying all products
        catalog.displayCatalog();

        // Applying Discounts
        System.out.println("\nApplying Discounts:");
        ProductCatalog.applyDiscount(book1, 10);
        ProductCatalog.applyDiscount(tshirt, 20);
        ProductCatalog.applyDiscount(laptop, 5);

        // Displaying updated catalog
        catalog.displayCatalog();
    }
}
//
//=== Product Catalog ===
//Book: Java Programming | Author: James Gosling | Category: EDUCATIONAL | Price: $45.0
//Clothing: T-Shirt | Size: L | Category: MEN | Price: $20.0
//Gadget: MacBook | Brand: Apple | Category: LAPTOP | Price: $1200.0
//
//Applying Discounts:
//Discount applied: 10.0% | New Price: $40.5
//Discount applied: 20.0% | New Price: $16.0
//Discount applied: 5.0% | New Price: $1140.0
//
//        === Product Catalog ===
//Book: Java Programming | Author: James Gosling | Category: EDUCATIONAL | Price: $40.5
//Clothing: T-Shirt | Size: L | Category: MEN | Price: $16.0
//Gadget: MacBook | Brand: Apple | Category: LAPTOP | Price: $1140.0