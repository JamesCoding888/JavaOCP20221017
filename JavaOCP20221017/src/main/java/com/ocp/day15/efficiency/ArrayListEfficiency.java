package com.ocp.day15.efficiency;
/*
	List:
	single test
	13:16:22.531413 -> 13:16:22.542954 = -0.011 secs 
	
	pause 2secs
	13:20:47.089430 -> 13:20:49.181771 = -0.092 secs
	13:21:28.200123 -> 13:21:30.294629 = -0.094 secs
	13:21:51.716034 -> 13:21:53.792272 = -0.076 secs
*/


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
public class ArrayListEfficiency {
	public static void main(String[] args) {
		LocalTime begin = LocalTime.now();	
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		List<String> list = new ArrayList<>();
		for(int n = 1 ; n<= 100000 ; n++) {
			list.add("1");			
		}	
		System.out.println(list);				
		LocalTime end = LocalTime.now();
		System.out.println(begin);	
		System.out.println(end);						
	}
}
