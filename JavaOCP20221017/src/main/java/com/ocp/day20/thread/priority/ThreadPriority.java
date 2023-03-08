package com.ocp.day20.thread.priority;

import com.ocp.day20.thread.daemon.Log;

public class ThreadPriority {

	public static void main(String[] args) {
		Log log1 = new Log();
		Log log2 = new Log();
		log1.setName("CPU1");
		log2.setName("CPU2");
		log1.setPriority(Thread.MIN_PRIORITY);
		log2.setPriority(Thread.MAX_PRIORITY);
		log1.start();
		log2.start();
	}

}
