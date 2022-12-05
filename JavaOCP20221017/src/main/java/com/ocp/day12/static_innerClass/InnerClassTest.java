package com.ocp.day12.static_innerClass;

public class InnerClassTest {

	public static void main(String[] args) {
		
		System.out.println("Invoke the globalVariable in Outter.class: " + new Outter().globalVariable);
		
		System.out.println("Invoke the staticMemberVariable in Outter.class: " + Outter.staticMemberVariable);
			
		Outter.Inner.staticInnerMethod();
		
	}
}
