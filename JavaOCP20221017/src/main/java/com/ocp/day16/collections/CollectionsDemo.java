package com.ocp.day16.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(7);   //  7 % 3 = 1
		arrayList.add(3);   //  3 % 3 = 0
		arrayList.add(9);   //  9 % 3 = 0
		arrayList.add(15);  // 15 % 3 = 0
		System.out.println(arrayList);
		
		// Traditional implementation of Comparator
		Collections.sort(arrayList, new Comparator<Integer>() {			
			
			// (1) ASCENDING order
			/*
				@Override
				public int compare(Integer o1 , Integer o2) {				
					return o1 - o2;				
				}
			*/
				
			// (2) DESCENDING order			
			/*
				@Override
				public int compare(Integer o1 , Integer o2) {				
					return o2 - o1;				
				}
			*/
			
			// (3) ASCENDING order by "result of o % 3"		
			/*
				@Override
				public int compare(Integer o1 , Integer o2) {				
					return (o1 % 3) - (o2 % 3);				
				}
			*/				
			
			// (4) DESCENDING order by "result of o % 3"		
//			/*
				@Override
				public int compare(Integer o1 , Integer o2) {				
					return (o2 % 3) - (o1 % 3);				
				}
//			*/	
		});
		// print out the element(s) of arrayList based on the implementation of Comparator 
		System.out.println(arrayList);
		
		
	}
}


/*
	Console (1): 
				[7, 3, 9, 15]
				[3, 7, 9, 15]
		
	Console (2): 
				[7, 3, 9, 15]
				[15, 9, 7, 3]
				
	Console (3): 				
				[7, 3, 9, 15]
				[3, 9, 15, 7]
				
	Console (4):
				[7, 3, 9, 15]
				[7, 3, 9, 15]

	 
*/