package com.ocp.day17.exception.application.loginpage;

public class LoginException extends Exception{
	
	/*
	  	Notice here, the variable naming here:
		1) Accessed Priviledge shall be Private!
		2) Cannot change the value of final variable, since variable is constant
		3) variable naming shall be upper-case letter, because of final variable 
	*/
	private final short REPEATED_INCORRECT_PWD = 3;
	
	public LoginException(String errorMessage) {
		super(errorMessage);
	}
	
	// Inform end-user to proceed the next step
	public void how2Do() {
		++LoginExceptionDemo.lock;
		if(LoginExceptionDemo.lock == REPEATED_INCORRECT_PWD) {
			System.out.println("Account is currently locked out and may not be logged on to. "
						     + "This error when you enter an incorrect password repeatedly. "
						     + "This error prevents you from signing into your account. "
						     + "You can fix this issue by contacting Service Team");
			System.exit(0);
		}
		System.out.println("Please enter your password again");
	}
}