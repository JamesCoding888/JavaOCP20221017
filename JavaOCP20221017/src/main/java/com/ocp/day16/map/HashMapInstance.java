package com.ocp.day16.map;

/* Let's redirect to day14 - HashSet 
 * https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
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
public class HashMapInstance {
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