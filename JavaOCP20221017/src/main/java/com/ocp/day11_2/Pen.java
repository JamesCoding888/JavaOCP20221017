package com.ocp.day11_2;


import java.util.Objects;

public class Pen {
	
	private String color;
	
	private int price;

	public Pen(String color, int price) {
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
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		return Objects.equals(color, other.color) && price == other.price;
	}
	
	@Override
	public String toString() {
		return "Pen [color = " + color + ", price = " + price + "]";
	}	
}	
