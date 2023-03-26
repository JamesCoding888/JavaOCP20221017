package com.ocp.day20.synchronizedmethod.e_commerce;

import java.util.ArrayList;
import java.util.List;

public class OrderQueue {
    private List<Order> queue = new ArrayList<>();
    
    public synchronized void addOrder(Order order) {
        queue.add(order);
        notifyAll(); // notify all waiting threads that a new order has been added
    }
    
    public synchronized Order getNextOrder() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // wait until a new order is added to the queue
        }
        return queue.remove(0);
    }
}