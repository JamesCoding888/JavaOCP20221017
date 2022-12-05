package com.ocp.day12.InnerClass.staticInnerClass;

public class StaticInnerClassTest {

	public static void main(String[] args) {
		
		System.out.println("Invoke the globalVariable in Outter.class: " + new Outter().globalVariable);
		
		System.out.println("Invoke the staticMemberVariable in Outter.class: " + Outter.staticMemberVariable);
			
		Outter.Inner.staticInnerMethod();
		
	}
}



/*
	Console:
			Invoke the globalVariable in Outter.class: 1
			Invoke the staticMemberVariable in Outter.class: 2
			I'm in staticInnerMethod
*/