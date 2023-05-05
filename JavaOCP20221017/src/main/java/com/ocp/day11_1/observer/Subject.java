package com.ocp.day11_1.observer;
/*
 
	This is the definition of a Java interface called Subject.
	
	The interface defines three methods: add, remove, and notifyObserver. All three methods are declared without implementation because this is an interface.
	 
		1. add method:
			
			The add method takes an object that implements the Observer interface as a parameter, and its purpose is to add the observer to the list of observers that the subject will notify when a change occurs.
		 
		2. remove method:
			
			The remove method takes an object that implements the Observer interface as a parameter, and its purpose is to remove the observer from the list of observers that the subject will notify when a change occurs.
		
		3. notifyObserver method:
		
			The notifyObserver method takes a String parameter named message. Its purpose is to notify all the observers that a change has occurred by calling the update method on each observer and passing the message parameter.
	
	By defining this interface, any class that needs to act as a subject in the observer pattern can implement this interface and provide its own implementation of these three methods.

*/
public interface Subject {
	void add(Observer observer);           // same as "public abstract void add(Observer observer);" 
	void remove(Observer observer);		   // same as "public abstract void remove(Observer observer);"
	void notifyObserver(String message);   // same as "public abstract void notifyObserver(String message);"
}
