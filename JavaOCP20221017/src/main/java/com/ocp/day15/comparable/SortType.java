package com.ocp.day15.comparable;
/*
	Regarding introduction of enum class, please read the previously article 
	at package: com.ocp.day14.enumLesson.currency
	
	
	Introduction of enum class:
 	1. Enum is introduced in Java 1.5 as a new type whose fields consists of a fixed set of constants 
 	2. fields - Actually we give an accessibility of fields to be "private".
 	3. Constructors:
 	   Accessibility of Constructors, MUST be in "private", eventually we do NOT specify an access modifier the enum constructor as default, 
 	   but finally JRE will help to pad with "private" on constructors
	 
	4. The type enum class cannot be the superclass of SubClass; a superclass must be a class. Please refer to the "TestCoin.java"
	
	
*/
public enum SortType {
    ASCENDING(true), DESCENDING(false);
	// Actually we give an accessibility of fields to be "private"
    private boolean value;
    
    // JRE will help to pad with "private" on constructors
    // SAME as private SortType(boolean value) { ... }
    SortType(boolean value) {      
        this.value = value;
    }
    public boolean getValue() {
        return value;
    }
}

