package com.ocp.day20.cyclicbarrier.callable;
/*
 	
	Here is an example of how you can modify the main method of CyclicBarrierImplCallable class to execute the tasks using a thread pool:

	
	In this modified code, a new ExecutorService with a fixed thread pool of size 3 is created using the Executors.newFixedThreadPool(3) method. 
	
	Then, the 3 Callable tasks are submitted to the thread pool using the executor.submit() method, which returns a Future object that can be used to retrieve the result of the task. 
	
	Finally, the results of the tasks are obtained using the Future.get() method, and the thread pool is shutdown using the executor.shutdown() method.

	Overall, using an ExecutorService with a thread pool is a good approach to manage the execution of multiple Callable tasks efficiently.

*/

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CyclicBarrierImplCallableWithThreadPool {

	public static void main(String[] args) {
		// Create a new CyclicBarrier with a count of 3
		CyclicBarrier barrier = new CyclicBarrier(3);

		// Create an ExecutorService with 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);

		// Create and submit 3 Callable tasks, each running an instance of the Worker
		// class.
		Callable<Integer> task1 = new Worker(barrier);
		Callable<Integer> task2 = new Worker(barrier);
		Callable<Integer> task3 = new Worker(barrier);

		int sum = 0;
		try {
			// Submit the tasks to the ExecutorService
			Future<Integer> future1 = executor.submit(task1);
			Future<Integer> future2 = executor.submit(task2);
			Future<Integer> future3 = executor.submit(task3);

			// Wait for the tasks to complete and get their results
			sum += future1.get();
			sum += future2.get();
			sum += future3.get();

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			// Shutdown the ExecutorService
			executor.shutdown();
		}
		
		System.out.println("Sum of results: " + sum);
	}

	// The Worker class implements the Callable interface, which allows it to return
	// a value.
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
				// Once all 3 Worker tasks have reached the barrier, they are released and can
				// continue executing.
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
			pool-1-thread-1 is doing some work
			pool-1-thread-3 is doing some work
			pool-1-thread-2 is doing some work
			pool-1-thread-3 is waiting at the barrier
			pool-1-thread-2 is waiting at the barrier
			pool-1-thread-1 is waiting at the barrier
			pool-1-thread-2 has crossed the barrier
			pool-1-thread-3 has crossed the barrier
			pool-1-thread-1 has crossed the barrier
			Sum of results: 3

*/
