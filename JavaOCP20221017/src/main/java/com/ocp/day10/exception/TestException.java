package com.ocp.day10.exception;

class HandleNumberException extends Exception {

	public HandleNumberException() {
		super(); // default
	}

	public HandleNumberException(int x) {
		System.out.printf("[Number - Engineer - 0001] End-user enter %d to denominator, engineer team shall record this event! \n\n", x);
	}

	public void reDirect2FrontEnd() {
		System.out.println("[Number - ServiceTeam - 0001] Appologies, our system don't allow '0' number here. Please re-enter your number. Thank you");
	}
}

public class TestException {

	static int x = 0;
	static int result = 0;
	public static void main(String[] args) throws HandleNumberException{
		HandleNumberException handle = new HandleNumberException();			
		if(x>0) {
			result = 100/x;	
		}
		if(x<=0) {
			handle.reDirect2FrontEnd();
			throw new HandleNumberException(x);
		}
		System.out.println(result);		
	}
}

/*
	Console:
			[Number - ServiceTeam - 0001] Appologies, our system don't allow '0' number here. Please re-enter your number. Thank you
			[Number - Engineer - 0001] End-user enter 0 to denominator, engineer team shall record this event! 
			
			Exception in thread "main" com.ocp.day9_2.polymorphism_2.HandleNumberException
				at com.ocp.day9_2.polymorphism_2.TestException.main(TestException.java:29)
*/