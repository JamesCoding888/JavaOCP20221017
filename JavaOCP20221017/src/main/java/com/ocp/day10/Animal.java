package com.ocp.day10;
/*
 	What is interface?
 	1) Another way to achieve abstract
 	2) interface method (does not have a body), the body is provided by the "implement" class
 	3) To access the interface methods, the interface must be "implemented" by another class with the "implements" keyword (instead of "extends")
 	4) On implementation of an interface, you must override all of its methods
	5) Interface attributes are by "public static final"
	6) An interface CANNOT contain a constructor (that is, interface cannot be used to create objects)
	
	Why And When To Use Interfaces?
	1) For security - we can hide certain details and only show the important details of an object (interface).
	2) Java does not support "multiple inheritance" (i.e., a class can only inherit from one superclass, e.g., A extends B). However, interface can be achieved with interfaces, since the class can implement multiple interfaces, e.g., A implements B, C, D 
*/
public interface Animal {
    String COPY_RIGHT = "Discovery.com"; // same as "public static final String COPY_RIGHT"
    void eat();  // same as "public abstract void eat();"
    void play(); // same as "public abstract void play();"
    void name(); // same as "public abstract void name();"
    // After Java 1.8 (including 1.8 version), Java allows the implemented method in interface.class, but must add "default"
    // Java 1.8 之後，介面中有實作的方法必須加上 default 
    default void copyRight() {  // same as "public default void copyRight() { ... }"
        System.out.println(COPY_RIGHT);
    }
}
