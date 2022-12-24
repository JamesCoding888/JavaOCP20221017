package com.ocp.day15.treeset;
/*
	TreeSet is one of the most important implementations of the SortedSet interface 
	in Java that uses a Tree for storage. 
	
	The ordering of the elements is maintained by a set using their natural ordering 
	whether or not an explicit comparator is provided. 
	
	This must be consistent with equals if it is to correctly implement the Set interface.
	
	Reference of following link -> https://www.geeksforgeeks.org/treeset-in-java-with-examples/
	
	 
	 
	 ====
	 
	 1. This class NOT permits the null element. If element(s) 
	 
	 Exception in thread "main" java.lang.NullPointerException
*/

import java.util.Set;
import java.util.TreeSet;
public class TreeSetDemo1 {

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