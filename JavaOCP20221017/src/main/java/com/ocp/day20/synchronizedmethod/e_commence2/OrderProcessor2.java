package com.ocp.day20.synchronizedmethod.e_commence2;

import java.io.FileWriter;  
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/*
 	This class implements the Runnable interface, which means that it can be executed in a separate thread.
*/
public class OrderProcessor2 implements Runnable {
    
	private OrderQueue2 queue;

    // The OrderProcessor2 object receives an instance of the OrderQueue2 class through its constructor
    public OrderProcessor2(OrderQueue2 queue) {
        this.queue = queue;
    }

    // The run() method is the entry point for the new thread
    public void run() {
        while (true) {
            try {
            	// The OrderProcessor2 object repeatedly calls the getNextOrder() method of the OrderQueue2 object
            	// to retrieve the next order from the queue. 
            	// If there are no orders in the queue, the getNextOrder() method blocks until an order is added to the queue.
            	Order order = queue.getNextOrder();
                // Once an order is retrieved from the queue, the processOrder() method is called to process the order. 
                System.out.println("OrderProcessor2 - " + Thread.currentThread().getName());
            	processOrder(order);
              // If an InterruptedException is caught, the handleException() method is called to log the exception to a file named "exceptions.log". 
              // This method writes the exception message and stack trace to the file and closes the file.
            } catch (InterruptedException e) {
                handleException(e);
            }
        }
    }
    
    private void processOrder(Order order) {
        // The processOder() method here, could be modified to perform more complex processing, 
    	// such as updating a database or sending a message to a vendor to fulfill the order.
    	// Here, we just print out the orderId
        System.out.println("Processing order: " + order.getOrderId());
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