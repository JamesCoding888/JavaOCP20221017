package com.ocp.day20.thread.priority;

/*
 	Thread class provides a method called setPriority(int priority) to set the priority of a thread. 
 	
 	The priority parameter is an integer value that ranges from 1 (minimum) to 10 (maximum), where 5 is the default priority.

	In the code snippet daemonThread.setPriority(Thread.MIN_PRIORITY), we are setting the priority of the daemonThread to the minimum possible value using the constant Thread.MIN_PRIORITY, which has a value of 1. 
	
	This means that the thread will have a lower priority compared to other threads in the system.

	Thread priority is used by the underlying operating system to determine the order in which threads are scheduled to execute. 
	
	Higher priority threads are given preferential treatment and are executed before lower priority threads. 
	
	However, it is important to note that thread priority is only a hint to the underlying operating system, and it is ultimately up to the operating system to decide the order in which threads are executed.

	It is generally recommended to use thread priority judiciously, as setting thread priority too high or too low can have unintended consequences and negatively impact the performance and responsiveness of the application.
	
*/
import com.ocp.day20.thread.daemon.Log;

public class ThreadPriority {

	public static void main(String[] args) {
		Log log1 = new Log();
		Log log2 = new Log();
		log1.setName("CPU1");
		log2.setName("CPU2");
		log1.setPriority(Thread.MIN_PRIORITY);
		log2.setPriority(Thread.MAX_PRIORITY);
		log1.start();
		log2.start();
	}

}
