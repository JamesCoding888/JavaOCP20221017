package com.ocp.day15.efficiency;

/* 	
	Queue:
 	single test
 	13:18:33.792905 -> 13:18:33.804692 = -0.012 secs
 	
 	pause 2secs
 	13:23:01.185719 -> 13:23:03.254943 = -0.069224 secs
 	13:24:24.484999 -> 13:24:26.548896 = -0.063897 secs 
	15:05:45.379541 -> 15:05:47.463576
	

*/

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;
public class QueueEfficiency {
	public static void main(String[] args) {
		LocalTime begin = LocalTime.now();	
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		Queue<String> elementsForAdd = new LinkedList <>();		
		for(int n = 1 ; n<= 100000 ; n++) {
			elementsForAdd.add("1");			
		}
		System.out.println(elementsForAdd);
		LocalTime end = LocalTime.now();
		System.out.println(begin);	
		System.out.println(end);		
	}
}
