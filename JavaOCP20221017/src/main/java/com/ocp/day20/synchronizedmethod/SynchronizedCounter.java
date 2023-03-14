package com.ocp.day20.synchronizedmethod;
/*
 	To make a method synchronized, simply add the synchronized keyword to its declaration!
 	
 	You will see the different results if method without synchronized keyword!
*/

class SynchronizedCounter extends Thread {

	private int count = 0;
//	/*  synchronized
		public synchronized void increment() {
			count++;
		}
	
		public synchronized void decrement() {
			count--;
		}
	
		public synchronized int getCount() {
			return count;
		}
//	*/
	
	/*  non-synchronized
		public void increment() {
			count++;
		}
	
		public void decrement() {
			count--;
		}
	
		public int getCount() {
			return count;
		}
	*/
		
	public static void main(String[] args) {

		SynchronizedCounter counter = new SynchronizedCounter();

		// Create and start two threads that increment the counter
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				counter.increment();
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				counter.increment();
			}
		});
		thread1.start();
		thread2.start();

		// Wait for the threads to finish
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Print the final count
		System.out.println("Final count: " + counter.getCount());

	}
}

/*
 	Console 1 (synchronized):
 			
 			Final count: 20000
 	
	Console 2 (non-synchronized):
 			
 			Final count: 14855

 	Console 3 (non-synchronized):
 			
 			Final count: 16740
*/