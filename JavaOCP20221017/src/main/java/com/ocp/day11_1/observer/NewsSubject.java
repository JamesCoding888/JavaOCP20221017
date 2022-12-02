package com.ocp.day11_1.observer;

import java.util.ArrayList;
import java.util.List;


public class NewsSubject implements Subject {

	private List<Observer> list = new ArrayList<>();

	@Override
	public void add(Observer observer) {
		list.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObserver(String message) {
		for (Observer observer : list) {
			observer.update(message);
		}
	}
}