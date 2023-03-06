package com.ocp.day11_1.decorator;

public class Bread extends AgentOfFood {
	
	public Bread(String bread) {
		
		name = bread;
		price = 35;
		
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
}
