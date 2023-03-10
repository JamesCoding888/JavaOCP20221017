package com.ocp.day20.thread.daemon;
/*
 	Of this lesson, we create a daemon thread that runs an infinite loop, printing a message every second. 
 	We set the daemon flag to true which is likely calling method of setDaemon(true) to mark the thread as a daemon thread.

	In the main thread, we print a message and sleep for 5 seconds before printing another message. 
	Because the daemon thread is running in the background and does not block the main thread, the program will exit after the main thread finishes execution, 
	even though the daemon thread is still running.
	
	For the specifically operation of Daemon thread, please refer to the DaemonThreadExample2.java
	
*/
public class DaemonThreadExample1 {

	public static void main(String[] args) throws InterruptedException {
		// Create a daemon thread with Java 1.1 - Anonymous class
		/*
			Runnable runnable = new Runnable() {
				
				public void run() {
					while (true) {
						System.out.println("Daemon thread is running...");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			
			Thread daemonThread = new Thread(runnable);
		*/
		
		
		// Create a daemon thread with Java 1.8 - Lambda Expression
//		/*
			Thread daemonThread = new Thread(() -> {
				while (true) {
					System.out.println("Daemon thread is running...");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
//		*/
		
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