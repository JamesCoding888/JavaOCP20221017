package com.ocp.day17.exception.application;

import java.util.Map;

public class LoginExceptionDemo  {
	
	private static Map<String, String> users;
	
	static {
		users.put("James", "#$&(^1WS784");
		users.put("David", "#&784(^1WS$");
	}
	
	public static boolean checkLogin(String username, String password) throws LoginException {
		String pwd = users.get(password);
		if(pwd == null) {
			throw new LoginException("Account Error");			
		} 
		if(!pwd.equals(password)) {
			// Notice here - Hacker can try to guess your password. Do NOT throw Password Error message to end-user !!!
			// Generally speaking, we will lock account if end-user submits the incorrect password in 3 times. 
			throw new LoginException("Password Error");
		}
		return false;
	}
	
	public static void main(String[] args) {
		String username = "James";
//		String password = "#$&(^1WS784";
		String password = null;
		try {
			boolean isPass = checkLogin(username, password);
			System.out.println(isPass);
		} catch(LoginException e) {
			System.out.println(e.getMessage());
			e.how2Do();
		}
	}
}
