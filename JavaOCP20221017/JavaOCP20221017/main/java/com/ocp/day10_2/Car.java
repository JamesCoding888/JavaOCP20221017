package com.ocp.day10_2;

public abstract class Car {
	
    public void printName() {
        System.out.println("I'm a Car");
    }
    
    // "abstract" keyword - MUST be padded into abstract method, in abstract class
    // 抽象類別之抽象方法，必須加上 “abstract” 至抽象方法中
    public abstract void move();
}
