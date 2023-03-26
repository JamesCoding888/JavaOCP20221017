package com.ocp.day20.synchronizedmethod.cookiesdispatcher;
/*
 * This is a class that tests the Cookies class using two threads: 
 * 		
 * A "owner" thread that puts cookies on the plate and a "dog" thread that eats cookies from the plate.
 * 
 * The main() method creates a Cookies object, then creates two Runnable objects (Put and Eat) that take the Cookies object as a parameter. 
 * 
 * These Runnable objects define the behavior of the threads.
 * 
 * The Thread objects are then created, passing in the Runnable objects as parameters. 
 * 
 * The start() method is then called on each Thread object to execute the threads
 * 
 * Overall, this class tests the synchronization of the eat() and put() methods in the Cookies class to ensure that the dog and the owner interact with the plate of cookies correctly.
 * 
 */
public class CookieNotifyTest {
	public static void main(String[] args) {
		Cookies cookies = new Cookies();
		// Define the job of threads
		Runnable put = new Put(cookies);
		Runnable eat = new Eat(cookies);
		// Assign the job into the Thread
		Thread owner = new Thread(put);
		Thread dog = new Thread(eat);
		// Execute
		dog.start();
		owner.start();
	}
}

/*

	Console:	
			Owner puts 1 cookies on the plate
			Doggy ate 1 cookies on the plate
			Owner puts 2 cookies on the plate
			Doggy ate 2 cookies on the plate
			Owner puts 3 cookies on the plate
			Doggy ate 3 cookies on the plate
			Owner puts 4 cookies on the plate
			Doggy ate 4 cookies on the plate
			Owner puts 5 cookies on the plate
			Doggy ate 5 cookies on the plate
			Owner puts 6 cookies on the plate
			Doggy ate 6 cookies on the plate
			Owner puts 7 cookies on the plate
			Doggy ate 7 cookies on the plate
			Owner puts 8 cookies on the plate
			Doggy ate 8 cookies on the plate
			Owner puts 9 cookies on the plate
			Doggy ate 9 cookies on the plate
			Owner puts 10 cookies on the plate
			Doggy ate 10 cookies on the plate

*/