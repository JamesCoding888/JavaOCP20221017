package com.ocp.day3;
/*
		The program defines a class StringDemo4 with a main() method and a addUtil() method.
		
		In the main() method, a String variable language is initialized with the value "Javascrip".
	 	
	 	Then, the addUtil() method is called with language as an argument. The addUtil() method concatenates the string " to be node.js" to the end of the string parameter and returns the resulting string.
		
		The main() method then prints the concatenated string using the println() method.
		
		One thing to note is that the String class in Java is immutable, which means that once a String object is created, it cannot be modified. Therefore, when string += " to be node.js"; is executed in the addUtil() method, a new String object is created with the concatenated value, and string is updated to refer to the new object. This means that the original String object referenced by language in the main() method is not modified.
		
		
		In general, it is recommended to use a StringBuilder or StringBuffer when concatenating strings in Java, as these classes are mutable and can provide better performance when performing multiple concatenations. 
*/
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