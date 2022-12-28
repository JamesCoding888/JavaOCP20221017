package com.ocp.day15.comparable;
/*
	Regarding introduction of enum class, please read the previously article 
	at package: com.ocp.day14.enumLesson.currency
		
*/
public enum SortedOrder {
    ASCENDING(true), DESCENDING(false);
	// Actually we give an accessibility of fields to be "private"
    private boolean value;
    
    // JRE will help to pad with "private" on constructors
    // SAME as private SortType(boolean value) { ... }
    SortedOrder(boolean value) {      
        this.value = value;
    }
    public boolean getValue() {
        return value;
    }
}

