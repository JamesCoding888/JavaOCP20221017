package com.ocp.day12.anonymous;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.IntPredicate;
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
		
		System.out.println("*************************************** Lambda Expression ****************************************");
		
		IntPredicate overSpeedLimits4LambdaExpression = (int value) -> { return value > 60; };
		
//		boolean overSpeedLimits = Arrays.stream(speedPerMiles).anyMatch(overSpeedLimits4LambdaExpression);
		
		Arrays.stream(speedPerMiles).filter(overSpeedLimits4LambdaExpression).forEach(speed -> System.out.printf("Watching your speed, %d Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!\n", speed));

		
		
	}

}
