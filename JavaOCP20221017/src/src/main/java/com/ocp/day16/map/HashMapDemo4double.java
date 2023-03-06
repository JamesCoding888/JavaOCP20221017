package com.ocp.day16.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.Set;

public class HashMapDemo4double{
	public static void main(String[] args) {
		Map<Object, Object> hashMap = new HashMap<>();
		hashMap.put("Mathematics", 98.0);
		hashMap.put("Microwave Engineering", 88.0);
		hashMap.put("RFIC Design", 89.0);
		hashMap.put("Java-1z0-819", 87.0);
		System.out.println(hashMap);
		Set<Map.Entry<Object, Object>> set = hashMap.entrySet(); 
		// for-each to print out the each of keys and values
		for(Entry<Object, Object> entry : set) {
			System.out.printf("[Key : Value] -> [%s : %.3f]\n", entry.getKey(), entry.getValue());			
		}
		
		// Invoke the method of Map (i.e., keySet()) to get all keys and store those keys into object of Set
		Set<Object> keys = hashMap.keySet();
		// for-each to print out the each of keys
		for (Object key : keys) {
			System.out.printf("[Key : Value] -> [%s : %.3f]\n", key, hashMap.get(key));
		}

		System.out.println("*************** Java 1.5 - Iterable API & Java 1.8 - forEach ***************");
		/*
			public interface Iterable<T> {
			    
			     * Returns an iterator over elements of type {@code T}.
			     *
			     * @return an Iterator.
			    
			    Iterator<T> iterator();
	
			    
			     * Performs the given action for each element of the {@code Iterable}
			     * until all elements have been processed or the action throws an
			     * exception.  Actions are performed in the order of iteration, if that
			     * order is specified.  Exceptions thrown by the action are relayed to the
			     * caller.
			     * <p>
			     * The behavior of this method is unspecified if the action performs
			     * side-effects that modify the underlying source of elements, unless an
			     * overriding class has specified a concurrent modification policy.
			     *
			     * @implSpec
			     * <p>The default implementation behaves as if:
			     * <pre>{@code
			     *     for (T t : this)
			     *         action.accept(t);
			     * }</pre>
			     *
			     * @param action The action to be performed for each element
			     * @throws NullPointerException if the specified action is null
			     * @since 1.8
			     
			    default void forEach(Consumer<? super T> action) {
			        Objects.requireNonNull(action);
			        for (T t : this) {
			            action.accept(t);
			        }
			    }
		*/
		
		set.forEach(entry -> System.out.printf("[Key : Value] -> [%s : %.3f]\n", entry.getKey(), entry.getValue()));

		double sum = hashMap.entrySet().stream()	
									// Notice here - "Type mismatch: cannot convert from Object to double", 
									// Please down-casting the type of entry.getValue() to double
									   .mapToDouble((Entry<Object, Object> entry) -> (double)entry.getValue()).sum();
		System.out.printf("Total Scores: %.3f", sum);
	}
}


/*
	Console: 
			{Java-1z0-819=87.0, Microwave Engineering=88.0, Mathematics=98.0, RFIC Design=89.0}
			[Key : Value] -> [Java-1z0-819 : 87.000]
			[Key : Value] -> [Microwave Engineering : 88.000]
			[Key : Value] -> [Mathematics : 98.000]
			[Key : Value] -> [RFIC Design : 89.000]
			[Key : Value] -> [Java-1z0-819 : 87.000]
			[Key : Value] -> [Microwave Engineering : 88.000]
			[Key : Value] -> [Mathematics : 98.000]
			[Key : Value] -> [RFIC Design : 89.000]
			*************** Java 1.5 - Iterable API & Java 1.8 - forEach ***************
			[Key : Value] -> [Java-1z0-819 : 87.000]
			[Key : Value] -> [Microwave Engineering : 88.000]
			[Key : Value] -> [Mathematics : 98.000]
			[Key : Value] -> [RFIC Design : 89.000]
			Total Scores: 362.000

*/