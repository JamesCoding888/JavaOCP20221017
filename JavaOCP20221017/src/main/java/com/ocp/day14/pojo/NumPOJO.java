package com.ocp.day14.pojo;

import java.util.Objects;

public class NumPOJO {
	private int cash;
	private double rate;
	
	public NumPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NumPOJO(int cash, double rate) {
		super();
		this.cash = cash;
		this.rate = rate;
	}
	
	   
   
   	/*  1) Override the method of "public int hashCode(){ ... }"
   	 
	   	@Override
		public int hashCode() {
			return Objects.hash(cash, rate);
		}
   	*/
	
//	/*  2) Override the method of "public int hashCode(){ ... }"
	 
		@Override
	   	public int hashCode() {
	   		int hash = 3;
	        hash = 67 * hash + this.cash;
	        hash = 67 * hash + (int) (Double.doubleToLongBits(this.rate) ^ (Double.doubleToLongBits(this.rate) >>> 32));
	        return hash;
	   	}
//   	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumPOJO other = (NumPOJO) obj;
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
	
	/*	For checking the result of hashCode, please hide the following "public String toString(){ ... }"
		
		@Override
		public String toString() {
			return "num [cash=" + cash + ", rate=" + rate + "]";
		} 
	*/	
}
