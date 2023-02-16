package com.ocp.day17.exception.runtimeexception;

public class RuntimeExceptionDemo {
	
	public static void printScore(Double score) {
		if(score < 0 || score > 100) {
			RuntimeException runtimeException = new RuntimeException("scale over limitedness !!!");
			System.out.println(runtimeException);
			/*
			  	Notice here - Don't throw runtimeException !!! Otherwise, the main thread will be terminated.
			  	Then, the following code or services will NOT proceed.
			*/	
			
			throw runtimeException; 
		}
		boolean isPass = score >= 60;
		System.out.printf("Scores: %.2f -> %s\n", score, isPass? "Pass" : "Fail");
	}
	
	public static void main(String[] args) {
		// Notice here - round off to 2nd decimal place
		printScore(59.125); 
		printScore(60.514);
		// throw RuntimeException
		printScore(100.001);
		printScore(60.0); 
	}	
}


/*
	Console w/o "throw runtimeException": 			
			Scores: 59.13 -> Fail
			Scores: 60.51 -> Pass
			java.lang.RuntimeException: scale over limitedness !!!
			Scores: 100.00 -> Pass
			Scores: 60.00 -> Pass

	
	Console w/ "throw runtimeException":	
			Scores: 59.13 -> Fail
			Scores: 60.51 -> Pass
			java.lang.RuntimeException: scale over limitedness !!!
			Exception in thread "main" java.lang.RuntimeException: scale over limitedness !!!
		
*/