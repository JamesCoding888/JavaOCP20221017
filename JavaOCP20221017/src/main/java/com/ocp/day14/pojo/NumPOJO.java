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
	
	/*  2) Override the method of "public int hashCode(){ ... }"
		
		// "The value 31 was chosen because it is an odd prime. If it were even and the multiplication overflowed, 
	    // information would be lost, because multiplication by 2 is equivalent to shifting. 
	    // The advantage of using a prime is less clear, but it is traditional. 
	    // A nice property of 31 is that the multiplication can be replaced by a shift 
	    // and a subtraction for better performance on some architectures: 31 * i == (i << 5) - i. 
	    // Modern VMs do this sort of optimization automatically." - refer to "Effective Java (3rd Edition), Joshua Bloch"
	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Objects.hash(cash, rate);			
			return result;
		}
	*/
	 	
//	/*	3) Standard implementations for overriding the method of "public int hashCode(){ ... }"
	 	@Override
	 	public int hashCode() {
	 	    int hash = 7;
	 	    hash = 31 * hash + (int) rate;
	 	    hash = 31 * hash + ((Integer)cash == null ? 0 : ((Integer)cash).hashCode());
	 	    return hash;
	 	}
//	*/	
		
	
	
	
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
