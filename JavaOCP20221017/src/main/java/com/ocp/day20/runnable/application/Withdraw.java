package com.ocp.day20.runnable.application;

public class Withdraw implements Runnable{

	private JointAccount jointAccount;
	private int amount;
	
	public Withdraw(JointAccount jointAccount, int amount) {
		this.jointAccount = jointAccount;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		jointAccount.withdraw(amount);
	}
}
