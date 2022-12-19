package com.ocp.day15.stack;

import java.util.Scanner;
import java.util.Stack;
public class StackDemo02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type characters: ");
//		String text = scanner.next();
		String textLine = scanner.nextLine();
//		char[] chars = text.toCharArray();
		char[] charsLine = textLine.toCharArray();
//		Stack<Character> stackChar = new Stack<>();
		Stack<Character> stackCharLine = new Stack<>();
		
		// stackChar
//		for (Character c : chars) {
//			stackChar.push(c);
//		}
//		System.out.println(stackChar);		
//		while (!stackChar.isEmpty()) {
//			System.out.print(stackChar.pop());
//		}	

		// stackCharLine
		for (Character c : charsLine) {
			stackCharLine.push(c);
		}		
		System.out.println(stackCharLine);
		while (!stackCharLine.isEmpty()) {
			System.out.print(stackCharLine.pop());
		}
	}
}

/*
 	
		
 	
	Console:
			Please type characters: Java
			[J, a, v, a]
			avaJ
*/