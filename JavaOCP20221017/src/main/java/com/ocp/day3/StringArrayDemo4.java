package com.ocp.day3;
/*
		This program will follow up the previously StringArraydemo3.java but giving a differently demostration of calculation of average Score 
		(which is >= 60) in Java 1.8.
		1) mapToInt(score -> Integer.parseInt(score))
		2) filter(score -> score >= 60)
		3) average()
		4) getAsDouble()
*/
import java.util.Arrays;

public class StringArrayDemo4 {
	public static void main(String[] args) {
		String stringNumber = "100, 90, 80, 71, 59, 60, 45, 30, 0, 12, 18, 66";
		// 請計算及格人數的平均分數
		// 字串轉數字
		// int x = Integer.parseInt("100"); 
		
		String[] scores = stringNumber.split(", ");
		// Java 1.8
		double avgPassScore = Arrays.stream(scores)
									.mapToInt(score -> Integer.parseInt(score)) // 1) Plz following the description below
									.filter(score -> score >= 60) // 2) + 3) Plz following the description below
									.average() // 4) Plz following the description below
									.getAsDouble(); // 5) Plz following the description below
		
		System.out.printf("及格人數的平均分數: %.2f\n", avgPassScore);
		
	}	
}


/**
	1)
	package java.util.function;    
	
	@FunctionalInterface
	public interface ToIntFunction<T> {
	 * Applies this function to the given argument.
	 *
	 * @param value the function argument
	 * @return the function result   
		int applyAsInt(T value);
	}
	
	
	2)
	package java.util.stream;
	 * @param predicate a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *                  <a href="package-summary.html#Statelessness">stateless</a>
     *                  predicate to apply to each element to determine if it
     *                  should be included
     * @return the new stream
     
    	IntStream filter(IntPredicate predicate);
	
	
	3)
	package java.util.function;
     * Evaluates this predicate on the given argument.
     *
     * @param value the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     
    	boolean test(int value);
	
	
	4)
	package java.util.stream;
	
	 * @return an {@code OptionalDouble} containing the average element of this
	 * stream, or an empty optional if the stream is empty
	 *
	 	OptionalDouble average();
	 
	 
	5) 
	package java.util;
	 
	* If a value is present, returns the value, otherwise throws
	* {@code NoSuchElementException}.
	*
	* @apiNote
	* The preferred alternative to this method is {@link #orElseThrow()}.
	*
	* @return the value described by this {@code OptionalDouble}
	* @throws NoSuchElementException if no value is present
	 
		public double getAsDouble() {
	    	if (!isPresent) {	
	        	throw new NoSuchElementException("No value present");
	    	}
	    	return value;
		}

*/


/*
	Console:
	及格人數的平均分數: 77.83
*/