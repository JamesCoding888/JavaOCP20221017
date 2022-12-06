package com.ocp.day13;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (Integer score) -> score >= 60;
	    
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

		System.out.println("Score >= 60: " + (predicate.test(88) ? "Pass" : "Fail"));
		
		
		IntPredicate intPredicate = (int score) -> score >= 60;
		/*
			@FunctionalInterface
			public interface IntPredicate {


		    // Evaluates this predicate on the given argument.
		    
		    // @param value the input argument
		    // @return {@code true} if the input argument matches the predicate,
		    // otherwise {@code false}

		    boolean test(int value);
		*/		
		
		System.out.println("Score >= 60: " + (intPredicate.test(8) ? "Pass" : "Fail"));
		
		
		BiPredicate<Integer, String> biPredicate = (Integer length, String string)  -> length == string.length();
		/*
			@FunctionalInterface		 
			public interface BiPredicate<T, U> {


		    // Evaluates this predicate on the given arguments.
		    
		    // @param t the first input argument
		    // @param u the second input argument
		    // @return {@code true} if the input arguments match the predicate,
		    // otherwise {@code false}
		   
		    boolean test(T t, U u);

		*/
		System.out.println("The length of ID number is equal to 10? " + (biPredicate.test(10, "A987654321") ? "Yes" : "No")); 
		
		
		
	}
}
