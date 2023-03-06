package com.ocp.day11_1.observer;

public interface Subject {
	void add(Observer observer);           // same as "public abstract void add(Observer observer);" 
	void remove(Observer observer);		   // same as "public abstract void remove(Observer observer);"
	void notifyObserver(String message);   // same as "public abstract void notifyObserver(String message);"
}
