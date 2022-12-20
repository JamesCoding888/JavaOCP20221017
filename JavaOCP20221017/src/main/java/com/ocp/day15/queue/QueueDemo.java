package com.ocp.day15.queue;

/*
 	Introduction of Queue:
 	
 	1. public interface Queue<E> extends Collection<E>
	2. A collection designed for holding elements prior to processing. 
	3. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations. 
	3. Each of these methods exists in two forms: 
	   one throws an exception if the operation fails, 
	   the other returns a special value (either null or false, depending on the operation). 
	4. The latter form of the insert operation is designed specifically for use with capacity-restricted Queue implementations; in most implementations, insert operations cannot fail.
 	5. Since JDK 1.5
 	
 	Refer to the link of Oracle:
 	https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
*/

import java.util.LinkedList; 
import java.util.Queue;
public class QueueDemo {
	public static void main(String[] args) {
		// add method here
		Queue<String> elementsForAdd = new LinkedList <>();
		// offer method here
		Queue<String> elementsForOffer = new LinkedList <>();
		// add method here
		elementsForAdd.add("1");
		elementsForAdd.add("2");
		elementsForAdd.add("2"); 
		elementsForAdd.add(null);
		elementsForAdd.add(null);
		elementsForAdd.add(null);
		// Please remove the following line, throws: NoSuchElementException - if this queue is empty
		elementsForAdd.add("3");    			
		// offer method here
		// 不要使用 offer，因為 null 不處理
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
			String stringOfRemove = elementsForAdd.remove();
			
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
			String stringOfRemove = elementsForOffer.remove();
			
			// first-in-first-out (FIFO)
			System.out.println("First Out (poll): " + stringOfPoll);
			System.out.println("First Out (remove): " + stringOfRemove);
			System.out.println("Elements: " + elementsForOffer);
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