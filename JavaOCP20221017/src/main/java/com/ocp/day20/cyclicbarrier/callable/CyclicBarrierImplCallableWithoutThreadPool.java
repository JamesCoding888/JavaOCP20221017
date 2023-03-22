package com.ocp.day20.cyclicbarrier.callable;
/*
 	
	Here is an example of how you can modify the main method of CyclicBarrierImplCallable class:

	This example does NOT use a thread pool explicitly. 
	
	Instead, we create 3 new threads explicitly using the new Thread(task).start() method to submit each FutureTask to a new thread for execution.  
	
	
	
	Notice:
	
		This approach creates a new thread for each task and is NOT very efficient, especially if we need to execute a large number of tasks. 
		
		A better approach is to use a thread pool, which can manage a group of threads and reuse them to execute multiple tasks.
		
		Please refer to CyclicBarrierImplCallableWithThreadPool.java and CyclicBarrierImplCallableWithThreadPool2.java for a better approach.

	

*/

import java.util.concurrent.Callable; 
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CyclicBarrierImplCallableWithoutThreadPool {

	public static void main(String[] args) {
		// Create a new CyclicBarrier with a count of 3
		CyclicBarrier barrier = new CyclicBarrier(3);

		// Create and submit 3 FutureTask tasks, each running an instance of the Worker
		// class.
		FutureTask<Integer> task1 = new FutureTask<>(new Worker(barrier));
		FutureTask<Integer> task2 = new FutureTask<>(new Worker(barrier));
		FutureTask<Integer> task3 = new FutureTask<>(new Worker(barrier));
		
		int sum = 0;
		try {
			// Submit the tasks to the thread pool
			new Thread(task1).start();
			new Thread(task2).start();
			new Thread(task3).start();

			// When a Worker task runs, it does some work for 1 second and then waits at the
			// barrier by calling the await() method of the barrier object
			sum += task1.get();
			sum += task2.get();
			sum += task3.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
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
			Thread-1 is doing some work
			Thread-0 is doing some work
			Thread-2 is doing some work
			Thread-0 is waiting at the barrier
			Thread-2 is waiting at the barrier
			Thread-1 is waiting at the barrier
			Thread-1 has crossed the barrier
			Thread-0 has crossed the barrier
			Thread-2 has crossed the barrier
			Sum of results: 3

 */
