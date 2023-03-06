package com.ocp.day10_2;

public class Truck extends Car {
    
	public Truck() {
		
	}
	
	public Truck(String teamName) {
		System.out.println(teamName + "Ready");
	}
	
    @Override
    public void move() {
        System.out.println("Trucks move to the area of burrow");
    }
    
}