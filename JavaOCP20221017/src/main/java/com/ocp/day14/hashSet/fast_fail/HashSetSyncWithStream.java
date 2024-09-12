package com.ocp.day14.hashSet.fast_fail;
import java.util.Collections; 
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
/*
 * This reflects the core focus of the code, which involves working with a synchronized HashSet, 
 * performing a stream-based filtering operation, and updating the set in a thread-safe manner.
 */
public class HashSetSyncWithStream {
	public static void main(String[] args) {		
		Set<String> hashSetSync = Collections.synchronizedSet(new LinkedHashSet<>());
		hashSetSync.add("1");
		hashSetSync.add("2");
		hashSetSync.add("5");
		hashSetSync.add("4");
		hashSetSync.add("3");
		System.out.println("Before: " + hashSetSync);		
		// streamline implementation
		synchronized (hashSetSync) {
		    // Filter the elements and collect them back into the original hashSet
		    Set<String> filteredSet = hashSetSync.stream()
			        .filter(next -> !(next.equals("3"))) // Remove the element "3"
			        .collect(Collectors.toSet());

		    // Clear the original set and add back the filtered elements
		    hashSetSync.clear();
		    hashSetSync.addAll(filteredSet);
		}		
		System.out.println("After: " + hashSetSync);
	}
}