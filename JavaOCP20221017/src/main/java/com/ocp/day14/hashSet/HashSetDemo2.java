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
        		iterator1.remove();  // remote the element(s) of null
        	}
        }
        System.out.println(scores);
        
        // Calculate total score
        int sumOfiterator2= 0;            
        while (iterator1.hasNext()) {
        	sumOfiterator2 += iterator1.next().intValue();
        }
        System.out.println("Sum: " + sumOfiterator2);
        int sumOfiterator3 = 0;
        Iterator<Number> iterator3 = scores.iterator();
        while (iterator3.hasNext()) {
        	sumOfiterator3 += iterator3.next().intValue();
        }
        
        System.out.println("Sum: " + sumOfiterator3);
        
        // int sum2 = scores.stream().mapToInt(next -> next.intValue()).sum();
        int sum2 = scores.stream().mapToInt(Number::intValue).sum();
        System.out.println(sum2);
	}
}
