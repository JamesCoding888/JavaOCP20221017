package com.ocp.day14;
/*
 	Introduction of enum class:
 	1. Enum is introduced in Java 1.5 as a new type whose fields consists of a fixed set of constants 
 	2. fields - Actually we give an accessibility of fields to be "private".
 	3. Constructors:
 	   Accessibility of Constructors, MUST be in "private", eventually we do NOT specify an access modifier the enum constructor as default, 
 	   but finally JRE will help to pad with "private" on constructors
	 
	4. The type enum class cannot be the superclass of SubClass; a superclass must be a class. Please refer to the "Coin.java"
	
*/

public enum EnumForUSCurrency {

	// Constant implicitly as "public static final"
	// Shall be placed in the top
	PENNY(1), 		// 1 美分 
	NICKLE(5), 		// 5 美分
	DIME(10), 		// 10 美分
	QUARTER(25);	// 25 美分
	
	/*
	   Actually, we give the accessibility of fields, to be "private"; 
	   however, it's NOT big deal even we give the fields of accessibility in "public", 
	   since developer CANNOT instantiate an object of enum class outside and access the value of fields in enum class with that instantiated object. 
	*/
	private Integer value;

	private EnumForUSCurrency(Integer value) {  // 
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}