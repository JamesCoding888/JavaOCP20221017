package com.ocp.day20.synchronizedmethod.e_commerce;

import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<Item> items;
    
    public Order(int orderId, String customerName, List<Item> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public List<Item> getItems() {
        return items;
    }
}

