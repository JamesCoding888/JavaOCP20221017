package com.ocp.day15.efficiency;

/*
 	This session we will inspect the efficiency of vector, stack, queue, linkedhashset, linkedlist, iterator 	
	
	List:
	single test
	13:16:22.531413 -> 13:16:22.542954 = -0.011 secs 
	
	pause 2secs
	13:20:47.089430 -> 13:20:49.181771 = -0.092 secs
	13:21:28.200123 -> 13:21:30.294629 = -0.094 secs
	13:21:51.716034 -> 13:21:53.792272 = -0.076 secs
	===============================================
 	Queue:
 	single test
 	13:18:33.792905 -> 13:18:33.804692 = -0.012 secs
 	
 	pause 2secs
 	13:23:01.185719 -> 13:23:03.254943 = -0.069224 secs
 	13:24:24.484999 -> 13:24:26.548896 = -0.063897 secs 
	15:05:45.379541 -> 15:05:47.463576

	Refer to the following link:
	https://stackoverflow.com/questions/63097585/stack-implementation-java-linkedlist-vs-vector
	https://publicobject.com/2010/07/07/caliper_confirms_reality_linked_list_vs_array_list/
*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Testqueue {

	public static void main(String[] args) {
		LocalTime begin = LocalTime.now();	
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
//		Queue<String> elementsForAdd = new LinkedList <>();
		List<String> list = new ArrayList<>();
		
		
//		for(int n = 1 ; n<= 100000 ; n++) {
//			elementsForAdd.add("1");			
//		}
		for(int n = 1 ; n<= 100000 ; n++) {
			list.add("1");			
		}
//		System.out.println(elementsForAdd);
		System.out.println(list);				
		LocalTime end = LocalTime.now();
		System.out.println(begin);	
		System.out.println(end);		
		
		
	}
}
