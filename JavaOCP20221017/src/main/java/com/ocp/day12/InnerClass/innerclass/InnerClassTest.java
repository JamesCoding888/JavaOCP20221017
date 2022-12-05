package com.ocp.day12.InnerClass.innerclass;

public class InnerClassTest {
	
	public static void main(String[] args) {
		
		Outer inner = new Outer("888888");
		
		Outer.InnerCardOwner cardOwner = inner.new InnerCardOwner("Fubon", 5);
		
		cardOwner.print();
	}
	
}


/*
  	Console:
  			Card Info.: No.: 100, Name on Card: Fubon, Serial-Number: 888888, Confidentiality Level: 5

*/
