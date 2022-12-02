package com.ocp.day11_1.observer;

public interface Subject {
	void add(Observer observer); 
	void remove(Observer observer);
	void notifyObserver(String message);
}
