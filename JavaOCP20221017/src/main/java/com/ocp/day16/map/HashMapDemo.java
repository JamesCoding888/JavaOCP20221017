package com.ocp.day16.map;

/*  後續整理~~~
 	Introduction of HashMap:
  	1) HashMap<K, V> is a part of Java’s collection since Java 1.2. 
  	   This class is found in java.util package. It provides the basic implementation of the Map interface of Java. 
  	2) HashMap stores the data based on Key and Value. 
  	3) You can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace the element of the corresponding key.
	3) HashMap is almost same as HashTable, but HashMap is Unsynchronized. 
	4) It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.  This class makes no guarantees as to the order of the map. To use this class and its methods, you need to import java.util.HashMap package or its superclass.
 
 
 	https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
 
 
 
 
 	Following the table page of sample code:
	 	 
		 *******************************************************************
		 * 			   id    	               name						   *
		 * row_1        1		James, Marry, David						   *
		 * row_2		2					 	Tim						   *
		 * row_3 		3					   Elon						   *
		 *******************************************************************
		 
		 
*/

import java.util.HashMap; 
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
public class HashMapDemo {
	public static void main(String[] args) {

		Map<Object, Set<Object>> hashMap1 = new HashMap<>();
		Set<Object> hashSet1 = new LinkedHashSet<>();
		
		Map<Object, Set<Object>> hashMap2 = new HashMap<>();
		Set<Object> hashSet2 = new LinkedHashSet<>();
		
		Map<Object, Set<Object>> hashMap3 = new HashMap<>();
		Set<Object> hashSet3 = new LinkedHashSet<>();
		
		hashSet1.add("James");		
		hashSet1.add("Marry");
		hashSet1.add("David");	
		hashMap1.put(1, hashSet1);
		
		hashSet2.add("Tim");					
		hashMap2.put(2, hashSet2);
		
		hashSet3.add("Elon");					
		hashMap3.put(3, hashSet3);	
		
		System.out.println(hashMap1);
		System.out.println(hashMap2);
		System.out.println(hashMap3);
	}
}

/*
		 Console: 
		 
				{1=[James, Marry, David]}
				{2=[Tim]}
				{3=[Elon]}
*/