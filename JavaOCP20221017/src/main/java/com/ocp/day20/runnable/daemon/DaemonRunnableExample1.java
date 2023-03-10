package com.ocp.day20.runnable.daemon;
/*
 	Continue of DaemonThreadExample1.java, we updated the inheritance of Log.java from "extends to Thread" to "implements Runnable"
 	Because only one super class could be extended to, what if we need to extend to many super classes, respectively? We will implement Runnable interface! 
 	
*/
public class DaemonRunnableExample1 {

	public static void main(String[] args) throws InterruptedException {
		
		LogImpl1 log = new LogImpl1();
		Thread daemonThread = new Thread(log);

		// set the thread as daemon
		daemonThread.setDaemon(true);
		// start the thread
		daemonThread.start(); 
		
		// main thread
		System.out.println("Main thread (high-priority thread) is running...and faster than Daemon thread (low-priority thread)");
		Thread.sleep(5000);
		System.out.println("Main thread is finished.");
	}
}

/*
	Console:
			Main thread (high-priority thread) is running...and faster than Daemon thread (low-priority thread)
			Daemon thread is running...
			Daemon thread is running...
			Daemon thread is running...
			Daemon thread is running...
			Daemon thread is running...
			Main thread is finished.

*/