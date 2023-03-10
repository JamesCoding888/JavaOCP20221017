package com.ocp.day20.thread.guessnumber;

public class Guesses {

	public static void main(String[] args) {
		new LuckyBall("A123456789", "James", 42, "CPU1").start();
		new LuckyBall("B123456788", "Marry", 39, "CPU2").start();
	}
}

/*
 
	The following console-line was trying to run on the application of 
	Guess.java in many times. You will find the different result 
	because of value of limitedNumber being given to 10.
	 
			Console 1:
					CPU2 never got your number!
					CPU1 never got your number!
			
			Console 2:
					[CPU2 Guessed 9 times] Congratulations! Marry (ID: B...6788) got 39 number same as Lucky Ball!
					CPU1 never got your number!
			
			Console 3:
					CPU1 never got your number!
					[CPU2 Guessed 8 times] Congratulations! Marry (ID: B...6788) got 39 number same as Lucky Ball!
			
			Console 4:
					[CPU1 Guessed 8 times] Congratulations! James (ID: A...6789) got 42 number same as Lucky Ball!
					[CPU2 Guessed 10 times] Congratulations! Marry (ID: B...6788) got 39 number same as Lucky Ball!

*/