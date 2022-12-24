package com.ocp.day15.treeset;

import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo03 {
	public static void main(String[] args) {
		// Creating an object of TreeSet
		TreeSet<String> treeSet = new TreeSet<String>();
		// add element(s)
		treeSet.add("David");
		treeSet.add("James");
		treeSet.add("Tim");
		treeSet.add("Tesla");

		// Traversing elements of TreeSet
		Iterator<String> iteratorTreeSet = treeSet.iterator();

		while (iteratorTreeSet.hasNext()) {
			System.out.println(iteratorTreeSet.next());
		}
	}
}

/*
	Console:
		Tesla
		Tim
		David
		James
*/