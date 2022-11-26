package com.ocp.day10;
// abstract class of Animal implements Animal of interface
// abstract class (抽象類別) 實作介面的 Animal
public abstract class AbstractAnimal implements Animal  {

	// Override the abstract method of eat
	// 覆寫介面的抽象方法 eat
	@Override
	public void eat() {
		System.out.println("Eat beef");		
	}

	
}
