package com.ocp.day15.treeset;

import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo03 {
	public static void main(String[] args) {
		// Creating an object of TreeSet
		TreeSet<String> treeSet = new TreeSet<String>();
		// add element(s)		
		treeSet.add("Tesla"); // Te
		treeSet.add("James"); // J
		treeSet.add("David"); // D
		treeSet.add("Tasle"); // Ta
		treeSet.add("Tim");   // Ti

		// Traversing elements of TreeSet
		Iterator<String> iteratorTreeSet = treeSet.iterator();			
		while (iteratorTreeSet.hasNext()) {
			// D -> J -> T
			// Ta -> Te -> Ti
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