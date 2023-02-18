package com.ocp.day16.map;

/*
 	Overview of LinkedHashMap:
 	1. LinkedHashMap is a class in the Java programming language that extends the HashMap class. 
 	
 	2. LinkedHashMap maintains a doubly-linked list of the entries in the map in the order in which they were inserted. 
 	   This allows the elements to be accessed in the order they were added to the map.
 	
 	3. The aspects of LinkedHashMap is generally like HashMap. 
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

	4. The element(s) of LinkedHashMap is iteration guaranteed
	
	5. Repeated element(s) NOT allowable
 	
 	
 	
 	
 	
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
						
			
			
	}
}

/*
 		Console:
		 		***** AccessOrder4False *****
				{a=1, b=2, c=3, d=4}
				{a=1, b=2, c=3, d=4}
				{a=1, b=2, c=3, d=4}
				{a=1, b=2, c=3, d=4}
				{a=1, b=2, c=3, d=4}
				***** AccessOrder4True *****
				{a=1, b=2, c=3, d=4}
				{b=2, c=3, d=4, a=1}
				{c=3, d=4, a=1, b=2}
				{d=4, a=1, b=2, c=3}
				{a=1, b=2, c=3, d=4}
 		
*/
