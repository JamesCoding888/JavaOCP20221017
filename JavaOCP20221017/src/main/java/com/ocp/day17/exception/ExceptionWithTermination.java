package com.ocp.day17.exception;

public class ExceptionWithTermination {
	public static void main(String[] args) {
		
		// finally
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
//			/*
				return;
//			 */
			// Console 3)
			/*
				System.exit(0); 
			*/
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