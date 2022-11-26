package com.ocp.day10;

public class Cat extends AbstractAnimal {
	
	// Override the abstract method of play
	// 覆寫介面的抽象方法 play
    @Override
    public void play() {
        System.out.println("Play cat litter"); // 玩貓砂
    }
   
}
