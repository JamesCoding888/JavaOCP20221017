package com.ocp.day20.runnable.application;
/*
 	For more understanding of synchronized method, please read the SynchronizedCounter.java, firstly. 
 	
*/
public class ATM {
	public static void main(String[] args) {

		// Instantiate the field of balance
		JointAccount jointAccount = new JointAccount(10_000);

		// Assign an activity for each instance of runnable
		Runnable runnable1 = new Withdraw(jointAccount, 2500);
		Runnable runnable2 = new Withdraw(jointAccount, 5000);
		Runnable runnable3 = new Withdraw(jointAccount, 5000);
		

		/*
	     * Allocates a new {@code Thread} object. This constructor has the same
	     * effect as {@linkplain #Thread(ThreadGroup,Runnable,String) Thread}
	     * {@code (null, target, name)}.
	     *
	     * @param  target
	     *         the object whose {@code run} method is invoked when this thread
	     *         is started. If {@code null}, this thread's run method is invoked.
	     *
	     * @param  name
	     *         the name of the new thread
       
       		public Thread(Runnable target, String name) {
       			this(null, target, name, 0);
       		}
    
		 */
		// Assign threadName to implement the each activity
		Thread thread1 = new Thread(runnable1, "James");
		Thread thread2 = new Thread(runnable2, "Marry");
		Thread thread3 = new Thread(runnable3, "Elon");
		
		// Start each of thread
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

/*
	 Console 1:
			
				James expected to withdraw $2500 and currently balance: $10000
				[Transaction Successfully] James withdraws $2500 and balance: $7500
				[Transaction Successfully] James withdraws $2500 and balance: $5000
				[Transaction Successfully] James withdraws $2500 and balance: $2500
				[Transaction Successfully] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				Marry expected to withdraw $5000 and currently balance: $10000
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				Elon expected to withdraw $5000 and currently balance: $10000
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0

		
	Console 2:
	
				James expected to withdraw $2500 and currently balance: $10000
				[Transaction Successfully] James withdraws $2500 and balance: $7500
				[Transaction Successfully] James withdraws $2500 and balance: $5000
				[Transaction Successfully] James withdraws $2500 and balance: $2500
				[Transaction Successfully] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				[Transaction Rollback] James withdraws $2500 and balance: $0
				Marry expected to withdraw $5000 and currently balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				[Transaction Rollback] Marry withdraws $5000 and balance: $0
				Elon expected to withdraw $5000 and currently balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0
				[Transaction Rollback] Elon withdraws $5000 and balance: $0


*/