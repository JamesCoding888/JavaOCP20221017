package com.ocp.day11_1.observer;

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