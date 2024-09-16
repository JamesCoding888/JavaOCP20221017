package com.ocp.day16.map;

import java.util.HashMap;

//Custom Key class to force collisions
class CustomKey {
	private String key;

	public CustomKey(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		// Force all keys to have the same hash code to simulate collisions
		return 1; // All keys will hash to the same bucket
	}

	// Notice: no proper equals implementation here!
	// This will cause issues when retrieving values as different keys with the same
	// hash code won't be considered equal.
	/*
		@Override
		public boolean equals(Object obj) {
			// Deliberately returning false to simulate a faulty equals method
			return false;
		}
	*/
	// This overrided equals method could help retrieve the correct value
	/*
		@Override
	    public boolean equals(Object obj) {
	        // Proper equals implementation to differentiate between keys
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        CustomKey other = (CustomKey) obj;
	        return key.equals(other.key);
	    }
	*/
	@Override
	public String toString() {
		return key;
	}
}

public class HashMapWithCollisionDemo {
	public static void main(String[] args) {
		HashMap<CustomKey, Integer> map = new HashMap<>(2); // Only 2 buckets, simulating high collision rate

		// Insert a large number of key-value pairs to see the impact of collisions
		for (int i = 1; i <= 10000; i++) {
			map.put(new CustomKey("key" + i), i);
		}

		// Try to retrieve a value (This will fail due to the improper equals method)
		Integer value = map.get(new CustomKey("key5000")); // This won't work because equals always returns false
		System.out.println("Value for key5000: " + value); // This will print "null" due to incorrect equals method

		// Printing the size of the map to confirm the entries
		System.out.println("Total entries: " + map.size());
	}
}
