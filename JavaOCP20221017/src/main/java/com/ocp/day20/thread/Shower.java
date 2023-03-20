package com.ocp.day20.thread;
class Worker extends Thread{
	
	@Override
	public void run() {
        System.out.println("5. Bottled gas delivering...");
        for(int n=0 ; n<Integer.MAX_VALUE ; n++); 
        System.out.println("6. Operator delivered the bottled gas to the destination and every utilities are assembly well");
    }
}

class Father extends Thread {
	
	@Override
	public void run() {
		System.out.println("1. Daddy goes home!");
		System.out.println("2. Daddy needs to take a shower");
		System.out.println("3. Daddy found the bottled gas is exhausted");
		System.out.println("4. Daddy asked operator to deliver bottled gas to home");
		Worker worker = new Worker();
		worker.start();
	}
}

public class Shower {
	public static void main(String[] args) {
		new Father().start();
	}
}
/*
 
	Console
			1. Daddy goes home!
			2. Daddy needs to take a shower
			3. Daddy found the bottled gas is exhausted
			4. Daddy asked operator to deliver bottled gas to home
			5. Bottled gas delivering...
			6. Operator delivered the bottled gas to the destination and every utilities are assembly well

*/
