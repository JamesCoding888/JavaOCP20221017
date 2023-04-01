package com.ocp.day20.synchronizedmethod.e_commence2;

public class Customer2 {
    public static void main(String[] args) throws InterruptedException {                
        OrderQueue queue = new OrderQueue();
        OrderAcceptor2 acceptor = new OrderAcceptor2(queue, 2);
        Thread acceptorThread = new Thread(acceptor);
        acceptorThread.start();

        OrderProcessor processor = new OrderProcessor(queue);
        Thread processorThread = new Thread(processor);
        processorThread.start();
    }
}
