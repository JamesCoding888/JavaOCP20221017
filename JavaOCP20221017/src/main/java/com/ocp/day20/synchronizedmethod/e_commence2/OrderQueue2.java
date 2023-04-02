package com.ocp.day20.synchronizedmethod.e_commence2;

import java.util.concurrent.BlockingQueue; 
import java.util.concurrent.LinkedBlockingQueue;

public class OrderQueue2 {
    // The OrderQueue2 class, implements a blocking queue of orders. 
	// It has a private instance variable blockingQueue of type BlockingQueue<Order>, 
	// which is initialized to a new LinkedBlockingQueue<Order> object. 
	private BlockingQueue<Order> blockingQueue = new LinkedBlockingQueue<>();
 
	public BlockingQueue<Order> getBlockingQueue() {
        return blockingQueue;
    }
	// The addOrder method adds the given Order object to the blocking queue, 
	// but only if the size of the queue is less than the given maxQueueSize. 
	// If the queue is full, the method waits until space becomes available in the queue.
    public synchronized void addOrder(Order order, int maxQueueSize) throws InterruptedException {    	
        while (blockingQueue.size() >= maxQueueSize) {        	
            wait(); // wait until space becomes available in the queue
        }
        // Once the order is added to the queue 
        blockingQueue.add(order);       
        // The method calls notifyAll to notify all waiting threads that a new order has been added.
        notifyAll();        
    }

    // The getNextOrder method retrieves and removes the next order from the queue, and blocks if the queue is empty.
    public Order getNextOrder() throws InterruptedException {
        return blockingQueue.take();
    }
}

