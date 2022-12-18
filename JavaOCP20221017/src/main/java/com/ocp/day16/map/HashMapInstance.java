package com.ocp.day16.map;

/* Let's redirect to day14 - HashSet 
 * https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
 */
	

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
public class HashMapInstance {
	public static void main(String[] args) {
		Map<Object, Set<Object>> hashMap = new HashMap();
		Set<Object> hashSet = new LinkedHashSet<>();
		hashSet.add("james");
		hashMap.put(1, hashSet);
		System.out.println(hashMap); // {1=[james]}				
	}
}