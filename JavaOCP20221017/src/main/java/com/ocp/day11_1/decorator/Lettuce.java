package com.ocp.day11_1.decorator;

public class Lettuce extends SideDish {
	
	public Lettuce(Food food) {
		super(food);
		name = "Ham";
		price = 40;
	}
}