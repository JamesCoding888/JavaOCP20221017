package com.ocp.day12.anonymous;

public class TestAnonymousInnerCalc {

	public static void main(String[] args) {
		
		int sum = new CalcImplement().submit(5, 5);
		
		System.out.println(sum);
		
		Calc calc = new CalcImplement();
		System.out.println(calc.submit(10, 30));
		
		
		/*
	 		An inner class declared without a Class name is 
			defined as an Anonymous Inner Class. 
			In case of anonymous inner classes, we "declare" and 
			"instantiate" them at the same time. 
		
			Generally, they are used whenever you need to override the method of 
			"a class" or "an interface". 
		
			The syntax of an anonymous inner class is as follows:			
		*/
		Calc calcByInnerClass = new CalcImplement() {
			
			// Override the abstraction method at Calc.class
			@Override 
			public int submit(int x, int y) {
				
				return x + y;	
				
			}			
		};

		int sumByAnonymous = calcByInnerClass.submit(8, 7);
		
		System.out.println(sumByAnonymous);
		
		
	    // Lambda expression - Standard Syntax
        Calc calcByLambdaExpression01 = (int x, int y) -> { return x + y; };
        System.out.println(calcByLambdaExpression01.submit(7, 9));

        // Lambda expression - allow to remove type of arguments (Reminder, remove ONLY one type of arguments - Unallowable)        
        Calc calcByLambdaExpression02 = (x, y) -> { return x + y; };
        System.out.println(calcByLambdaExpression02.submit(1, 3));

        // Lambda expression - allow to remove type of arguments and "{ return  ;}"         
        Calc calcByLambdaExpression03 = (x, y) -> x + y ;
        System.out.println(calcByLambdaExpression03.submit(3, 6));
		
	}
}
