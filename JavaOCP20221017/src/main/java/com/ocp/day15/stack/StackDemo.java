package com.ocp.day15.stack;
/*
	Introduction of Stack:
	last-in-first-out (LIFO)
	
*/
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		names.push("1");
		names.push("2");
		names.push("3");
		System.out.println(names);
		while(!names.isEmpty()) {
			String name = names.pop();
			// last-in-first-out (LIFO) (後進，先出)
			System.out.println("Last Out: " + name);
			System.out.println("Elements: " + names);
		}
	}
}

/*
	Console:
			[1, 2, 3]
			Last Out: 3
			Elements: [1, 2]
			Last Out: 2
			Elements: [1]
			Last Out: 1
			Elements: []

*/