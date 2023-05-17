package com.ocp.day16.map;
/*
======================================================================================================================================================================================================================

	Introduction of this lesson (Please also recap HashMap at package: com.ocp.day16.map):
	
		1) The Hashtable class is the oldest implementation of a hash table data structure in Java.
		
		2) Hashtable<K, V> class, at package: "java.util", is a subclass of Map interface, 
		   which means it implements the Map interface and provides the functionality of a key-value mapping.
		
		3) Hashtable is specifically designed as a hashtable-based implementation of the Map interface. 
		
		4) Hashtable stores data in the form of key-value pairs. Each key is associated with a corresponding value.
		
		5) Hashtable does not allow null values or null keys. Attempting to store null values or null keys will result in an exception.
				 
		6) Hashtable utilizes a hash table data structure, where keys are mapped to specific indices in an underlying array using a hash function.
		
		7) When attempting to insert a key-value pair with a duplicate key, Hashtable will replace the existing value associated with that key.
		
		8) Hashtable is synchronized, meaning it is designed to be thread-safe for concurrent access. On the other hand, HashMap is not synchronized by default.
		
		9) Hashtable provides fail-fast iteration. If a collection is modified while being iterated, a ConcurrentModificationException will be thrown. 
		
	   10) Hashtable provides an Enumeration interface for iterating over its elements. However, HashMap does not provide a specific Enumeration interface.
	   
	   11) Hashtable does not guarantee any specific order of the key-value pairs in the map. The order may vary, and it is not guaranteed to remain constant over time.
	   
	   12) Hashtable implements fail-fast iteration. This means that if a collection is modified while being iterated, a ConcurrentModificationException will be thrown.  
	   
	   13) The Hashtable class was indeed introduced in Java 1.0, which was released in 1996.

	Refer to the link as follows:
	https://www.baeldung.com/java-hash-table
	https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html
	
======================================================================================================================================================================================================================		 
	
	The code demonstrates the usage of a Hashtable in Java. 
	
	It initializes a Hashtable with a default initial capacity of 11 and a load factor of 0.75. 
	
	Then, it adds key-value pairs to the Hashtable using the put() method. 
	
	If a duplicate key is inserted, the Hashtable will replace the existing value associated with that key.

	Also the code attempts to add a null key and a null value to the Hashtable, which would result in a NullPointerException. 
		
	It's important to avoid storing null keys or null values in a Hashtable.

	The code also demonstrates the usage of the elements() method, which returns an Enumeration of the values in the Hashtable. 
		
	It iterates over the elements using the hasMoreElements() and nextElement() methods of the Enumeration, printing each value. 
		
*/


import java.util.Enumeration;
import java.util.Hashtable;
public class HashTableDemo {
	public static void main(String[] args) {
		
		/*
	     * Constructs a new, empty hashtable with a default initial capacity (11)
	     * and load factor (0.75).	    
		   public Hashtable() {
		       this(11, 0.75f);
		   }		    
		*/
	    

		// Create a Hashtable with default initial capacity (11) and load factor (0.75)
		Hashtable<String, Integer> hashTable = new Hashtable<>();
		// Add key-value pairs to the Hashtable
		hashTable.put("Mathematics", 98);
		hashTable.put("Microwave Engineering", 88);
		hashTable.put("Microwave Engineering", 88); // Duplicate key, value will be replaced
		hashTable.put("RFIC Design", 59);
		hashTable.put("Java-1z0-819", 87);
		/*
			// Exception in thread "main" java.lang.NullPointerException
			hashTable.put(null, null);			
		*/
		System.out.println(hashTable);
		// Iterate over the values using Enumeration
		Enumeration<Integer> values = hashTable.elements();
		while (values.hasMoreElements()) {
			Integer value = values.nextElement();
			System.out.println(value);
		}
	}
}

/*
	Console:
			{Java-1z0-819=87, Mathematics=98, RFIC Design=59, Microwave Engineering=88}
			87
			98
			59
			88
*/