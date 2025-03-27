package com.bridegeLabz.WarehouseManagementSystem;


class Groceries <T> extends WarehouseItem<T> {
    public Groceries(String itemName, double itemPrice,T itemId) {
        super(itemName,itemId,itemPrice);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}
