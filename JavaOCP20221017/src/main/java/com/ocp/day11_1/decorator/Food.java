package com.ocp.day11_1.decorator;
/*
  
  	Regarding visibility of protected, 
  	please recap the previously lecture on package: com.ocp.day2.bar
  
*/

public abstract class Food {

	protected String name;
    
    protected int price;
    
    public abstract String getName();
    
    public abstract int getPrice();
    
}
