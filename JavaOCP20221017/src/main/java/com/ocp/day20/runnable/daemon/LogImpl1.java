package com.ocp.day20.runnable.daemon;

public class LogImpl1 implements Runnable{
	
	@Override
	public void run() {
		while (true) {
			System.out.println("Daemon thread is running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
