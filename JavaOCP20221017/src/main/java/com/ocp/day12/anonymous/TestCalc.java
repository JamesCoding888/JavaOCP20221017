package com.ocp.day12.anonymous;

public class TestCalc {

	public static void main(String[] args) {
		
		int sum = new CalcImplement().submit(5, 5);
		
		System.out.println(sum);
		
		Calc calc = new CalcImplement();
		System.out.println(calc.submit(10, 30));
		
		
		// Anonymous Inner Class
		Calc calcByInnerClass = new CalcImplement() {
			
			public int submit(int x, int y) {
				
				return x + y;
				
			}	
		};
		
		int sumByAnonymous = calcByInnerClass.submit(8, 7);
		
		System.out.println(sumByAnonymous);
		
		
	    // Lambda expression
        Calc calcByLambdaExpression01 = (int x, int y) -> { return x + y; };
        System.out.println(calcByLambdaExpression01.submit(7, 9));
        
        Calc calcByLambdaExpression02 = (x, y) -> { return x + y; };
        System.out.println(calcByLambdaExpression02.submit(1, 3));
        
        Calc calcByLambdaExpression03 = (x, y) -> x + y ;
        System.out.println(calcByLambdaExpression03.submit(3, 6));
		
	}

}
