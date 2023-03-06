package com.ocp.day10_2;

public class Tank extends Car implements Weapon {
    
	public Tank() {
		
	}
	
	public Tank(String mission) {
		System.out.println(mission + "Ready");	
	}
	
    @Override
    public void move() {
        System.out.println("Tanks move to the areas of enemy");
    }
    
    @Override
    public void fire() {
        System.out.println("Shooting armour-piercing ammunition to penetrate tank armour");
    }

}