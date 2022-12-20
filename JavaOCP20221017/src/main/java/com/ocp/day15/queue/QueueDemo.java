package com.ocp.day15.queue;

import java.util.LinkedList; 
import java.util.Queue;
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> elements = new LinkedList <>();
		elements.offer("1");
		elements.offer("2");
		elements.offer("3");	
		System.out.println(elements);
		while(!elements.isEmpty()) {
			String peekAtTopOfQueue = elements.peek();
			System.out.println("Peek at the top of elements from Queue: " + peekAtTopOfQueue);			
			String string = elements.poll();
			// first-in-first-out (FIFO)
			System.out.println("First Out: " + string);
			System.out.println("Elements: " + elements);
		}
	}
}

/*
	Console:
			[1, 2, 3]
			Peek at the top of elements from Queue: 1
			First Out: 1
			Elements: [2, 3]
			Peek at the top of elements from Queue: 2
			First Out: 2
			Elements: [3]
			Peek at the top of elements from Queue: 3
			First Out: 3
			Elements: []

*/