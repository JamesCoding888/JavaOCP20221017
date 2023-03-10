package com.ocp.day20.runnable.daemon;
/*
 	Continue of DaemonThreadExample1.java, we updated the inheritance of Log.java from "extends to Thread" to "implements Runnable"
 	Because only one super class could be extended to, what if we need to extend to any other class, respectively? We will do implement Runnable interface! 
 	
 	
 	In general speaking, we do encourage the use of Runnable over Thread:

	1) While extending the Thread class, we're NOT overriding any of Thread's methods. However, we do override the method of Runnable (which Thread conducts implementation of Runnable). 
	   
	   This is a clear violation of IS-A Thread principle. For more detailed info of violation of IS-A Thread principle, please read the following description:
	   
	   The "IS-A Thread" principle refers to the concept that a class that extends the Thread class is a type of thread, and should therefore be used as a thread in the same way that the Thread class is used.

	   The principle of IS-A is a fundamental principle of object-oriented programming, which states that a subclass should be able to be used anywhere that its superclass is expected. 
	   
	   In the case of threading, if a class extends the Thread class, it should be able to be used in the same way that the Thread class is used.

	   However, when extending the Thread class, it is generally not recommended to override the Thread class's run() method directly. Instead, it is recommended to implement the Runnable interface and pass an instance of the class to a Thread object's constructor. 
	   
	   This is because the Thread class provides other functionality besides just running a thread, such as managing thread states and handling thread interruptions. 
	   
	   By implementing the Runnable interface and passing it to a Thread object, we can separate the code that will actually run in the thread from the underlying thread management functionality provided by the Thread class.

	   So, while it is technically possible to override the Thread class's run() method when extending the Thread class, it is generally not recommended and can be considered a violation of the IS-A Thread principle. 
	   
	   The preferred approach is to implement the Runnable interface and separate the thread management functionality from the code that runs in the thread.
	
	2) Beginning of Java 1.8, Runnable can be represented as lambda expressions
	
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