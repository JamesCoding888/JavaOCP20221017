package com.ocp.day20.executor.scheduledexecutorservice;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lucky implements Callable<Integer> {
    @Override
    public Integer call() throws InterruptedException {
        //Thread.sleep(new Random().nextInt(10));
        Thread.sleep(500);
        int randomNumber = new Random().nextInt(100);
        System.out.println("The current thread name is: " + Thread.currentThread().getName());
        return randomNumber;
    }  
}