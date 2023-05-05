package com.ocp.day11_1.observer;
/*
	This is the definition of a Java interface called Observer.

	The interface has a single method called update, which takes a String parameter named message. 
	
	The method does not have an implementation because interfaces only define the method signature but not the implementation.

	Any class that implements this interface will be required to provide its own implementation of the update method. 
	
	The purpose of this interface is to define a common contract for classes that need to observe and react to changes in a system or data. 
*/
public interface Observer {
	
	void update(String message); // same as "public abstract void update(String message);"
	
}
