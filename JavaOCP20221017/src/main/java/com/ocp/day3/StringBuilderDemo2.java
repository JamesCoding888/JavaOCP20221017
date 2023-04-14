package com.ocp.day3;
/*
		This program gives a lecture on how to use StringBuilder Util.
*/
public class StringBuilderDemo2 {
	public static void main(String[] args) {
		StringBuilder language = new StringBuilder("Javascript ");
		addUtil(language);
		System.out.println(language);
		
	}
	
	private static void addUtil(StringBuilder stringBuilder) {
		stringBuilder.append("to be node.js");
	}
}

/*
	Console:
		Javascript to be node.js
*/