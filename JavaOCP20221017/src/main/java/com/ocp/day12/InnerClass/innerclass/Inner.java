package com.ocp.day12.InnerClass.innerclass;

public class Inner {
	
	private String serialNumber;
	
	static int number = 100;
	
	public Inner(String serialNumber) {
	
		this.serialNumber = serialNumber;
	
	}
	
	public class CardOwner {
		
//		static int quantityOfCard = 1;  // How many q'ty of card does owner have?  
	
		private String nameOfCardOwner;     // VISA
		
		private int confidentialityLevel;  // 卡片機密等級 
		
		public CardOwner(String nameOfCardOwner, int confidentialityLevel) {
			
			this.nameOfCardOwner = nameOfCardOwner;
			this.confidentialityLevel = confidentialityLevel;
			
		}
		
		public void print() {
			
			String name = "Card Info.";
			
			System.out.printf("%s: No.: %s, Name on Card: %s, ID: %s, Confidentiality Level: %d\n", name, Inner.number, this.nameOfCardOwner, serialNumber, confidentialityLevel);
			
		}
	}
}
