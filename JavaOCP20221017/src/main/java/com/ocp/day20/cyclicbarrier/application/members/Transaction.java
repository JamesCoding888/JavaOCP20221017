package com.ocp.day20.cyclicbarrier.application.members;
/*
	For a group of members to start a transaction, you can use a CyclicBarrier. 
	
	Here is an example of how to use a CyclicBarrier to ensure that all members have arrived at a transaction point before starting the transaction.
	
	
*/
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Transaction {
	// The number of members participating in the transaction
	private static final int NUM_MEMBERS = 5;

	public static void main(String[] args) {
		// Create a new CyclicBarrier with a count of NUM_MEMBERS
		// Each member is represented by a Member object, which implements the Runnable interface. 
		CyclicBarrier barrier = new CyclicBarrier(NUM_MEMBERS);

		// Create and start the threads for the members
		for (int i = 0; i < NUM_MEMBERS; i++) {
			new Thread(new Member(barrier)).start();
		}
	}

	private static class Member implements Runnable {
		private final CyclicBarrier barrier;

		public Member(CyclicBarrier barrier) {
			this.barrier = barrier;
		}

		@Override
		public void run() {
			try {
				// Each member arrives at the transaction point and waits for the others by calling barrier.await()
				System.out.println("Member " + Thread.currentThread().getId() + " arrived at transaction point.");
				barrier.await();

				// All members have arrived, so the transaction can start
				System.out.println("Transaction started by Member " + Thread.currentThread().getId());
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}
	}
}
/*
	Console:
			Member 17 arrived at transaction point.
			Member 15 arrived at transaction point.
			Member 16 arrived at transaction point.
			Member 14 arrived at transaction point.
			Member 18 arrived at transaction point.
			Transaction started by Member 18
			Transaction started by Member 15
			Transaction started by Member 16
			Transaction started by Member 14
			Transaction started by Member 17
*/