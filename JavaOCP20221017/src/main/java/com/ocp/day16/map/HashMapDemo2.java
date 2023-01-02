package com.ocp.day16.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.Set;

public class HashMapDemo2{
	public static void main(String[] args) {
		Map<Object, Object> hashMap = new HashMap<>();
		hashMap.put("Mathematics", 98);
		hashMap.put("Microwave Engineering", 88);
		hashMap.put("RFIC Design", 89);
		hashMap.put("Java-1z0-819", 87);
		System.out.println(hashMap);
		Set<Map.Entry<Object, Object>> set = hashMap.entrySet(); 
		// for-each to print out the each of keys and values
		for(Entry<Object, Object> entry : set) {
			System.out.printf("[Key : Value] -> [%s : %d]\n", entry.getKey(), entry.getValue());			
		}
		
		System.out.println("*************** Java 1.5 - Iterable API ***************");
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
		
		set.forEach(entry -> System.out.printf("[Key : Value] -> [%s : %d]\n", entry.getKey(), entry.getValue()));
		
	}
}




/*
public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Mathematics", 98);
        hashMap.put("Microwave Engineering", 88);
        hashMap.put("RFIC Design", 89);
        hashMap.put("Java-1z0-819", 87);
        System.out.println(hashMap);
        
        // Invoke the method of Map - keySet() to get all elements (i.e., keys) 
        // and store those keys into object of Set
        Set<String> keys = hashMap.keySet();  
        // for-each to print out the each of keys and values
        for(String key : keys) {
            System.out.println(key + " = " + hashMap.get(key));
        }
        
        Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
        entrySet.forEach((Entry<String, Integer> entry) -> System.out.println(entry.getKey() + " : " + entry.getValue()));
        
        // Sum of all scores
        int sum = hashMap.entrySet()
                         .stream()
                       //.mapToInt(entry -> entry.getValue())
                         .mapToInt(Entry::getValue) // same syntax as previously line
                         .sum();
        System.out.println("Total Scores: " + sum);
    }
}
*/
/*
	Console: 
			{Java-1z0-819=87, Microwave Engineering=88, Mathematics=98, RFIC Design=89}
			Java-1z0-819 = 87
			Microwave Engineering = 88
			Mathematics = 98
			RFIC Design = 89
			Java-1z0-819 : 87
			Microwave Engineering : 88
			Mathematics : 98
			RFIC Design : 89
			Total Scores: 362

*/