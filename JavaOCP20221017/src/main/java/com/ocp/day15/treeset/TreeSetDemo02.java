package com.ocp.day15.treeset;
/*

	The given code is written in Java and demonstrates the use of LinkedHashSet and TreeSet to store and order elements. 

*/
import java.util.LinkedHashSet; 
import java.util.Set; 
import java.util.TreeSet;
public class TreeSetDemo02 {

	public static void main(String[] args) {
		Set<Object> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("88");
		linkedHashSet.add("8");
		linkedHashSet.add("78");
		linkedHashSet.add("68");
		linkedHashSet.add("28");
		linkedHashSet.add("58");
		linkedHashSet.add("38");
		linkedHashSet.add("18");
		linkedHashSet.add("48");
		linkedHashSet.add("98");
		linkedHashSet.add("108");
		System.out.println("Elements of LinkedHashSet: " + linkedHashSet);
		// Expected to query the element(s) of linkedHashSet, please use TreeSet, because of natural ordering
		// 欲查詢 linkedHashSet 中的 element(s) ，改用 TreeSet，因為 natural ordering
		linkedHashSet = new TreeSet<>(linkedHashSet);
		System.out.println("The elements are ordered using their natural ordering: " + linkedHashSet);		
	}
}

/*
 	Console:
			Elements of LinkedHashSet: [88, 8, 78, 68, 28, 58, 38, 18, 48, 98, 108]
			The elements are ordered using their natural ordering: [108, 18, 28, 38, 48, 58, 68, 78, 8, 88, 98]

*/