package com.ocp.day11_1.observer;
/*
 
	This is a Java class called RecipientCommunication that demonstrates the use of the observer pattern using the NewsTopic and Recipient classes.
	
	In this example, each recipient is added to the list of observers managed by the subject, and then removed after receiving a notification. 
	
	This demonstrates the dynamic nature of the observer pattern, where observers can be added and removed as needed, depending on the requirements of the application.

*/
public class RecipientCommunication {
	public static void main(String[] args) {

		// Three instances of the Recipient class are created, each with a different name 
		Observer observer1 = new Recipient("President Tsia");
		Observer observer2 = new Recipient("President of the Executive Yuan");
		Observer observer3 = new Recipient("Mission");

		// Initiated an object of NewsTopic for management of observer(s)
		Subject subject = new NewsTopic();

		// The first recipient is added to the list of observers managed by the subject using the add method
		subject.add(observer1);
		
		// CipherText
		// The subject notifies all the observers by calling the notifyObserver method
		subject.notifyObserver("Nancy Pelosi will meet you !!!");
		 
		// The first recipient is removed from the list of observers managed by the subject using the remove method
		subject.remove(observer1);
		
		// The second recipient is added to the list of observers managed by the subject using the add method
		subject.add(observer2);
		
		// CipherText
		subject.notifyObserver("Please have all executive team ready !!!");
		
		// The second recipient is removed from the list of observers managed by the subject using the remove method
		subject.remove(observer2);
		
		// The third recipient is added to the list of observers managed by the subject using the add method
		subject.add(observer3);
		
		// CipherText
		subject.notifyObserver("Taiwan’s TSMC to bring yours most advanced chip manufacturing to Arizona !!!");
		
		// The third recipient is removed from the list of observers managed by the subject using the remove method
		subject.remove(observer3);				

	}
}

/*
	Console:
			President Tsia, Received: Nancy Pelosi will meet you !!!
			President of the Executive Yuan, Received: Please have all executive team ready !!!
			Mission, Received: Taiwan’s TSMC to bring yours most advanced chip manufacturing to Arizona !!!
*/