package com.ocp.day14.pojo;

import java.util.Objects;

public class NumNonPOJOWithoutHashCode {
	private int cash;
	private double rate;
	
	public NumNonPOJOWithoutHashCode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NumNonPOJOWithoutHashCode(int cash, double rate) {
		super();
		this.cash = cash;
		this.rate = rate;
	}
	
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumNonPOJOWithoutHashCode other = (NumNonPOJOWithoutHashCode) obj;
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
	
//	/*	For checking the result of hashCode, please hide the following "public String toString(){ ... }"
		
		@Override
		public String toString() {
			return "num [cash=" + cash + ", rate=" + rate + "]";
		} 
//	*/	
}
