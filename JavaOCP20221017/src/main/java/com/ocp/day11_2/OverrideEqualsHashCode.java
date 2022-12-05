package com.ocp.day11_2;
/*
 	====================================================================================
 	Sincerely recommended a Book for your reference - "Effective Java 3rd Edition" 
 	You will be even better to understand the "Hash Collision" and "hashCode algorithm"
 	====================================================================================
 	誠摯的推薦讀者一本書 - 『Effective Java 3rd Edition』
 	您將能夠更清楚的了解其『雜湊碰撞』和『hashCode 演算法』
 	
 	Link -> "https://www.amazon.com/Effective-Java-3rd-Joshua-Bloch/dp/0134685997"
 	====================================================================================
 	
*/

import java.util.Objects;

public class OverrideEqualsHashCode {
	
	private String color;
	
	private int price;

	public OverrideEqualsHashCode(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
//	/*  1) Override the method of "public int hashCode(){ ... }" 	 	
	 	
	 	@Override
		public int hashCode() {
			int hash = 5;
			hash = 17 * hash + Objects.hashCode(this.color);
			hash = 17 * hash + this.price;
			return hash;
		}
//	*/

	/*  2) Override the method of "public int hashCode(){ ... }"
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Objects.hash(color, price);			
			return result;
		}
	*/
	 	
	/*	3) Standard implementations for overriding the method of "public int hashCode(){ ... }"
	 	@Override
	 	public int hashCode() {
	 	    int hash = 7;
	 	    hash = 31 * hash + (int) price;
	 	    hash = 31 * hash + (color == null ? 0 : color.hashCode());
	 	    return hash;
	 	}
	*/	
	 	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OverrideEqualsHashCode other = (OverrideEqualsHashCode) obj;
		return Objects.equals(color, other.color) && price == other.price;
	}
	
	@Override
	public String toString() {
		return "OverrideEqualsHashCode [color = " + color + ", price = " + price + "]";
	}	
}	
