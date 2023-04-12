package com.ocp.day20.fibonacci;
/*
 	Here's an example of solving the Fibonacci sequence using the fork/join framework.
 	
 	In this example, we extend the RecursiveTask class and override the compute() method to compute the nth Fibonacci number.
 	
 	The invokeAll method is called on the list of subtasks, which will execute them all asynchronously in separate threads. 
 	
 	In summary, this code shows an implementation of the fork/join framework to compute the nth number in the Fibonacci sequence 
 	
 	by breaking down the computation into smaller subtasks that can be executed asynchronously.
 	
 	
*/
import java.util.concurrent.RecursiveTask;
import java.util.Arrays;
import java.util.List;

public class FibonacciForkJoinWithInvokeAll extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 1;

    private final int n;

    public FibonacciForkJoinWithInvokeAll(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= THRESHOLD) {
            return n;
        } else {
        	FibonacciForkJoinWithInvokeAll fibonacciForkJoinWithInvokeAll01 = new FibonacciForkJoinWithInvokeAll(n - 1);
        	FibonacciForkJoinWithInvokeAll fibonacciForkJoinWithInvokeAll02 = new FibonacciForkJoinWithInvokeAll(n - 2);
            // Create a list to hold the subtasks
            List<FibonacciForkJoinWithInvokeAll> subtasks = Arrays.asList(fibonacciForkJoinWithInvokeAll01, fibonacciForkJoinWithInvokeAll02);
            /*
	            Call the invokeAll() method on the subtasks, which will execute all the subtasks
	            asynchronously in separate threads. This allows the current thread to continue
	            computing while waiting for the results of the subtasks.
            */
            invokeAll(subtasks);
            return fibonacciForkJoinWithInvokeAll02.join() + fibonacciForkJoinWithInvokeAll01.join();
        }
    }

    public static void main(String[] args) {
        int n = 48;
        FibonacciForkJoinWithInvokeAll fibonacciForkJoinWithInvokeAll = new FibonacciForkJoinWithInvokeAll(n);
        long startTime = System.nanoTime();
        int result = fibonacciForkJoinWithInvokeAll.compute();
        long endTime = System.nanoTime();
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        System.out.println("Elapsed time: " + (endTime - startTime) + " nanoseconds");
    }
}


/*
	Console:
			The 48th Fibonacci number is: 512559680
			Elapsed time: 52766773709 nanoseconds


*/
