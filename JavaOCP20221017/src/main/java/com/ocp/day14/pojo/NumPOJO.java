package com.ocp.day14.pojo;
/*
 	Description of POJO (Plain old Java object):
	 	
	 	1. The POJO class must be public and should not extend predefined classes.    
		
		2. It should not implement prespecified interfaces.     
		
		3. It should not have any prespecified annotation.       
		
		4. The object in the POJO Class can have any access modifies such as private, public, protected. But, all instance variables should be private for 
		   improved security of the project.
		
		5. It must have a public default constructor.
		
		6. It may have the arguments constructor.
	
		7. All objects must have some public Getters and Setters to access the object values by other Java Programs.
	
*/


import java.util.Objects;

// Please see the description above, for 1, 2 and 3 
public class NumPOJO {
	// Please see the description above, at 4
	private int cash;
	private double rate;
	
	// Please see the description above, at 5
	public NumPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Please see the description above, at 6
	public NumPOJO(int cash, double rate) {
		super();
		this.cash = cash;
		this.rate = rate;
	}
	
	// Please see the description above, at 7
   
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
	 	
	/*	3) Standard implementations for overriding the method of "public int hashCode(){ ... }"
	 	@Override
	 	public int hashCode() {
	 	    int hash = 7;
	 	    hash = 31 * hash + (int) rate;
	 	    hash = 31 * hash + ((Integer)cash == null ? 0 : ((Integer)cash).hashCode());
	 	    return hash;
	 	}
	*/	
	 	
//	/*	4) Standard implementations for overriding the method of "public int hashCode(){ ... }"
	    @Override
	    public int hashCode() {
	        int hash = 3;
	        hash = 67 * hash + this.cash;
	        hash = 67 * hash + (int) (Double.doubleToLongBits(this.rate) ^ (Double.doubleToLongBits(this.rate) >>> 32));
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
	
//	/*	For checking the result of hashCode, please hide the following "public String toString(){ ... }"
		
		@Override
		public String toString() {
			return "num [cash=" + cash + ", rate=" + rate + "]";
		} 
//	*/	
}
