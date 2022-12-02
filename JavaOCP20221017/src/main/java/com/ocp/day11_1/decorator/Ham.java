package com.ocp.day11_1.decorator;

public class Ham extends SideDish {
	
	public Ham(Food food) {
		super(food);
		name = "Lettuce";
		price = 13;
	}
}