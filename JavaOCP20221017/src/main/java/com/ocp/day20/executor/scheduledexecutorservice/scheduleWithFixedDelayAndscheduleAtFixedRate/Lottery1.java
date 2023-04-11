package com.ocp.day20.executor.scheduledexecutorservice.scheduleWithFixedDelayAndscheduleAtFixedRate;


import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Lottery1 implements Runnable {
	// used to notify NewSingleThreadScheduledExecutorDemo2 that Lottery1 is complete
	private final CountDownLatch countDownLatch; 
	
	public Lottery1(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
	/*
	 	The run method of Lottery1 generates a random integer between 0 and 100, 
	 	sleeps for 500 milliseconds, and then prints the random integer as the result of the Lottery1 task.
	*/
	@Override
	public void run() {
		try {
			Thread.sleep(500);
			int randomNumber = new Random().nextInt(100);
			System.out.println("The result of Lottery1 task: " + randomNumber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			countDownLatch.countDown(); // notify NewSingleThreadScheduledExecutorDemo2 that Lottery1 is complete
		}
	}
}