package com.ocp.day20.forkjoin.recursivetask;

import java.util.concurrent.RecursiveTask;

public class Task extends RecursiveTask<Integer>{
	// Initialize a threshold value
    private final static int THRESHOLD = 3;
    /*
    	An array, a start index, and an end index as parameters, 
    	and uses these values to split the task into subtasks. 
    */    
    int[] array;
    int start, end;
    
    public Task(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
    	/*
	    	 Check if the number of elements to sum is less than or equal to the THRESHOLD value.
	    	 If so, the code simply sums the values using a loop and returns the result.
    	*/     	
        if(end - start <= THRESHOLD) {
            int sum = 0;
            for(int i=start;i<end;i++) {
                sum += this.array[i];
            }
            return sum; 
        }
        
        //  Split the range of values to be summed into two halves 
        int middle = (end + start) / 2;
        System.out.printf("split %d~%d ==> %d~%d, %d~%d\n", start, end, start, middle, middle, end);
        // Create two new Task objects, one for each half of the range.
        Task Task1 = new Task(array, start, middle);
        Task Task2 = new Task(array, middle, end);
        // The invokeAll() method is called on the two Task objects to submit them to the ForkJoinPool
        // which will execute them asynchronously.
        invokeAll(Task1, Task2);
        // The join() method is called on each of the Task objects to wait for their completion and retrieve their result.
        int subResult1 = Task1.join();
        int subResult2 = Task2.join();
        // The results from the two Task objects are added together 
        int result = subResult1 + subResult2;
        System.out.printf("result=%d, subResult1=%d, subResult2=%d\n", result, subResult1, subResult2);        
        return result;
    }
}