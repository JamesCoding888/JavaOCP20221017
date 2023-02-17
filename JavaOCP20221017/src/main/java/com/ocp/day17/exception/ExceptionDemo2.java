package com.ocp.day17.exception;

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
		// Console 1): JVM catches the exception because w/o try-catch and finally statement in main method 
//		throws Exception   
	{
		// Console 2): With try-catch statement in main method
		try {
			printScore(100.0);
			printScore(-1.005);
		} catch(Exception e) {
			// log for engineering team
			System.out.println("Catch the exception by main method - " + e);
		} finally {
			// Following syntax is NOT workable but demo merely, since this project: JavaOCP20221017 doesn't have Server and also no .html/.jsp as well
			// reDirect to another web-page for end-user to proceed the service continually	
			System.out.println("redirect:/another-web-page/");
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
			redirect:/another-web-page/
*/
