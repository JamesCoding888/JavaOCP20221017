package com.ocp.day16.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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