package com.bridegeLabz.WarehouseManagementSystem;

// Main class to test the implementation
public class SmartWarehouse {
    public static void main(String[] args) {
        // Electronics storage (using Integer IDs)
        Storage<Electronics<Integer>> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics<>("Laptop", 60400, 101));
        electronicsStorage.addItem(new Electronics<>("Smartphone", 80450, 102));

        // Groceries storage (using String IDs)
        Storage<Groceries<String>> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries<>("Apples", 50, "G-001"));
        groceriesStorage.addItem(new Groceries<>("Milk", 34, "G-002"));

        // Furniture storage (using Long IDs)
        Storage<Furniture<Long>> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture<>("Chair", 700, 20014232L));
        furnitureStorage.addItem(new Furniture<>("Table", 1500, 20434302L));

        // Displaying Items
        System.out.println("Electronics:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
//Electronics:
//Item id : 101
//Item name : Laptop
//Category : Electronics
//Price : 60400.0
//Item id : 102
//Item name : Smartphone
//Category : Electronics
//Price : 80450.0
//
//Groceries:
//Item id : G-001
//Item name : Apples
//Category : Groceries
//Price : 50.0
//Item id : G-002
//Item name : Milk
//Category : Groceries
//Price : 34.0
//
//Furniture:
//Item id : 20014232
//Item name : Chair
//Category : Furniture
//Price : 700.0
//Item id : 20434302
//Item name : Table
//Category : Furniture
//Price : 1500.0