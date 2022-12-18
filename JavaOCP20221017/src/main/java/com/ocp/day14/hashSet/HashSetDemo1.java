package com.ocp.day14.hashSet;

/*
 	Overview of HashSet:
 	
 	1. The class of HashSet implements the Set interface, backed by a hash table (actually a HashMap instance)
 	   E.g., HashMapInstance.java at package "com.ocp.day16.hashMap"
 	2. It makes NO guarantees as to the iteration order of the set
 	3. It does not guarantee that the order will remain constant over time
 	4. This class permits the null element
 	5. Repeated element(s), NOT allowable
 	6. The element of Iterator can only be read from the beginning to the end, 			 
	   and also when we have already read the element, we cannot read the element repeatedly
	7. The class of HashSet offers constant time performance for the basic operations (add, remove, contains and size), 
	   assuming the hash function disperses the elements properly among the buckets. 
	   Iterating over this set requires time proportional to the sum of the HashSet instance's size (the number of elements) 
	   plus the "capacity" of the backing HashMap instance (the number of buckets). 
	   Thus, it's VERY IMPORTANT NOT to set the Initial Capacity too High (or the load factor too low) 
	   if iteration performance is important
	   
	   What's "Load Factor" and "Initial Capacity" ? Please refer to File: "Load Factor & Capacity", at package: "com.ocp.day14.hashSet"
	
	8. Notice that this implementation is NOT synchronized (i.e., not thread-safe). If Multiple-threads access a hash set concurrently, and at least ONE of the threads modifies the set, it MUST be Synchronized Externally. 
	   This is Typically accomplished by Synchronizing on some object that naturally Encapsulates the set. 
	   If NO such object EXISTS, the set should be "wrapped" using the "Collections.synchronizedSet" method.
	   
	   		Set s = Collections.synchronizedSet(new HashSet(...));
	   
	   The iterators returned by this class's iterator method are fail-fast: 
	   if the set is modified at any time after the iterator is created, in any way except through the iterator's own remove method, the Iterator throws a ConcurrentModificationException. 
	   Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at an undetermined time in the future.

	   Note that the fail-fast behavior of an iterator cannot be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent modification. 
	   Fail-fast iterators throw ConcurrentModificationException on a best-effort basis. Therefore, it would be wrong to write a program that depended on this exception for its correctness: 
	   the fail-fast behavior of iterators should be used only to detect bugs.


	Overview of LinkedHashSet:	   
	1. Hash table and linked list implementation of the Set interface, with predictable iteration order
	   LinkedHashSet implementation differs from HashSet in that it maintains a doubly-linked list running through all of its entries
	2. This linked list defines the iteration ordering, which is the order in which elements were inserted into the set (insertion-order) 
	3. The element(s) of LinkedHashSet is iteration guaranteed
	4. This class permits the null element
	5. Repeated element(s) NOT allowable
	
	Overview of LinkedList:	   
	1. Doubly-linked list implementation of the List and Deque interfaces. Implements all optional list operations, and permits all elements (including null).
	2. All of the operations perform as could be expected for a doubly-linked list. Operations that index into the list will traverse the list from the beginning or the end, whichever is closer to the specified index.
	3. Note that this implementation is not synchronized. If multiple threads access a linked list concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally. (A structural modification is any operation that adds or deletes one or more elements; merely setting the value of an element is not a structural modification.) This is typically accomplished by synchronizing on some object that naturally encapsulates the list. If no such object exists, the list should be "wrapped" using the Collections.synchronizedList method. This is best done at creation time, to prevent accidental unsynchronized access to the list:



 	
 	Refer to the overview of Oracle as follows link: 
 	https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
 	https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html
 	
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

public class HashSetDemo1 {
	public static void main(String[] args) {		
		
		// The element(s) of HashSet is no iteration guaranteed
		// Repeated element(s) NOT allowable
		// HashSet 中的元素，不保證有順序性
		// 元素不允許重複
		Set hashSet = new HashSet();
		hashSet.add("Chinese");
		hashSet.add(100);        // type of 100, is Integer, NOT int
		hashSet.add("English");
		hashSet.add(80);		
		hashSet.add("English");
		hashSet.add(80);	
		
		System.out.println(hashSet);
		
		// The element(s) of LinkedHashSet is iteration guaranteed
		// Repeated element(s) NOT allowable
		// LinkedHashSet 中的元素，保證有順序性
		// 元素不允許重複
		Set linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("Chinese");
		linkedHashSet.add(100);   // type of 100, is Integer, NOT int
		linkedHashSet.add("English");
		linkedHashSet.add(80);
		linkedHashSet.add("English");
		linkedHashSet.add(80);
		
		System.out.println(linkedHashSet);		
		
		// Let's create a for-loop with running 10 times for collecting elements by HashSet
		Set<Object> loopHashSet = new HashSet<>();
		Set<Object> loopLinkedHashSet = new LinkedHashSet<>();
		List<Object> loopLinkedList = new LinkedList<>();
		for(int n=1 ; n<=10 ; n++) {
			int number = new Random().nextInt(10)+1;
			loopHashSet.add(number);
			loopLinkedHashSet.add(number);						
			loopLinkedList.add(number);
		}
		
		System.out.println("Repeated element(s) NOT count it: " + loopHashSet);
		System.out.println("Repeated element(s) NOT count it: " + loopLinkedHashSet);
		System.out.println("Repeated element(s) count it: " + loopLinkedList);		
		
		// Iterator 
		Iterator<Object> iteratorOfloopHashSet = loopHashSet.iterator();
		Iterator<Object> iteratorOfloopLinkedHashSet = loopLinkedHashSet.iterator();
		Iterator<Object> iteratorOflist = loopLinkedList.iterator();
		
		while(true) {
			if(iteratorOfloopHashSet.hasNext()) {
				
				Object next = iteratorOfloopHashSet.next();
				System.out.println("element from iteratorOfloopHashSet: " + next);
				
			}
			
			if (iteratorOfloopLinkedHashSet.hasNext()) {
	
				Object next = iteratorOfloopLinkedHashSet.next();
				System.out.println("element from iteratorOfloopLinkedHashSet: " + next);
	
			}
			
			if (iteratorOflist.hasNext()) {
	
				Object next = iteratorOflist.next();
				System.out.println("element from iteratorOflist: " + next);
	
			}
			
			if ((iteratorOfloopHashSet.hasNext() && iteratorOfloopLinkedHashSet.hasNext() && iteratorOflist.hasNext()) == false) {
				break;
			}
		}
		
		iteratorOfloopHashSet = loopHashSet.iterator();		
		iteratorOfloopLinkedHashSet = loopLinkedHashSet.iterator();
		iteratorOflist = loopLinkedList.iterator();		
		Integer sumOfiteratorOfloopHashSet = 0;
		Integer sumOfiteratorOfloopLinkedHashSet = 0;
		Integer sumOfiteratorOflist = 0;
		
		while (true) {
			
			if (iteratorOfloopHashSet.hasNext()) {
				Object o = iteratorOfloopHashSet.next();
				if (o instanceof Integer) {
					// add-up of all elements
					sumOfiteratorOfloopHashSet += (Integer) o;
				}

			}
			
			if (iteratorOfloopHashSet.hasNext() == false) {
				break;
			}

			if (iteratorOfloopLinkedHashSet.hasNext()) {
				Object o = iteratorOfloopLinkedHashSet.next();
				if (o instanceof Integer) {
					// add-up of all elements
					sumOfiteratorOfloopLinkedHashSet += (Integer) o;
				}

			}
			
			if (iteratorOfloopLinkedHashSet.hasNext() == false) {
				break;
			}

			if (iteratorOflist.hasNext()) {
				Object o = iteratorOflist.next();
				if (o instanceof Integer) {
					// add-up of all elements
					sumOfiteratorOflist += (Integer) o;
				}

			}
			
			if (iteratorOflist.hasNext() == false) {
				break;
			}
		}
		System.out.println("Result of add-up all elements from iteratorOfloopHashSet: " + sumOfiteratorOfloopHashSet);
		System.out.println("Result of add-up all elements from iteratorOfloopLinkedHashSet: " + sumOfiteratorOfloopLinkedHashSet);
		System.out.println("Result of add-up all elements from iteratorOflist: " + sumOfiteratorOflist);
		
		// Java 1.8 - Stream
		int sumOfloopHashSet = loopHashSet.stream()
										  .filter((Object next) -> next instanceof Integer)
										  .mapToInt(next -> Integer.valueOf(next.toString())) // Object downcasting to String, then int
				                          .sum();
		
		int sumOfloopLinkedHashSet = loopLinkedHashSet.stream()
													  .filter((Object next) -> next instanceof Integer)
													  .mapToInt(next -> Integer.valueOf(next.toString())) // Object downcasting to String, then int
									                  .sum();
					  
		int sumOfloopLinkedList = loopLinkedList.stream()
											    .filter((Object next) -> next instanceof Integer)
											    .mapToInt(next -> Integer.valueOf(next.toString())) // Object downcasting to String, then int
											    .sum();
		
		System.out.println("Result of add-up all elements from sumOfloopHashSet: " + sumOfloopHashSet);
		System.out.println("Result of add-up all elements from sumOfloopLinkedHashSet: " + sumOfloopLinkedHashSet);
		System.out.println("Result of add-up all elements from sumOflist: " + sumOfloopLinkedList);
				
	}
}

/*
 		Notice here! The following console of elements may be different because of random number. 
		Console:
				[80, English, 100, Chinese]
				[Chinese, 100, English, 80]
				Repeated element(s) NOT count it: [3, 4, 6, 8, 9]
				Repeated element(s) NOT count it: [3, 4, 6, 8, 9]
				Repeated element(s) count it: [3, 3, 4, 6, 6, 3, 8, 9, 6, 9]
				element from iteratorOfloopHashSet: 3
				element from iteratorOfloopLinkedHashSet: 3
				element from iteratorOflist: 3
				element from iteratorOfloopHashSet: 4
				element from iteratorOfloopLinkedHashSet: 4
				element from iteratorOflist: 3
				element from iteratorOfloopHashSet: 6
				element from iteratorOfloopLinkedHashSet: 6
				element from iteratorOflist: 4
				element from iteratorOfloopHashSet: 8
				element from iteratorOfloopLinkedHashSet: 8
				element from iteratorOflist: 6
				element from iteratorOfloopHashSet: 9
				element from iteratorOfloopLinkedHashSet: 9
				element from iteratorOflist: 6
				Result of add-up all elements from iteratorOfloopHashSet: 30
				Result of add-up all elements from iteratorOfloopLinkedHashSet: 21
				Result of add-up all elements from iteratorOflist: 16
				Result of add-up all elements from sumOfloopHashSet: 30
				Result of add-up all elements from sumOfloopLinkedHashSet: 30
				Result of add-up all elements from sumOflist: 57




*/
