package com.ocp.day20.cyclicbarrier.application.bank;
/*
 	CyclicBarrier is a synchronization aid in Java that allows a set of threads to wait for each other to reach a certain point of execution before continuing.  
 	
 	It is a barrier that all threads must wait at until all of them have reached that point, and then the barrier is released, and all threads can continue executing.

	A CyclicBarrier is initialized with a fixed number of parties, which is the number of threads that need to reach the barrier. 
	
	As each thread arrives at the barrier, it calls the await() method, which causes it to wait until all other threads have also arrived at the barrier. 
	
	Once all the threads have arrived, the barrier is released, and all threads can continue executing.

	
	Application of CyclicBarrier:

		1) CyclicBarrier can be useful in situations where you have multiple threads that need to work in parallel on a particular task and need to synchronize their execution at certain points,
		
		   and then wait for each other to complete before moving on to the next stage of processing.
	
		2) It is also useful in cases where you need to split a larger task into smaller sub-tasks and want to wait until all sub-tasks are completed before proceeding at a later stage.	
*/
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
public class CyclicBarrierDemo {
	public static void main(String[] args) {
		/*
			Runnable runnable = () -> new Runnable() {
				@Override
				public void run() {
					System.out.println("Start Transaction");
				}
			};
		*/
		// Java 1.8 - Lambda Expression
		Runnable runnable = () -> System.out.println("All JointAccount are Synced!");
		
		// java.util.concurrent.CyclicBarrier.CyclicBarrier(int parties, Runnable barrierAction)
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, runnable);

		Thread[] threads = { new Thread(new JointAccountWithCyclicBarrier(cyclicBarrier), "James"),
				             new Thread(new JointAccountWithCyclicBarrier(cyclicBarrier), "Marry"),
				             new Thread(new JointAccountWithCyclicBarrier(cyclicBarrier), "Elon") };

		Arrays.stream(threads).forEach(Thread::start);

//		Arrays.stream(threads).forEach(t -> t.start());
	}
}

/*
	Console:
			[James] Start Transaction
			[Elon] Start Transaction
			[Marry] Start Transaction
			[Marry] Enter account's information
			[James] Enter account's information
			[Elon] Enter account's information
			All JointAccount are Synced!
			[Elon_Arrival_Index: 0] Withdraw money...
			[Elon] - Transaction Closely!
			[Marry_Arrival_Index: 2] Withdraw money...
			[Marry] - Transaction Closely!
			[James_Arrival_Index: 1] Withdraw money...
			[James] - Transaction Closely!


*/