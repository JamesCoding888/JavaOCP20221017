package com.ocp.day16.map;
/**
 * Introduction of this lesson:
 *
 * 1) The `Hashtable` class is the oldest implementation of a hash table data structure in Java.
 *
 * 2) `Hashtable<K, V>` is part of the `java.util` package and is a subclass of the `Map` interface,
 *    which provides the functionality of a key-value mapping.
 *
 * 3) `Hashtable` is designed as a hash table-based implementation of the `Map` interface.
 *
 * 4) `Hashtable` stores data in the form of key-value pairs, where each key is associated with a corresponding value.
 *
 * 5) `Hashtable` does not allow `null` keys or `null` values. Attempting to store `null` values or keys will result in a `NullPointerException`.
 *
 * 6) It uses a hash table data structure to map keys to specific indices in an underlying array through a hash function.
 *
 * 7) If you attempt to insert a key-value pair with a duplicate key, `Hashtable` will replace the existing value for that key.
 *
 * 8) `Hashtable` is synchronized, meaning it is thread-safe for concurrent access, unlike `HashMap` which is not synchronized by default.
 *
 * 9) `Hashtable` provides fail-fast iteration. If the collection is modified while being iterated, a `ConcurrentModificationException` will be thrown.
 *
 * 10) It also provides an `Enumeration` interface for iterating over its elements. This feature is not available in `HashMap`.
 *
 * 11) `Hashtable` does not guarantee any specific order for its key-value pairs, and the order may change over time.
 *
 * 12) Like `HashMap`, `Hashtable` also implements fail-fast iteration to prevent concurrent modification issues.
 *
 * 13) The `Hashtable` class was introduced in Java 1.0, which was released in 1996.
 *
 * Code demonstration:
 *
 * 1) A `Hashtable` is initialized with a default initial capacity of 11 and a load factor of 0.75.
 *
 * 2) The `put()` method is used to add key-value pairs. If a duplicate key is inserted, the existing value is replaced.
 *
 * 3) Adding a `null` key or value to the `Hashtable` will result in a `NullPointerException`, so it is important to avoid this.
 *
 * 4) The `elements()` method is used to return an `Enumeration` of the values in the `Hashtable`.
 *    The iteration over the elements is done using the `hasMoreElements()` and `nextElement()` methods from the `Enumeration` interface, 
 *    printing each value.
 *
 * References:
 * - https://www.baeldung.com/java-hash-table
 * - https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html
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