package com.ocp.day20.synchronizedmethod.e_commence2;
/*
	In this updated version of the OrderAcceptor class, we pass the maxQueueSize parameter to the addOrder() method and catch any InterruptedException that may be thrown by the addOrder() method. 
 	
 	We also added a handleException() method to handle the exception appropriately.
*/


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Arrays;

public class OrderAcceptor2 implements Runnable {
    private OrderQueue queue;
    private int maxQueueSize;

    public OrderAcceptor2(OrderQueue queue, int maxQueueSize) {
        this.queue = queue;
        this.maxQueueSize = maxQueueSize;
    }

    public void run() {
        while (true) {
        	try {
        		// Simulation for 3 buyers, differently
        		for(int n = 1; n<=3 ; n++) {
        			Order order = new Order(915+n, "person_" + n, Arrays.asList(new Item("keyboard", 10))); // get the next order from the website	
        			queue.addOrder(order, maxQueueSize);
        		}
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
