package com.ocp.day10_2;

public class Tank extends Car implements Weapon {
    
    @Override
    public void move() {
        System.out.println("I'm a tank with widedly steel belt on wheel for running");
    }
    
    @Override
    public void shoot() {
        System.out.println("Shooting armour-piercing ammunition to penetrate tank armour");
    }

}