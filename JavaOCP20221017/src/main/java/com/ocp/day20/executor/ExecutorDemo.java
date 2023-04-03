package com.ocp.day20.executor;


/*
 	1) This code demonstrates the use of the Executor interface to execute multiple Runnable tasks asynchronously. 
 	
 		The Executor interface provides a way to decouple task submission from task execution, allowing the tasks 
 	
 		to be executed in parallel without blocking the main thread.
 	
 	
 	2) The order in which the threads are started and executed is determined by the operating system's scheduling algorithm, 
 	
 		which can vary between runs and between different systems.
 	
 	3)	It's possible that in some cases runnable1 may be executed before runnable2, 
 	
 		while in other cases runnable2 may be executed before runnable1. 
 	
 	4) This behavior is expected when working with multi-threaded applications and should be taken into consideration 
 	
 		when designing and testing such applications.
 	
*/
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;
public class ExecutorDemo {
	public static void main(String[] args) {
		/*
		 	Two Runnable tasks are defined: 
		 		1) runnable1 simply prints the current date
		 		2) runnable2 generates a random integer between 0 and 30 and prints it. 
		*/
		Runnable runnable1 = () -> System.out.println(new Date());
		Runnable runnable2 = () -> System.out.println(new Random().nextInt(30));		
		// An instance of the ExecutorTask class is created, 
		// which implements the Executor interface. 
		Executor executor = new ExecutorTask();
		/*
		 	The main method of the ExecutorDemo class creates a loop 
		 	that executes the two Runnable tasks 100 times using the Executor instance. 
		 	
		 	Since the tasks are executed asynchronously, the order of the output may vary between runs.
		*/
		for(int n = 1 ; n<=100 ; n++) {
			// The execute method of the Executor interface is overridden, 
			// which creates a new thread and starts it to execute the given Runnable task.
			executor.execute(runnable1);
			executor.execute(runnable2);	
		}		
	}
}
