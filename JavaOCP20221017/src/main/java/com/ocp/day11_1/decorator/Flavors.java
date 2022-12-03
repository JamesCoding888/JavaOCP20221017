package com.ocp.day11_1.decorator;

public class Flavors extends AgentOfFood {
	
	protected Food food;
	
	
	public Flavors(Food food) {
		this.food = food; 
	}


	@Override
	public String getName() {
		// hereby, the "name" is outermost object, 
		// and "food.getName()" is next of the outermost object
		return name + " + " + food.getName();
	}


	@Override
	public int getPrice() {

		return price + food.getPrice();
	}
	
	
	@Override
	public String toString() {
		return name + "(" + price + ")" + " + " + ((AgentOfFood)food).getNameAndPrice();
	}
	
}
