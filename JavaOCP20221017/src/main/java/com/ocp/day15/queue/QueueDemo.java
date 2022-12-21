package com.ocp.day15.queue;

/*
	
	Queues typically order elements in a FIFO (first-in-first-out) manner. 
	
	
	Methods of Queue:
	
	remove()
	NoSuchElementException - if this queue is empty

*/

import java.util.ArrayList;
import java.util.Iterator;

/*
 	Introduction of Queue:
 	
 	1. public interface Queue<E> extends Collection<E>
	2. A collection designed for holding elements prior to processing. 
	3. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations. 
	3. Each of these methods exists in two forms: 
	   one throws an exception if the operation fails, 
	   the other returns a special value (either null or false, depending on the operation). 
	4. The latter form of the insert operation is designed specifically for use with capacity-restricted Queue implementations; in most implementations, insert operations cannot fail.
 	5. DON'T SUGGEST to use the method of "remove()"! If the queue is empty, then throws NoSuchElementException. E.g., Please check-out the following sample code for more detail
 	6. Since JDK 1.5
 	
 	Refer to the link of Oracle:
 	https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
*/

import java.util.LinkedList; 
import java.util.Queue;
public class QueueDemo {
	public static void main(String[] args) {
		// Created objects of Queue
		Queue<String> elementsForAdd = new LinkedList <>();
		Queue<String> elementsForOffer = new LinkedList <>();
		// add method here
		elementsForAdd.add("1");
		elementsForAdd.add("2");
		elementsForAdd.add("2"); 
		elementsForAdd.add(null);
		elementsForAdd.add(null);
		elementsForAdd.add(null);
		// Please remove the following line, throws: NoSuchElementException - because queue is empty
		elementsForAdd.add("3");  
		// offer method here
		elementsForOffer.offer("1");
		elementsForOffer.offer("2");
		elementsForOffer.offer("2"); 
		elementsForAdd.offer(null);
		elementsForAdd.offer(null);
		elementsForAdd.offer(null);
		elementsForOffer.offer("3");
		
		System.out.printf("elementsForAdd:   %s\n", elementsForAdd);
		System.out.printf("elementsForOffer: %s\n", elementsForOffer);
		// add method here
		System.out.println("=============================================");
		while(!elementsForAdd.isEmpty()) {
			String peekAtTopOfQueue = elementsForAdd.peek();
			System.out.println("Peek at the top of elements from Queue: " + peekAtTopOfQueue);
			// method of remove() and poll(), both are handling with null
			String stringOfPoll = elementsForAdd.poll();
			String stringOfRemove = elementsForAdd.remove();   // queue empty, throws NoSuchElementException
			
			// first-in-first-out (FIFO)
			System.out.println("First Out (poll): " + stringOfPoll);
			System.out.println("First Out (remove): " + stringOfRemove);			
			System.out.println("Elements: " + elementsForAdd);
		}
		// offer method here
		System.out.println("=============================================");
		while(!elementsForOffer.isEmpty()) {
			String peekAtTopOfQueue = elementsForOffer.peek();
			System.out.println("Peek at the top of elements from Queue: " + peekAtTopOfQueue);
			// method of remove() and poll(), both are handling with null
			String stringOfPoll = elementsForOffer.poll();
			String stringOfRemove = elementsForOffer.remove(); // queue empty, throws NoSuchElementException
			
			// first-in-first-out (FIFO)
			System.out.println("First Out (poll): " + stringOfPoll);
			System.out.println("First Out (remove): " + stringOfRemove);
			System.out.println("Elements: " + elementsForOffer);
		}
	}
}

/*
	Console (1):
			elementsForAdd:   [1, 2, 2, null, null, null, 3, null, null, null]
			elementsForOffer: [1, 2, 2, 3]
			=============================================
			Peek at the top of elements from Queue: 1
			First Out (poll): 1
			First Out (remove): 2
			Elements: [2, null, null, null, 3, null, null, null]
			Peek at the top of elements from Queue: 2
			First Out (poll): 2
			First Out (remove): null
			Elements: [null, null, 3, null, null, null]
			Peek at the top of elements from Queue: null
			First Out (poll): null
			First Out (remove): null
			Elements: [3, null, null, null]
			Peek at the top of elements from Queue: 3
			First Out (poll): 3
			First Out (remove): null
			Elements: [null, null]
			Peek at the top of elements from Queue: null
			First Out (poll): null
			First Out (remove): null
			Elements: []
			=============================================
			Peek at the top of elements from Queue: 1
			First Out (poll): 1
			First Out (remove): 2
			Elements: [2, 3]
			Peek at the top of elements from Queue: 2
			First Out (poll): 2
			First Out (remove): 3
			Elements: []

	Console (2):
			elementsForAdd:   [1, 2, 2, null, null, null, null, null, null]
			elementsForOffer: [1, 2, 2, 3]
			=============================================
			Peek at the top of elements from Queue: 1
			First Out (poll): 1
			First Out (remove): 2
			Elements: [2, null, null, null, null, null, null]
			Peek at the top of elements from Queue: 2
			First Out (poll): 2
			First Out (remove): null
			Elements: [null, null, null, null, null]
			Peek at the top of elements from Queue: null
			First Out (poll): null
			First Out (remove): null
			Elements: [null, null, null]
			Peek at the top of elements from Queue: null
			First Out (poll): null
			First Out (remove): null
			Elements: [null]
			Peek at the top of elements from Queue: null
			Exception in thread "main" java.util.NoSuchElementException
				at java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
				at java.base/java.util.LinkedList.remove(LinkedList.java:689)
				at com.ocp.day15.queue.QueueDemo.main(QueueDemo.java:54)

*/