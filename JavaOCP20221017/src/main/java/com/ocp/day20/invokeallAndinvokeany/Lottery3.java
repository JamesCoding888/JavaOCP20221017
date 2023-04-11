package com.ocp.day20.invokeallAndinvokeany;

/*
 	This class implements the Callable interface and defines a call() method that generates a random number 
 	
 	between 0 and 100 after a delay of 500 milliseconds using the sleep() method. 
 	
 	The result is returned as an Integer object.
*/

import java.util.Random;
import java.util.concurrent.Callable;

public class Lottery3 implements Callable{

	@Override
	public Integer call() throws Exception {
		try {
			Thread.sleep(500);
			Integer randomNumber = Integer.valueOf(new Random().nextInt(100));
			System.out.println("The result of Lottery3 task: " + randomNumber);
			return randomNumber;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		return null;
	}	
}