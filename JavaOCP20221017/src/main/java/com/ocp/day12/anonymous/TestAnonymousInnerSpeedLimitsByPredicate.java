package com.ocp.day12.anonymous;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.IntConsumer;
public class TestAnonymousInnerSpeedLimitsByPredicate {

	public static void main(String[] args) {
		
		System.out.println("************************************** Anonymous Inner Class **************************************");
		
		// To be noticed! Given a type of elements with int, 
		// because the following programming we used from abstraction method of IntPredicate.class 
		// that only released as-is.
		int[] speedPerMiles = {0, 15, 25, 35, 65, 78, 87, 98, 105};  // Miles per hours
		
		IntPredicate overSpeedLimits4Anonymous = new IntPredicate() {

			// Override the abstraction method of IntPredicate.class, 
			// please see the following method from Java 1.8 - java.util.function.IntPredicate;
		    /**
		     * Evaluates this predicate on the given argument.
		     *
		     * @param value the input argument
		     * @return {@code true} if the input argument matches the predicate,
		     * otherwise {@code false}
		     */
			@Override
		    public boolean test(int value) {
				
				return value > 60;
				
			}	
			/*  Reminder again! The type of input argument in "double", is NOT supported by Java 1.8 - IntPredicate.class 
				@Override
			    public boolean test(double value) {
					
					return value > 60;
					
				}	
			*/
		};				
		
		for (int speed : speedPerMiles) {
			
			if (overSpeedLimits4Anonymous.test(speed)) {

				System.out.printf("Watching your speed, %d Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!\n", speed);

			}
		}
		
		System.out.println("*************************** Anonymous Inner Class & Lambda Expression ****************************");		
		
		Arrays.stream(speedPerMiles).filter(overSpeedLimits4Anonymous).forEach(speed -> System.out.printf("Watching your speed, %d Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!\n", speed));
		
		System.out.println("******************************** Lambda Expression - IntPredicate *********************************");
		
		IntPredicate overSpeedLimits4LambdaExpression = (int value) -> { return value > 60; };
		
		IntPredicate lowerSpeedLimits4LambdaExpression = value -> value < 30 ;

//		boolean overSpeedLimits = Arrays.stream(speedPerMiles).anyMatch(overSpeedLimits4LambdaExpression);
		
		Arrays.stream(speedPerMiles).filter(overSpeedLimits4LambdaExpression).forEach(speed -> System.out.printf("Watching your speed, %d Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!\n", speed));

		System.out.println("********************************* Lambda Expression - IntConsumer *********************************");
		
		// Override the abstraction method of IntConsumer.class, as follows 
		// please see the following method from Java 1.8 - java.util.function.InConsumer;
		/**
	     * Performs this operation on the given argument.
	     * @param value the input argument	     
	     * void accept(int value);
		**/
		
		
		// Following syntaxes, are All similar function
		// IntConsumer consumer = (int value) -> System.out.println(value);
		// IntConsumer consumer = (value) -> System.out.println(value);
		IntConsumer intConsumer4HighSpeed = value -> System.out.printf("Watching your speed, %d Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!\n", value);
		Arrays.stream(speedPerMiles).filter(overSpeedLimits4LambdaExpression).forEach(intConsumer4HighSpeed);
		
		IntConsumer intConsumer4LowSpeed = value -> System.out.printf("Watching your speed, %d Miles/hours, Sir. You're lower speed limits and won a ticket for $5000 !!!\n", value);				
		Arrays.stream(speedPerMiles).filter(lowerSpeedLimits4LambdaExpression).forEach(intConsumer4LowSpeed);
		
	}
}

/*
	Console:
			************************************** Anonymous Inner Class **************************************
			Watching your speed, 65 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 78 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 87 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 98 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 105 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			*************************** Anonymous Inner Class & Lambda Expression ****************************
			Watching your speed, 65 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 78 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 87 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 98 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 105 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			******************************** Lambda Expression - IntPredicate *********************************
			Watching your speed, 65 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 78 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 87 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 98 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 105 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			********************************* Lambda Expression - IntConsumer *********************************
			Watching your speed, 65 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 78 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 87 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 98 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 105 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 0 Miles/hours, Sir. You're lower speed limits and won a ticket for $5000 !!!
			Watching your speed, 15 Miles/hours, Sir. You're lower speed limits and won a ticket for $5000 !!!
			Watching your speed, 25 Miles/hours, Sir. You're lower speed limits and won a ticket for $5000 !!!

*/