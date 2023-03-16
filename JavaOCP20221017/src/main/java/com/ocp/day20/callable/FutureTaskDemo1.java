package com.ocp.day20.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
public class FutureTaskDemo1 {
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
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(futureTask4Callable);
		thread1.start();
		thread2.start();
		
		try {
			System.out.println(futureTask4Runnable.get());			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
	}
}

/*
	Console:
			Hello everybody, this is Runnable without value return
			Hello everybody, this is Callable with value return
*/