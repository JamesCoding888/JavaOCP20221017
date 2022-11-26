package com.ocp.day10;
/*
 	Why Interfaces need Default Methods?
 	Like a regular interface methods, default methods are implicitly public; there's no need to specify the public modifier.

	Unlike regular interface methods, we declare them with the default keyword at the beginning of the method signature, and they provide an implementation.
	
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
