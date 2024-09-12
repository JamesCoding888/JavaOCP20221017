package com.ocp.day14.hashSet;

/*
======================================================================================================================================================================
 	
 	Overview of HashSet:
 	1. Implementation: The HashSet class implements the Set interface, backed by a hash table (actually an instance of HashMap).
	   Example: See HashMapInstance.java in the package com.ocp.day16.hashMap.
 	   
 	2. Iteration Order: There are no guarantees regarding the iteration order of the set, and the order may change over time.
 	
 	3. Order Stability: The order of elements is not constant over time.
 	
 	4. Null Element: This class permits the inclusion of a null element.
 	
 	5. Duplicates: Duplicate elements are not allowed.
 	
 	6. Iterator Behavior: The Iterator only allows reading elements sequentially from the beginning to the end. 
 	   Once an element is read, it cannot be read again.
 	   
 	   
	7. Performance: The class provides constant time performance for basic operations (such as add, remove, contains, and size), 
	   assuming the hash function distributes elements evenly across buckets. 
	   Iterating over the set requires time proportional to the size of the HashSet instance and the "capacity" of the backing HashMap.
       
       Important: Do not set the initial capacity too high or the load factor too low if iteration performance is important.
       
       For more details about "Load Factor" and "Initial Capacity", refer to:
       File: "Load Factor & Capacity" in the package com.ocp.day14.hashSet.
	
	8. Thread Safety: This implementation is not synchronized (i.e., not thread-safe). If multiple threads access the set concurrently and at least one modifies it, external synchronization is required.
	   Solution:
	   
	   		Set s = Collections.synchronizedSet(new HashSet(...));
	   
	   Iterators are fail-fast, throwing a ConcurrentModificationException if the set is modified after the iterator is created.
	   
	9. Fail-fast Behavior:
	   The description of fail-fast iterators throwing ConcurrentModificationException is accurate. 
	   The key point is that HashSet's iterator fails quickly if the set is structurally modified outside the iterator's own remove method after its creation.
	   
	   Improvement: It would be useful to add that this behavior is provided by the modCount field, which tracks modifications to the HashSet. 
	   When the iterator detects that the modCount has changed unexpectedly, it throws ConcurrentModificationException.
       
       Limitations of Fail-fast Iterators:
	   The note that fail-fast behavior is not guaranteed is correctly stated. Since concurrency issues in a multithreaded environment are hard to predict, relying on the ConcurrentModificationException for correctness is discouraged.
       Improvement: Emphasize that synchronization is still required even though the fail-fast mechanism exists because the exception is not a substitute for proper thread safety mechanisms.

	9. Available since java 1.2

======================================================================================================================================================================

	Overview of LinkedHashSet:	
	   
	1. Implementation: LinkedHashSet is a hash table and linked list implementation of the Set interface, with predictable iteration order. It differs from HashSet by maintaining a doubly-linked list of all entries.
	2. Order Tracking: The doubly-linked list keeps track of insertion order (or access order in access-order LinkedHashMap). This differs from HashSet, which makes no order guarantees.
	3. Iteration Order: The iteration order is defined by the order in which elements were inserted (insertion-order). 
	4. Guaranteed Iteration: The elements of a LinkedHashSet have a guaranteed iteration order.
	5. Null Element: This class permits the inclusion of a null element.
	6. Duplicates: Duplicate elements are not allowed.
	7. Performance: Similar to HashSet, it provides constant-time performance for basic operations. 
	   However, it incurs a slight performance overhead due to maintaining the linked list. 
	   Iteration time is proportional to the size of the set, unlike HashSet, where iteration time is proportional to the capacity of the set.
	
	8. Parameters: The performance of LinkedHashSet is affected by two parameters:
	   (1) Initial Capacity
	   (2) Load Factor
	   These are defined similarly to HashSet, but the impact of a high initial capacity is less severe since iteration time is unaffected by capacity.
	
	9. Thread Safety: Like HashSet, it is not synchronized. External synchronization is required if accessed by multiple threads concurrently.
	   Solution:
	   	   		
	   		Set s = Collections.synchronizedSet(new LinkedHashSet(...));
	 
   10. Fail-fast Behavior:
	   Similar to HashSet, LinkedHashSet uses a fail-fast iterator, which throws a ConcurrentModificationException if the set is structurally modified outside the iterator's own remove method after its creation.
	  
	   Improvement: The modCount field in LinkedHashSet (inherited from HashSet) tracks structural modifications. If an unexpected modification is detected while iterating, it triggers a ConcurrentModificationException, ensuring that inconsistencies due to concurrent modifications are avoided.
	   
	   Limitations of Fail-fast Iterators:
	   While fail-fast behavior is reliable in single-threaded environments, it is not guaranteed in multithreaded environments. The occurrence of ConcurrentModificationException is not a certainty but rather a best-effort mechanism.
	   
	   Improvement: As with HashSet, it is important to highlight that LinkedHashSet still requires proper synchronization for thread safety. The fail-fast mechanism should not be relied upon as a substitute for synchronization in multithreaded scenarios.
	   
	11. Available since java 1.4
	
======================================================================================================================================================================
	
	Overview of LinkedList:	   
	1. Implementation: LinkedList is a doubly-linked list implementation of the List and Deque interfaces. 
	2. Optional Operations: It implements all optional list operations. 
	3. Permitted Elements: All types of elements, including null, are allowed.
	4. Performance: Operations are consistent with what is expected of a doubly-linked list. 
	5. Indexing: Index-based operations will traverse the list from the beginning or the end, whichever is closer to the specified index.
	6. Iterator Behavior: Once an element is read, it cannot be read again.
	7. Thread Safety: Like HashSet and LinkedHashSet, LinkedList is not synchronized. External synchronization is required if the list is accessed concurrently by multiple threads, especially if structural modifications occur.
	   Solution:
	  	
	   		List list = Collections.synchronizedList(new LinkedList(...));
       
       Iterators are fail-fast, throwing a ConcurrentModificationException if the list is modified structurally after iterator creation.
       
	8. Fail-fast Behavior:
	   LinkedList also provides a fail-fast iterator, throwing a ConcurrentModificationException if the list is structurally modified outside of the iterator's own remove method.
	   
	   Improvement: The fail-fast behavior is implemented by the modCount field (inherited from AbstractList), which tracks changes to the list. If the iterator detects that the modCount has been altered unexpectedly, a ConcurrentModificationException is thrown, ensuring the iterator operates on a consistent state.
	   
	   Limitations of Fail-fast Iterators:
	   Just like with HashSet and LinkedHashSet, the fail-fast behavior in LinkedList is not guaranteed in a multithreaded environment. The exception may or may not occur depending on the timing of concurrent modifications.
	   
	   Improvement: Emphasize that proper synchronization mechanisms (such as using synchronized blocks or CopyOnWriteArrayList) are still needed for thread safety when working with LinkedList in concurrent scenarios, as the fail-fast behavior alone is not enough to ensure correctness. 
	
	9. Capacity and Load Factor: LinkedList has no initial capacity or load factor constraints.
	10. Available since java 1.2


 	
 	Refer to the overview of Oracle as follows link: 
 	https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
 	https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html
 	https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
 	
 	Refer to the stackOverFlow with regards to the doubly-linked list of LinkedHashSet:
 	-	https://stackoverflow.com/questions/4881868/bug-in-linkedhashset-javadoc
 	-	reference folder (p.s., For the sake of avoiding missing content on web-site, 
 		we duplicated the whole content from stackoverflow and paste to package of hashSet)  
 
======================================================================================================================================================================
 	
 	The given code is this example of using HashSet, LinkedHashSet, and LinkedList in Java.
 	Overall, the code demonstrates the usage of HashSet, LinkedHashSet, and LinkedList, as well as the iteration and stream operations on these collections.

======================================================================================================================================================================
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
		Set<Object> hashSet = new HashSet<>();
		hashSet.add("Chinese");
		hashSet.add(100);        // type of 100, is Integer, NOT int, due to Auto-boxing
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
		Set<Object> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Chinese");
		linkedHashSet.add(100);   // type of 100, is Integer, NOT int
		linkedHashSet.add("English");
		linkedHashSet.add(80);
		linkedHashSet.add("English");
		linkedHashSet.add(80);
		
		System.out.println(linkedHashSet);		
		
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add("Chinese");
		linkedList.add(100);   // type of 100, is Integer, NOT int
		linkedList.add("English");
		linkedList.add(80);
		linkedList.add("English");
		linkedList.add(80);
		
		System.out.println(linkedList);		
		
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
	   			// The doubly-linked list CAN KEEP track of the order your items are inserted into the set (and also for order of accessing elements in access-order LinkedHashMap). 	   			
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
				[Chinese, 100, English, null, English, 80]
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
