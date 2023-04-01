package com.ocp.day20.synchronizedmethod.e_commence2;

import java.io.FileWriter; 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class OrderProcessor implements Runnable {
    private OrderQueue queue;
    
    public OrderProcessor(OrderQueue queue) {
        this.queue = queue;
    }
    
    public void run() {
        while (true) {
            try {
                Order order = queue.getNextOrder();
                processOrder(order);
            } catch (InterruptedException e) {
                handleException(e);
            }
        }
    }
    
    private void processOrder(Order order) {
        // process the order here
        System.out.printf("Processing order: %d, buyer: %s\n", order.getOrderId(), order.getCustomerName());
        order.getItems().forEach((Item item) -> System.out.printf("Item name: %s, Quantity: %d\n", item.getName(), item.getQuantity()));
    }
    
    private void handleException(Exception e) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("exceptions.log", true));
            writer.println(new Date() + ": " + e.getMessage());
            e.printStackTrace(writer);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}