package com.ocp.day16.map;
/*
	Overview of LinkedHashMap:
 	
	 1) LinkedHashMap is a class in the Java programming language that extends HashMap.
	 	
	    Example:
	 		public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>  
	 			
	 2) LinkedHashMap maintains a doubly-linked list of its entries in the order they were inserted.
	    This ensures the elements can be accessed in insertion order.
	 	
	 3) LinkedHashMap shares most characteristics with HashMap but provides additional methods and constructors to maintain the ordering of elements.
	 	
	    For example, LinkedHashMap offers a constructor to specify the initial capacity and the order of iteration:
	 		
	 		public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
	 			super(initialCapacity, loadFactor);
	 			this.accessOrder = accessOrder;
	 		}
	 		
	    - initialCapacity: The initial number of buckets. Default value: 16.
	    - loadFactor: The ratio of entries to buckets before resizing occurs. Default value: 0.75.
	    - accessOrder: 
	      - true: Iteration follows access order (from least to most recently accessed).
	      - false: Iteration follows insertion order (default).
	
	 4) Load factor and initial capacity are the same as in HashMap, but LinkedHashMap incurs less penalty for a high initial capacity, as iteration time is unaffected by capacity.
		
	 5) LinkedHashMap guarantees predictable iteration order.
	 
	 6) Duplicate keys are not allowed.
	 
	 7) Null keys are permitted.
	 
	 8) LinkedHashMap is not synchronized. If accessed by multiple threads, and at least one of them modifies it structurally, external synchronization is required. 
	 	
	    For example:
	 	    Map m = Collections.synchronizedMap(new LinkedHashMap<>());
	 	
	    See the class 'LinkedHashMapWithSynchronizedMap' for more details.
	 
	 9) The constant-time performance of LinkedHashMap is slightly worse than HashMap due to the overhead of maintaining the doubly-linked list. Iteration over LinkedHashMap is O(n), but it tends to perform better than HashMap for iteration, as the time complexity for LinkedHashMap depends only on the number of entries, not the capacity.
	 	
	    See 'LinkedHashMapAndHashMapEfficiency' for more details.
	 
	10) LinkedHashMap was introduced in Java 1.4 (released in 2002).
	
	For further details, refer to:
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

		System.out.println("***** AccessOrder4False - Print the original order of elements (insertion order) *****");
		System.out.println(map4accessOrder4False);
		System.out.println(map4accessOrder4False.get("a"));
		System.out.println(map4accessOrder4False);
		System.out.println(map4accessOrder4False.get("b"));
		System.out.println(map4accessOrder4False);
		System.out.println(map4accessOrder4False.get("c"));
		System.out.println(map4accessOrder4False);
		System.out.println(map4accessOrder4False.get("d"));
		System.out.println(map4accessOrder4False);
		System.out.println(map4accessOrder4False.get(null));

		Map<Object, Object> map4accessOrder4True = new LinkedHashMap<>(16, .75f, true);
		map4accessOrder4True.put("a", 1);
		map4accessOrder4True.put("b", 2);
		map4accessOrder4True.put("c", 3);
		map4accessOrder4True.put("c", 3);
		map4accessOrder4True.put("d", 4);
		map4accessOrder4True.put(null, 5);
		System.out.println("***** AccessOrder4True - Print the order of elements after access (access order) *****");
		System.out.println(map4accessOrder4True);
		map4accessOrder4True.get("a");
		System.out.println(map4accessOrder4True);
		map4accessOrder4True.get("b");
		System.out.println(map4accessOrder4True);
		map4accessOrder4True.get("c");
		System.out.println(map4accessOrder4True);
		map4accessOrder4True.get("d");
		System.out.println(map4accessOrder4True);
		map4accessOrder4True.get(null);
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
				 	***** AccessOrder4False - Print the original order of elements (insertion order) *****
					{a=1, b=2, c=3, d=4, null=5}
					1
					{a=1, b=2, c=3, d=4, null=5}
					2
					{a=1, b=2, c=3, d=4, null=5}
					3
					{a=1, b=2, c=3, d=4, null=5}
					4
					{a=1, b=2, c=3, d=4, null=5}
					5
					***** AccessOrder4True - Print the order of elements after access (access order) *****
					{a=1, b=2, c=3, d=4, null=5}
					{b=2, c=3, d=4, null=5, a=1}
					{c=3, d=4, null=5, a=1, b=2}
					{d=4, null=5, a=1, b=2, c=3}
					{null=5, a=1, b=2, c=3, d=4}
					keySet(): [a, b, c, d, null]
					values(): [1, 2, 3, 4, 5]
					value of remove(null): 5
					[Key : Value] = [a : 1]
					[Key : Value] = [b : 2]
					[Key : Value] = [c : 3]
					[Key : Value] = [d : 4]		
*/
