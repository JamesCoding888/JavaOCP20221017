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
			/*
			  	Java method called "join" that belongs to the Thread class.

				The "join" method is used to wait for the thread on which it is called to complete its execution. 
				
				When a thread1 calls the join method on another thread2, thread1 will wait until thread2 finishes its execution before proceeding further.
				
				This particular version of the "join" method is a public final method that takes no arguments and throws an InterruptedException. 
				
				It calls another version of the "join" method with an argument of 0. 
				
				The argument represents the number of milliseconds that the calling thread will wait for the target thread to complete its execution.
				
				By passing in a value of 0, this method is effectively asking the calling thread to wait indefinitely until the target thread completes its execution. 
				
				If an InterruptedException is thrown, it means that the calling thread was interrupted while waiting for the target thread to complete.
				
				Following programming from Oracle:
								  
				     * <p> An invocation of this method behaves in exactly the same
				     * way as the invocation
				     *
				     * <blockquote>
				     * {@linkplain #join(long) join}{@code (0)}
				     * </blockquote>
				     *
				     * @throws  InterruptedException
				     *          if any thread has interrupted the current thread. The
				     *          <i>interrupted status</i> of the current thread is
				     *          cleared when this exception is thrown.
				        
				        public final void join() throws InterruptedException {
				        	join(0);
				    	}
			*/
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
 	Console 1 (w/ synchronized keyword):
 			
 			Final count: 20000
 	
	Console 2 (non-synchronized keyword; run on the application in 1st time):
 			
 			Final count: 14855

 	Console 3 (non-synchronized keyword; run on the application in 2nd time):
 			
 			Final count: 16740
*/