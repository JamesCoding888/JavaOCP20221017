package com.ocp.day12.InnerClass.staticInnerClass;

public class StaticInnerClassTest {

	public static void main(String[] args) {
		
		System.out.println("Invoke the globalVariable in Outter.class: " + new Outer().globalVariable);
		
		System.out.println("Invoke the staticMemberVariable in Outter.class: " + Outer.staticMemberVariable);
			
		Outer.Inner.staticInnerMethod();
		
	}
}



/*
	Console:
			Invoke the globalVariable in Outter.class: 1
			Invoke the staticMemberVariable in Outter.class: 2
			I'm in staticInnerMethod
*/