package com.ocp.day15.treeset;
/*
==========================================================================================================================
	
	Introduction of TreeSet:
	
	1. TreeSet is one of the most important implementations of the SortedSet interface 
	   in Java that uses a Tree for storage. 
	
	2. The ordering of the elements is maintained by a set using their natural ordering 
	   whether or not an explicit comparator is provided. 
	
	3. TreeSet must be consistent with equals if it is to correctly implement the Set interface.
	
	4. TreeSet class NOT permits the null element; Otherwise, Exception in thread "main" java.lang.NullPointerException
	
	
	Reference of following link -> https://www.geeksforgeeks.org/treeset-in-java-with-examples/
	
==========================================================================================================================	
	
	The code you provided demonstrates the usage of a TreeSet in Java. 
	
	A TreeSet is an implementation of the Set interface that maintains its elements in sorted order.
	
==========================================================================================================================
*/

import java.util.Set;
import java.util.TreeSet;
public class TreeSetDemo01 {

	public static void main(String[] args) {
		Set<Object> treeSet = new TreeSet<>();
		treeSet.add("88");
		treeSet.add("8");		
		treeSet.add("78");
		treeSet.add("68");
		treeSet.add("28");
		treeSet.add("58");
		treeSet.add("38");
		treeSet.add("18");
		treeSet.add("48");
		treeSet.add("98");
		treeSet.add("108");
		System.out.println("The elements are ordered using their natural ordering: " + treeSet);
	}
}

/*
 	Console:
 			The elements are ordered using their natural ordering: [108, 18, 28, 38, 48, 58, 68, 78, 8, 88, 98]


*/