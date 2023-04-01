package com.ocp.day20.threadpoolexecutor;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Task1 implements Runnable {

    @Override
    public void run() {        
    	 String threadName = Thread.currentThread().getName();
         System.out.println(threadName + " -> Assign Task1 to thread pool");
         try {        	
         	/*
         	 * int randomNumber = new Random().nextInt(5) + 1;
         	 * Thread.sleep(randomNumber);
         	 */        	
         	TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1);
         } catch (Exception e) {
         	e.printStackTrace();
         }
         System.out.println(threadName + " -> Task1 is executed!");
    }
}
