package com.ocp.day20.synchronizedmethod;
/*
 	How to make non-synchronized method to be likely with same synchronized function? 
 	
 	Following consoles of view for your understanding: 
		
		1) Console 1: No invocation of .join()
				
				Result: With huge difference from 20_000
				
		2) Console 2: invocation of .join() but no Thread.sleep(100)
		
				Result: With slightly difference
		
		3) Console 3: invocation of .join() and also execute Thread.sleep(100)
		
				Result: Synchronized!!! 
*/

class SynchronizedCounter2 extends Thread {

	private int count = 0;
	
		// non-synchronized keyword
		public void increment() {
			count++;
		}
	
		public void decrement() {
			count--;
		}
	
		public int getCount() {
			return count;
		}
		
	public static void main(String[] args) {

		SynchronizedCounter2 counter1 = new SynchronizedCounter2();
		SynchronizedCounter2 counter2 = new SynchronizedCounter2();
		SynchronizedCounter2 counter3 = new SynchronizedCounter2();
		// ********************************************************************************************************
		
		// Console 1:
		// Create and start two threads that increment the counter
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				counter1.increment();
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				counter1.increment();
			}		
		});
		thread1.start();
		thread2.start();		
		
		// Print the final count
		System.out.println("[Console 1] Final count: " + counter1.getCount());
		// ********************************************************************************************************
		

		
		// Console 2:
		// Create and start two threads that increment the counter
		Thread thread3 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				counter2.increment();
			}
		});
		Thread thread4 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				counter2.increment();
			}		
		});
		thread3.start();
		thread4.start();		
		try {
			thread4.join();	
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		// Print the final count
		System.out.println("[Console 2] Final count: " + counter2.getCount());
		// ********************************************************************************************************

		
		
		// Console 3:
		// Create and start two threads that increment the counter
		Thread thread5 = new Thread(() -> {
//			System.out.println("3");
			for (int i = 0; i < 10000; i++) {
				counter3.increment();
			}
//			System.out.println("5");
		});
		Thread thread6 = new Thread(() -> {
			try {
				System.out.println("Awaiting 0.1 seconds for thread5 being finished, and then thread6 continues!");
				Thread.sleep(100); // Strictly advice to add Thread.sleep(100) for awaiting thread5 to be done, completely! 
				for (int i = 0; i < 10000; i++) {
					counter3.increment();
				}
//				System.out.println("6");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}			
		});
//		System.out.println("1");
		thread5.start();
//		System.out.println("2");
		thread6.start();		
		try {
//			System.out.println("4");
			thread6.join();	
//			System.out.println("7");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		// Print the final count
		System.out.println("[Console 3] Final count: " + counter3.getCount());
		// ********************************************************************************************************

		
	}
}

/*
	Console 1:
		
			[Console 1] Final count: 1055
	Console 2:
		
			[Console 2] Final count: 15840
	
	Console 3 (w/ numeric value):
			1
			2
			3
			4
			Awaiting 0.1 seconds for thread5 being finished, and then thread6 continues!
			5
			6
			7
			[Console 3] Final count: 20000
	
	Console 3 (w/o numeric value):
			[Console 1] Final count: 2205
			[Console 2] Final count: 16893
			Awaiting 0.1 seconds for thread5 being finished, and then thread6 continues!
			[Console 3] Final count: 20000


*/