package com.ocp.day20.synchronizedmethod.e_commence2;

public class Item {
    private String name;
    private int quantity;
    
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public int getQuantity() {
        return quantity;
    }
}