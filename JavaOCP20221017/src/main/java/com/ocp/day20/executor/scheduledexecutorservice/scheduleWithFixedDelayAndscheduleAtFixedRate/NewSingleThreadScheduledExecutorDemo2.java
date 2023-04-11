package com.ocp.day20.executor.scheduledexecutorservice.scheduleWithFixedDelayAndscheduleAtFixedRate;

/*
 	The NewSingleThreadScheduledExecutorDemo2 class demonstrates the use of a ScheduledExecutorService instance that executes two tasks: Lottery1 and Lottery2. 
 	
 	ScheduledExecutorService is a Java interface that provides methods to schedule the execution of tasks at a specified time or with a fixed delay/interval.
 	
 	Please notice the following code is unreachable. 
 	
 		scheduledFuture4LotteryTask2.get(); // wait for Lottery2 to complete
		System.out.println("Lottery2 task completed time: " + new Date());
		scheduledExecutorService.shutdown();
	
 	This is because scheduledFuture4LotteryTask2.get() will block the thread until the task is complete, but the task is scheduled to run indefinitely every second 
 	
 	using scheduleAtFixedRate(). Therefore, scheduledFuture4LotteryTask2.get() will never complete, and the subsequent code to print the completion time and 
 	
 	shutdown the executor service will never execute.
	 
*/
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class NewSingleThreadScheduledExecutorDemo2 {
	public static void main(String[] args) {
		// ScheduledExecutorService is created using the static factory method Executors.newSingleThreadScheduledExecutor(),
		// which returns an instance of ScheduledExecutorService that uses a single worker thread to execute tasks. 
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		// Creates a CountDownLatch object with an initial count of one, which is used to block the execution of Lottery2 until Lottery1 completes.
		final CountDownLatch countDownLatch = new CountDownLatch(1);
		try {
			System.out.println("Before running Lottery1 task: " + new Date());
			// The code schedules Lottery1 with a fixed delay of 1 second using scheduleWithFixedDelay method of ScheduledExecutorService
			ScheduledFuture<?> scheduledFuture4LotteryTask1 = scheduledExecutorService.scheduleWithFixedDelay(new Lottery1(countDownLatch), 1, 1, TimeUnit.SECONDS);
			// block the execution of Lottery2 until Lottery1 completes using await method of CountDownLatch 
			countDownLatch.await();
			System.out.println("Before running Lottery2 task: " + new Date());
			Lottery2 lottery2 = new Lottery2();
			/*
				Once Lottery1 is complete, NewSingleThreadScheduledExecutorDemo2 schedules Lottery2 to run at a fixed rate of 1 second 
			 	using scheduleAtFixedRate method of ScheduledExecutorService
			*/
			ScheduledFuture<?> scheduledFuture4LotteryTask2 = scheduledExecutorService.scheduleAtFixedRate(lottery2, 1, 1, TimeUnit.SECONDS);
			scheduledFuture4LotteryTask2.get(); // wait for Lottery2 to complete
			System.out.println("Lottery2 task completed time: " + new Date());

		} catch (Exception e) {
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
				Before running Lottery1 task: Mon Apr 10 17:08:07 CST 2023
				The result of Lottery1 task: 40
				Before running Lottery2 task: Mon Apr 10 17:08:08 CST 2023
				The result of Lottery1 task: 85
				The result of Lottery2 task: 5
				The result of Lottery2 task: 38
				The result of Lottery1 task: 52
				The result of Lottery2 task: 50
				The result of Lottery2 task: 31
				The result of Lottery1 task: 98
				The result of Lottery2 task: 0
				The result of Lottery2 task: 67
				The result of Lottery1 task: 29
				The result of Lottery2 task: 64
				The result of Lottery2 task: 20
				The result of Lottery1 task: 61
				The result of Lottery2 task: 80
				The result of Lottery2 task: 52
				The result of Lottery1 task: 0
				The result of Lottery2 task: 91
				The result of Lottery2 task: 1
				The result of Lottery1 task: 26
				...
*/