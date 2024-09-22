package com.ocp.day17.exception.application.data.practiceOfSplitAndDelimiter;

import java.util.Scanner;
public class DelimiterSample {
	public static void main(String[] args) {		
		// Initialize two Scanner objects with different input strings
        Scanner scan1 = new Scanner("Dream/to/Dream");
        Scanner scan2 = new Scanner("Dream.to.Dr2eam");
        // Oracle document - https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#bounds        
        // Set delimiter for scan1: beginning of the input (using "\\A")
        // Regular Expression Explanation:
        // - \A : Matches the beginning of the input
        scan1.useDelimiter("\\A");
        
        // Set delimiter for scan2: matches any digit (using "\\d")
        // Regular Expression Explanation:
        // - \d : Matches any digit [0-9]
        scan2.useDelimiter("\\d");
        
        // Print tokens for scan1
        System.out.println("Tokens from scan1 (using delimiter '\\A'):");
        while (scan1.hasNext()) {
            // Prints the entire string because \A matches only at the start of the string
            System.out.println(scan1.next());
        }
        
        // Print tokens for scan2
        System.out.println("\nTokens from scan2 (using delimiter '\\d'):");
        while (scan2.hasNext()) {
            // Prints tokens split by digits
            System.out.println(scan2.next());
        }
        
        // Close the scanners to free resources
        scan1.close();
        scan2.close();
	}
}

/*
	 Console:
	 	 	Tokens from scan1 (using delimiter '\A'):
			Dream/to/Dream
			
			Tokens from scan2 (using delimiter '\d'):
			Dream.to.Dr
			eam



*/