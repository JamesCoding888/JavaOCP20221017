package com.ocp.day11_1.observer;
/*
	This is a Java class called Recipient that implements the Observer interface.
	
	By implementing the Observer interface, this class can act as an observer in the observer pattern.
	
	The class has a private field called name that represents the name of the recipient.
	
	The class provides an implementation for the update method defined in the Observer interface.
	
	1. update method:
	   
	   The update method takes a String parameter named message, which represents the message sent by the subject. 
	
	   The method simply prints a message to the console indicating that the recipient has received the message and displays the name of the recipient and the message itself.

	   When a change occurs in the subject, the update method will be called on each registered observer, including instances of this class. 
	
	   In the update method, the recipient can take appropriate actions based on the information provided in the message parameter.
*/
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
