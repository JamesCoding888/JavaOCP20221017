package com.ocp.day20.synchronizedmethod.e_commence2;
/*
	we can modify the addOrder() method to check if the queue has exceeded the maximum size before adding an order. 
*/



import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class OrderQueue {
    private BlockingQueue<Order> queue = new LinkedBlockingQueue<>();

    public synchronized void addOrder(Order order, int maxQueueSize) throws InterruptedException {
        while (queue.size() >= maxQueueSize) {
            wait(); // wait until space becomes available in the queue
        }
        queue.add(order);
        notifyAll(); // notify all waiting threads that a new order has been added
    }

    public Order getNextOrder() throws InterruptedException {
        return queue.take();
    }
}

