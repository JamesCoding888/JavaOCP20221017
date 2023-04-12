package com.ocp.day20.forkjoin.recursivetask;

/*
	
	Introduction of Fork/Join framework:
	
		The Fork/Join framework is a Java concurrency mechanism that enables the parallel execution of tasks in a recursive divide-and-conquer approach. 
		
		It is designed to efficiently handle workloads that can be broken down into smaller, independent pieces that can be processed in parallel.
		
		One of the key benefits of the Fork/Join framework is that it can take advantage of multiple processors and cores, 
		
		which can significantly improve the performance of parallelizable algorithms. 
		
		Additionally, the framework automatically balances the workload among the available threads, ensuring that each thread is working on a comparable amount of work.
 		
 		Overall, the Fork/Join framework is a powerful tool for writing efficient, parallelizable code in Java.
 		
 		
 		The Fork/Join framework consists of two main components: 
 		
 			1) ForkJoinPool 
 			   
 			   		The ForkJoinPool is a thread pool that manages the execution of ForkJoinTasks.
 			   
 			2) ForkJoinTask
 			
 			  		The ForkJoinTask is an abstract class that represents a task that can be divided into smaller subtasks. 
 			  		
 			  		When a ForkJoinTask is executed, it may split itself into multiple subtasks, which are then executed in parallel by the threads in the ForkJoinPool.
 			  		
 	
 	Introduction of this Java program:
 		
 		This program demonstrates how to use the Fork/Join framework to calculate the sum of an array of integers.
 	
 		
*/
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinTaskDemo {
	public static void main(String[] args) {
		// The program first initializes an array with values from 1 to 10
		int len = 10;
		// This code initializes an integer array named array with a length of 10
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			// Assign each element of the array a value equal to its index plus one
			array[i] = i + 1;
		}		
		// Record the start time
        long startTime = System.nanoTime();		
		// 
		int sumOfArrayValue = 0;
		// loop iterates over each index of the array, and adds the value at that index to the sumOfArrayValue variable
		for (int i = 0; i < array.length; i++) {
			sumOfArrayValue += array[i];
		}
		// Record the end time
        long endTime = System.nanoTime();
		System.out.println(Arrays.toString(array));
		System.out.printf("Calculate the sum of the array: %d\n", sumOfArrayValue);
		System.out.printf("Execution time: %d milliseconds\n", ((endTime - startTime) / 1000000));
		System.out.println("--------------------------------");
		// The Fork/Join framework works by recursively splitting a large task into smaller subtasks until the subtasks become small enough to be computed directly.
		// Create a Task object with the entire range of the array passed as arguments to its constructor
		ForkJoinTask<Integer> forkJoinTask = new Task(array, 0, array.length);

		// Record the start time
        startTime = System.nanoTime();	
        /*
         	When the invoke() method is called on the initial Task object, 
         	the ForkJoinPool will divide the range of elements to sum into smaller and smaller subranges 
         	until each subrange has no more than THRESHOLD elements.
         	
         	At that point, the subranges are summed up, and their results are combined to 
         	obtain the final sum of all the elements in the array.
        */
		int result = ForkJoinPool.commonPool().invoke(forkJoinTask); //
		// Record the end time
		endTime = System.nanoTime();
		System.out.printf("Calculated sum using the Fork/Join framework: %d\n", result);
		System.out.printf("Execution time for the Fork/Join framework: %d milliseconds\n", ((endTime - startTime) / 1000000));
	}
}