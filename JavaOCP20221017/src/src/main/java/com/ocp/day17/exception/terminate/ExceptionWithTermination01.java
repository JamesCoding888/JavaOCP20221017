package com.ocp.day17.exception.terminate;
/*
 	To be noticed:			 	  
	 	   As you may know, the try-catch and finally statement for exception handling, the block code of "finally" MUST be executed eventually the code block of catch statement does NOT handle any exception/error.
	 	   Of this lesson, we are going to demonstrate a function of "return" and "System.exit(0)" with application of try-catch and finally statement.
	 	   
	 	   Please read the follows: 
	 	   		
	 	   		a. The keyword of return is to finish the execution of a method, and also can be used to return a value of a method.
	 	   
	 	   		b. The function of System.exit(0), is going to terminate the currently running JVM and exits the program. 		 	  
				  	   Why do we need System.exit(0)? If there is an abnormal condition and shall exit immediately, then proceed System.exit(0).
				
*/
public class ExceptionWithTermination01 {
	public static void main(String[] args) {

		printAvg(10, 0);
		
	}
	
	public static void printAvg(int x, int y) {
		int avg = 0;
		try {
			avg = x / y;
		} catch(Exception e) {
			// Console 1), 2) and 3)
			e.printStackTrace(System.out);
			// Console 2)
			/*
				return;
			 */
			// Console 3)
//			/*
				System.exit(0); 
//			*/
		} finally {
			// Console 1): w/o return 
			// Console 2): w/ return 
			System.out.printf("Must execute avg = %d\n", avg);
		}
		// Console 1): w/o return 
		System.out.printf("maybe execute avg = %d\n", avg); 
	}
}

/*
	Console 1):
				java.lang.ArithmeticException: / by zero					
				Must execute avg = 0
				maybe execute avg = 0
				
	Console 2):				
				java.lang.ArithmeticException: / by zero				
				Must execute avg = 0

	Console 3):
				java.lang.ArithmeticException: / by zero				
*/