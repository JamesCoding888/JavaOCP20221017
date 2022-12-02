package com.ocp.day11_1.decorator;

public class Tuna extends SideDish {
	
	public Tuna(Food food) {
		super(food);
		name = "Tune";
		price = 22;
	}
}
