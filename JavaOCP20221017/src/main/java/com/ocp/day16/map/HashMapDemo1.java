package com.ocp.day16.map;

/*

======================================================================================================================================================================================================================  

 	Introduction of HashMap:
 	
	  	1) HashMap<K, V> class, is indeed a class in the "java.util" package and is a subclass of Map interface.  
	  
	  	2) HashMap stores data as key-value pairs.
	  	
	  	3) HashMap allows both null values and null keys.
	  	 
	  	4) When inserting a key-value pair with a duplicate key, HashMap will replace the existing value with the new one.
	  	
	  	6) HashMap is unsynchronized (not thread-safe), while Hashtable is synchronized (thread-safe).
	  	
	  	7) HashMap allows null values and keys, whereas Hashtable does not.
	  	   
	  	8) HashMap does not guarantee the order of the map. The iteration order can change over time due to various factors.
	   
	    9) HashMap provides fail-fast iteration, which means that if the map is modified while iterating over it, it will throw a ConcurrentModificationException to indicate the structural modification.   	    	   
	   
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
	   
	   11) The HashMap class was introduced in Java 1.2, which was released in 1998.
    
    
    Load Factor & Initial Capacity:	
	
	    1) Iteration over collection views requires time proportional to 
		   the "capacity" of the HashMap instance (the number of buckets) 
	       plus its size (the number of key-value mappings).
	   
	    2) It's very IMPORTANT NOT to set the "initial capacity" too high or the "load factor" too low if iteration PERFORMANCE is IMPORTANT.
		   An instance of HashMap has two variables that affect its performance: 
	       
	       (1) Initial Capacity:
	           The capacity is the number of buckets in the "hash table", and the initial capacity is simply the capacity at the time the "hash table" is created.
	 	  
	 	   (2) Load Factor:
	   		   The load factor is a Measure of how full the "hash table" is Allowed to Get before its capacity is automatically increased. 
	   		   When the number of entries in the "hash table" EXCEEDS the product of the load factor and the current capacity, 
	   		   the hash table is "rehashed" (that is, internal data structures are rebuilt) so that the "hash table" has approximately Twice the number of buckets.

		
		3) As a general rule speaking:
		   
		   (1) The default load factor (.75) offers a Good TradeOff between Time and Space Costs (Hard Disk / SSD). 
		   (2) Higher value of load factor decreases the space overhead but increase the lookup cost (reflected in most of the operations of the HashMap class, including get and put). 
		       The expected number of entries in the map and its load factor should be taken into account when setting its initial capacity, so as to minimize the number of rehash operations. 
		   (3) If the initial capacity is greater than the maximum number of entries divided by the load factor, no rehash operations will ever occur.
			
		   (4) If many mappings are to be stored in a HashMap instance, creating it with a sufficiently large capacity will allow the mappings to be stored more efficiently 
		       than letting it perform automatic rehashing as needed to grow the table. 
		       
		   (5) Note that using many keys with the same hashCode() is a sure way to Slow Down Performance of any hash table. To improve impact, when keys are Comparable, 
		       this class may use comparison order among keys to help break ties.
	    
  	    	    
  	Refer to the link as follows:
  	https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html  	  	
 	https://www.baeldung.com/java-hashmap-load-factor
 	
		 
======================================================================================================================================================================================================================		 
	
	The code demonstrates various operations with HashMap, including insertion, retrieval, removal, and printing of key sets and values. It also shows the usage of LinkedHashSet with HashMap. 
	
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
		
	    
		// Create instances of LinkedHashSet and HashMap with default initial capacity (16) and load factor (0.75)
		Map<Object, Object> hashMap = new HashMap<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		// Add elements to the LinkedHashSet
		linkedHashSet.add("James");		
		linkedHashSet.add(null);	// LinkedHashSet permits null values	
		linkedHashSet.add("Marry");	 	
		linkedHashSet.add("Marry"); // Repeated elements are not allowed
		linkedHashSet.add("David");	

		// Put the LinkedHashSet into the HashMap
		hashMap.put(1, linkedHashSet);		
		hashMap.put(null, null);    // HashMap permits null keys and values
		hashMap.put(null, 5); 
		hashMap.put(null, 5);       // a duplicate key is inserted, the element of the corresponding key is replaced
		hashMap.put(2, null);
		hashMap.put(3, "Tim");
		
		// Print the HashMap and perform various operations
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
		 * row_1    null                                 5                 *
		 * row_2       1         James, null, Marry, David				   *	
		 * row_3       2         					  null				   *
		 * row_4       3         			           Tim				   *	 
		 *******************************************************************
		 * 			  id    	                      name				   *
		 * row_1    null                                 5                 *
		 * row_2       1         James, null, Marry, David				   *	
		 * row_3       2         					  null				   *	 
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