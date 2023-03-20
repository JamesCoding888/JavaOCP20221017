package com.ocp.day20.callable;
/*
 	Explanation of programs as following:
	
	The Lotto class implements Callable<Set<Integer>> which means that it can be used as a task that returns a set of integers and may throw an exception.
    
    The Lotto class contains a method call() which is called when the Lotto object is executed as a task. 
	
	The main method in the LottoMain class creates a FutureTask object using the Lotto object and starts a new thread to execute the task. 
	
	The main thread waits for the result of the FutureTask by calling the get() method. 
	
	If the task throws an InterruptedException or an ExecutionException, they are caught and their stack traces are printed.

	When the Lotto task is executed, it generates a set of 6 random integers and returns them as the result of the task. 
	
	Finally, the main thread prints the result of the task, which is the set of 6 random integers.
	
*/
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
public class Lotto implements Callable<Set<Integer>>{
	
	private Random random = new Random();
	
	/**
	 * A task that returns a result and may throw an exception.
	 * Implementors define a single method with no arguments called
	 * {@code call}.
	 *
	 * <p>The {@code Callable} interface is similar to {@link
	 * java.lang.Runnable}, in that both are designed for classes whose
	 * instances are potentially executed by another thread.  A
	 * {@code Runnable}, however, does not return a result and cannot
	 * throw a checked exception.
	 *
	 * <p>The {@link Executors} class contains utility methods to
	 * convert from other common forms to {@code Callable} classes.
	 *
	 * @see Executor
	 * @since 1.5
	 * @author Doug Lea
	 * @param <V> the result type of method {@code call}
	 
		@FunctionalInterface
		public interface Callable<V> {

		     * Computes a result, or throws an exception if unable to do so.
		     *
		     * @return computed result
		     * @throws Exception if unable to compute a result

		       V call() throws Exception;
		}
	*/
	// Inside the call() method, a Set of integers is created using a LinkedHashSet, 
	// which ensures that the elements in the set are in the order they were inserted.
	@Override
	public Set<Integer> call() throws Exception {
		
		// programs here
		Set<Integer> numbers = new LinkedHashSet<>();
		// The while loop is used to generate 6 random integers between 1 and 42 
		// and add them to the set until there are 6 unique numbers in the set.
		while(numbers.size() < 6) {
			int luckyBall = random.nextInt(42) + 1;
			numbers.add(luckyBall);			
		}				
		return numbers;
	}
}
