package com.ocp.day11_1.decorator;

public class Tuna extends Flavors {
	
	public Tuna(Food food) {
		super(food);
		name = "Tune";
		price = 22;
	}
}
