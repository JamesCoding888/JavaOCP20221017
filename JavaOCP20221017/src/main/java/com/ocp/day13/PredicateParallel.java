package com.ocp.day13;

import java.util.Arrays;
import java.util.function.Predicate;
/*
 * The provided code demonstrates the usage of Java's Predicate functional interface for filtering elements in an array.
 * Stream Operations:
 * The code converts the elements array into a parallel stream using Arrays.stream(elements).parallel().
 * 
 * Filtering with Predicate:
 * The first filter(predicate1) step applies the condition defined by predicate1 (i.e., element > 5).
 * 
 * Peek Operation:
 * The peek() method is used to inspect elements that pass the first filter. It prints out the element and the thread name (since the stream is parallel).
 * 
 * Second Filter:
 * The second filter operation is defined inline using a lambda expression that filters elements greater than 60 (predicate2 > 60).
 * 
 * forEachOrdered Operation:
 * forEachOrdered() ensures that the order of elements is preserved (despite the parallelism). It prints out elements that pass both filters (greater than 5 and greater than 60) along with the current thread name.
 * 
 * Execution Flow:
 * The stream starts with the elements array and runs in parallel.
 * Elements are filtered first based on the condition element > 5 using predicate1.
 * The peek() method prints all elements that pass the first filter.
 * A second filter removes elements that are not greater than 60.
 * Finally, the remaining elements are printed by forEachOrdered() in the original order.
 */
public class PredicateParallel {

	public static void main(String[] args) {
		/*		
		   @FunctionalInterface
		   public interface Predicate<T> {
		   
	       // Evaluates this predicate on the given argument.
	     
	       // @param t the input argument
	       // @return {@code true} if the input argument matches the predicate,
	       // otherwise {@code false}

	          boolean test(T t);
	       }	      
		*/
		Predicate<Integer> predicate1 = new Predicate<>() {
			@Override
			public boolean test(Integer element) {
				if(element > 5) {
					return true;
				} else {
					return false;
				}
			}
		};		
        Integer[] elements = new Integer[]{1, 3, 5, 2, 7, 6, 8, 70, 65};
		Arrays.stream(elements)
			  .parallel()  // Convert to parallel stream
			  .filter(predicate1)			  
			  .peek(s -> System.out.printf("Input element > 5: %d --- %s\n", s, Thread.currentThread().getName()))
		      .filter(predicate2 -> {
		    	  if(predicate2 > 60) {
		    		  return true;
		    	  } else {
		    		  return false;
		    	  }
		      })
		      .forEachOrdered(s -> System.out.printf("Input element > 60: %d --- %s\n", s, Thread.currentThread().getName()));	
	}
}
