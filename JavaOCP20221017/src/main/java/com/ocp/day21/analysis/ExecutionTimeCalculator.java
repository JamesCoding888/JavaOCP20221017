package com.ocp.day21.analysis;

/*
 	This code creates an ExecutionTimeCalculator class with a main method that measures the execution time of two code samples using the System.nanoTime() method. 
 	
	To properly measure the running time of two code samples, you need to insert the code for each sample between the startTime and endTime measurements. 
	
	Here's an updated version of the code that includes two code samples:
*/

public class ExecutionTimeCalculator {
    public static void main(String[] args) {
        
        // Code sample 1
        // Record the start time
        long startTime4One = System.nanoTime();
        
        // Execute the code sample 1 to be measured
        for (int i = 0; i < 1000000; i++) {
            // do something
        }
        
        // Record the end time
        long endTime4One = System.nanoTime();
        
        // Calculate the elapsed time in milliseconds
        long elapsedTime4One = (endTime4One - startTime4One) / 1000000;
        
        // Print the elapsed time for code sample 1
        System.out.println("Elapsed time for code sample #1: " + elapsedTime4One + " ms");
        
        // Code sample 2
        // Record the start time
        long startTime4Two = System.nanoTime();
        
        // Execute the code sample 2 to be measured
        for (int i = 0; i < 10000000; i++) {
            // do something else
        }
        
        // Record the end time
        long endTime4Two = System.nanoTime();
        
        // Calculate the elapsed time in milliseconds
        long elapsedTime4Two = (endTime4Two - startTime4Two) / 1000000;
        
        // Print the elapsed time for code sample 2
        System.out.println("Elapsed time for code sample #2: " + elapsedTime4Two + " ms");
    }   
}