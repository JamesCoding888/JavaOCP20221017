package com.ocp.day20.fibonacci;
/*
 	Here's an example of solving the Fibonacci sequence using the fork/join framework.
 	
 	In this example, we extend the RecursiveTask class and override the compute() method to compute the nth Fibonacci number. 
 	
 	In summary, this code shows an implementation of the fork/join framework to compute the nth number in the Fibonacci sequence 
 	
 	by breaking down the computation into smaller subtasks that can be executed asynchronously.
 	
*/
import java.util.concurrent.RecursiveTask;

public class FibonacciForkJoin extends RecursiveTask<Integer> {
	
	private static final int THRESHOLD = 1;
    
	private final int n; // the nth Fibonacci number to compute

	// The class has a constructor that takes an integer n, 
	// which represents the number in the Fibonacci sequence that we want to compute. 
    public FibonacciForkJoin(int n) {
        this.n = n;
    }
    /*
     	The computer() method overrides the compute() method defined in RecursiveTask. 
    */
    @Override
    protected Integer compute() {
    	//  Check if THRESHOLD is less than or equal to 1, and if so, it returns n
        if (n <= THRESHOLD) {
            return n;
        } else {
        	/*
        		Create two new instances of the FibonacciForkJoin class, passing n - 1 and n - 2 as arguments to their respective constructors. 
            	These instances represent the subtasks that will compute the (n-1)th and (n-2)th numbers in the Fibonacci sequence.
            */	
            FibonacciForkJoin fibonacciForkJoin1 = new FibonacciForkJoin(n - 1);
            FibonacciForkJoin fibonacciForkJoin2 = new FibonacciForkJoin(n - 2);
            /*
              Call the fork() method on the first subtask fibonacciForkJoin1, which will execute the task asynchronously in a separate thread.
              This allows the current thread to continue computing the second subtask fibonacciForkJoin2. 
            */
            fibonacciForkJoin1.fork();
            // Call join() on the first instance, which waits for its result to be available before returning its value
            // Finally, the results of the two subtasks are added together and returned as the result of the current task
            return fibonacciForkJoin2.compute() + fibonacciForkJoin1.join();
        }
    }
    public static void main(String[] args) {
        // Create an instance of FibonacciForkJoin with the specific value
    	int n = 48;
        FibonacciForkJoin fibonacci = new FibonacciForkJoin(n);
        long startTime = System.nanoTime();
        int result = fibonacci.compute();
        long endTime = System.nanoTime();
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        System.out.println("Elapsed time: " + (endTime - startTime) + " nanoseconds");
    }
}


/*
	Console:
	 		The 48th Fibonacci number is: 512559680
			Elapsed time: 42156460125 nanoseconds

*/
