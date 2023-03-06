package com.ocp.day16.map;

/*
 	Overview of LinkedHashMap:
	 	1) LinkedHashMap is a class in the Java programming language that extends the HashMap class. 
	 			
	 	   E.g.,
	 			public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>  
	 			
	 	2) LinkedHashMap maintains a doubly-linked list of the entries in the map in the order in which they were inserted. 
	 	   This allows the elements to be accessed in the order they were added to the map.
	 	
	 	3) The aspects of LinkedHashMap is generally like HashMap. 
	 	   But, LinkedHashMap provides additional methods and constructors to support the ordering of the elements. 
	 	   
	 	   For an instance, LinkedHashMap provides a constructor that allows you to specify the initial capacity of the map 
	 	   and whether it should maintain the order of insertion.
	 	   
		 	   public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
		       		super(initialCapacity, loadFactor);
		        	this.accessOrder = accessOrder;
		       }
		   
			   initialCapacity: 
			   		
			   		The initial capacity of the map. This is the number of buckets that the map can hold initially. The default value is 16.
			  
			   loadFactor: 
			   		
			   		The load factor of the map. This is the maximum ratio of entries to buckets before the map is resized. The default value is 0.75.
			   
			   accessOrder: 
			   		
			   		If true, the order of iteration is the order of access (from least-recently accessed to most-recently accessed). 
			   		If false, the iteration order is the order in which the entries were inserted. The default value is false.
	
		4) Load Factor and Initial Capacity are defined precisely as for HashMap. However, that the penalty for 
		   choosing an excessively high value for initial capacity is less severe for LinkedHashMap than for HashMap, 
		   as iteration times for this class are unaffected by capacity.
		
		
		5) The element(s) of LinkedHashMap is iteration guaranteed
		
		6) Repeated element(s) NOT allowable
		
		7) Null key allowable
		
		8) LinkedHashMap implementation is NOT synchronized. 
		   If you are trying to access it from multiple threads and at least one of these threads is likely to change it structurally, 
		   then it MUST be externally synchronized.
		   
		   Best to do this at creation for synchronization:	   		
		 		Map m = Collections.synchronizedMap(new LinkedHashMap());
	 	
	 	9) The constant-time performance of LinkedHashMap is likely to be a little worse than the constant-time of HashMap due to the added overhead of maintaining a doubly-linked list.
		   Iteration over collection views of LinkedHashMap also takes linear time O(n) similar to that of HashMap. 
		   On the flip side, LinkedHashMap‘s linear time performance during iteration is better than HashMap‘s linear time.
		   This is because, for LinkedHashMap, n in O(n) is only the number of entries in the map regardless of the capacity. Whereas, for HashMap, n is capacity and the size summed up, O(size+capacity).
		   
	   10) Available since java 1.4
	
	
	Refer to the link as follows:
	https://www.baeldung.com/java-linked-hashmap
	   
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {		
		Map<Object, Object> map4accessOrder4False = new LinkedHashMap<>(16, .75f, false);
		map4accessOrder4False.put("a", 1);
		map4accessOrder4False.put("b", 2);
		map4accessOrder4False.put("c", 3);
		map4accessOrder4False.put("c", 3);
		map4accessOrder4False.put("d", 4);
		map4accessOrder4False.put(null, 5);

		System.out.println("***** AccessOrder4False - No element will move to the end of the map *****");
		System.out.println(map4accessOrder4False);
		map4accessOrder4False.get("a");
		System.out.println(map4accessOrder4False);
		map4accessOrder4False.get("b");
		System.out.println(map4accessOrder4False);
		map4accessOrder4False.get("c");
		System.out.println(map4accessOrder4False);
		map4accessOrder4False.get("d");
		System.out.println(map4accessOrder4False);

		Map<Object, Object> map4accessOrder4True = new LinkedHashMap<>(16, .75f, true);
		map4accessOrder4True.put("a", 1);
		map4accessOrder4True.put("b", 2);
		map4accessOrder4True.put("c", 3);
		map4accessOrder4True.put("c", 3);
		map4accessOrder4True.put("d", 4);
		map4accessOrder4True.put(null, 5);
		System.out.println("***** AccessOrder4True - Move an element to the end of the map *****");
		System.out.println(map4accessOrder4True);
		map4accessOrder4True.get("a");
		System.out.println(map4accessOrder4True);
		map4accessOrder4True.get("b");
		System.out.println(map4accessOrder4True);
		map4accessOrder4True.get("c");
		System.out.println(map4accessOrder4True);
		map4accessOrder4True.get("d");
		System.out.println(map4accessOrder4True);

		System.out.println("keySet(): " + map4accessOrder4True.keySet());
		System.out.println("values(): " + map4accessOrder4True.values());

		System.out.println("value of remove(null): " + map4accessOrder4True.remove(null));

		for (Map.Entry<Object, Object> entry : map4accessOrder4True.entrySet()) {
			System.out.printf("[Key : Value] = [%s : %s]\n", entry.getKey(), entry.getValue());
		}
	}
}

/*
 		Console:
				 	***** AccessOrder4False - No element will move to the end of the map *****
					{a=1, b=2, c=3, d=4, null=5}
					{a=1, b=2, c=3, d=4, null=5}
					{a=1, b=2, c=3, d=4, null=5}
					{a=1, b=2, c=3, d=4, null=5}
					{a=1, b=2, c=3, d=4, null=5}
					***** AccessOrder4True - Move an element to the end of the map *****
					{a=1, b=2, c=3, d=4, null=5}
					{b=2, c=3, d=4, null=5, a=1}
					{c=3, d=4, null=5, a=1, b=2}
					{d=4, null=5, a=1, b=2, c=3}
					{null=5, a=1, b=2, c=3, d=4}
					keySet(): [null, a, b, c, d]
					values(): [5, 1, 2, 3, 4]
					value of remove(null): 5
					[Key : Value] = [a : 1]
					[Key : Value] = [b : 2]
					[Key : Value] = [c : 3]
					[Key : Value] = [d : 4]

 		
*/
