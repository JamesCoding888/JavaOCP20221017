package com.ocp.day15.list;

/*
 	Again, you may know the following statements from HashSetDemo1.java, at package "com.ocp.day14.hashSet"
 	
	Overview of LinkedList:	   
	1. Doubly-linked list implementation of the List and Deque interfaces 
	2. LinkedList implements all Optional list operations 
	3. LinkedList permits all elements (including null)
	4. All of the operations perform as could be expected for a doubly-linked list. 
	5. Operations that INDEX into the list will TRAVERSE the list from the BEGINNING or the END, whichever is Closer to the Specified INDEX.
	6. Note that this implementation is NOT Synchronized. If Multiple-threads access a linked list concurrently, and at least ONE of the threads modifies the list structurally, it MUST be Synchronized Externally. 
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
*/

import java.util.LinkedList; 
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("james");
		list.add("betty");
		list.add("david");
		list.add("Tom");
		System.out.println(list);
		
		
		ListIterator<String> listIterator = list.listIterator();
		
		// Operations that INDEX into the list will TRAVERSE the list from the BEGINNING  
		while(listIterator.hasNext()) {
			int index = listIterator.nextIndex();
			String name = (String)listIterator.next(); 
			System.out.printf("[1] Index -> %d : name -> %s\n", index, name);			
		}
		
		// NO Effect !!! 
		while(listIterator.hasNext()) {
			int index = listIterator.nextIndex();
			String name = (String)listIterator.next(); 
			System.out.printf("[2] Index -> %d : name -> %s\n", index, name);			
		}

		// Operations that INDEX into the list will TRAVERSE the list from the END 
		while(listIterator.hasPrevious()) {
			int index = listIterator.previousIndex();			
			String name = (String)listIterator.previous(); 
			System.out.printf("[3] Index -> %d : name -> %s\n", index, name);			
		}
		
		// NO Effect !!! 
		while (listIterator.hasPrevious()) {
			int index = listIterator.previousIndex();
			String name = (String) listIterator.previous(); 
			System.out.printf("[4] Index -> %d : name -> %s\n", index, name);			
		}
		
		//
		System.out.println("[1] Revised before: " + list.get(0));
		System.out.println("[2] Revised before: " + list);
		list.set(0, "tim");
		System.out.println("[3] Revised after: " + list);
		// 
		System.out.printf("[4] Revised before: %s\n", list.get(0));
		// 寫在裡面，不會先印出 list.set(0, "nicole")，而是印出先前的資料
		System.out.printf("[5] Revised after: %s\n", list.set(0, "nicole")); 
		System.out.printf("[6] Revised before: %s\n", list.get(0));
		System.out.printf("[7] Revised after: %s\n", list.set(0, "nicole"));
		list.remove(0);
		System.out.println("[8] Revised after: " + list);		
	}
}
