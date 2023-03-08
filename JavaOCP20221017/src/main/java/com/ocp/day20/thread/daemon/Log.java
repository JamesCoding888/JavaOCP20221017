package com.ocp.day20.thread.daemon;

public class Log extends Thread{

	@Override
	public void run() {
		logOfThread();
	}
	
	public void logOfThread() {
		String threadName = Thread.currentThread().getName();
		if(Thread.currentThread().isDaemon()) {
			for(int n = 1 ; n <= 100 ; n++) {
				System.out.printf("Daemon thread of %s operating %d\n",threadName, n);
			}	
		} else {
			for(int n = 1 ; n <= 100 ; n++) {
				System.out.printf("User thread of %s operating %d\n",threadName, n);
			}
		}	
	}
}
