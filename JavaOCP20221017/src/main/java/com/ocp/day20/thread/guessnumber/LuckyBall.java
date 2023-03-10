package com.ocp.day20.thread.guessnumber;

import java.util.Random;

public class LuckyBall extends Thread {

	private String id_num;
	private String name;
	private int number;

	public LuckyBall(String id_num, String name, int number, String threadName) {
		super(threadName);
		this.id_num = id_num;
		this.name = name;
		this.number = number;
	}

	@Override
	public void run() {

		Algorithm();

	}

	private void Algorithm() {	
		String threadName = Thread.currentThread().getName();
		int limitedNumber = 10;
		for(int n = 1 ; n <= limitedNumber ; n++) {
			int generatedNumberByThread = new Random().nextInt(42)+1;
			if(generatedNumberByThread == this.number) {
				System.out.printf("[%s Guessed %d times] Congratulations! %s (ID: %s) got %d number same as Lucky Ball!\n", 
							       threadName, n, this.name, (this.id_num.substring(0, 1) + "..." + id_num.substring(6, 10)), this.number);
				break;
			} 
			if(n == limitedNumber) {
				System.out.printf("%s never got your number!\n", threadName);
			}
		}
	}
}
