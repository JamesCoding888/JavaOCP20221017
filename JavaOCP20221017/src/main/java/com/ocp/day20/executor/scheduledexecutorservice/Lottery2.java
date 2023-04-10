package com.ocp.day20.executor.scheduledexecutorservice;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Lottery2 implements Runnable{

	// Create a CompletableFuture<Integer> object called futureResult
	private final CompletableFuture<Integer> futureResult = new CompletableFuture<>();

	/*
	 	The run method generates a random integer between 0 and 100, sleeps for 500 milliseconds, 
	 	
	 	and then sets the value of futureResult to the random integer using the complete method. 
	 	
	 	If an exception occurs during the execution of the task, futureResult is set to the exception using the completeExceptionally method. 	 	 	
	*/
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            int randomNumber = new Random().nextInt(100);
            System.out.println("The result of Lottery2 task: " + randomNumber);
            futureResult.complete(randomNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
            futureResult.completeExceptionally(e);
        }
    }

    // The getResult method returns the futureResult object, which can be used to retrieve the result of the task.
    public Future<Integer> getResult() {
        return futureResult;
    }
    
}