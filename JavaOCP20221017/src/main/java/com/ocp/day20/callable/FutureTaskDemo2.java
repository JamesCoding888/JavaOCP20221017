package com.ocp.day20.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
public class FutureTaskDemo2 {
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
		
		/*
			Thread thread1 = new Thread(runnable);
			Thread thread2 = new Thread(futureTask4Callable);
			thread1.start();
			thread2.start();
		
			try {
				System.out.println(futureTask4Runnable.get());			
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			} 
		*/
		// Using ExecutorService to execute futureTask
		ExecutorService exectutorService = Executors.newSingleThreadExecutor();
		exectutorService.execute(futureTask4Runnable);
		exectutorService.execute(futureTask4Callable);
		
		try {
			// 1st implementation - exectutorService.submit(runnable)
			// 2nd implementation - .get()
			System.out.println(exectutorService.submit(runnable).get());
			// 1st implementation - exectutorService.submit(callable)
			// 2nd implementation - .get()
			System.out.println(exectutorService.submit(callable).get());
			// 1st implementation - exectutorService.submit(futureTask4Runnable)
			// 2nd implementation - .get()
			System.out.println(exectutorService.submit(futureTask4Runnable).get());
			// 1st implementation - exectutorService.submit(futureTask4Callable)
			// 2nd implementation - .get()
			System.out.println(exectutorService.submit(futureTask4Callable).get());
			// without calling method of .shutdown(), the JRE will continue running!
			exectutorService.shutdown();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
	}
}

/*
	Console:
			Hello everybody, this is Runnable without value return
			Hello everybody, this is Callable with value return
			Hello everybody, this is Runnable without value return
			null
			Hello everybody, this is Callable with value return
			Done!
			null
			null

*/