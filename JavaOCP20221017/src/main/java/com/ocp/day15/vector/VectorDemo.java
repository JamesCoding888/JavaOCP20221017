package com.ocp.day15.vector;

import java.util.Vector;

public class VectorDemo {
	static final int initialCapacity = 671;
	static final int capacityIncrement = 20;
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("james");
		vector.add("betty");
		vector.add(null);
		vector.add(null);
		vector.add("david");
		vector.add("Tom");
		
		System.out.println(vector);
		int size = vector.size();
		/*
		  	// Please remove the annotation here "/*", then run of this sample code on your IDE
		
			// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 5				
			
			// Notice here !!! 
			// The length of vector is Dynamic, it's NOT supposed to invoke the .remove(int index) inside for-loop/for-each 
			for(int n = 0 ; n < size ; n++) {
				if(vector.get(n) == null) {
					vector.remove(n);	
					System.out.println(vector);
				}						
			}		 
		*/
		for(int n = 0 ; n < size ; n++) {
			if(vector.get(n) == null) {
				vector.remove(n);	
				System.out.println(vector);
				// Notice here !!! 
				// Since the size of vector is dynamic and also the cursor of "int n" will shift to the next position 
				// after removing an element; therefore, we shall deduct one position from previously size and n
				--size; --n;
			}						
		}
		
		
		/*
		    // Constructs an empty vector with the specified initial capacity and
		    // capacity increment.
		     
		    // @param   initialCapacity     the initial capacity of the vector
		    // @param   capacityIncrement   the amount by which the capacity is increased when the vector overflows
		    // @throws IllegalArgumentException if the specified initial capacity is negative
		    public Vector(int initialCapacity, int capacityIncrement) {
		       super();
		       if (initialCapacity < 0)
		           throw new IllegalArgumentException("Illegal Capacity: "+
		                                               initialCapacity);
		       this.elementData = new Object[initialCapacity];
		       this.capacityIncrement = capacityIncrement;
		    }
		*/
				
		Vector<Integer> v = new Vector<>(initialCapacity, capacityIncrement);
		System.out.println("Initial Capacity: " + v.capacity());
		System.out.println("Already used the capacity: " + v.size());
		for (int i = 1; i <= 671; i++) {
			v.add(i);
		}
		System.out.println("Initial Capacity: " + v.capacity());
		System.out.println("Already used the capacity: " + v.size());
		// There is NO MORE capacity at this moment if proceed the following operation
		// However, the capacityIncrement will be 
		v.add(888); 
		System.out.println("Initial Capacity: " + v.capacity());
		System.out.println("Already used the capacity: " + v.size());
	}
}

/*
	Console:
			[james, betty, null, null, david, Tom]
			[james, betty, null, david, Tom]
			[james, betty, david, Tom]
			Initial Capacity: 671
			Already used the capacity: 0
			Initial Capacity: 671
			Already used the capacity: 671
			Initial Capacity: 691
			Already used the capacity: 672

*/