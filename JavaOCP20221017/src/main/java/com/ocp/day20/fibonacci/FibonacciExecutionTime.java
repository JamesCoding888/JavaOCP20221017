package com.ocp.day20.fibonacci;
/*
 	Introduction of Fibonacci:
	 	
	 	1) Fibonacci can be used as an example problem for demonstrating different programming concepts and techniques.
	 	
	 	   For example, the Fibonacci sequence can be used to demonstrate recursion, dynamic programming, and parallel programming. 
	 	
	 	2) Implementing the Fibonacci sequence can be a good exercise for beginner programmers to learn these concepts.
	 	
	 	3) Note that for larger values of n, the recursive algorithm can be very slow and may cause a stack overflow error. 
	 	
	 	   In practice, it is often better to use an iterative algorithm or a more efficient algorithm, such as dynamic programming, to compute large Fibonacci numbers.
	 	
	 	4) Also, the Fibonacci sequence is often used as an example of a problem that can be solved using the fork/join framework.
	 	
	 	   The ForkJoinTask class provides a way to divide a task into smaller sub-tasks that can be executed in parallel on multiple processors. 
 	
 	
 	Introduction of sample code:
 		
 		The following code demonstrates three different ways of computing the nth Fibonacci number, using recursion, iteration, and dynamic programming, and compares the execution times of each approach.
 		
 		For the sample code with fork/join framework to compute the nth Finonacci number, please refer to FibonacciForkJoin.java.
 		
 	
*/
public class FibonacciExecutionTime {
    public static void main(String[] args) {
        int n = 48; // the nth Fibonacci number to compute
        // Record the start time
        long startTime4First = System.nanoTime();
        int result4First = fibonacciFirst(n);
        // Record the start time
        long startTime4Second = System.nanoTime();
        int result4Second = fibonacciSecond(n);
        // Record the start time
        long startTime4Thrid = System.nanoTime();
        int result4Third = fibonacciThird(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result4First);
        // Record the end time
        long endTime4First = System.nanoTime();
        System.out.println("The " + n + "th Fibonacci number is: " + result4Second);
        // Record the end time
        long endTime4Second = System.nanoTime();
        System.out.println("The " + n + "th Fibonacci number is: " + result4Third);
        // Record the end time
        long endTime4Third = System.nanoTime();
        
        // Print the elapsed time
        System.out.println("Elapsed time for fibonacciFirst: " + (endTime4First - startTime4First)  + " nanoseconds");
        System.out.println("Elapsed time for fibonacciSecond: " + (endTime4Second - startTime4Second) + " nanoseconds");
        System.out.println("Elapsed time for fibonacciThird: " + (endTime4Third - startTime4Thrid)  + " nanoseconds");
        
    }
    // Recursive algorithm, computes the nth number in the Fibonacci sequence using a recursive algorithm.
    public static int fibonacciFirst(int n) {
        if (n <= 1) {
        	// System.out.println(n);
            return n;
        } else {
            return fibonacciFirst(n-1) + fibonacciFirst(n-2);
        }
    }
    
    // Use a loop (iteration) instead of recursion
    /*     	
     	In this example, the fibonacci method computes the nth Fibonacci number using a loop instead of recursion. 
     	
     	The loop starts at 2 (since the first two Fibonacci numbers are 0 and 1), and computes each subsequent Fibonacci number by adding the two previous Fibonacci numbers. 
     	
     	The loop continues until the nth Fibonacci number is computed.

		This algorithm has linear time complexity, which means it is more efficient than the recursive algorithm for large values of n.
    */
    public static int fibonacciSecond(int n) {
        if (n <= 1) {
        	return n;
        } else {
            int fibNMinus2 = 0;
            int fibNMinus1 = 1;
            int fibN = 0;
            for (int i = 2; i <= n; i++) {
                fibN = fibNMinus1 + fibNMinus2;
                fibNMinus2 = fibNMinus1;
                fibNMinus1 = fibN;
            }
            return fibN;
        }
    }
    
    // Dynamic programming
    /*
     	This example is more efficient algorithm for computing Fibonacci numbers with dynamic programming.
     	
     	The fibonacci method uses an array fib to store the previously computed Fibonacci numbers. 
     	
     	The loop starts at 2 and computes each subsequent Fibonacci number by adding the two previous Fibonacci numbers from the array. 
     	
     	This way, we avoid recomputing the same Fibonacci numbers multiple times.

		This algorithm also has linear time complexity and is more efficient than the recursive algorithm for large values of n.
    */    
    public static int fibonacciThird(int n) {
        if (n <= 1) {
            return n;
        } else {
            int[] fib = new int[n+1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i-1] + fib[i-2];
            }
            return fib[n];
        }
    }
}
