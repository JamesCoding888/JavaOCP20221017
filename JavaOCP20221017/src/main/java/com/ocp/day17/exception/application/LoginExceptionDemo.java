package com.ocp.day17.exception.application;

import java.util.HashMap;
import java.util.Map;
public class LoginExceptionDemo  {
	
	public static short lock = 0;
	
	private static Map<String, String> users = new HashMap<>();
	
	static {
		// Following account already stored in Database
		users.put("James", "#$&(^1WS784");
		users.put("David", "#&784(^1WS$");
	}

	public static boolean checkLogin(String username, String password) throws LoginException {
		String pwd = users.get(username);
		if(pwd == null) {			
			throw new LoginException("Account Error");			
		} 
		if(!pwd.equals(password)) {
			// Notice here - Hacker can try to guess your password. Do NOT throw Password Error message to end-user !!!
			// Generally speaking, we will lock account if end-user submits incorrect password in 3 times. 
			throw new LoginException("Password Error");
		}
		return true;
	}
	
	public static void main(String[] args) {			
		while(true) {				
			// End-user enters the username but incorrect password on web-page, repeatedly
			String username = "James";
			String password = "#$&(^1WS784512";			
			try {
				boolean isPass = checkLogin(username, password);			
				// isPass ? true : LoginException
				System.out.println(isPass);			
			} catch(LoginException e) {
				System.out.println(e.getMessage());
				e.how2Do();
			}	
		}
	}
}

/*
	Console:
			Password Error
			Please enter your password again
			Password Error
			Please enter your password again
			Password Error
			Account is currently locked out and may not be logged on to. This error when you enter an incorrect password repeatedly. This error prevents you from signing into your account. You can fix this issue by contacting Service Team
*/