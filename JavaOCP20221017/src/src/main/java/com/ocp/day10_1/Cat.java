package com.ocp.day10_1;

public class Cat extends AbstractAnimal {
	
	// Override the abstract method of play
	// 覆寫介面的抽象方法 play
    @Override
    public void play() {
        System.out.println("Play cat litter"); // 玩貓砂
    }
   
    // Override the abstract method of name
 	// 覆寫介面的抽象方法 name
    @Override
    public void name() {
    	System.out.println("I'm Persian");  // 我是馬爾濟斯
    }
}
