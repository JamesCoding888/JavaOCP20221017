package com.ocp.day18;

public class Area {
	private int weight;
	private int height;
	
	
	public Area(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	public int getArea() {
		return (weight * height);
	}
	
	public int getPerimeter() {		
		return 2 * (weight + height);
	}
}
