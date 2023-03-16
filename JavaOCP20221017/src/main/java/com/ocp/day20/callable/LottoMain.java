package com.ocp.day20.callable;
/*
 	
	1) ExecutionException: 
	
	   It is a checked exception that is thrown when an exception occurs during the execution of a task in a java.util.concurrent framework,
	   such as ExecutorService. It is a subclass of Exception and implements the Serializable interface.
	
	2) InterruptedException:
	   
	   It is an exception that is thrown when a thread is interrupted while it is waiting, sleeping, or blocking for some operation to complete. 
	   It is a subclass of Exception, but not of ExecutionException.
	
	3) While ExecutionException and InterruptedException are NOT related through inheritance, they are both commonly used in multi-threaded programming in Java to handle exceptions related to concurrent execution.
	
*/
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LottoMain {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		FutureTask<Set<Integer>> futureTask = new FutureTask<>(lotto);
		Thread thread4LuckyBall = new Thread(futureTask);
		thread4LuckyBall.start();
		
		System.out.println("Let's start up the System of Lucky Ball");
		
		try {
			System.out.printf("Lucky Balls: %s", futureTask.get());
		} catch (InterruptedException | ExecutionException e) { // Both of exceptions are irrelated inheritance
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
	Console:
				Let's start up the System of Lucky Ball
				Lucky Balls: [33, 10, 30, 4, 37, 38]
*/