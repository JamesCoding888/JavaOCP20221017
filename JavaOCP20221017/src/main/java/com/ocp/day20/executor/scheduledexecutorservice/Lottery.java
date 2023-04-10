package com.ocp.day20.executor.scheduledexecutorservice;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lottery implements Runnable {

	@Override
	public void run() {
	    System.out.print(new Date() + " [ ");
	    int jobTime = ThreadLocalRandom.current().nextInt(1500);
	    try {
	        Thread.sleep(jobTime);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    int n = ThreadLocalRandom.current().nextInt(100);
	    System.out.print(n);
	    System.out.print(" (" + jobTime + ") ");
	    System.out.println(" ] " + new Date());
	}

//	@Override
//	public void run() {
//		try {
//			Thread.sleep(500);
//			int randomNumber = new Random().nextInt(100);
//			System.out.println("The result of Lottery task: " + randomNumber);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
}