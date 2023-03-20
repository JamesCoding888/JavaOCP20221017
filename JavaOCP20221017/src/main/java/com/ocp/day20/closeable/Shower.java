package com.ocp.day20.closeable;
class Worker extends Thread{
	
	@Override
	public void run() {
        System.out.println("5. Natural gas delivering...");
        for(int i=0;i<Integer.MAX_VALUE;i++); // 模擬忙碌的狀況
        System.out.println("6. Operator of gas delivered the natural gas to the destination and every devices are assembly well");
    }
}

class Father extends Thread {
	
	@Override
	public void run() {
		System.out.println("1. Dady goes home!");
		System.out.println("2. Dady needs to take a hot shower");
		System.out.println("3. Dady found the natural gas is exhausted");
		System.out.println("4. Dady asked dispatcher to deliver gas to home");
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
			1. Dady goes home!
			2. Dady needs to take a hot shower
			3. Dady found the natural gas is exhausted
			4. Dady asked dispatcher to deliver gas to home
			5. Natural gas delivering...
			6. Operator of gas delivered the natural gas to the destination and every devices are assembly well

*/
