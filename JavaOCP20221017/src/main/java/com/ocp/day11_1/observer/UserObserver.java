package com.ocp.day11_1.observer;

public class UserObserver implements Observer {
	
	private String name;

	public UserObserver(String name) {
	        this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + " 收到: " + message);
	}

}
