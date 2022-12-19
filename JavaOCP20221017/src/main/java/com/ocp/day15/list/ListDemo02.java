package com.ocp.day15.list;

/*
	Of this sample code, we remind the developer shall NOT invoke method of ".remove(int index)" inside for-loop/for-each, because the following object of list is Dynamic.
		
		List<String> list = new LinkedList<>();
*/

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo02 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("james");
		list.add("betty");
		list.add(null);
		list.add(null);
		list.add("david");
		list.add("Tom");
		System.out.println(list);
		int size = list.size();
		
		/*	
			// Please remove the annotation here "/*", then run of this sample code on your IDE
		
			// java.lang.IndexOutOfBoundsException: Index: 5, Size: 5				
			
			// Notice here !!! 
			// The length of list is Dynamic, it's NOT supposed to invoke the .remove(int index) inside for-loop/for-each 
		
			for(int n = 0 ; n < size ; n++) {
				if(list.get(n) == null) {
					list.remove(n);	
					System.out.println(list);
				}						
			}	
		*/
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {		
			if(listIterator.next() == null) {
				listIterator.remove();	
				System.out.println(list);
			}
		}
	}
}

/*
	Console:
			[james, betty, null, null, david, Tom]
			[james, betty, null, david, Tom]
			[james, betty, david, Tom]

*/