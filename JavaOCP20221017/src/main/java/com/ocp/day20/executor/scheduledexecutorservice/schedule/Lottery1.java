package com.ocp.day20.executor.scheduledexecutorservice.schedule;

/*
	This class implements the Runnable interface and defines a run() method that generates a random number 
	
	between 0 and 100 after a delay of 500 milliseconds using the sleep() method. 
	
	The result is printed to the console.
	
	
*/
import java.util.Random;

public class Lottery1 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(500);
			int randomNumber = new Random().nextInt(100);
			System.out.println("The result of Lottery1 task: " + randomNumber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}