package com.ocp.day20.thread;
/*
	The given code represents a multi-threaded program in Java.
	
	Note that the execution order may vary slightly between runs since the threads are running concurrently. 
*/
class ThreadTimer {
	public final int MAX_PRIORITY = 1_000; // 1,000 milliseconds = 1 second
	// A method countDown() that causes the current thread to sleep for a specified duration. 
	public void countDown() {
		try {
			Thread.sleep(MAX_PRIORITY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Thread01 extends Thread {

	@Override
	public void run() {
		System.out.println("1");
		
		/*
			When the run() method calls, the code specified in the run() method is executed. 
			You can call the run() method multiple times.
			
			The run() method can be called by: 
				1) Using the start() method
				2) Calling the run() method itself			
				   To be noticed, when you use run() method for calling itself, it creates problems
			
		    Following description of document from Oracle: 
		    * If this thread was constructed using a separate
		    * {@code Runnable} run object, then that
		    * {@code Runnable} object's {@code run} method is called;
		    * otherwise, this method does nothing and returns.
		    * <p>
		    * Subclasses of {@code Thread} should override this method.
		    *
		    * @see     #start()
		    * @see     #stop()
		    * @see     #Thread(ThreadGroup, Runnable, String)
	       
	       	   @Override
	       	   public void run() {
		       		if (target != null) {
		            	target.run();
		        	}
	       	   }	
		*/
		super.run(); // Nothing will be done and returned		
		new ThreadTimer().countDown();
		Thread02 thread02 = new Thread02();
		thread02.start();
		new ThreadTimer().countDown();
		System.out.println("2");
	}
}

class Thread02 extends Thread {
	
	@Override
	public void run() {
		/*
			When the run() method calls, the code specified in the run() method is executed. 
			You can call the run() method multiple times.
			
			The run() method can be called by: 
				1) Using the start() method
				2) Calling the run() method itself			
				   To be noticed, when you use run() method for calling itself, it creates problems
			
			Following description of document from Oracle: 
		    * If this thread was constructed using a separate
		    * {@code Runnable} run object, then that
		    * {@code Runnable} object's {@code run} method is called;
		    * otherwise, this method does nothing and returns.
		    * <p>
		    * Subclasses of {@code Thread} should override this method.
		    *
		    * @see     #start()
		    * @see     #stop()
		    * @see     #Thread(ThreadGroup, Runnable, String)
	       
	       	   @Override
	       	   public void run() {
		       		if (target != null) {
		            	target.run();
		        	}
	       	   }  
		*/
		super.run(); // Nothing will be done and returned
		System.out.println("3");
		new ThreadTimer().countDown();
		new ThreadTimer().countDown();
		System.out.println("4");
	}
}

public class ThreadFlow {
	public static void main(String[] args) {
		// Create an instance of Thread01 and starts it by calling the start() method
		new Thread01().start();
	}
}


/*
 	Console w/ "new ThreadTimer().countDown()" 
	at line 50 and line 53:
 	
									 			1
												3
												2
												4
	
	
	Console w/o "new ThreadTimer().countDown()" 
	at line 50 and line 53:
	
												1
												2
												3
												4

*/