package com.ocp.day14.hashSet;

import java.util.ArrayList;

/*
 	Overview of HashSet:
 	1. The class of HashSet implements the Set interface, backed by a hash table (actually a HashMap instance). 
 	2. It makes NO guarantees as to the iteration order of the set
 	3. It does not guarantee that the order will remain constant over time. 
 	4. This class permits the null element.
 	5. Repeated element(s), NOT allowable
 	
 	Refer to the overview of Oracle as follows link: 
 	https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
 	
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
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
	}
}
