package com.ocp.day20.callable;
/*
 	The FutureTaskDemo1 class is an example of how to use FutureTask and Thread in Java. 
 	
 	Following explanation of programs:

	1) In the main method, two tasks are created - a Runnable and a Callable - and used to create two FutureTask objects. 
	  
	   The first FutureTask is created with a result value of "Runnable", while the second FutureTask is created with no result value.
	
	2) Two threads are then created using the Thread constructor, one for the Runnable and one for the FutureTask with the Callable. 
	
	3) The start() method is used to start the execution of both threads.
	
	4) Next, the get() method is called on the FutureTask with the result value to retrieve the result. This call to get() blocks until the corresponding task has completed and returns the result of the task. If an exception occurs during the task execution, an InterruptedException or ExecutionException is thrown, which are handled by the try-catch block.
	
	5) Finally, the main method completes and the program terminates. 
	
	6) Note that no explicit shutdown of the threads is necessary, as they will automatically terminate once their tasks have completed.
	
*/
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
public class FutureTaskDemo1 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Hello everybody, this is Runnable without value return");
		};
		Callable<String> callable = () -> {	
			System.out.println("Hello everybody, this is Callable with value return");	
			return "Done!";
		};
	
		FutureTask futureTask4Runnable = new FutureTask(runnable, "Runnable");
		FutureTask<Callable<String>> futureTask4Callable = new FutureTask(callable);
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(futureTask4Callable);
		thread1.start();
		thread2.start();
		
		try {
			System.out.println(futureTask4Runnable.get());			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
	}
}

/*
	Console (Notice here! JRE continues running!):
			Hello everybody, this is Runnable without value return
			Hello everybody, this is Callable with value return
*/