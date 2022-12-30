package com.ocp.day16.map;

/*  
 	Introduction of HashMap:
  	1) HashMap<K, V> class, at package: "java.util", is a subclass of Map interface since Java 1.2.  
  	2) Hash table is based implementation of the Map interface
  	3) HashMap stores the data based on Key and Value. 
  	4) Permit null values and the null keys 
  	5) If trying to insert the duplicate key, HashMap will replace the element of the corresponding key.
  	6) HashMap class is almost same as Hashtable class, except for unsynchronized and permitted nulls.
  	7) HashMap is Unsynchronized but HashTable Synchronized
  	8) HashMap permits elements of Key and Value to be "null", but HashTable is Unallowable
  	9) HashMap class makes NO guarantees as to the order of the map; especially, 
  	   HashMap does NOT guarantee that the order will remain constant over time.
  	    	    
  	Refer to the link as follows:
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
		int initialCapacity = 16;
		float DEFAUL_LOAD_FACTOR = 0.75f;
		new HashMap(initialCapacity, DEFAUL_LOAD_FACTOR);
		
		
		/*
		 	 // Please read the document of Oracle as follows
		     
		     // Constructs an empty {@code HashMap} with the default initial capacity (16) and the default load factor (0.75).
		     // int initialCapacity = 16;
		     // float DEFAUL_LOAD_FACTOR = 0.75f;
			   
			    public HashMap() {
			        this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
			    }
		*/
		
	    
		// default Initial Capacity: 16 
		// default Load Factor: 0.75
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