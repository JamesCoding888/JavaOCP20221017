package com.ocp.day14.hashSet;

import java.util.Iterator;  
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo3 {
	public static void main(String[] args) {
		// Create a Set object to collect the elements of Set<Number>
		Set<Set<Number>> linkedHashSet4Collecting = new LinkedHashSet<>();
        
		// Instantiate the object of LinkedHashSet
		Set<Number> linkedHashSet1 = new LinkedHashSet<>();
        Set<Number> linkedHashSet2 = new LinkedHashSet<>();
        Set<Number> linkedHashSet3 = new LinkedHashSet<>();
        linkedHashSet1.add(7.8);
        linkedHashSet1.add(8.7);
        linkedHashSet2.add(6.9);
        linkedHashSet2.add(9.6);       
        linkedHashSet3.add(10.0);
        linkedHashSet3.add(100);
        
        
        // place elements of Set<Number> above into Set object
        linkedHashSet4Collecting.add(linkedHashSet1);
        linkedHashSet4Collecting.add(linkedHashSet2);
        linkedHashSet4Collecting.add(linkedHashSet3);
       
        System.out.println(linkedHashSet4Collecting); 
        
        double total = 0;        
        for(Set<Number> elementOfLinkedHashSet4Collecting : linkedHashSet4Collecting) {
        	// Giving a limited length of elementOfLinkedHashSet4Collecting, and 
        	// 限制物件 (linkedHashSet4Collecting) 中的元素 (elementOfLinkedHashSet4Collecting) 長度必須為 2，才執行 if 判斷式
        	// 將第一個元素分給 cash，第二個元素分給 rate
        	if(elementOfLinkedHashSet4Collecting.size() == 2) {
        		Iterator<Number> iteratorOfLinkedHashSet4Collecting = elementOfLinkedHashSet4Collecting.iterator();
        		int cash = iteratorOfLinkedHashSet4Collecting.next().intValue();
        		double rate = iteratorOfLinkedHashSet4Collecting.next().doubleValue();        		
        		double result = cash * rate;
        		total += result;
        		       	
        	}        	        	
        }
        System.out.println(total);
	}
}

/*
	Console:
			[[7.8, 8.7], [6.9, 9.6], [10.0, 100]]
			1118.5

*/