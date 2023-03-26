package com.ocp.day20.synchronizedmethod.cookiesdispatcher;

public class Eat implements Runnable {
	
	private Cookies cookies;
	
	public Eat(Cookies cookies) {
		this.cookies = cookies;
	}
	
	@Override
	public void run() {
		try {
			for(int number = 1 ; number <= 10 ; number++) {
				cookies.eat(number);	
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
