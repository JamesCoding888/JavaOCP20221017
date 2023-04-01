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
    	System.out.printf("Processing order: %d, buyer: %s\n", order.getOrderId(), order.getCustomerName());
        order.getItems().forEach((Item item) -> System.out.printf("Item name: %s, Quantity: %d\n", item.getName(), item.getQuantity()));
    }
    
    private void handleException(InterruptedException e) {
        // handle the exception here
        System.out.println("Exception caught: " + e.getMessage());
        // optionally, you could log the exception or take other action
    }
}