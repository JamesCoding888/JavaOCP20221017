package com.ocp.day20.executor.scheduledexecutorservice;
/*
 	
 	NewSingleThreadScheduledExecutorDemo:
 	 
 		This class demonstrates the use of the ScheduledExecutorService interface to schedule tasks for execution. 
 	
 		It creates a new instance of ScheduledExecutorService using the newSingleThreadScheduledExecutor() method of the Executors class, 
 	
 		which returns a single-threaded executor. 
 	
 		It then schedules three tasks to run after a delay of one second each using the schedule() method of the ScheduledExecutorService interface.
 			 
	 		1) The first task is an instance of the Lottery1 class	 		  	 		  
	 		
	 		2) The second task is an instance of the Lottery2 class
	 		
	 		3) The third task is an instance of the Lottery3 class
	 		

		The result of obtaining tasks:
			
			1) The first and third's task are obtained using the get() method of the ScheduledFuture interface
			
			2) The second task is obtained using the getResult() method of the Lottery2 class	
 	
*/
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class NewSingleThreadScheduledExecutorDemo {
	public static void main(String[] args) {
		// ScheduledExecutorService is created using the static factory method Executors.newSingleThreadScheduledExecutor(),
		// which returns an instance of ScheduledExecutorService that uses a single worker thread to execute tasks. 
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();		
		try {			
			System.out.println("Before running Lottery1 task: " + new Date());
			/*
			 	Lottery Task is scheduled to run after a delay of 1 second using the schedule method of the ScheduledExecutorService
			 	
			 	The schedule method takes three arguments: 
			 		
			 		1) The task to be executed (which can be an instance of Runnable or Callable)
			 		2) The delay time
			 		3) The time unit for the delay. 
			 		
			*/
			ScheduledFuture scheduledFuture4LotteryTask1 = scheduledExecutorService.schedule(new Lottery1(), 1, TimeUnit.SECONDS);
			/*
		 		The run() method of the Lottery1 class does not return any value, because Lottery1 class implements Runnable
			*/
			System.out.println("Get the result of the Lottery1 task: " + scheduledFuture4LotteryTask1.get());
			System.out.println("Lottery1 task completed time: " + new Date());	
			System.out.println("Before running Lottery2 task: " + new Date());
			Lottery2 lottery2 = new Lottery2();
			ScheduledFuture scheduledFuture4LotteryTask2 = scheduledExecutorService.schedule(lottery2, 1, TimeUnit.SECONDS);			
			System.out.println("Get the result of the Lottery task: " + lottery2.getResult().get());
			System.out.println("Lottery2 task completed time: " + new Date());
			System.out.println("Before running Lottery3 task: " + new Date());
			ScheduledFuture scheduledFuture4LotteryTask3 = scheduledExecutorService.schedule(new Lottery3(), 1, TimeUnit.SECONDS);
			System.out.println("Get the result of the Lottery3 task: " + scheduledFuture4LotteryTask3.get());
			System.out.println("Lottery3 task completed time: " + new Date());	
		} catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();				
		} finally {
			// The code uses a try-finally block to ensure that the ScheduledExecutorService is shut down after all tasks are executed.
			// The shutdown method of the ScheduledExecutorService is called to initiate a graceful shutdown of the service.
			scheduledExecutorService.shutdown();
		}
	}
}

/*
	Console:
			Before running Lottery1 task: Mon Apr 10 11:19:33 CST 2023
			The result of Lottery1 task: 23
			Get the result of the Lottery1 task: null
			Lottery1 task completed time: Mon Apr 10 11:19:34 CST 2023
			Before running Lottery2 task: Mon Apr 10 11:19:34 CST 2023
			The result of Lottery2 task: 76
			Get the result of the Lottery task: 76
			Lottery2 task completed time: Mon Apr 10 11:19:36 CST 2023
			Before running Lottery3 task: Mon Apr 10 11:19:36 CST 2023
			The result of Lottery3 task: 60
			Get the result of the Lottery3 task: 60
			Lottery3 task completed time: Mon Apr 10 11:19:37 CST 2023
*/