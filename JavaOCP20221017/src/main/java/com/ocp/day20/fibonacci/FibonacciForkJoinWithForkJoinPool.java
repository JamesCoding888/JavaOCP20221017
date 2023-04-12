package com.ocp.day20.fibonacci;

/*
	The code is an implementation of the Fibonacci sequence using the fork/join framework in Java. The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.
	
	The class FibonacciForkJoinWithForkJoinPool extends the RecursiveTask class, which represents a task that can be split into smaller subtasks and executed asynchronously in separate threads. 
	
	Also, the class FibonacciForkJoinWithForkJoinPool allows for more control over the number of threads used.
	
	In Summary of both of the FibonacciForkJoinWithInvokeAll and FibonacciForkJoinWithForkJoinPool classes:
	
		1) Both of classes use the fork/join framework to compute the nth Fibonacci number recursively in parallel. 
	
		   However, they differ in the way the subtasks are executed and the number of threads used.
	
		2) FibonacciForkJoinWithInvokeAll:
	
		   Use the invokeAll() method to execute the subtasks asynchronously in separate threads. 
		   
		   The two subtasks are created and added to a list, which is then passed to the invokeAll() method. 
		   
		   The invokeAll() method returns when all the subtasks are complete, and the results are obtained using the join() method.
		   
		3) FibonacciForkJoinWithForkJoinPool:
			
		   Use the ForkJoinPool class to execute the subtasks. The ForkJoinPool class is instantiated with the desired number of threads, and the invoke() method is called on the main task to execute the computation. 
		   
		   The invoke() method returns the result of the computation, which is obtained using the join() method.
		   
		   FibonacciForkJoinWithForkJoinPool also has a maximum number of threads limit. The number of threads created is based on the number of processors available and also the maximum limit set as MAXIMUM_NUMBER_THREADS.
		   
		   The ForkJoinPool will create threads up to this limit, and if there are more subtasks than threads available, some of the subtasks will have to wait for a thread to become available before they can be executed.
		   		 
*/


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.Arrays;
import java.util.List;

public class FibonacciForkJoinWithForkJoinPool extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 1;
    
    private static final int MAXIMUM_NUMBER_THREADS = 40;
    
    private final int n;

    public FibonacciForkJoinWithForkJoinPool(int n) {
        this.n = n;
    }
    /*
     	The compute() method compute the nth Fibonacci number using the fork/join framework.
    */
    @Override
    protected Integer compute() {
    	/*
    	 	The THRESHOLD constant is used to define a base case where the computation is small enough to be handled without further decomposition.
    	 	If the value of n is less than or equal to THRESHOLD, the method simply returns the value of n.
    	*/
        if (n <= THRESHOLD) {
            return n;
        } else {
        	// If n is greater than THRESHOLD, two subtasks are created
        	// each of which is an instance of the FibonacciForkJoinWithForkJoinPool class. 
        	FibonacciForkJoinWithForkJoinPool fibonacciForkJoinWithForkJoinPool01 = new FibonacciForkJoinWithForkJoinPool(n - 1);
        	FibonacciForkJoinWithForkJoinPool fibonacciForkJoinWithForkJoinPool02 = new FibonacciForkJoinWithForkJoinPool(n - 2);
            // The two subtasks are then added to a list of subtasks and executed asynchronously using the invokeAll() method 
            List<FibonacciForkJoinWithForkJoinPool> subtasks = Arrays.asList(fibonacciForkJoinWithForkJoinPool01, fibonacciForkJoinWithForkJoinPool02);
            invokeAll(subtasks);
            // The join() method is then called on each subtask to retrieve its result, and the sum of the two results is returned.
            return fibonacciForkJoinWithForkJoinPool02.join() + fibonacciForkJoinWithForkJoinPool01.join();
        }
    }

    public static void main(String[] args) {
        int n = 48;
        /*
         	The argument passed to the ForkJoinPool() constructor determines the maximum number of threads that can be used to execute the subtasks in parallel. 
         	If a large value is passed, then more threads will be created, which can increase the parallelism and potentially speed up the computation. 
         	
         	However, creating too many threads can lead to performance degradation due to the overhead of thread creation and management.
         	On the other hand, if a small value is passed, then fewer threads will be created, which can reduce the parallelism and slow down the computation. 
         	
         	It is important to choose an appropriate value for the argument based on the available resources and the nature of the computation to achieve the best performance.
        */
        ForkJoinPool pool = new ForkJoinPool(MAXIMUM_NUMBER_THREADS);
        // FibonacciForkJoinWithForkJoinPool class is then instantiated with the desired value of n
        FibonacciForkJoinWithForkJoinPool fibonacciForkJoinWithForkJoinPool = new FibonacciForkJoinWithForkJoinPool(n);
        long startTime = System.nanoTime();
        // The invoke() method is called on the FibonacciForkJoinWithForkJoinPool object to execute the computation, and the result is stored in the result variable.
        int result = pool.invoke(fibonacciForkJoinWithForkJoinPool);
        long endTime = System.nanoTime();
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        System.out.println("Elapsed time: " + (endTime - startTime) + " nanoseconds");
    }
}


/*
	Console for ForkJoinPool():
			
			The 48th Fibonacci number is: 512559680
			Elapsed time: 35104927666 nanoseconds
	
	Console for ForkJoinPool(4):
			
			The 48th Fibonacci number is: 512559680
			Elapsed time: 48318381250 nanoseconds
			
	Console for ForkJoinPool(10):		
			
			The 48th Fibonacci number is: 512559680
			Elapsed time: 35348438708 nanoseconds
			
	Console for ForkJoinPool(30):	
			
			The 48th Fibonacci number is: 512559680
			Elapsed time: 33662109500 nanoseconds

	Console for ForkJoinPool(40):	
			
			The 48th Fibonacci number is: 512559680
			Elapsed time: 36961120833 nanoseconds

*/
