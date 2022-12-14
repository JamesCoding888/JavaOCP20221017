package com.ocp.day14.hashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetWrongDemo {
	public static void main(String[] args) {
		Set hashSet = new HashSet();
		List list = new ArrayList();
//		hashSet.add(1);
//		hashSet.add(2);
//		hashSet.add(3);
//		hashSet.add(4);
//		hashSet.add(5);
//		hashSet.add(6);
//		hashSet.add(7);
//		hashSet.add(8);
//		hashSet.add(9);
//		hashSet.add(10);
//		hashSet.add(11);
		int num;
		for(int n=1; n<=100; n++) {
			num = new Random().nextInt(10) + 1 ;
			list.add(num);
			hashSet.add(num);
		}
		
		System.out.println(list);
		System.out.println(hashSet);
//		for(int n=1 ; n<=11 ; n++) {			
//			int num = new Random().nextInt(10) + 1;
//			hashSet.add(num);
//			System.out.println(num + ":" + hashSet);
//		}
		// HashSet(元素無順序性)
		// LinkedHashSet(元素有順序性)
//		Set<Integer> hashSet = new HashSet<>();
//		for(int n=1 ; n<=5000 ; n++) {
////			Set<Integer> hashSet = new HashSet<>();
////			int num = new Random().nextInt(10) + 1;
//			hashSet.add(new Random().nextInt(10) + 1);					
//			System.out.println(hashSet);
//		}
		
		

		
		/*
		Set subject = new LinkedHashSet();
		subject.add("Chinese");
		subject.add(100);
		subject.add("English");
		subject.add(80);
		
		System.out.println(subject);
		*/
	}
}
