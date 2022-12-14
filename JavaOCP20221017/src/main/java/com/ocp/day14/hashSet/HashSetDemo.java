package com.ocp.day14.hashSet;

/*
 	Overview of HashSet:
 	1. The class of HashSet implements the Set interface, backed by a hash table (actually a HashMap instance). 
 	2. It makes NO guarantees as to the iteration order of the set
 	3. It does not guarantee that the order will remain constant over time. 
 	4. This class permits the null element.
 	5. Repeated element, NOT allowable
 	
 	Refer to the overview of Oracle as follows link: 
 	https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
 	
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {		
		
		// The element(s) of HashSet is no iteration guaranteed
		// Repeated element NOT allowable
		// HashSet 中的元素，不保證順序性
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
		// Repeated element NOT allowable
		// LinkedHashSet 中的元素，保證順序性
		// 元素不允許重複
		Set linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("Chinese");
		linkedHashSet.add(100);   // type of 100, is Integer, NOT int
		linkedHashSet.add("English");
		linkedHashSet.add(80);
		linkedHashSet.add("English");
		linkedHashSet.add(80);
		
		System.out.println(linkedHashSet);
		
	}
}
