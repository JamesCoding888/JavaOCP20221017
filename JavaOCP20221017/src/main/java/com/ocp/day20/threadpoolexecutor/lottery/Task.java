package com.ocp.day20.threadpoolexecutor.lottery;

import java.util.Random;

/*
	The task implements the Runnable interface, 
	which means that it can be executed in a separate thread 
	using a thread pool or other means of concurrency.
*/
public class Task implements Runnable {
	// The run() method of the Task class contains two main parts:
    @Override
    public void run() {
        try {
        	/*
        	 	The first part sleeps for a random number of milliseconds between 0 and 9. 
        	 	This simulates some kind of processing that the task needs to perform before generating its output.
        	 */
            Thread.sleep(new Random().nextInt(10));
        } catch (InterruptedException ex) {
        }
        /*
         	The second part generates a random integer between 0 and 99 
         	using a new instance of the java.util.Random class. 
         	This simulates the actual output of the task, which could be some kind of computation, I/O operation, or other processing.
         */
        int n = new Random().nextInt(100);
        /*
         	Once the integer is generated, the task prints it to the console using System.out.println(). 
         	This output could be redirected or stored in a data structure for further processing, 
         	depending on the needs of the program.
         */
        System.out.println(n);
    }
    
}
