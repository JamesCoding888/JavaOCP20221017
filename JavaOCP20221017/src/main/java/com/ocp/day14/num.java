package com.ocp.day14;

import java.util.Objects;

public class num {
	private int cash;
	private double rate;
	
	public num() {
		super();
		// TODO Auto-generated constructor stub
	}

	public num(int cash, double rate) {
		super();
		this.cash = cash;
		this.rate = rate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cash, rate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		num other = (num) obj;
		return cash == other.cash && Double.doubleToLongBits(rate) == Double.doubleToLongBits(other.rate);
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "num [cash=" + cash + ", rate=" + rate + "]";
	}
	
}
