package com.ocp.day10_1;

public class Dog extends AbstractAnimal {

	// Override the abstract method of play
	// 覆寫介面的抽象方法 play
    @Override
    public void play() {
        System.out.println("Play frisbee"); // 玩飛盤
    }
    
    @Override
    public void name() {
    	System.out.println("I'm Chihuahua~ "); // 我是吉娃娃
    }
}