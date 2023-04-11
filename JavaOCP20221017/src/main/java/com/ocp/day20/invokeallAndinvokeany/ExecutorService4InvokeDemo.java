package com.ocp.day20.invokeallAndinvokeany;
/*
 	This is a Java code example that demonstrates the use of the ExecutorService.invokeAll() and ExecutorService.invokeAny() methods.
 	
 	Overall, this code demonstrates how to submit multiple tasks to a thread pool using the invokeAll method and obtain their results, 
 	
 	as well as how to obtain the result of the first completed task using the invokeAny method.
 	
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService4InvokeDemo {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create an ExecutorService object using the newCachedThreadPool method of the Executors class. 
    	// This creates a thread pool that can dynamically adjust its size based on the number of tasks being executed.
    	ExecutorService executorService = Executors.newCachedThreadPool();
    	// Create a Collection of four Callable<Integer> objects that implement the Callable interface
        Collection<Callable<Integer>> collection = new ArrayList<>();
        collection.add(new Lottery3());
        collection.add(new Lottery3());
        collection.add(new Lottery3());
        collection.add(new Lottery3());
        // Use the invokeAll method of the ExecutorService object to submit all the Callable objects to the thread pool for execution
        // The invokeAll method returns a list of Future objects that represent the results of the submitted tasks.
        List<Future<Integer>> list = executorService.invokeAll(collection);
        // Use a for loop to iterate through the Future objects in the list returned by invokeAll
        for(Future<Integer> future : list) {
            // Call the get method on each Future object to obtain the result of the corresponding task
        	// The get method blocks until the task completes and the result is available.
        	System.out.println(future.get());
        }
        System.out.println("------------------------------------------------");
        // Use the invokeAny method of the ExecutorService object to obtain the result of the first completed task
        // The invokeAny method blocks until at least one task completes and returns the result of the first task that completes successfully.
        Integer resultOfFirstTask = executorService.invokeAny(collection);
        System.out.println("Return the result of the first task that completes successfully: " + resultOfFirstTask);
        // Shutdown the thread pool using the shutdown method of the ExecutorService object to release all the resources used by the thread pool.
        executorService.shutdown();        
    }    
}