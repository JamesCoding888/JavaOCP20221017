package com.ocp.day20.callable;

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
	@Override
	public Set<Integer> call() throws Exception {
		
		// programs here
		Set<Integer> numbers = new LinkedHashSet<>();
		// Only 6 numbers will be collected
		while(numbers.size() < 6) {
			int luckyBall = random.nextInt(42) + 1;
			numbers.add(luckyBall);			
		}				
		return numbers;
	}
}
