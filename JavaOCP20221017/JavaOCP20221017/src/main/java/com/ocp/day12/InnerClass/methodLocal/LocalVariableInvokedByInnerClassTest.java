package com.ocp.day12.InnerClass.methodLocal;

public class LocalVariableInvokedByInnerClassTest {
	
	public static void main(String[] args) {
		
		LocalVariableInvokedByInnerClass localVariableInvokedByInnerClass = new LocalVariableInvokedByInnerClass("A123456789");

		String responseOfVariables = localVariableInvokedByInnerClass.print();
		
		System.out.print(responseOfVariables);
		
	}	
}

/*
	Console:
			 A123456789, Java SE, 1Z0-819
			 
*/