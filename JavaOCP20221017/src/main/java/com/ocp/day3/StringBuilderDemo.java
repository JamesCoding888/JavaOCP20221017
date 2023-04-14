package com.ocp.day3;
/*
 		This program is giving an introduction of StringBuffer and StringBuilder.
*/
public class StringBuilderDemo {
	public static void main(String[] args) {
		// StringBuffer / StringBuilder 可變字串
		// String 不可變字串
		StringBuilder stringBuilder = new StringBuilder("Oracle");
		System.out.println(stringBuilder);
		stringBuilder.append(" Java 11");
		System.out.print(stringBuilder);
		StringBuffer stringBuffer = new StringBuffer(" v.s. ");
		stringBuffer.append("Java 8");
		System.out.print(stringBuffer);
	}
}
/*
	Console:
		Oracle
		Oracle Java 11 v.s. Java 8
*/