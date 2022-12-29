package com.ocp.day16.map;

/*
 	Introduction of Hashtable class:
	1) The Hashtable class implements a hash table
 	2) A hash table maps key(s) to value(s)
 	3) Any object(s), except for null, could be used as a key or as a value 
 	4) To successfully create and retrieve object(s) from a hashtable, 
 	   the objects used as keys MUST implement the hashCode method and the equals method.
 	   That is, developer shall override the equals and hashcode's method !!! 	
 	5) HashTable is almost same as HashMap, but HashTable is Synchronized.   
*/

import java.util.Enumeration;
import java.util.Hashtable;
public class EnumerationDemo {
	public static void main(String[] args) {
		// 起初先建立 200 個空間, 用到 80% 就會自動增長
		Hashtable<String, Integer> tables = new Hashtable<>(200, 0.8f);
		tables.put("A", 100);
		tables.put("C", 90);
		tables.put("B", 80);
		tables.put("B", 40);
		// Exception in thread "main" java.lang.NullPointerException: 
		// Cannot invoke "Object.hashCode()" because "key" is null
		tables.put(null, 30);
		// Exception in thread "main" java.lang.NullPointerException
		tables.put("D", null);
		System.out.println(tables);

		Enumeration<Integer> values = tables.elements();
		while (values.hasMoreElements()) {
			Integer value = values.nextElement();
			System.out.println(value);
		}
	}
}
