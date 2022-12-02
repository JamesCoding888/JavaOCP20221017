package com.ocp.day11_1.decorator;

public class Onion extends SideDish {
	
	public Onion(Food food) {
		super(food);
		name = "Onion";
		price = 22;
	}
}