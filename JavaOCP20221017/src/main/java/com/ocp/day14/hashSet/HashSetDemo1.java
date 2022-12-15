package com.ocp.day14.hashSet;

/*
 	Overview of HashSet:
 	1. The class of HashSet implements the Set interface, backed by a hash table (actually a HashMap instance)
 	2. It makes NO guarantees as to the iteration order of the set
 	3. It does not guarantee that the order will remain constant over time
 	4. This class permits the null element
 	5. Repeated element(s), NOT allowable
 	6. The element of Iterator can only be read from the beginning to the end, 			 
	   and also when we have already read the element, we cannot read the element repeatedly.
		   
		   
 	
 	Refer to the overview of Oracle as follows link: 
 	https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
 	
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
		Set loopHashSet = new HashSet();
		Set loopLinkedHashSet = new LinkedHashSet();
		List list = new ArrayList();
		ListIterator listIterator = new LinkedList().listIterator();
		for(int n=1 ; n<=10 ; n++) {
			int number = new Random().nextInt(10)+1;
			loopHashSet.add(number);
			loopLinkedHashSet.add(number);						
			list.add(number);
		}
		
		System.out.println("Repeated element(s) NOT count it: " + loopHashSet);
		System.out.println("Repeated element(s) NOT count it: " + loopLinkedHashSet);
		System.out.println("Repeated element(s) count it: " + list);		
		
		// Iterator 
		Iterator iteratorOfloopHashSet = loopHashSet.iterator();
		Iterator iteratorOfloopLinkedHashSet = loopLinkedHashSet.iterator();
		Iterator iteratorOflist = list.iterator();
		
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
		iteratorOflist = list.iterator();		
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
					  
		int sumOflist = loopLinkedHashSet.stream()
										 .filter((Object next) -> next instanceof Integer)
										 .mapToInt(next -> Integer.valueOf(next.toString())) // Object downcasting to String, then int
										 .sum();
		
		System.out.println("Result of add-up all elements from sumOfloopHashSet: " + sumOfloopHashSet);
		System.out.println("Result of add-up all elements from sumOfloopLinkedHashSet: " + sumOfloopLinkedHashSet);
		System.out.println("Result of add-up all elements from sumOflist: " + sumOflist);
				
	}
}

/*
 		Notice here! The following console of elements may be different because of random number. 
		Console:
				[80, English, 100, Chinese]
				[Chinese, 100, English, 80]
				Repeated element(s) NOT count it: [1, 2, 3, 4, 5, 7, 8, 10]
				Repeated element(s) NOT count it: [2, 3, 7, 5, 10, 4, 8, 1]
				Repeated element(s) count it: [2, 3, 7, 7, 5, 10, 4, 4, 8, 1]
				element from iteratorOfloopHashSet: 1
				element from iteratorOfloopLinkedHashSet: 2
				element from iteratorOflist: 2
				element from iteratorOfloopHashSet: 2
				element from iteratorOfloopLinkedHashSet: 3
				element from iteratorOflist: 3
				element from iteratorOfloopHashSet: 3
				element from iteratorOfloopLinkedHashSet: 7
				element from iteratorOflist: 7
				element from iteratorOfloopHashSet: 4
				element from iteratorOfloopLinkedHashSet: 5
				element from iteratorOflist: 7
				element from iteratorOfloopHashSet: 5
				element from iteratorOfloopLinkedHashSet: 10
				element from iteratorOflist: 5
				element from iteratorOfloopHashSet: 7
				element from iteratorOfloopLinkedHashSet: 4
				element from iteratorOflist: 10
				element from iteratorOfloopHashSet: 8
				element from iteratorOfloopLinkedHashSet: 8
				element from iteratorOflist: 4
				element from iteratorOfloopHashSet: 10
				element from iteratorOfloopLinkedHashSet: 1
				element from iteratorOflist: 4
				Result of add-up all elements from iteratorOfloopHashSet: 40
				Result of add-up all elements from iteratorOfloopLinkedHashSet: 39
				Result of add-up all elements from iteratorOflist: 38
				Result of add-up all elements from sumOfloopHashSet: 40
				Result of add-up all elements from sumOfloopLinkedHashSet: 40
				Result of add-up all elements from sumOflist: 40


*/
