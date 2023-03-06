package com.ocp.day15.treeset;

import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo03 {
	public static void main(String[] args) {
		// Creating an object of TreeSet
		TreeSet<String> treeSet = new TreeSet<String>();
		// add element(s)		
		treeSet.add("Tesla"); 
		treeSet.add("James"); 
		treeSet.add("David"); 
		treeSet.add("Tasle"); 
		treeSet.add("Tim");   

		// Traversing elements of TreeSet
		Iterator<String> iteratorTreeSet = treeSet.iterator();			
		while (iteratorTreeSet.hasNext()) {
			// 'D'avid -> 'J'ames -> T'a'sle -> T'e'sla -> T'i'm
			System.out.println(iteratorTreeSet.next());
		}
	}
}

/*
	Console:
		David
		James
		Tasle
		Tesla
		Tim

*/