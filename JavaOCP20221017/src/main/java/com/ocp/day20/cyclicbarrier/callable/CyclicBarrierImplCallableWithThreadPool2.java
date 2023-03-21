package com.ocp.day20.cyclicbarrier.callable;
/*
 	In this version, we create a thread pool with 3 threads using the Executors.newFixedThreadPool(3) method. 
 	
 	We submit each FutureTask object to the 3 pool using the submit() method of the ThreadPoolExecutor object. 
 	
 	Finally, we shut down the thread pool using the shutdown() method of the ThreadPoolExecutor object after all tasks have completed.
 	
*/

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class CyclicBarrierImplCallableWithThreadPool2 {

   public static void main(String[] args) {
      // Create a new CyclicBarrier with a count of 3
      CyclicBarrier barrier = new CyclicBarrier(3);
      
      // Create a thread pool with 3 threads
      ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
      
      // Create and submit 3 FutureTask tasks, each running an instance of the Worker class.
      FutureTask<Integer> task1 = new FutureTask<>(new Worker(barrier));
      FutureTask<Integer> task2 = new FutureTask<>(new Worker(barrier));
      FutureTask<Integer> task3 = new FutureTask<>(new Worker(barrier));
      executor.submit(task1);
      executor.submit(task2);
      executor.submit(task3);

      int sum = 0;
      try {
         // When a Worker task runs, it does some work for 1 second and then waits at the barrier by calling the await() method of the barrier object
         sum += task1.get();
         sum += task2.get();
         sum += task3.get();
      } catch (InterruptedException | ExecutionException e) {
         e.printStackTrace();
      }

      // Shutdown the thread pool
      executor.shutdown();
      
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
			pool-1-thread-2 is doing some work
			pool-1-thread-1 is doing some work
			pool-1-thread-3 is doing some work
			pool-1-thread-3 is waiting at the barrier
			pool-1-thread-2 is waiting at the barrier
			pool-1-thread-1 is waiting at the barrier
			pool-1-thread-1 has crossed the barrier
			pool-1-thread-3 has crossed the barrier
			pool-1-thread-2 has crossed the barrier
			Sum of results: 3

*/
