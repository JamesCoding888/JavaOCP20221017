package com.ocp.day20.synchronizedmethod.e_commence2;
/*
 	We refined the code of OrderQueue2, OrderAcceptor2, and OrderProcessor2 from e_commerce package, to avoid experiencing deadlock.
*/
public class Customer2 {
    public static void main(String[] args) throws InterruptedException {                
        // Creates an OrderQueue2 object
    	OrderQueue2 queue = new OrderQueue2();
    	// The OrderAcceptor2 object is created with the OrderQueue2 object and the integer value 2 as arguments 
    	OrderAcceptor2 acceptor = new OrderAcceptor2(queue, 2);
        // A new thread is created with the OrderAcceptor2 object as the runnable object, 
    	Thread acceptorThread = new Thread(acceptor);
    	// start method is called to start the thread
        acceptorThread.start();

        // OrderProcessor2 object is created with the OrderQueue2 object as the argument
        OrderProcessor2 processor = new OrderProcessor2(queue);
        // Another thread is created with the OrderProcessor2 object as the runnable object 
        Thread processorThread = new Thread(processor);
        // start method is called to start the thread
        processorThread.start();
    }
}


/*
	1) Notice here! Caller may receive a different result as follows, Console 1 and Console 2.
		
		Console 1:
				Processing order: 916
				Processing order: 917
		
		Console 2:
				Processing order: 916
				Processing order: 917
				Processing order: 918
				
	2) Explanation of this situation:
	
		Since the OrderAcceptor2 is responsible for adding orders to the queue, 
		
		and the maxQueueSize parameter in the addOrder method is used to limit the number of orders that can be added to the queue at a time. 
		
		However, it is NOT directly related to the number of orders that will be processed by the OrderProcessor2. 
		
		In the code we provided, the OrderAcceptor2 adds 3 orders to the queue in each iteration of its loop, regardless of the maxQueueSize parameter. 
		
		So the number of orders added to the queue will depend on how long the program is running for and how often the OrderAcceptor2 is able to add orders to the queue.
		
		On the other hand, the OrderProcessor2 is responsible for processing orders from the queue one at a time, so the number of orders it processes will depend on 
		
		how quickly it is able to process each order and how often new orders are added to the queue.
		
		Finally, caller can use the following line of code, to print a message to the console 
		
		that indicates the name of the thread running the run() method of the OrderAcceptor2 and OrderProcessor2 class.
			
			'System.out.println("OrderAcceptor2 - "+ Thread.currentThread().getName());'
			'System.out.println("OrderProcessor2 - " + Thread.currentThread().getName());'

			Console 3:
				
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderProcessor2 - Thread-1
				Processing order: 917

	3) Caller may ask a question. The thread is still running but only see the result of Console 3. 
	
	   Yes, the programs was experiencing a deadlock.
	
	   Where both the 'OrderAcceptor2' and 'OrderProcessor2' threads were blocked, waiting for each other to release a shared resource. 
	   
	   The code	we added to the 'OrderAcceptor2' class, which waits if the queue is full, should help prevent this from happening.
	   
	   		// Wait if the queue is full, to avoid experiencing a deadlock
			while (queue.getBlockingQueue().size() >= maxQueueSize) {
				Thread.sleep(1000);
			}
	   
	   By waiting for the queue to have space before adding new orders, we ensure that the 'OrderProcessor2' thread has 
	   
	   a chance to remove orders from the queue and create space for new ones. 
	   
	   Without this waiting mechanism, it's possible for the 'OrderAcceptor2' thread to keep adding orders to the queue, 
	   
	   eventually causing it to become full and blocking the 'OrderProcessor2' thread.
	   
	   Let's see  the Console 4, without deadlock, below!
				
			
			Console 4:
			
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderProcessor2 - Thread-1
				Processing order: 917
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				OrderAcceptor2 - Thread-0
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				OrderProcessor2 - Thread-1
				Processing order: 916
				OrderAcceptor2 - Thread-0
				OrderAcceptor2 - Thread-0
				OrderProcessor2 - Thread-1
				Processing order: 917
				OrderProcessor2 - Thread-1
				Processing order: 918
				...

*/