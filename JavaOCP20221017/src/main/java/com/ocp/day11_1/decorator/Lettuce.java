package com.ocp.day11_1.decorator;

public class Lettuce extends Flavors {
	
	public Lettuce(Food food) {
		super(food);
		name = "Ham";
		price = 40;
	}
}