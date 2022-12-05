package com.ocp.day12.InnerClass.innerclass;

public class InnerClassTest {
	
	public static void main(String[] args) {
		
		Outter inner = new Outter("888888");
		
		Outter.InnerCardOwner cardOwner = inner.new InnerCardOwner("Fubon", 5);
		
		cardOwner.print();
	}
	
}


/*
  	Console:
  			Card Info.: No.: 100, Name on Card: Fubon, ID: 888888, Confidentiality Level: 5

*/
