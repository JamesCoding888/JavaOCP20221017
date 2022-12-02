package com.ocp.day11_1.decorator;

public class Tomato extends SideDish {
	
	public Tomato(Food food) {
		super(food);
		name = "Tomato";
		price = 18;
	}
}
