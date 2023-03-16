package com.ocp.day20.callable;
/*
	The FutureTaskDemo2 class is an example of how to use FutureTask and ExecutorService in Java. Following explanation of programs, for your information:
	
	1) In the main method, two tasks are created - a Runnable and a Callable - and used to create two FutureTask objects. 
	
	   The first FutureTask is created with a result value of "Runnable", while the second FutureTask is created with no result value.
	
	2) An ExecutorService is then created using Executors.newSingleThreadExecutor(), which creates a thread pool with a single thread. 
	
	   The execute() method is used to submit both FutureTask objects and the Runnable to the executor service for execution.
	
	3) Next, the submit() method is called on the executor service to submit each of the tasks and retrieve their results using the get() method. 
	
	   The first three submit() calls are used to submit the Runnable, Callable, and the FutureTask with the result value to the executor service, respectively. 
	
	   The last submit() call is used to submit the FutureTask with no result value.
	
	4) Each call to get() blocks until the corresponding task has completed and returns the result of the task. 
	
	5) If an exception occurs during the task execution, an InterruptedException or ExecutionException is thrown, which are handled by the try-catch block.
	
	6) Finally, the shutdown() method is called on the executor service to shut it down and prevent any further tasks from being submitted. 
	
	7) If this method is not called, the JRE will continue running even after the main method has completed.
	
*/
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
public class FutureTaskDemo2 {
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
		
		/*
			Thread thread1 = new Thread(runnable);
			Thread thread2 = new Thread(futureTask4Callable);
			thread1.start();
			thread2.start();
		
			try {
				System.out.println(futureTask4Runnable.get());			
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			} 
		*/
		// Using ExecutorService to execute futureTask4Runnable and futureTask4Callable
		ExecutorService exectutorService = Executors.newSingleThreadExecutor();
		exectutorService.execute(futureTask4Runnable);
		exectutorService.execute(futureTask4Callable);
		
		try {
			// retrieve the result of the FutureTask using submit() and get()
			System.out.println(exectutorService.submit(runnable).get());
			System.out.println(exectutorService.submit(callable).get());
			System.out.println(exectutorService.submit(futureTask4Runnable).get());
			System.out.println(exectutorService.submit(futureTask4Callable).get());
			// wait for the executor service to finish executing tasks
			// without calling method of .shutdown(), the JRE will continue running!
//			exectutorService.shutdown();
			exectutorService.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}  
		finally {
            if (!exectutorService.isShutdown()) {
            	System.out.println("Woops! Overtime and now Terminate JRE!");
            	exectutorService.shutdownNow();
            }
		}
	}
}

/*
	Console:
			Hello everybody, this is Runnable without value return
			Hello everybody, this is Callable with value return
			Hello everybody, this is Runnable without value return
			null
			Hello everybody, this is Callable with value return
			Done!
			null
			null
			Woops! Overtime and now Terminate JRE!


*/