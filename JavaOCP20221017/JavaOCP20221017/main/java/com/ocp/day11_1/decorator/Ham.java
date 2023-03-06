package com.ocp.day11_1.decorator;

public class Ham extends Flavors {
	
	public Ham(Food food) {
		super(food);
		name = "Ham";
		price = 13;
	}
}