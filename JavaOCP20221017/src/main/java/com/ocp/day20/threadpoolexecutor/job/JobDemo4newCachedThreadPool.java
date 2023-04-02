package com.ocp.day20.threadpoolexecutor.job;

/*
	1. This code implements a thread pool using the ThreadPoolExecutor class in Java. 
	   The program creates a thread pool using the Executors.newCachedThreadPool() method, 
	   which creates a thread pool that creates new threads as needed and reuses previously constructed threads when they are available.
	
	2. The program then submits 5 tasks to the thread pool, alternating between Task1 and Task2. 
	   Each task simulates some work by sleeping for a random amount of time between 1 and 5 seconds using TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1).
	
	3. After all tasks have been submitted, the program initiates a graceful shutdown of the thread pool using executors.shutdown(). 
	   The program then waits for 5 seconds for all tasks to be completed using executors.awaitTermination(5, TimeUnit.SECONDS). 
	   If any threads inside the thread pool are not executed completely, the program outputs the thread name that is awaiting for remaining thread(s) being executed. 
	   Otherwise, the program prints out "All tasks were executed and completed, so Pool thread was closed!".
	   
	4. The Task1 and Task2 classes implement the Runnable interface, which allows them to be executed in a thread pool. 
	   Each task simulates some work by sleeping for a random amount of time between 1 and 5 seconds using TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1). 
	   When the task is executed, it outputs a message to the console indicating that it has been assigned to the thread pool and another message indicating that it has been executed.
	
*/

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JobDemo4newCachedThreadPool {
	public static void main(String[] args) {
		// The Executors.newCachedThreadPool() method creates a thread pool that creates new threads as needed, 
		// but will reuse previously constructed threads when they are available.
        ThreadPoolExecutor executors = (ThreadPoolExecutor)Executors.newCachedThreadPool();       
        // The program submits five tasks to the thread pool, alternating between Task1 and Task2.      
        executors.submit(new Task1());
        executors.submit(new Task2());
        executors.submit(new Task1());
        executors.submit(new Task2());
        executors.submit(new Task1());
        executors.submit(new Task2());
        
        // Once all tasks have been submitted, the shutdown() method is called to initiate a graceful shutdown of the thread pool
        executors.shutdown();        
		try {
			// Any threads inside the thread pool are not executed completely, 
			// then output the thread name that is awaiting for remaining thread(s) being executed, in 5 seconds
			// Otherwise, will NOT await 5 seconds but continue the next line to print out 'All tasks were executed and completed, so Pool thread was closed!'
	    	String threadName = Thread.currentThread().getName();
			while (!executors.awaitTermination(5, TimeUnit.SECONDS)) {
				System.out.println(threadName + " ->  awaiting all task(s) inside the thread pool to be executedly!");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}        
        System.out.println("All tasks were executed and completed, so Pool thread was closed!");   
    }
}


/*
	Console:
			pool-1-thread-1 -> Assign Task1 to thread pool
			pool-1-thread-5 -> Assign Task1 to thread pool
			pool-1-thread-3 -> Assign Task1 to thread pool
			pool-1-thread-2 -> Assign Task2 to thread pool
			pool-1-thread-6 -> Assign Task2 to thread pool
			pool-1-thread-4 -> Assign Task2 to thread pool
			pool-1-thread-3 -> Task1 is executed!
			pool-1-thread-2 -> Task2 is executed!
			pool-1-thread-5 -> Task1 is executed!
			pool-1-thread-1 -> Task1 is executed!
			pool-1-thread-4 -> Task2 is executed!
			pool-1-thread-6 -> Task2 is executed!
			All tasks were executed and completed, so Pool thread was closed!


*/

