package com.ocp.day20.threadpoolexecutor;

import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Task2 implements Runnable {
	
	@Override
    public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " -> Assign Task2 to thread pool");
        try {        	
        	/*
        	 * int randomNumber = new Random().nextInt(5) + 1;
        	 * Thread.sleep(randomNumber);
        	 */        	
        	TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        System.out.println(threadName + " -> Task2 is executed!");
    }
}
