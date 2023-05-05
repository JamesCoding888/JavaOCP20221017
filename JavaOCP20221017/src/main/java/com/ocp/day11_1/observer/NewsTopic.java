package com.ocp.day11_1.observer;
/*
	This is a Java class called NewsTopic that implements the Subject interface.
	
	The class has a private field called collectElementsFromObserver that is a List of Observer objects. This list is used to manage the observers that are interested in receiving notifications from the subject.
	
	The class provides implementations for the three methods defined in the Subject interface.
	
		1. add method:
			
		   The add method adds an Observer object to the list of observers managed by the subject.
		
		2. remove method:
			
		   The remove method removes an Observer object from the list of observers managed by the subject.
					
		3. notifyObserver method:
			
		   The notifyObserver method notifies all the observers in the list by calling the update method on each observer and passing the message parameter.
	
	By implementing the Subject interface, this class can act as a subject in the observer pattern, and other classes can register themselves as observers by calling the add method. When a change occurs, the subject can notify all the registered observers by calling the notifyObserver method. The observers will receive the notification and can take appropriate actions based on the information provided in the message parameter.

*/
import java.util.ArrayList;
import java.util.List;


public class NewsTopic implements Subject {
	
	// Collect element(s) from Observer into List for management
	// Visibility of colectElementsFromObserver: private
	private List<Observer> collectElementsFromObserver = new ArrayList<>();

	@Override
	public void add(Observer observer) {
		collectElementsFromObserver.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		collectElementsFromObserver.remove(observer);
	}

	@Override
	public void notifyObserver(String message) {
		for (Observer observer : collectElementsFromObserver) {
			observer.update(message);
		}
	}
}