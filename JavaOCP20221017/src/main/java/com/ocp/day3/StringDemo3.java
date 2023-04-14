package com.ocp.day3;
/*
		The code above defines a class StringDemo3 with a main() method.

		In the main() method, a String variable message is initialized with the value " she sell sea shell on the sea shore ". 
		
		The trim() method is then called on message to remove leading and trailing whitespace characters, and the resulting string is printed using println().
		
		The length() method is then called on message to get the length of the string, which is printed using printf().
		
		The substring() method is then demonstrated with two examples. 
		
		The first example uses the substring() method to extract a substring of message starting at index 9 and ending at index 12 (not inclusive of the character at index 12), 
		
		which corresponds to the substring "sea". The resulting substring is printed using printf().
		
		The second example extracts each character of the String variable name by calling substring() with appropriate start and end indexes for each character. 
		
		Finally, the code attempts to extract a substring starting at index 5 and ending at index 6 of name, which results in a java.lang.StringIndexOutOfBoundsException 
		
		since the string is only 5 characters long and there is no character at index 5.
		
		Overall, the substring() method can be useful for extracting substrings from a String, but care must be taken to ensure that the indexes are valid.
*/
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