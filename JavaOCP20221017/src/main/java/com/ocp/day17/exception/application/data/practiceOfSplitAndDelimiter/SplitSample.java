package com.ocp.day17.exception.application.data.practiceOfSplitAndDelimiter;
import java.util.Scanner;

public class SplitSample {
    public static void main(String[] args) {
        // Create Scanner to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in: "); // Example input: How are you
        
        // Check if there is input
        if (scanner.hasNextLine()) {			
            // Read the entire input line
            String inputLine = scanner.nextLine();
            
            // Display the input line
            System.out.println("Input: " + inputLine);
            
            // Split the input line by spaces
            String[] words = inputLine.split("\\u0020"); // Regular expression for a space
            
            // Print each word from the split array
            for (int i = 0; i < words.length; i++) {
                System.out.println("Word " + (i + 1) + ": " + words[i]);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}

/*
 Console:	
			Please type in: How areyou @
			Input: How areyou @
			Word 1: How
			Word 2: areyou
			Word 3: @

*/