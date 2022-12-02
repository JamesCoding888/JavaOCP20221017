package com.ocp.day11_1.decorator;

public class Onion extends Flavors {
	
	public Onion(Food food) {
		super(food);
		name = "Onion";
		price = 22;
	}
}