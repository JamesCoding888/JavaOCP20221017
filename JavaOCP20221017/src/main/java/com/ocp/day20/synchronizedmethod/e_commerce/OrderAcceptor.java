package com.ocp.day20.synchronizedmethod.e_commerce;

import java.util.Arrays;

public class OrderAcceptor implements Runnable {
    private OrderQueue queue;
    
    public OrderAcceptor(OrderQueue queue) {
        this.queue = queue;
    }
    
    public void run() {
        while (true) {
            Order order = new Order(915, "James", Arrays.asList(new Item("keyboard", 10))); // get the next order from the website
            queue.addOrder(order);           
        }
    }
}

