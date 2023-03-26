package com.ocp.day20.synchronizedmethod.e_commerce;

public class Customer {
    public static void main(String[] args) throws InterruptedException {                
        OrderQueue queue = new OrderQueue();
        OrderAcceptor acceptor = new OrderAcceptor(queue);
        Thread acceptorThread = new Thread(acceptor);
        acceptorThread.start();

        OrderProcessor processor = new OrderProcessor(queue);
        Thread processorThread = new Thread(processor);
        processorThread.start();
    }
}