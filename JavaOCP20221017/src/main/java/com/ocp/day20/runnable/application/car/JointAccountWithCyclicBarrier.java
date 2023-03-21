package com.ocp.day20.runnable.application.car;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class JointAccountWithCyclicBarrier implements Runnable {

	private CyclicBarrier cyclicBarrier;

	public JointAccountWithCyclicBarrier(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("[%s] Start Transaction\n", tName);
		try {
			// To wait 100 milliseconds for all account of owners to start transaction
			Thread.sleep(new Random().nextInt(100));
			System.out.printf("[%s] Enter account's information\n", tName);
			/*
			 * @return the arrival index of the current thread, where index
			 * {@code getParties() - 1} indicates the first
			 * to arrive and zero indicates the last to arrive
			 */
			int arrivalIndex = cyclicBarrier.await(); // 等待是否達到 parties 的設置
			System.out.printf("[%s_Arrival_Index: %s] Withdraw money...\n", tName, arrivalIndex);
		} 
		/*
	     * @throws InterruptedException if the current thread was interrupted
	     *         while waiting
	     * @throws BrokenBarrierException if <em>another</em> thread was
	     *         interrupted or timed out while the current thread was
	     *         waiting, or the barrier was reset, or the barrier was
	     *         broken when {@code await} was called, or the barrier
	     *         action (if present) failed due to an exception
	     */
		catch(InterruptedException | BrokenBarrierException e) {
			System.out.printf("[%s] for %s!\n", e, tName);
		} 
		System.out.printf("[%s] - Transaction Closely!\n", tName);
	}
}
