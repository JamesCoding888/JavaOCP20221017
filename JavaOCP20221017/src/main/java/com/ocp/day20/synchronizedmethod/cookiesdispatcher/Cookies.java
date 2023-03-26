package com.ocp.day20.synchronizedmethod.cookiesdispatcher;
/* 
 * This is a Java class named Cookies that simulates a plate of cookies that can be eaten by a dog and refilled by an owner.
 * 
 * The class has a boolean variable empty that represents whether the plate is empty or not. 
 * 
 * The class also has two synchronized methods, 'eat' and 'put', that represent the dog eating cookies and the owner refilling the plate, respectively.
 * 
 * eat method:
 * 		
 * 			The eat method waits for the plate to be filled with cookies (i.e., empty is true) using a while loop and the wait() method. 
 * 
 * 			Once the plate has cookies, the method prints out a message indicating that the dog has eaten a certain number of cookies, 
 * 
 * 			marks the plate as empty again, and notifies any waiting threads (i.e., the notifyAll() method) that the plate is now empty 
 * 
 * 			and the owner can refill it. 
 * 
 * 			This method can throw an InterruptedException if the thread is interrupted while waiting.
 * 
 * put method:
 * 
 * 			The put method waits for the plate to be empty (i.e., empty is true) using a while loop and the wait() method. 
 * 
 * 			Once the plate is empty, the method prints out a message indicating that the owner has put a certain number of cookies on the plate, 
 * 
 * 			marks the plate as not empty, and notifies any waiting threads (i.e., the notifyAll() method) that the plate now has cookies. 
 * 
 * 			This method can also throw an InterruptedException if the thread is interrupted while waiting.
 * 
 * 
 * Both methods are synchronized, which means that only one thread can execute them at a time. 
 * 
 * This is necessary to ensure that the empty variable is properly synchronized and 
 * 
 * that no race conditions occur when multiple threads try to access the plate at the same time.
 * 
 * Notice here:
 * 	
 * 		If the methods of 'eat' or 'put' don't add 'synchronized' keyword, then the "java.lang.IllegalMonitorStateException: current thread is not owner" exception is typically thrown 
 * 		
 * 		when a thread attempts to invoke wait(), notify(), or notifyAll() methods on an object's monitor that it does not own.
 * 		
 * 		In Java, threads can access the monitor of an object through the synchronized keyword. When a thread acquires a monitor using synchronized, it becomes the owner of that monitor, and no other thread can enter the synchronized block until the current thread exits it.
 * 		
 * 		If a thread tries to invoke the wait(), notify(), or notifyAll() methods on an object's monitor that it does not own, the "java.lang.IllegalMonitorStateException: current thread is not owner" exception is thrown.
 * 
 * 		To resolve this issue, ensure that your code is properly synchronized and that the thread invoking these methods actually owns the monitor. 
 * 
 * 		Make sure that any wait(), notify(), or notifyAll() method calls are made from within a synchronized block, and that the thread invoking them is the owner of that monitor.
 *
 */
public class Cookies{
	// default value of plate
	private boolean empty = true;
	// The method named 'eat' that takes an integer parameter number
	// and may throw an InterruptedException if the thread is interrupted while waiting. 
	public synchronized void eat(int number) throws InterruptedException {
		// if the plate is empty
		while(empty) {
			wait();
		}
		System.out.printf("Doggy ate %d cookies on the plate\n", number);
		// plates empty
		empty = true;
		// Notify owner to put cookies on the plate
		notifyAll();
	}
	// The method named 'put' that takes an integer parameter number
	// and may throw an InterruptedException if the thread is interrupted while waiting.
	public synchronized void put(int number) throws InterruptedException {
		// if the plate is NOT empty
		while(!empty) {
			// owner awaiting doggy to eat cookies
			wait();
		}
		System.out.printf("Owner puts %d cookies on the plate\n", number);
		// plate not empty
		empty = false;
		// Notify doggy to eat cookies on the plate
		notifyAll();
	}	
}
