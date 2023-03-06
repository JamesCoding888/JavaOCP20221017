package com.ocp.day14.hashSet;

import java.util.Iterator;  
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo2 {
	public static void main(String[] args) {		
		// Generic type
        Set<Number> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(90);
        scores.add(null);
        scores.add(80);
        System.out.println(scores);
		
        Iterator<Number> iterator1 = scores.iterator();
        while(iterator1.hasNext()) {
        	if(iterator1.next() == null) {
        		iterator1.remove();  // remove the element(s) of null
        	}
        }
        System.out.println(scores);
        
        // Calculate total score
        /* 
		   The element of Iterator can only be read from the beginning to the end, 			 
		   and also when we have already read the element, 
		   we cannot read the element repeatedly.
		   
		   Iterator 物件中的元素只能從頭讀到尾，且當我們已讀取過的元素，就不可將元素再讀取一次
		*/
        int sum1 = 0;            
        while (iterator1.hasNext()) {
        	sum1 += iterator1.next().intValue();
        }
        System.out.println("SumOfIterator2: " + sum1);
        
        int sum2 = 0;
        Iterator<Number> iterator3 = scores.iterator();
        while (iterator3.hasNext()) {
        	sum2 += iterator3.next().intValue();
        }
        
        System.out.println("SumOfIterator3: " + sum2);
        
        // Java 1.8 - Stream
        int sumInStandardSyntax = scores.stream().mapToInt((Number next) -> next.intValue()).sum();
        int sumInShorthandSyntax = scores.stream().mapToInt(Number::intValue).sum();
        System.out.println("SumOfStream: " + sumInStandardSyntax);
        System.out.println("SumOfStream: " + sumInShorthandSyntax);
	}
}

/*
	Console:
			[100, 90, null, 80]
			[100, 90, 80]
			SumOfIterator2: 0
			SumOfIterator3: 270
			SumOfStream: 270
			SumOfStream: 270

*/