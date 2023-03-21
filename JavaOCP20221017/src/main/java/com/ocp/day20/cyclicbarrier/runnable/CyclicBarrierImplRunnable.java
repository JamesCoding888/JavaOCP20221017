package com.ocp.day20.cyclicbarrier.runnable;
/* 
 	In this example, we have 5 threads executing concurrently.  
 	
 	Each thread will print a message indicating that it is working, and then wait for all other threads to reach the barrier. 
 	
 	Once all threads have reached the barrier, the barrier will "break" and all threads will continue executing. 
 	
 	Each thread will then print another message indicating that it is done.
 	
 	Overall of this implementation, it is similar to the one with threads, but uses Runnable tasks instead of directly creating threads.
 	
 	
 	Notice:
 		
 		The order in which the threads complete may vary from run to run, so the actual console may differ from below. 
 	
 		However, the pattern should be the same: all threads should complete their work, and the barrier should ensure that they all reach the synchronization point before continuing.	
 	
*/
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierImplRunnable {

    public static void main(String[] args) {
        int numThreads = 5;
        // Create a CyclicBarrier object with a count of numThreads 
        CyclicBarrier barrier = new CyclicBarrier(numThreads);
        // Create numThreads instances of the Worker class, passing the CyclicBarrier object to each instance
        for (int n = 0; n < numThreads; n++) {
            Runnable worker = new Worker(barrier);
            // Start a new thread for each Worker instance
            new Thread(worker).start();
        }
    }
}

// The Worker class implements the Runnable interface
class Worker implements Runnable {
    // Create a CyclicBarrier object with a count of numThreads
	private final CyclicBarrier barrier;

    // The Worker class takes a CyclicBarrier object as a constructor argument
    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }
    // The run method of the Worker class simply prints a message indicating that the thread is working, 
    // each Worker task does some work for 1 second and then waits for all other threads to reach the barrier by calling the await method on the CyclicBarrier object, 
    // and then prints another message indicating that the thread is done.
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is working.");
            Thread.sleep(1000);
            barrier.await();
            System.out.println("Thread " + Thread.currentThread().getId() + " is done.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

/*
	Console:
			Thread 15 is working.
			Thread 17 is working.
			Thread 14 is working.
			Thread 16 is working.
			Thread 18 is working.
			Thread 16 is done.
			Thread 15 is done.
			Thread 17 is done.
			Thread 18 is done.
			Thread 14 is done.
*/