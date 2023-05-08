package com.ocp.day15.stack;

/* 	
	   	
 	The provided code is a Java program that demonstrates the use of a stack data structure to reverse the input characters and takes input from the user using the Scanner class. 
 	
 	Regarding application of Scanner, please recap the previously lecture of day6 at package: "com.ocp.day6.ScannerPractice"
*/

import java.util.Scanner;
import java.util.Stack;
public class StackDemo02 {
	public static void main(String[] args) {
		// Created object of Scanner being used for .next()
		Scanner scanner4Char = new Scanner(System.in);		
		System.out.print("Please type characters: ");
		// Initialize the text
		String text = scanner4Char.next();
		// Convert the text to a new character array
		char[] chars = text.toCharArray();
		// Create an object of Stack to collect the each of element from chars
		Stack<Character> stackChar = new Stack<>();		
		// for-each function - push the each of elements from chars into stackChar
		for (Character c : chars) {
			stackChar.push(c);
		}
		System.out.println(stackChar);	
		// If the judgment of stackChar is NOT Empty, execute the following loop function
		while (!stackChar.isEmpty()) {
			// LIFO (last-in-first-out)
			System.out.print(stackChar.pop());
		}		
		
		System.out.println();

		// Created object of Scanner being used for .nextLine()
		Scanner scanner4CharLine = new Scanner(System.in);
		System.out.print("Please type characters: ");
		// Initialize the textLine
		String textLine = scanner4CharLine.nextLine();
		// Convert the textLine to a new character array
		char[] charsLine = textLine.toCharArray();
		// Create an object of Stack to collect the each of element from charsLine
		Stack<Character> stackCharLine = new Stack<>();	
		// for-each function - push the each of elements from charsLine into stackCharLine
		for (Character c : charsLine) {
			stackCharLine.push(c);
		}		
		System.out.println(stackCharLine);
		// If the judgment of stackCharLine is NOT Empty, execute the following loop function
		while (!stackCharLine.isEmpty()) {
			// LIFO (last-in-first-out)
			System.out.print(stackCharLine.pop());
		}		
		// Closes scanner
		scanner4Char.close();
		scanner4CharLine.close();		
	}
}

/*
 	
	Console:
			Please type characters: Java$$$ ,&&& GOGOGO
			[J, a, v, a, $, $, $]
			$$$avaJ
			Please type characters: Java$$$ ,&&& GOGOGO
			[J, a, v, a, $, $, $,  , ,, &, &, &,  , G, O, G, O, G, O]
			OGOGOG &&&, $$$avaJ
*/