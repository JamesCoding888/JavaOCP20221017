package com.ocp.day15.stack;

import java.util.Scanner;
import java.util.Stack;
public class StackDemo02 {
	public static void main(String[] args) {
		// Scanner.next()
		Scanner scanner4Char = new Scanner(System.in);		
		System.out.print("Please type characters: ");
		String text = scanner4Char.next();		
		char[] chars = text.toCharArray();
		Stack<Character> stackChar = new Stack<>();		
		for (Character c : chars) {
			stackChar.push(c);
		}
		System.out.println(stackChar);		
		while (!stackChar.isEmpty()) {
			System.out.print(stackChar.pop());
		}		
		
		System.out.println();

		// Scanner.nextLine()
		Scanner scanner4CharLine = new Scanner(System.in);
		System.out.print("Please type characters: ");
		String textLine = scanner4CharLine.nextLine();
		char[] charsLine = textLine.toCharArray();
		Stack<Character> stackCharLine = new Stack<>();	

		// stackCharLine
		for (Character c : charsLine) {
			stackCharLine.push(c);
		}		
		System.out.println(stackCharLine);
		while (!stackCharLine.isEmpty()) {
			System.out.print(stackCharLine.pop());
		}		
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