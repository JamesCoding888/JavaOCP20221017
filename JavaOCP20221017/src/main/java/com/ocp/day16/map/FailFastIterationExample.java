package com.ocp.day16.map;
/*
	
	Introduction of this example:
	
		We have a list called names containing three elements. 
	
		We obtain an iterator from the list using the iterator() method. 
	
		Then, we enter a loop to iterate over the elements using the hasNext() and next() methods of the iterator.
	
		Inside the loop, we print each name and intentionally modify the list by adding a new element ("David") while iterating. 
	
		This modification violates the fail-fast behavior, as the list is structurally modified during iteration.
	
	Exception:
		
		When you run this code, it will throw a ConcurrentModificationException because the list was modified while being iterated. 
		
		This exception serves as a fail-fast mechanism, alerting you to the concurrent modification and preventing potential data inconsistencies.
	
	Avoid ConcurrentModificationException:
		
		To avoid the ConcurrentModificationException in this scenario, you can use proper synchronization or utilize concurrent collection classes like ConcurrentHashMap or CopyOnWriteArrayList, 
	
		which are specifically designed to handle concurrent modifications safely. 
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterationExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("Lucy");
        names.add("Betty");

        // Create an iterator
        Iterator<String> iterator = names.iterator();

        // Perform fail-fast iteration
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // Concurrent modification - Adding an element while iterating
            names.add("David");
        }
    }
}


/*
	Console:
			James
			Exception in thread "main" java.util.ConcurrentModificationException
*/