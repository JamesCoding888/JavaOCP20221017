package com.ocp.day20.cyclicbarrier.thread;
/*
	This Java code demonstrates the use of CyclicBarrier from the java.util.concurrent package.

	The CyclicBarrier class provides a synchronization aid that allows a set of threads to wait for each other to reach a common barrier point. 
	
	In this code, a CyclicBarrier object is created with a count of 3, meaning that 3 threads must reach the barrier point before they can continue.

	3 instances of the Worker class are created and passed the CyclicBarrier object in their constructors. 
	
	When a Worker thread runs, it performs some work for 1 second and then waits at the barrier by calling the await() method of the CyclicBarrier object.

	Once all 3 Worker threads have reached the barrier, they are released and can continue executing. 
	
	As shown in the console output, all 3 threads wait at the barrier until all of them have reached it, and then they proceed with their execution.

	Overall, this code demonstrates how to use the CyclicBarrier class to synchronize multiple threads in a concurrent program.
	
*/
import java.util.concurrent.BrokenBarrierException;
/* 
	In this example, we create a CyclicBarrier with a count of 3, meaning that 3 threads will need to reach the barrier before they can continue.
	
	We then create and start 3 threads, each running an instance of the Worker class.
	
	Once all 3 Worker threads have reached the barrier, they are released and can continue executing. 
	
	As you can see the console below, all 3 threads wait at the barrier until all of them have reached it, and then they proceed with their execution.
	
	
	
*/
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierImplThread {

   public static void main(String[] args) {
      // Create a new CyclicBarrier with a count of 3
      CyclicBarrier barrier = new CyclicBarrier(3);

      // Create and start 3 threads
      Thread thread1 = new Thread(new Worker(barrier));
      Thread thread2 = new Thread(new Worker(barrier));
      Thread thread3 = new Thread(new Worker(barrier));
      // When a Worker thread runs, it does some work for 1 second and then waits at the barrier by calling the await() method of the barrier object
      thread1.start();
      thread2.start();
      thread3.start();
   }

   // The Worker class implements the Runnable interface
   private static class Worker implements Runnable {
      
	  private final CyclicBarrier barrier;
	  
	  // The Worker class takes a CyclicBarrier as a parameter in its constructor
      public Worker(CyclicBarrier barrier) {
         this.barrier = barrier;
      }
      
      @Override
      public void run() {
         try {
            System.out.println(Thread.currentThread().getName() + " is doing some work");
            // Each Worker task does some work for 1 second 
            // and then waits for all other threads to reach the barrier by calling the await method on the CyclicBarrier object
            // and then prints another message indicating that the thread is done.
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
            barrier.await(); // wait for other threads (i.e., 3 threads) to reach the barrier
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
         } catch (InterruptedException | BrokenBarrierException e) {
             e.printStackTrace();
         }
      }
   }
}

/*
	Console:
			Thread-1 is doing some work
			Thread-2 is doing some work
			Thread-0 is doing some work
			Thread-1 is waiting at the barrier
			Thread-2 is waiting at the barrier
			Thread-0 is waiting at the barrier
			Thread-0 has crossed the barrier
			Thread-1 has crossed the barrier
			Thread-2 has crossed the barrier

*/