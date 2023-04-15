package com.ocp.day10_1;
/*
 	What is interface?
 	1) Another way to achieve abstract
 	2) interface method (does not have a body), the body is provided by the "implement" class
 	3) To access the interface methods, the interface must be "implemented" by another class with the "implements" keyword (instead of "extends")
 	4) On implementation of an interface, you must override all of its methods
	5) Interface attributes are by "public static final"
	6) An interface CANNOT contain a constructor (that is, interface cannot be used to create objects)
	7) An interface doesn't have any memory space of its own. It is just a blueprint or a contract that defines a set of methods that must be implemented by a class that implements the interface. 
	   When a class implements an interface, it provides the actual implementation for the methods defined in the interface, and it is the object of that class that will have memory space allocated to it when instantiated. 
	
	Why And When To Use Interfaces?
	1) For security - we can hide certain details and only show the important details of an object (interface).
	2) Java does not support "multiple inheritance" (i.e., a class can only inherit from one superclass, e.g., A extends B). However, interface can be achieved with interfaces, since the class can implement multiple interfaces, e.g., A implements B, C, D
	
	
	Introduction of this program:
	1) In the given code snippet, we have an interface called InterfaceAnimal. It declares three abstract methods eat(), play(), and name(). 
	   These methods don't have any implementation and will be implemented by any class that implements this interface.
	2) The interface also has a constant COPY_RIGHT declared as public static final String COPY_RIGHT = "Discovery.com". 
	   It means that any class implementing this interface will have access to this constant.
	
	3) The interface also has a default method copyRight() declared as default void copyRight() { ... }. 
	   It means that any class implementing this interface will have this method with a default implementation that prints the value of COPY_RIGHT.
	
	4) An interface cannot have a constructor. This is because an interface is not a class and cannot be instantiated, 
	   so it doesn't make sense to have a constructor in an interface.
	
	    
*/
public interface InterfaceAnimal {
    String COPY_RIGHT = "Discovery.com"; // same as "public static final String COPY_RIGHT"
    void eat();  // same as "public abstract void eat();"
    void play(); // same as "public abstract void play();"
    void name(); // same as "public abstract void name();"
    // After Java 1.8 (including 1.8 version), Java allows the implemented method in interface.class, but must add "default"
    // Java 1.8 之後，介面中有實作的方法必須加上 default 
    default void copyRight() {  // same as "public default void copyRight() { ... }"
        System.out.println(COPY_RIGHT);
    }
    // Interface cannon have constructor
    /*
    public InterfaceAnimal() {
    	super();
    }
    */
}
