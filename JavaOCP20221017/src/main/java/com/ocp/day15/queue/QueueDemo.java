package com.ocp.day15.queue;

import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> elements = new LinkedList <>();
		elements.offer("1");
		elements.offer("2");
		elements.offer("3");
		System.out.println(elements);

	}

}
