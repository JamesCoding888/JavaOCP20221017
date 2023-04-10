package com.ocp.day20.executor.scheduledexecutorservice;
/*
 	The code consists of three classes: NewSingleThreadScheduledExecutorDemo, Lottery, and Lucky. 
 	
 	NewSingleThreadScheduledExecutorDemo class creates a single-threaded scheduled executor service, 
 	
 	schedules two tasks to run after a delay of 1 second, and prints out the results.
 	
 	
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
			System.out.println("Before running Lottery task: " + new Date());
			// Lottery Task is scheduled to run after a delay of 1 second using the schedule method of the ScheduledExecutorService		
			ScheduledFuture scheduledFuture4LotteryTask = scheduledExecutorService.schedule(new Lottery(), 1, TimeUnit.SECONDS);
			System.out.println("Get the result of the Lottery task: " + scheduledFuture4LotteryTask.get());
			System.out.println("Lottery task completed time: " + new Date());	
			System.out.println("Before running Lucky task: " + new Date());
			ScheduledFuture scheduledFuture4LuckyTask = scheduledExecutorService.schedule(new Lucky(), 1, TimeUnit.SECONDS);
			System.out.println("Get the result of the Lucky task: " + scheduledFuture4LuckyTask.get());
			System.out.println("Lucky task completed time: " + new Date());
		} catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();				
		} finally {
			scheduledExecutorService.shutdown();
		}
	}
}