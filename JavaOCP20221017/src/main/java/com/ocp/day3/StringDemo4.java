package com.ocp.day3;
public class StringDemo4 {
	public static void main(String[] args) {
		String language = "Javascrip";
		System.out.println("String = " + addUtil(language));	 
	}
	
	public static String addUtil(String string) {
		string += " to be node.js";
		return string;
	}
}

/*
	Console:
		String = Javascrip to be node.js
*/