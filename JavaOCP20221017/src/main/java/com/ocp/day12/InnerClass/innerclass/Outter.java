package com.ocp.day12.InnerClass.innerclass;

public class Outter {
	
	private String serialNumber;
	
	static int number = 100;
	
	public Outter(String serialNumber) {
	
		this.serialNumber = serialNumber;
	
	}
	
	public class InnerCardOwner {
		
//		static int quantityOfCard = 1;  // How many q'ty of card does owner have?  
	
		private String nameOfCardOwner;     // name of VISA card
		
		private int confidentialityLevel;  // confidentiality level of card (卡片機密等級) 
		
		public InnerCardOwner(String nameOfCardOwner, int confidentialityLevel) {
			
			this.nameOfCardOwner = nameOfCardOwner;
			this.confidentialityLevel = confidentialityLevel;
			
		}
		
		public void print() {
			
			String name = "Card Info.";
			
			System.out.printf("%s: No.: %s, Name on Card: %s, ID: %s, Confidentiality Level: %d\n", name, Outter.number, this.nameOfCardOwner, serialNumber, confidentialityLevel);
			
		}
	}
}
