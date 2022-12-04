package com.ocp.day11_1.decorator;
/*
  
  	The global variable of "name" and "price", we place here in the Food.class, for implement by subclass. 
  	Also, there are two methods given by abstraction, because these methods without body (so-called virtual method) are, 
  	developer expected them to be implemented.
  	
  	
  	Regarding visibility of "protected", please recap the previously lecture on package: com.ocp.day2.bar
*/

public abstract class Food {
	
	/*   
		Accessibility of protected type: 
		1) Same Class 
		2) Class in same Package
	    3) Subclass in Same Package
		4) Subclass Outside the Same Package
	*/
	protected String name;
    protected int price;
    
    public abstract String getName();
    
    public abstract int getPrice();
    
}
