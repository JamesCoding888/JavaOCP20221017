package com.ocp.day11_1.observer;

public class RecipientCommunication {
	public static void main(String[] args) {

		// Initiated the "name" variable of UserObserver 
		Observer observer1 = new Recipient("President Tsia");
		Observer observer2 = new Recipient("President of the Executive Yuan");
		Observer observer3 = new Recipient("Mission");

		// Initiated an object of NewsTopic for management of observer(s)
		Subject subject = new NewsTopic();

		// Recipient
		subject.add(observer1);
		
		// CipherText
		subject.notifyObserver("Nancy Pelosi will meet you !!!");
		
		// Destroy the confidential element from List
		subject.remove(observer1);
		
		// Recipient
		subject.add(observer2);
		
		// CipherText
		subject.notifyObserver("Please have all executive team ready !!!");
		
		// Destroy the confidential element from List
		subject.remove(observer2);
		
		// Recipient
		subject.add(observer3);
		
		// CipherText
		subject.notifyObserver("Taiwan’s TSMC to bring yours most advanced chip manufacturing to Arizona !!!");
		
		// Destroy the confidential element from List
		subject.remove(observer3);				

	}
}

/*
	Console:
			President Tsia, Received: Nancy Pelosi will meet you !!!
			President of the Executive Yuan, Received: Please have all executive team ready !!!
			Mission, Received: Taiwan’s TSMC to bring yours most advanced chip manufacturing to Arizona !!!
*/