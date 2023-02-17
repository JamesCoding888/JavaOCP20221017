package com.ocp.day17.exception.application;

public class LoginException extends Exception{
	
	public LoginException(String errorMessage) {
		super(errorMessage);
		System.out.println("1");
	}
	
	public void how2Do() {
		System.out.println("Please enter your password again");
	}
}