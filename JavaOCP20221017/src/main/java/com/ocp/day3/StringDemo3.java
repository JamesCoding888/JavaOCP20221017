package com.ocp.day3;
public class StringDemo3 {

	public static void main(String[] args) {
		String message =" she sell sea shell on the sea shore ";
		message = message.trim(); // remove the space from both sides
		System.out.println(message);
		System.out.printf("Length of message %d\n", message.length());
		
		// Substring application
		System.out.printf("Substring(9, 12): %s\n", message.substring(9, 12)); // begin 9, end 12 but NOT include 12
		String name = "james";
		System.out.print(name.substring(0, 1));
		System.out.print(name.substring(1, 2));
		System.out.print(name.substring(2, 3));
		System.out.print(name.substring(3, 4));
		System.out.print(name.substring(4, 5) + "\n");
		// java.lang.StringIndexOutOfBoundException: begin 5, end 6, length 5
		System.out.print(name.substring(5, 6)); 
	}
}

/*
	Console:
		she sell sea shell on the sea shore
		Length of message 35
		Substring(9, 12): sea
		james
		Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 5, end 6, length 5
			at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3751)
			at java.base/java.lang.String.substring(String.java:1907)
			at com.ocp.day3.StringDemo3.main(StringDemo3.java:19)

*/