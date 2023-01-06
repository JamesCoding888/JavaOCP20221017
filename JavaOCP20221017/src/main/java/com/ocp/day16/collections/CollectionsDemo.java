package com.ocp.day16.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		
		List<Integer> arrayList1 = new ArrayList<>();
		List<Integer> arrayList2 = new ArrayList<>();
		
		arrayList1.add(7);   //  7 % 3 = 1
		arrayList1.add(3);   //  3 % 3 = 0
		arrayList1.add(9);   //  9 % 3 = 0
		arrayList1.add(15);  // 15 % 3 = 0
		
		arrayList2.add(7);   //  7 % 3 = 1
		arrayList2.add(3);   //  3 % 3 = 0
		arrayList2.add(9);   //  9 % 3 = 0
		arrayList2.add(15);  // 15 % 3 = 0

		// **************************** Implementation of Comparator ****************************
		
		// Regarding the previously lecture on "Anonymous inner class" for implement of Comparator, 
		// please refer to TestAnonymousInnerSpeedLimits.java, at package: com.ocp.day12.anonymous.speedLimits		
		/*  Following statement of Anonymous Inner class, for your info.:
	 		An inner class declared without a Class name is 
			defined as an Anonymous Inner Class. 
			
			In case of anonymous inner classes, we "declare" and 
			"instantiate" them at the same time. 
		
			Generally speaking, they are used whenever you need to override the method of 
			"a class" or "an interface". 						
		*/
		Collections.sort(arrayList1, new Comparator<Integer>() {			
			
			// (1) ASCENDING order
//			/*
				@Override
				public int compare(Integer o1 , Integer o2) {				
					return o1 - o2;				
				}
//			*/
				
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
			/*
				@Override
				public int compare(Integer o1 , Integer o2) {				
					return (o2 % 3) - (o1 % 3);				
				}
			*/	
		});
		// print out the element(s) of arrayList based on the implementation of Comparator 
		System.out.println("Anonymous inner class for implementation of Comparator: " + arrayList1);
		
		
		// Lambda's implementation of Comparator
		// (1) ASCENDING order	
//		/*	
			Comparator<Integer> comparatorInAscendingOrder = (Integer o1, Integer o2) -> (o1 - o2);
			Collections.sort(arrayList2, comparatorInAscendingOrder);
//		*/
		// (2) DESCENDING order
		/*
			Comparator<Integer> comparatorInDescendingOrder = (Integer o1, Integer o2) -> (o2 - o1);
			Collections.sort(arrayList2, comparatorInDescendingOrder);
		*/
		// (3) ASCENDING order by "result of o % 3"
		/*
			Comparator<Integer> comparatorInAscendingOrderByＭodulo = (o1, o2) -> ((o1 % 3) - (o2 % 3));
			Collections.sort(arrayList2, comparatorInAscendingOrderByＭodulo);
		*/
		// (4) DESCENDING order by "result of o % 3"						
		/*
			Comparator<Integer> comparatorInDescendingOrderByＭodulo = (o1, o2) -> ((o2 % 3) - (o1 % 3));
			Collections.sort(arrayList2, comparatorInDescendingOrderByＭodulo);
		*/		
		System.out.println("Lambda's implementation of Comparator: " + arrayList2);
		
		// **************************** Implementation of BiConsumer ****************************
		
		
		
		
		
		
		
	}
}


/*
	**************************** Implementation of Comparator **************************** 
	
	Console (1): 
				Anonymous inner class for implementation of Comparator: [3, 7, 9, 15]
				Lambda's implementation of Comparator: [3, 7, 9, 15]
		
	Console (2): 
				Anonymous inner class for implementation of Comparator: [15, 9, 7, 3]
				Lambda's implementation of Comparator: [15, 9, 7, 3]
												
	Console (3): 				
				Anonymous inner class for implementation of Comparator: [3, 9, 15, 7]
				Lambda's implementation of Comparator: [3, 9, 15, 7]							
				
	Console (4):
				Anonymous inner class for implementation of Comparator: [7, 3, 9, 15]
				Lambda's implementation of Comparator: [7, 3, 9, 15]	
	
	**************************** Implementation of BiConsumer ****************************
				
				
				
				
				
				
		
*/