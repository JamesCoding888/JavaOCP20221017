package com.ocp.day17.exception;

/*
	Noticed here !!! Shall NOT Throw RuntimeException, Exception, or Throwable. 
	
	E.g.,
		public static void main(String[] args) throws RuntimeException, Exception, Throwable { ... }
		
	
	
	Reason of NOT throwing RuntimeException:
		
		1) Throwing a RuntimeException can lead to subtle errors; for example, a caller cannot 
		   examine the exception to determine why it was thrown and consequently cannot attempt recovery.
	
	
	
	Supposed to do:
		
		1) Methods can throw a customized exception or a sub-classes exception from Exception or RuntimeException. 
	
	
	
	Refer to the link as follows:
	https://wiki.sei.cmu.edu/confluence/display/java/ERR07-J.+Do+not+throw+RuntimeException%2C+Exception%2C+or+Throwable
	
*/

class HandleNumberException extends Exception {

	public HandleNumberException() {
		super(); // default
	}

	public HandleNumberException(int x) {
		System.out.printf("[Number - Engineer - 0001] End-user enter %d to denominator, engineer team shall stop end-user typing the '0' number into denominator at the front-end web page ! \n\n", x);
	}

	public void reDirect2FrontEnd() {
		System.out.println("[Number - ServiceTeam - 0001] Apologies, our system don't allow '0' number here. Please re-enter your number. Thank you");
	}
}

public class ExceptionDemo {

	static int x = 0;	// end-user enter the number at front-end web page
	static int result = 0;
	
	public static void main(String[] args) throws HandleNumberException{
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