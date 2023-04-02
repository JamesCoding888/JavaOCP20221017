package com.ocp.day20.synchronizedmethod.e_commence2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Arrays;

public class OrderAcceptor2 implements Runnable {
    private OrderQueue2 queue;
    private int maxQueueSize;

    // A private instance variables queue of type OrderQueue2 and maxQueueSize of type int, 
    // which are initialized in the constructor. 
    public OrderAcceptor2(OrderQueue2 queue, int maxQueueSize) {
        this.queue = queue;
        this.maxQueueSize = maxQueueSize;
    }
    // The run method contains an infinite loop that simulates 3 buyers ordering items one by one.
    public void run() {
        while (true) {
        	try {
        		// Simulation for 3 buyers, differently
        		// For each buyer, an Order object is created with a unique orderId, a name, and a list of items. 
        		for(int n = 1; n<=3 ; n++) {
        			Order order = new Order(915+n, "person_" + n, Arrays.asList(new Item("keyboard", 10))); // get the next order from the website
        			// The addOrder method of the OrderQueue2 object is called with the Order object and maxQueueSize as arguments.
        			System.out.println("OrderAcceptor2 - "+ Thread.currentThread().getName());
        			queue.addOrder(order, maxQueueSize);
        			
        			// Wait if the queue is full, to avoid experiencing a deadlock
//        			/*        				
                    	while (queue.getBlockingQueue().size() >= maxQueueSize) {
                        	Thread.sleep(1000);
                    	}
//                  */
        		}
        	  // If the addOrder method throws an InterruptedException, 
        	  // the handleException method is called to log the exception message and stack trace to a file named "exceptions.log".
            } catch (InterruptedException e) {
                handleException(e);
            }
        }
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