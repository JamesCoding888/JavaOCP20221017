package com.ocp.day17.exception.terminate;
/*
	Key Points to Notice:
	
	- In Java exception handling, the `finally` block **must** be executed even if the `catch` block does not handle any exceptions or errors.
	
	- This lesson demonstrates the behavior of `return` and `System.exit(0)` in conjunction with the try-catch-finally structure.
	
	Detailed Explanation:
	
	a. The keyword `return`:
	   - It is used to end the execution of a method and, optionally, return a value from the method.
	
	b. The method `System.exit(0)`:
	   - Terminates the currently running Java Virtual Machine (JVM) and exits the program.
	   - Use `System.exit(0)` to handle situations where an immediate termination of the program is necessary, such as encountering an abnormal condition.
	   
	Please observe the behavior in the following code.
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
			e.printStackTrace(System.out); // Explicitly prints to standard output (System.out), less common and used when you want to redirect errors to standard output.
			e.printStackTrace(); // Default to standard error (System.err), preferred for error handling.
			// Console 2)
			/*
				return;
			 */
			// Console 3)
//			/*
				System.exit(0); // Terminates the Java Virtual Machine (JVM), meaning the entire application will stop running, not just the current thread. 
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