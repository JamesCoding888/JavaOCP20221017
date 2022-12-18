package com.ocp.day15.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new LinkedList();
		list.add("james");
		list.add("betty");
		list.add("david");
		list.add("Tom");
		System.out.println(list);
		
		ListIterator listIterator = list.listIterator();
		
		// Operations that INDEX into the list will TRAVERSE the list from the BEGINNING or the END, 
		// whichever is Closer to the Specified INDEX
		while(listIterator.hasNext()) {
			int index = listIterator.nextIndex();
			String name = (String)listIterator.next(); // 為什麼我需要 downcasting ???
			System.out.printf("Index -> %d : name -> %s\n", index, name);			
		}
		
		while(listIterator.hasNext()) {
			int index = listIterator.nextIndex();
			String name = (String)listIterator.next(); // 為什麼我需要 downcasting ???
			System.out.printf("Index -> %d : name -> %s\n", index, name);			
		}
		
		while(listIterator.hasPrevious()) {
			int index = listIterator.previousIndex();
			String name = (String)listIterator.previous(); // 為什麼我需要 downcasting ???
			System.out.printf("Index -> %d : name -> %s\n", index, name);			
		}
	}
}
