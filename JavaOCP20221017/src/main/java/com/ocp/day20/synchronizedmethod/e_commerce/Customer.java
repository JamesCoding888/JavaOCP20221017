package com.ocp.day20.synchronizedmethod.e_commerce;
/*
 	1. This code represents a simple implementation of a producer-consumer pattern in Java. 
 	
 	2. The OrderQueue class represents the shared buffer where the orders are stored.
 	
 	3. The OrderAcceptor class acts as the producer, adding orders to the queue, while the OrderProcessor class acts as the consumer, processing orders from the queue.
 	
 	   When the program starts, a new OrderQueue instance is created, and two threads are started: 
 		
 			i.  One for the OrderAcceptor 
 			ii. Another for the OrderProcessor 
 		
 	4. The OrderAcceptor thread generates new orders and adds them to the queue using the addOrder method of the OrderQueue class.
 	
 	5. The OrderProcessor thread consumes orders from the queue using the getNextOrder method of the OrderQueue class and processes them using the processOrder method of the OrderProcessor class.
 
 	6. The synchronized keyword is used in the OrderQueue class to ensure that only one thread can access the queue at a time, avoiding race conditions. 
 	
 	7. The wait and notifyAll methods are used to signal when a new order is added to the queue or when the queue is empty.
 	
 	8. Overall:
 	   
 	   This code is a good example of how to implement the producer-consumer pattern in Java using multithreading and synchronization. 
 	
 	   However, there are some potential issues with this implementation, such as the possibility of the queue becoming too large and consuming too much memory, or the potential for the program to become deadlocked 
 	
       if the wait and notifyAll methods are not used correctly. 
 	
 	   Therefore, it's important to carefully consider these issues and design the code accordingly.
 	
 	
*/
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
