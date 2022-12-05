package com.ocp.day12.InnerClass.innerclass;

public class InnerClassTest {
	
	public static void main(String[] args) {
		
		Inner inner = new Inner("888888");
		
		Inner.CardOwner cardOwner = inner.new CardOwner("Fubon", 5);
		
		cardOwner.print();
	}
	
}


/*
  	Console:
  			Card Info.: No.: 100, Name on Card: Fubon, ID: 888888, Confidentiality Level: 5

*/
