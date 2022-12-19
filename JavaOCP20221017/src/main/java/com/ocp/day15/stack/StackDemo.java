package com.ocp.day15.stack;
/*
	Introduction of Stack:
	
	1. public class Stack<E> extends Vector<E>	
	2. The Stack class represents a last-in-first-out (LIFO) stack of objects. 
	3. It extends class Vector with five operations that allow a vector to be treated as a stack. 
	4. The usual push and pop operations are provided, as well as a method to peek at the top item on the stack, 
	   a method to test for whether the stack is empty, and a method to search the stack for an item and discover how far it is from the top.
	
	   When a stack is first created, it contains no items.
	5. Since JDK 1.0
	
	Refer to the link of Oracle: 
	https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
*/

import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> elements = new Stack<>();
		elements.push("1");
		elements.push("2");
		elements.push("3");
		System.out.println(elements);
		while(!elements.isEmpty()) {
			String string = elements.pop();
			// last-in-first-out (LIFO) (後進，先出)
			System.out.println("Last Out: " + string);
			System.out.println("Elements: " + elements);
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