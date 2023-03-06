package com.ocp.day16.map;
/*
	Introduction of this lecture (Please also recap HashMap at package: com.ocp.day16.map):
	
		1) The Hashtable class is the oldest implementation of a hash table data structure
		2) Hashtable<K, V> class, at package: "java.util", is a subclass of Map interface
		3) Hashtable is a hashtable-based implementation of the Map interface 
		4) Hashtable stores the data based on Key and Value
		5) NOT allow null values and the null keys		 
		6) Hashtable stores key-value pairs in a hash table, which is a data structure that uses a hash function to map keys to indices in an array
		7) If trying to insert the duplicate key, Hashtable will replace the element of the corresponding key
		8) Hashtable is "Synchronized" but HashMap "Unsynchronized"
		9) Hashtable provides NOT fail-fast Enumeration, but HashMap doesn't provide any Enumeration
	   10) Hashtable class makes NO guarantee as to the order of the map; especially, 
	  	   Hashtable does NOT guarantee that the order will remain constant over time
	   11) Fail-fast iteration  
	   12) The Hashtable class was introduced in Java 1.0, which was released in 1996

	Refer to the link as follows:
	https://www.baeldung.com/java-hash-table
	https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html
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
	    
		// default Initial Capacity: 11
		// default Load Factor: 0.75
		Hashtable<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("Mathematics", 98);
		// If trying to insert the duplicate key, 
		// HashMap will replace the element of the corresponding key.
		hashTable.put("Microwave Engineering", 88);
		hashTable.put("Microwave Engineering", 88);
		hashTable.put("RFIC Design", 59);
		hashTable.put("Java-1z0-819", 87);
		/*
			// Exception in thread "main" java.lang.NullPointerException
			hashTable.put(null, null);			
		*/
		System.out.println(hashTable);
		// Enumeration (Hashtable does have this API, but HashMap neither
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