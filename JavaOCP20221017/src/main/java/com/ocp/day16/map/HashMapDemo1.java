package com.ocp.day16.map;

/*  
 	Introduction of HashMap:
	  	1) HashMap<K, V> class, at package: "java.util", is a subclass of Map interface.  
	  	2) Hash table is based implementation of the Map interface
	  	3) HashMap stores the data based on Key and Value
	  	4) Permit null values and the null keys 
	  	5) If trying to insert the duplicate key, HashMap will replace the element of the corresponding key.
	  	6) HashMap class is almost same as Hashtable class, except for unsynchronized and permitted nulls.
	  	7) HashMap is "Unsynchronized" but HashTable "Synchronized"
	  	8) HashMap permits elements of Key and Value to be "null", but HashTable is NOT allowable
	  	9) HashMap class makes NO guarantee as to the order of the map; especially, 
	  	   HashMap does NOT guarantee that the order will remain constant over time  	    	   
	   10) This implementation of Map, provides constant-time performance for the basic operations (get and put), 
	       assuming the hash function disperses the elements properly among the buckets. 
	
		   Please see the following demo code of initiated instance of hashMap and basic operations of "get" and "put".
	
			******************************************************
			*	Map<Object, Object> hashMap = new HashMap<>();   *
			*	hashMap.put(1 , "A123456789");					 *
			*	hashMap.put(2 , "H123546789");					 *
			*	hashMap.put(3 , "B123546879");					 *
			*	System.out.println(hashMap);					 *	
			*	System.out.println(hashMap.get(1));			     *
			*	System.out.println(hashMap.get(2));				 *
			*	System.out.println(hashMap.get(3));				 *
			******************************************************
			*	Console: 										 *
			*		{1=A123456789, 2=H123546789, 3=B123546879}   *
			*		A123456789									 *
			*		H123546789									 *
			*		B123546879									 *
		 	******************************************************
	   
	   11) Available since java 1.2
    
    
    Load Factor & Initial Capacity:	
	    1) Iteration over collection views requires time proportional to 
		   the "capacity" of the HashMap instance (the number of buckets) 
	       plus its size (the number of key-value mappings).
	   
	    2) It's very IMPORTANT NOT to set the "initial capacity" too high or the "load factor" too low if iteration PERFORMANCE is IMPORTANT.
		   An instance of HashMap has two parameters that affect its performance: 
	       
	       (1) Initial Capacity:
	           The capacity is the number of buckets in the hash table, and the initial capacity is simply the capacity at the time the hash table is created.
	 	  
	 	   (2) Load Factor:
	   		   The load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased. 
	   		   When the number of entries in the hash table EXCEEDS the product of the load factor and the current capacity, 
	   		   the hash table is "rehashed" (that is, internal data structures are rebuilt) so that the hash table has approximately twice the number of buckets.

		
		3) As a general rule speaking:
		   
		   (1) The default load factor (.75) offers a Good TradeOff between Time and Space Costs. 
		   (2) Higher values decrease the space overhead but increase the lookup cost (reflected in most of the operations of the HashMap class, including get and put). 
		       The expected number of entries in the map and its load factor should be taken into account when setting its initial capacity, so as to minimize the number of rehash operations. 
		   (3) If the initial capacity is greater than the maximum number of entries divided by the load factor, no rehash operations will ever occur.
			
		   (4) If many mappings are to be stored in a HashMap instance, creating it with a sufficiently large capacity will allow the mappings to be stored more efficiently 
		       than letting it perform automatic rehashing as needed to grow the table. 
		       
		   (5) Note that using many keys with the same hashCode() is a sure way to slow down performance of any hash table. To improve impact, when keys are Comparable, 
		       this class may use comparison order among keys to help break ties.
	    
  	    	    
  	Refer to the link as follows:
  	https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html  	  	
 	https://www.baeldung.com/java-hashmap-load-factor
 	
		 
		 
*/

import java.util.HashMap; 
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
public class HashMapDemo1 {
	public static void main(String[] args) {
		
		 
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
		Map<Object, Object> hashMap = new HashMap<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("James");
		// linkedHashSet permits null value(s)
		linkedHashSet.add(null);		
		linkedHashSet.add("Marry");
	 	// Repeated element(s), NOT allowable
		linkedHashSet.add("Marry");
		linkedHashSet.add("David");	
		hashMap.put(1, linkedHashSet);
		// hashMap permits null keys and the null values
		hashMap.put(null, null);
		// If trying to insert the duplicate key, 
		// HashMap will replace the element of the corresponding key.
		hashMap.put(null, 5);
		hashMap.put(2, null);
		hashMap.put(3, "Tim");
		System.out.println(hashMap);
		System.out.println("hashMap.keySets: " + hashMap.keySet());
		System.out.println("hashMap.values: " + hashMap.values());
		System.out.println("hashMap.get(3): " + hashMap.get(3));
		System.out.println("hashMap.remove(3): " + hashMap.remove(3));
		System.out.println(hashMap);
		System.out.println("hashMap.get(4): " + hashMap.get(4));
	}
}

/*
 
		Following the table page of sample code: 	 
		 *******************************************************************
		 * 			  id    	                      name				   *
		 * row_1    null                              null                 *
		 * row_2       1         James, null, Marry, David				   *	
		 * row_3       2         					  null				   *
		 * row_4       3         			           Tim				   *	 
		 *******************************************************************
		 * 			  id    	                      name				   *
		 * row_1    null                                 5                 *
		 * row_2       1         James, null, Marry, David				   *	
		 * row_3       2         					  null				   *
		 * row_4       3         			           Tim				   *	 
		 *******************************************************************
		 
		 Console: 
		 
			{null=5, 1=[James, null, Marry, David], 2=null, 3=Tim}
			hashMap.keySets: [null, 1, 2, 3]
			hashMap.values: [5, [James, null, Marry, David], null, Tim]
			hashMap.get(3): Tim
			hashMap.remove(3): Tim
			{null=5, 1=[James, null, Marry, David], 2=null}
			hashMap.get(4): null
			
*/