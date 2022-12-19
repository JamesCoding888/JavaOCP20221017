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
	   This is BEST Done at Creation Time, to Prevent Accidental Unsynchronized access to the set
	   
	   		Set s = Collections.synchronizedSet(new HashSet(...));
	   
	   The iterators returned by this class's iterator method are fail-fast: 
	   if the set is modified at any time after the iterator is created, in any way except through the iterator's own remove method, the Iterator throws a ConcurrentModificationException. 
	   Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at an undetermined time in the future.

	   Note that the fail-fast behavior of an iterator cannot be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent modification. 
	   Fail-fast iterators throw ConcurrentModificationException on a best-effort basis. Therefore, it would be wrong to write a program that depended on this exception for its correctness: 
	   the fail-fast behavior of iterators should be used ONLY to detect bugs.


	Overview of LinkedHashSet:	
	   
	1. Hash table and linked list implementation of the Set interface, with predictable iteration order
	   LinkedHashSet implementation differs from HashSet in that it maintains a doubly-linked list running through all of its entries
	2. The doubly-linked list is on the implementation side, not necessarily exposed for you to get and use. 
	   The doubly-linked list CAN KEEP track of the order your items are inserted into the set (and also for order of accessing elements in access-order LinkedHashMaps). 
	   A regular HashSet has NO need for a doubly-linked list since it makes NO guarantee about the order of its contents.
	3. This linked list defines the iteration ordering, which is the order in which elements were inserted into the set (insertion-order) 
	4. The element(s) of LinkedHashSet is iteration guaranteed
	5. This class permits the null element
	6. Repeated element(s) NOT allowable
	7. LinkedHashSet provides constant-time performance for the basic operations (add, contains and remove), assuming the hash function disperses elements properly among the buckets. 
	   Performance is likely to be just slightly below that of HashSet (super-class of LinkedHashSet), due to the added Expense of Maintaining the linked list, with one exception: Iteration over a LinkedHashSet requires time proportional to the SIZE of the set, regardless of LinkedHashSet's Capacity. 
	   Iteration over a HashSet is likely to be MORE Expensive, requiring time proportional to its Capacity.
	
	8. A linked hash set has two parameters that affect its performance: 
	   (1) Initial Capacity and (2) Load Factor - They are defined Precisely AS for HashSet. 
	   Notice here, that the Penalty of LinkedHashSet for choosing an excessively high value for initial capacity is Less Severe for this class of LinkedHashSet than for HashSet, as iteration times for this class (i.e., LinkedHashSet) are Unaffected by Capacity.
	
	9. Note that this implementation is NOT synchronized. If Multiple-threads access a linked hash set concurrently, and at least ONE of the threads modifies the set, it MUST be Synchronized Externally. 	
	   This is Typically accomplished by Synchronizing on some object that naturally Encapsulates the set. 
	   If NO such object EXISTS, the set should be "wrapped" using the "Collections.synchronizedSet" method.
	   This is BEST Done at Creation Time, to Prevent Accidental Unsynchronized access to the set
	   
	   		Set s = Collections.synchronizedSet(new HashSet(...));
	 
	   The iterators returned by this class's iterator method are fail-fast: 
	   if the set is modified at any time after the iterator is created, in any way except through the iterator's own remove method, the Iterator throws a ConcurrentModificationException. 
	   Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at an undetermined time in the future.

	   Note that the fail-fast behavior of an iterator cannot be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent modification. 
	   Fail-fast iterators throw ConcurrentModificationException on a best-effort basis. Therefore, it would be wrong to write a program that depended on this exception for its correctness: 
	   the fail-fast behavior of iterators should be used ONLY to detect bugs.
	
	
	
	
	Overview of LinkedList:	   
	1. Doubly-linked list implementation of the List and Deque interfaces 
	2. LinkedList implements all Optional list operations 
	3. LinkedList permits all elements (including null)
	4. All of the operations perform as could be expected for a doubly-linked list. 
	5. Operations that INDEX into the list will TRAVERSE the list from the BEGINNING or the END, whichever is Closer to the Specified INDEX.
	6. When we have already read the element, we cannot read the element repeatedly
	7. Note that this implementation is NOT Synchronized. If Multiple-threads access a linked list concurrently, and at least ONE of the threads modifies the list structurally, it MUST be Synchronized Externally. 
	   (A structural modification is any operation that adds or deletes one or more elements; merely setting the value of an element is not a structural modification.) 
	   This is typically accomplished by Synchronizing on some object that naturally encapsulates the list. 
	   If NO such object exists, the list should be "wrapped" using the Collections.synchronizedList method. 
	   This is Best Done at Creation Time, to Prevent Accidental Unsynchronized access to the list:
	  	
	   		List list = Collections.synchronizedList(new LinkedList(...));

	   The iterators returned by this class's iterator and listIterator methods are fail-fast: 
	   if the list is structurally modified at any time after the iterator is created, in any way except through the Iterator's own remove or add methods, the iterator will throw a ConcurrentModificationException. 
	   Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at an undetermined time in the future.

	   Note that the fail-fast behavior of an iterator CANNOT be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of Unsynchronized Concurrent Modification. 
	   Fail-fast iterators throw ConcurrentModificationException on a best-effort basis. 
	   Therefore, it would be wrong to write a program that depended on this exception for its correctness: 
	   the fail-fast behavior of iterators should be used ONLY to detect bugs.
	
	8. There are NO Initial Capacity and Load Factor 



 	
 	Refer to the overview of Oracle as follows link: 
 	https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
 	https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html
 	https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
 	
 	Refer to the stackOverFlow with regards to the doubly-linked list of LinkedHashSet:
 	https://stackoverflow.com/questions/4881868/bug-in-linkedhashset-javadoc
 	
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
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
				
		/*	
		   // The element(s) of LinkedHashSet is iteration guaranteed
		   // Repeated element(s) NOT allowable
		   // LinkedHashSet 中的元素，保證有順序性
		   // 元素不允許重複
           // Constructs a new, empty linked hash set with the default initial
           // capacity (16) and load factor (0.75).
           public LinkedHashSet() {
           		super(16, .75f, true);
           }	
		*/
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
			/*
			 	// The doubly-linked list is on the implementation side, not necessarily exposed for you to get and use. 
	   			// The doubly-linked list CAN KEEP track of the order your items are inserted into the set (and also for order of accessing elements in access-order LinkedHashMaps). 	   			
	   			// 請留意 javadoc 之 LinkedHashSet，不支援 Backward Direct Iteration 
	   			// 所謂的 doubly-linked list 係為了確保 LinkedHashSet 中的元素，具有順序性
	   			if(iteratorOfloopLinkedHashSet.hasPrevious()) {
					int index = iteratorOfloopLinkedHashSet.previousIndex();
					String name = (String) iteratorOfloopLinkedHashSet.previous(); 
				}
			*/
			
			
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
