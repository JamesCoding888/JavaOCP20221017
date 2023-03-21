package com.ocp.day20.runnable.application.bank;

public class JointAccount {
	private int balance;
	
	public JointAccount(int balance) {
		this.balance = balance;
	}
	
	// non-synchronized: Warning! Currently balance never being deducted - Console 1
//	public void withdraw(int amount) {
	
	// Must have "synchronized" for transaction - Console 2
	public synchronized void withdraw(int amount) // Another valid syntax like "synchronized public void withdraw(int amount)"
	{
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s expected to withdraw $%d and currently balance: $%d\n", threadName, amount, balance);

		for (int expiration = 0; expiration < 10; expiration++) {
			if (balance >= amount) {
				balance -= amount;
				System.out.printf("[Transaction Successfully] %s withdraws $%d and balance: $%d\n", threadName, amount, balance);
			} else {
				System.out.printf("[Transaction Rollback] %s withdraws $%d and balance: $%d\n", threadName, amount, balance);
			}
		}
	}
}
