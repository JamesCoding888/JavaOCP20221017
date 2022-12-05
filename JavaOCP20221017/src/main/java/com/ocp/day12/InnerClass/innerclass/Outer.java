package com.ocp.day12.InnerClass.innerclass;

// 外部類別
public class Outer {
	
	private String serialNumber;   // Serial number of Card
	
	// "static member variable" could be in the Outer class (類別變數可放置於外部類別)
	// No. of Card
	static int number = 100;       
	
	public Outer(String serialNumber) {
	
		this.serialNumber = serialNumber;
	
	}
	
	// Generally speaking of the general Inner Class, the "static member" NOT Allowable !
	// 一般來說，若是一般內部類別，不允許『靜態的成員變數』
	public class InnerCardOwner {
		
		// The field quantityOfCard CANNOT be declared static in a "non-static inner type", 
		// unless initialized with a constant expression without "static".
		/*
			static int quantityOfCard = 1;  // How many q'ty of card does owner have?  
		*/
		
		private String nameOfCardOwner;     // name of VISA card
		
		private int confidentialityLevel;  // confidentiality level of card (卡片機密等級) 
		
		public InnerCardOwner(String nameOfCardOwner, int confidentialityLevel) {
			
			this.nameOfCardOwner = nameOfCardOwner;
			this.confidentialityLevel = confidentialityLevel;
			
		}
		
		public void print() {
			
			String name = "Card Info.";
			
			System.out.printf("%s: No.: %s, Name on Card: %s, Serial-Number: %s, Confidentiality Level: %d\n", name, Outer.number, this.nameOfCardOwner, serialNumber, confidentialityLevel);
			
		}
	}
}
