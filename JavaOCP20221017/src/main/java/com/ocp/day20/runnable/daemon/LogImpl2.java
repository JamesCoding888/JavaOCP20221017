package com.ocp.day20.runnable.daemon;

public class LogImpl2 implements Runnable{
	
	private String threadName;
	
	public LogImpl2(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		
		logOfThread();
				
	}
	
	public void logOfThread() {
//		String threadName = Thread.currentThread().getName();
		if(Thread.currentThread().isDaemon()) {
			for(int n = 1 ; n <= 100 ; n++) {
				System.out.printf("Daemon thread of %s operating %d\n",this.threadName, n);
			}	
		} else {
			for(int n = 1 ; n <= 100 ; n++) {
				System.out.printf("User thread of %s operating %d\n", this.threadName, n);
			}
		}	
	}
}
