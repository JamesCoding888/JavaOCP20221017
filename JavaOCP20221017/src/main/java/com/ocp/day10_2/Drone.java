package com.ocp.day10_2;

public class Drone extends Airplane {
   
	public Drone() {
		
	}
	
	public Drone(String teamName) {
		System.out.println(teamName + "Ready");	
	}
	
	@Override
    public void speed() {
        System.out.println("UAV speed in 800km/h");   // 無人機速度800km/h
    } 
	
}
