package com.ocp.day16.map;
/*
	9) The constant-time performance of LinkedHashMap is likely to be a little worse than the constant-time of HashMap due to the added overhead of maintaining a doubly-linked list.
	   Iteration over collection views of LinkedHashMap also takes linear time O(n) similar to that of HashMap. 
	   On the flip side, LinkedHashMap‘s linear time performance during iteration is better than HashMap‘s linear time.
	   This is because, for LinkedHashMap, n in O(n) is only the number of entries in the map regardless of the capacity. Whereas, for HashMap, n is capacity and the size summed up, O(size+capacity).
	   
	
	Let's break it down and explain it in detail of statement 9):
	
		1. For LinkedHashMap:
		
		   The time complexity for iterating over the collection view of a LinkedHashMap is linear, denoted as O(n).
		   Here, 'n' represents the number of entries in the map, which means it depends solely on the size of the LinkedHashMap and is independent of the initial capacity.
		   Regardless of the capacity of the LinkedHashMap, the iteration time is determined only by the number of entries present.
		
		2. For HashMap:
		
		   The time complexity for iterating over the collection view of a HashMap is also linear, denoted as O(n).
		   However, in the case of HashMap, 'n' represents the sum of the size of the map and the initial capacity.
		   In HashMap, the iteration time is influenced by both the size of the map and the initial capacity, which affects the total number of entries that need to be processed during iteration.
		
		3. To summarize:
		
		   LinkedHashMap's iteration time is solely based on the number of entries in the map and is independent of the capacity. 
		   This makes LinkedHashMap more efficient for iteration compared to HashMap when the number of entries is large but the capacity is relatively small.
			
		   HashMap's iteration time depends on both the size of the map and the initial capacity. 
		   This means that HashMap's iteration performance can be impacted by a larger initial capacity, resulting in a longer iteration time compared to LinkedHashMap.
			
		   It's important to note that these performance differences may vary based on the specific use case, the size of the map, and the specific implementation of the JVM. 
		   Therefore, it's always recommended to benchmark and profile the code to evaluate the actual performance characteristics in a given scenario.
	 
	   
	The sample code demonstrating statements 9):   
	
		The given code is comparing the execution time and iteration time of LinkedHashMap and HashMap for adding elements and iterating over the elements.
	
		In the code, the number of elements to add is set to numElements = 100. The execution time and iteration time are measured in nanoseconds.
	
	Here are the results of running the code with numElements = 1000000 and numElements = 100:

		1. For numElements = 1000000:
				
				LinkedHashMap execution time (adding elements): 254905292 nanoseconds
				HashMap execution time (adding elements): 194495166 nanoseconds
					
				LinkedHashMap iteration time: 14460583 nanoseconds
				HashMap iteration time: 26360292 nanoseconds
							
		2. For numElements = 100:
					
				LinkedHashMap execution time (adding elements): 1998791 nanoseconds
				HashMap execution time (adding elements): 198208 nanoseconds
					
				LinkedHashMap iteration time: 900083 nanoseconds
				HashMap iteration time: 11958 nanoseconds



	Based on the results, here are some observations:

		1. Adding Elements: 
				
				The execution time for adding elements is generally higher for LinkedHashMap compared to HashMap. This can be attributed to the additional overhead in maintaining the insertion order of elements in LinkedHashMap.

		2. Iteration Time: 
				
				The iteration time for both LinkedHashMap and HashMap is relatively faster compared to adding elements. In both cases, iterating over the elements is efficient. However, the iteration time for LinkedHashMap is slightly higher compared to HashMap due to the need to maintain the insertion order.

		3. Overall: 
		        
		        The choice between LinkedHashMap and HashMap depends on your specific requirements. If you need to maintain the insertion order of elements, LinkedHashMap is a suitable choice despite the slightly higher execution and iteration time. If insertion order is not a concern, HashMap can provide faster execution and iteration time.

	
*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAndHashMapEfficiency {
    public static void main(String[] args) {

        int numElements = 100; // Number of elements to add
        
        // Create a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        long linkedHashMapStartTime = System.nanoTime();
        for (int i = 1; i <= numElements; i++) {
            linkedHashMap.put("Key" + i, i);
        }
        long linkedHashMapEndTime = System.nanoTime();
        long linkedHashMapExecutionTime = linkedHashMapEndTime - linkedHashMapStartTime;
        System.out.println("LinkedHashMap execution time (adding elements): " + linkedHashMapExecutionTime + " nanoseconds");

        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        long hashMapStartTime = System.nanoTime();
        for (int i = 1; i <= numElements; i++) {
            hashMap.put("Key" + i, i);
        }
        long hashMapEndTime = System.nanoTime();
        long hashMapExecutionTime = hashMapEndTime - hashMapStartTime;
        System.out.println("HashMap execution time (adding elements): " + hashMapExecutionTime + " nanoseconds");

        // Iterating over LinkedHashMap and calculating time
        System.out.println("\nLinkedHashMap iteration:");
        long linkedHashMapIterationStartTime = System.nanoTime();
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            // Perform some operation with the entry if needed
            // For this example, we are just iterating over the elements
        }
        long linkedHashMapIterationEndTime = System.nanoTime();
        long linkedHashMapIterationTime = linkedHashMapIterationEndTime - linkedHashMapIterationStartTime;
        System.out.println("LinkedHashMap iteration time: " + linkedHashMapIterationTime + " nanoseconds");

        // Iterating over HashMap and calculating time
        System.out.println("\nHashMap iteration:");
        long hashMapIterationStartTime = System.nanoTime();
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            // Perform some operation with the entry if needed
            // For this example, we are just iterating over the elements
        }
        long hashMapIterationEndTime = System.nanoTime();
        long hashMapIterationTime = hashMapIterationEndTime - hashMapIterationStartTime;
        System.out.println("HashMap iteration time: " + hashMapIterationTime + " nanoseconds");
    }
}


/*
	Console (int numElements = 1000000):
	 
				LinkedHashMap execution time (adding elements): 254905292 nanoseconds
				HashMap execution time (adding elements): 194495166 nanoseconds
				
				LinkedHashMap iteration:
				LinkedHashMap iteration time: 14460583 nanoseconds
				
				HashMap iteration:
				HashMap iteration time: 26360292 nanoseconds

	Console (int numElements = 100):
	
				LinkedHashMap execution time (adding elements): 1998791 nanoseconds
				HashMap execution time (adding elements): 198208 nanoseconds
				
				LinkedHashMap iteration:
				LinkedHashMap iteration time: 900083 nanoseconds
				
				HashMap iteration:
				HashMap iteration time: 11958 nanoseconds
	
*/
