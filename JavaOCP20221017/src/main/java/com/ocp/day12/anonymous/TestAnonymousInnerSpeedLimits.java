package com.ocp.day12.anonymous;

public class TestAnonymousInnerSpeedLimits {
	
	
	public static void forEach(double[] speedPerMiles, SpeedLimits fine) {
		
		for(double speed : speedPerMiles) {
			
			System.out.printf("Current speed: %3.2f Miles/hours \n", speed);
			
			if(fine.verify(speed)) {
				System.out.printf("Watching your speed, %3.2f Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!\n", speed);
			}
			
		}		
	}
	
	public static void main(String[] args) {
		
		double[] speedPerMiles = {0, 15, 25, 35, 65, 78, 87, 98, 105};  // Miles per hours  
		
		System.out.println("*************************************** Lambda Expression ****************************************");
		
		// Lambda Expression 
		SpeedLimits overSpeedLimits4LambdaExpression = (double value) -> { return value > 60; };
		
		forEach(speedPerMiles, overSpeedLimits4LambdaExpression);
			
		
		System.out.println("************************************** Anonymous Inner Class **************************************");
		
		/*
	 		An inner class declared without a Class name is 
			defined as an Anonymous Inner Class. 
			In case of anonymous inner classes, we "declare" and 
			"instantiate" them at the same time. 
		
			Generally speaking, they are used whenever you need to override the method of 
			"a class" or "an interface". 
		
			The syntax of an anonymous inner class is as follows:			
		*/
		SpeedLimits overSpeedLimits4Anonymous = new SpeedLimitsImplement() {

			@Override
			public boolean verify(double value) {

				return value > 60;

			}
		};
		
		for (double speed : speedPerMiles) {
	
			if (overSpeedLimits4Anonymous.verify(speed)) {

				System.out.printf("Watching your speed, %3.2f Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!\n", speed);

			}
		}
	}
}

/*

	Console:
			*************************************** Lambda Expression ****************************************
			Current speed: 0.00 Miles/hours 
			Current speed: 15.00 Miles/hours 
			Current speed: 25.00 Miles/hours 
			Current speed: 35.00 Miles/hours 
			Current speed: 65.00 Miles/hours 
			Watching your speed, 65.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Current speed: 78.00 Miles/hours 
			Watching your speed, 78.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Current speed: 87.00 Miles/hours 
			Watching your speed, 87.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Current speed: 98.00 Miles/hours 
			Watching your speed, 98.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Current speed: 105.00 Miles/hours 
			Watching your speed, 105.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			************************************** Anonymous Inner Class **************************************
			Watching your speed, 65.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 78.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 87.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 98.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!
			Watching your speed, 105.00 Miles/hours, Sir. You're over speed limits and won a ticket for $1000 !!!


*/