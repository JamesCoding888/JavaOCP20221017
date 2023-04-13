package com.ocp.day6.ScannerPractice;
/*	
 	This Java program reads input from the user using a Scanner object and then collects the input into different lists 
 	
 	based on the type of input. 
 	
 	The program then adds the lists to a larger list called "list4TimingController" and prints the contents of that list.
 
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerFilter {
	// Create an empty ArrayList called "list4TimingController" to store the collected input
	public static List<Object> list4TimingController = new ArrayList<>();
	
	public static void main(String[] args) {
		// Create a new instance of the Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("(1) If exit program, please type \"exit\". Otherwise, (2) Type in the following sample string as \"ScannerSplit 888.8 GotYou 100 ~!@#$%^&*()_+}{|\":?>< \":");
		// Collect the string
		List<String> list4CollectingString = new ArrayList<>();		
		// Collect the number in decimal
		List<Double> list4CollectingDecimal = new ArrayList<>();
		// Collect the number in Integer
		List<Integer> list4CollectingInteger = new ArrayList<>();
		/*
			 The program prompts the user to enter a string by printing a message to the console.
			 If the user enters the string "exit", the program will terminate. 
		*/
		if(scanner.hasNext("exit")) {
			System.out.println("Exit the current program by terminating the Java Virtual Machine");
			System.exit(0);
		}
		// Read input from the user using the Scanner object
		if(scanner.hasNext()) {
			// Read in the token as a String
			String scannerString01 = scanner.next();
			// Read in the token as a double
			double scannerDouble = scanner.nextDouble();
			// Read in the token as a String
			String scannerString02 = scanner.next();
			// Read in the token as an integer
			int scannerInt = scanner.nextInt();
			// Read in the token as a String
			String scannerString03 = scanner.nextLine();
			// Add the user input to different lists based on their type 
			list4CollectingString.add(scannerString01);
			list4CollectingDecimal.add(scannerDouble);
			list4CollectingString.add(scannerString02);
			list4CollectingInteger.add(scannerInt);
			list4CollectingString.add(scannerString03);
			// Add all three lists to the list4TimingController list 
			list4TimingController.add(list4CollectingString);
			list4TimingController.add(list4CollectingDecimal);			
			list4TimingController.add(list4CollectingInteger);			

		}
		
		// Print the contents of the list4TimingController list
		System.out.println("list4TimingController[0]: " + list4TimingController.get(0));
		System.out.println("list4TimingController[1]: " + list4TimingController.get(1));
		System.out.println("list4TimingController[2]: " + list4TimingController.get(2));
		// The program closes the Scanner object before terminating
		scanner.close();		
	}
}

/*
	Console 1):
				(1) If exit program, please type "exit". Otherwise, (2) Type in the following sample string as "ScannerSplit 888.8 GotYou 100 ~!@#$%^&*()_+}{|":?>< ":
				exit
				Exit the current program by terminating the Java Virtual Machine
	
	Console 2):
				(1) If exit program, please type "exit". Otherwise, (2) Type in the following sample string as "ScannerSplit 888.8 GotYou 100 ~!@#$%^&*()_+}{|":?>< ":
				ScannerSplit 888.8 GotYou 100 ~!@#$%^&*()_+}{|":?>< 
				list4TimingController[0]: [ScannerSplit, GotYou,  ~!@#$%^&*()_+}{|":?>< ]
				list4TimingController[1]: [888.8]
				list4TimingController[2]: [100]
*/