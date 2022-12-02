package com.ocp.day11_1.decorator;

public abstract class AFood extends Food {
    
	public String getNameAndPrice() {

    	return name + "(" + price + ")";
	}
}
