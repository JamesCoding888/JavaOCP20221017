package com.ocp.day20.synchronizedmethod.e_commerce;

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
        System.out.println("Processing order: " + order.getOrderId());
    }
    
    private void handleException(InterruptedException e) {
        // handle the exception here
        System.out.println("Exception caught: " + e.getMessage());
        // optionally, you could log the exception or take other action
    }
}