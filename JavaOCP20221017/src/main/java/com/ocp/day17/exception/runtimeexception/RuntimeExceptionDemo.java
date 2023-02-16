package com.ocp.day17.exception.runtimeexception;

// Console 2):
/*
class ScaleOverLimitedException extends RuntimeException{
	
	public ScaleOverLimitedException() {
		super();
	}
	
	public ScaleOverLimitedException(Exception e) {
		System.out.printf("[Number - Engineer - 0002] End-user enters scores over the limitedness of printScore(Double scores) method\n");
		System.out.printf("[Number - ServiceTeam - 0002] My appologies, please enter scores between 60.00 to 100\n");
	}
}
*/

public class RuntimeExceptionDemo 
	 // Console 2): 
//	 extends ScaleOverLimitedException 
{

	public static void printScore(Double score) {
		if(score < 0 || score > 100) {
			RuntimeException runtimeException = new RuntimeException("scale over limitedness !!!");
			/*  
			 	Console 1):
				  	Notice here - Don't throw runtimeException !!! Otherwise, the main thread will be terminated.
				  	Then, the following code or services will NOT proceed.
			*/				
//			throw runtimeException;
			
			// Console 2):
//			throw new ScaleOverLimitedException(runtimeException);
			
			// Console 3): 
			System.out.println(runtimeException);
		}
		boolean isPass = score >= 60;
		System.out.printf("Scores: %.2f -> %s\n", score, isPass? "Pass" : "Fail");
	}
	
	public static void main(String[] args) {
		// Notice here - round off to 2nd decimal place
		printScore(59.125); 
		printScore(60.514);
		// RuntimeException
		printScore(100.001);
		printScore(60.0); 
	}	
}


/*
	Console 1) - w/ "throw runtimeException": 			
				Scores: 59.13 -> Fail
				Scores: 60.51 -> Pass
				Exception in thread "main" java.lang.RuntimeException: scale over limitedness !!!
						
	Console 2) - w/ "throw new ScaleOverLimitedException(runtimeException)":	
				Scores: 59.13 -> Fail
				Scores: 60.51 -> Pass
				[Number - Engineer - 0002] End-user enters scores over the limitedness of printScore(Double scores) method
				[Number - ServiceTeam - 0002] My appologies, please enter scores between 60.00 to 100
				Exception in thread "main" com.ocp.day17.exception.runtimeexception.ScaleOverLimitedException
	
	Console 3) - w/o "throw runtimeException" & "throw new ScaleOverLimitedException(runtimeException)":
				Scores: 59.13 -> Fail
				Scores: 60.51 -> Pass
				java.lang.RuntimeException: scale over limitedness !!!
				Scores: 100.00 -> Pass
				Scores: 60.00 -> Pass

*/