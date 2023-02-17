package com.ocp.day17.exception;
/*
 	Java_Virtual_Machine catches the exception
*/
public class ExceptionDemo2 {
	
	public static void printScore(Double score) throws Exception {
		if(score < 0 || score > 100) {
			Exception exception = new Exception("scale over limitedness !!!");
			throw exception;			
		}
		boolean isPass = score >= 60;
		System.out.printf("Scores: %.2f -> %s\n", score, isPass? "Pass" : "Fail");
	}
	public static void main(String[] args) 
		// Console 1): JVM catches the exception because w/o try-catch statement in main method 
//		throws Exception   
	{
		// Console 2): With try-catch statement in main method
		try {
			printScore(100.0);
			printScore(-1.005);
		} catch(Exception e) {
			System.out.println("Catch the exception by main method - " + e);
		}
	}
}

/*
	Console 1):
			
			Scores: 100.00 -> Pass
			Exception in thread "main" java.lang.Exception: scale over limitedness !!!
	
	Console 2):
			
			Scores: 100.00 -> Pass
			Catch the exception by main method - java.lang.Exception: scale over limitedness !!!

*/
