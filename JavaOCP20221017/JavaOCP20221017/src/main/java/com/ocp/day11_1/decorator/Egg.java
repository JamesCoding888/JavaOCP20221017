package com.ocp.day11_1.decorator;

public class Egg extends Flavors {
	
	public Egg(Food food) {
		super(food);
		name = "Egg";
		price = 15;
	}
}