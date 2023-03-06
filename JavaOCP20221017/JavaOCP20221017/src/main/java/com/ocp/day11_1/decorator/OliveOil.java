package com.ocp.day11_1.decorator;

public class OliveOil extends Flavors {
	
	public OliveOil(Food food) {
		super(food);
		name = "Olive oil";
		price = 30;
	}
}