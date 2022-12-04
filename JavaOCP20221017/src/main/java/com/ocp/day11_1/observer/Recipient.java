package com.ocp.day11_1.observer;

public class Recipient implements Observer {
	
	private String name;

	public Recipient(String name) {
	        this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + ", Received: " + message);
	}

}
