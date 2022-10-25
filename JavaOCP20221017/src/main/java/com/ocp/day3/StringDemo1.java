package com.ocp.day3;

public class StringDemo1 {

	public static void main(String[] args) {
		String string1 = new String("Java");
		String string2 = new String("Java");
		String string3 = new String("jAvA");
		
		
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		System.out.println(string1.equalsIgnoreCase(string3));
		// literal value 將地義字串內容，也就是說會將字串物件配置在 String pool 中共用 (Java 1.4 開始支援)
		String string4 = "Java";
		String string5 = "Java";
		System.out.println(string4 == string5); // stack 內容相同
		System.out.println(string4.equals(string5));

	}

}
