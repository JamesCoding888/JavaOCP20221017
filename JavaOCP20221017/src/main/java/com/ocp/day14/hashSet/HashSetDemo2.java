package com.ocp.day14.hashSet;

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
		
	}
}
