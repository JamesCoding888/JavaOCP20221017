package com.ocp.day20.threadpoolexecutor.lottery;
/*
 	Of this lesson, we demonstrate two type of thread pool - 'newCachedThreadPool' and 'newFixedThreadPool', , differently.  
 	
 	Which one is better depends on the specific requirements of the program. 
 	
 	In general, it's a good idea to experiment with different thread pool configurations and measure their performance to determine the best fit for a specific program.
 	
 	newCachedThreadPool:
 		
 		A cached thread pool can be more efficient for programs that have bursts of activity with long periods of inactivity in between, 
 	
 		as it can dynamically adjust the number of threads to match the workload. 
 		
 		However, it can also lead to performance problems if too many threads are created and the system becomes overloaded with context switching.

	newFixedThreadPool:
	
		A fixed thread pool is more predictable and can help avoid overload issues by limiting the number of threads that are created. 
		
		However, it can also lead to inefficiencies if the workload is unevenly distributed or if there are long periods of inactivity with no tasks to execute.

	
*/
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
public class JobDemo4newFixedThreadPool {
    public static void main(String[] args) {
    	/*
    		Use a cached thread pool, which creates new threads as needed and reuses idle threads if available. 
    	 	This means that the number of threads in the pool can vary dynamically depending on the workload, 
    	 	up to a certain maximum (which is effectively unbounded in this case).
        */
//        ThreadPoolExecutor thredPoolExecutor = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        /*
         	Use a fixed thread pool with a maximum size of 3 threads. 
         	This means that there will always be 3 threads in the pool, regardless of the workload. 
         	If more tasks are submitted than can be immediately executed, 
         	they will be placed in a queue and executed when a thread becomes available.
        */ 
        ThreadPoolExecutor thredPoolExecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
        
        int i = 10;
        while( i-- > 0) {
        	thredPoolExecutor.submit(new Task());
        }
        System.out.println("Thread count: " + Thread.activeCount());
        
        thredPoolExecutor.shutdown();   
    }
}


/*
	Console with newCachedThreadPool:
										Thread count: 11
										37
										75
										76
										30
										31
										68
										54
										99
										42
										93

	Console with newFixedThreadPool:
										Thread count: 4
										13
										84
										18
										93
										99
										36
										98
										86
										87
										88

*/