package com.ocp.day15.stack;
/*
	Introduction of Stack:
	
	1. public class Stack<E> extends Vector<E>	
	2. The Stack class represents a last-in-first-out (LIFO) stack of objects. 
	3. It extends class Vector with five operations - empty(), peek(), pop(), push(E item), search(Object o), that allow a vector to be treated as a stack. 
	4. The usual push and pop operations are provided, as well as a method to peek at the top item on the stack, 
	   a method to test for whether the stack is empty, and a method to search the stack for an item and discover how far it is from the top.	
	5. When a stack is first created, it contains no items.
	6. Since JDK 1.0
	
	Refer to the link of Oracle: 
	https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
*/

import java.util.Stack;
public class StackDemo01 {
	public static void main(String[] args) {
		Stack<String> elements = new Stack<>();
		elements.push("1");
		elements.push("2");
		elements.push("3");
		elements.push("3");
		System.out.println(elements);
		// The java.util.Stack.search(Object element) method in Java
		// is used to search for an element in the stack and get its distance from the top				
		System.out.println("Search for an element in the stack and get its distance from the top: " + elements.search("3"));
		System.out.println("Search for an element in the stack and get its distance from the top: " + elements.search("2"));
		System.out.println("Search for an element in the stack and get its distance from the top: " + elements.search("1"));
		System.out.println("Search for an element in the stack and get its distance from the top: " + elements.search("0"));
		
		while(!elements.isEmpty()) {			
			String peekAtTopOfStack = elements.peek();
			System.out.println("Peek at the top of elements from Stack: " + peekAtTopOfStack);
			String string = elements.pop();
			// last-in-first-out (LIFO) (後進，先出)
			System.out.println("Last Out: " + string);
			System.out.println("Elements: " + elements);
		}
	}
}

/*
	Console:
			[1, 2, 3, 3]
			Search for an element in the stack and get its distance from the top: 1
			Search for an element in the stack and get its distance from the top: 3
			Search for an element in the stack and get its distance from the top: 4
			Search for an element in the stack and get its distance from the top: -1
			Peek at the top of elements from Stack: 3
			Last Out: 3
			Elements: [1, 2, 3]
			Peek at the top of elements from Stack: 3
			Last Out: 3
			Elements: [1, 2]
			Peek at the top of elements from Stack: 2
			Last Out: 2
			Elements: [1]
			Peek at the top of elements from Stack: 1
			Last Out: 1
			Elements: []



*/