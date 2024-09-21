package com.ocp.day17.exception;

/*
	Important Notice: DO NOT throw RuntimeException, Exception, or Throwable directly.
	
	Example of incorrect usage:
	    public static void main(String[] args) throws RuntimeException, Exception, Throwable { ... }
	
	Reason for avoiding RuntimeException:
	
	    1) Throwing a RuntimeException can lead to subtle and hard-to-diagnose errors. 
	       For instance, the caller cannot inspect the exception to determine the cause 
	       and therefore cannot make an attempt to recover from the issue.
	
	Preferred approach:
	
	    1) Instead of throwing RuntimeException, create and throw a custom exception, 
	       or extend an existing exception class (either from Exception or RuntimeException).
	
	For more details, refer to:
	https://wiki.sei.cmu.edu/confluence/display/java/ERR07-J.+Do+not+throw+RuntimeException%2C+Exception%2C+or+Throwable
*/
class HandleNumberException extends Exception {

	public HandleNumberException() {
		super(); // default
	}

	public HandleNumberException(int x) {
		// The following statement will be stored into the specific column of table in Database.
		System.out.printf("[Number - Engineer - 0001] End-user enter %d to denominator, engineer team shall stop end-user typing the '0' number into denominator at the front-end web page ! \n\n", x);
	}

	public void reDirect2FrontEnd() {
		// For the sake of efficiency, generally developer will handle with the '0' number at the specific column of front-end web page (e.g., HTML5 or javascript) to reduce the Server Load.
		// The following statement will be thrown to the front-end web page for end-user. 
		System.out.println("[Number - ServiceTeam - 0001] Apologies, our system don't allow '0' number here. Please re-enter your number. Thank you");
	}
}

public class ExceptionDemo1 {

	static int x = 0;	// end-user enter the number at front-end web page
	static int result = 0;
	
	public static void main(String[] args) throws HandleNumberException{
		// Instantiate an object of customized exception (i.e., HandleNumberException)
		HandleNumberException handle = new HandleNumberException();			
		
		if(x > 0) {
			result = 100 / x;	
		}
		
		if(x <= 0) {
			handle.reDirect2FrontEnd();
			throw new HandleNumberException(x);
		}
		
		System.out.println(result);		
	}
}

/*
	Console with x = 0:
			
						[Number - ServiceTeam - 0001] Apologies, our system don't allow '0' number here. Please re-enter your number. Thank you
						[Number - Engineer - 0001] End-user enter 0 to denominator, engineer team shall stop end-user typing the '0' number into denominator at the front-end web page ! 
						
						Exception in thread "main" com.ocp.day17.exception.HandleNumberException
							at com.ocp.day17.exception.ExceptionDemo.main(ExceptionDemo.java:58)


	Console with x = 1:

						100

	
	
*/