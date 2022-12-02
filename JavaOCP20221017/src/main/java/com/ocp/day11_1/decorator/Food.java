package com.ocp.day11_1.decorator;
/*
  
  	Regarding visibility of protected, 
  	please recap the previously lecture on package: com.ocp.day2.bar
  
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
