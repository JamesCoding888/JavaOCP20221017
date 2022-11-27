package com.ocp.day10_2;

public interface Weapon {		  

	// After Java 1.8 (including 1.8 version), Java allows the implemented method in interface.class, but must add "default"
    // Java 1.8 之後，介面中有實作的方法必須加上 default 
	public default void printName() {
		
		System.out.println("Weapon");
	
	}
	
	public abstract void shoot();  // "abstract" method - Optional in interface class
			
	
}
