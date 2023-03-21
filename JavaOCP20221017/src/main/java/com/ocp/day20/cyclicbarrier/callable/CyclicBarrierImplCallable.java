package com.ocp.day20.cyclicbarrier.callable;
/* 
	In this wrong example, we expected to have 3 threads executing concurrently.   
	
	The main thread starts the tasks and waits for them to complete, summing up the return values of each task. 
	
	All 3 tasks wait at the barrier until all of them have reached it, and then they proceed with their execution. 
	
	The sum of the return values of the tasks is 3, indicating that all three tasks completed successfully.
	
	However, the expected execution above will NOT be proceeded. Please see the notice below. 
	
	Notice:
		
		This example is missing the code to submit the Callable tasks to a thread pool for execution, that's why the console you see it's continually awaiting another 2 tasks to reach the barrier.
		
		In the current implementation, the tasks are being executed sequentially in the main thread, which is why you see the console-lines "main is doing some work" and "main is waiting at the barrier" instead of the messages from the Worker tasks.
	
		To execute the tasks in parallel using a thread pool, you can use a ExecutorService to submit the tasks and wait for their completion using Future objects. 
		
		Please refer to the sample code of "CyclicBarrierImplCallableWithThreadPool.java"
	
*/
import java.util.concurrent.Callable; 
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;

public class CyclicBarrierImplCallable {

   public static void main(String[] args) {
      // Create a new CyclicBarrier with a count of 3
      CyclicBarrier barrier = new CyclicBarrier(3);
      
      // Create and submit 3 Callable tasks, each running an instance of the Worker class.
      Callable<Integer> task1 = new Worker(barrier);
      Callable<Integer> task2 = new Worker(barrier);
      Callable<Integer> task3 = new Worker(barrier);

      int sum = 0;
      try {
    	 // When a Worker task runs, it does some work for 1 second and then waits at the barrier by calling the await() method of the barrier object      
         sum += task1.call();
         sum += task2.call();
         sum += task3.call();
      } catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
	  } catch (Exception e) {
		  	e.printStackTrace();
      }

      System.out.println("Sum of results: " + sum);
   }

   // The Worker class implements the Callable interface, which allows it to return a value.
   private static class Worker implements Callable<Integer> {
      
      private final CyclicBarrier barrier;

      // The Worker class takes a CyclicBarrier as a parameter in its constructor
      public Worker(CyclicBarrier barrier) {
         this.barrier = barrier;
      }
      
      @Override
      public Integer call() throws Exception {
         try {
            System.out.println(Thread.currentThread().getName() + " is doing some work");
            // Each Worker task does some work for 1 second
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
            // Once all 3 Worker tasks have reached the barrier, they are released and can continue executing. 
            barrier.await(); // wait for other threads to reach the barrier
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            // Each Worker task returns the integer value 1
            return 1;
         } catch (Exception e) {
            e.printStackTrace();
            return 0;
         }
      }
   }
}
/*
	Console:
			main is doing some work
			main is waiting at the barrier


*/
