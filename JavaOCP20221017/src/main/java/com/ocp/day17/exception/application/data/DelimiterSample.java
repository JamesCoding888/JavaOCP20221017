package com.ocp.day17.exception.application.data;

import java.util.Scanner;
public class DelimiterSample {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner("Dream/to/Dream");
		Scanner scan2 = new Scanner("Dream.to.Dr2eam");
		// Initialize the string delimiter
		/*
		 	Regular Expression:
		 	-	\A
		 		Description: The beginning of the input
		 	-	\d	
		 		Description: A digit: [0-9]		 	
		 	-	Oracle document
		 		https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#bounds
		*/
		scan1.useDelimiter("\\A");  
		scan2.useDelimiter("\\d");
		// checks if the tokenized Strings has next token
		while (scan1.hasNext()) {
			// prints the next token
			System.out.println(scan1.next());
		}
		// checks if the tokenized Strings has next token
		while (scan2.hasNext()) {
			// prints the next token
			System.out.println(scan2.next());
		}
	}
}

/*
	 Console:
	 	 	Dream/to/Dream
			Dream.to.Dr
			eam


*/