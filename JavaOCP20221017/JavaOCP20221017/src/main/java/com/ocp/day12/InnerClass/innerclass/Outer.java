package com.ocp.day12.InnerClass.innerclass;
/*
 	============================================================================================================================= 
 	Rules of Local Inner Class:

	1) The scope of the local inner class is restricted to the block they are defined in.
	
	2) A local inner class cannot be instantiated from outside the block where it is created in.
	   For an example of following: 	
	   		
	   		OuterClassA {
 	   		
 	   			new InnerClassB(); // Unallowable  
 	   			
 	   			InnerClassB {
 	   			  
 	   			}
 	   		}
 	   		
	3) Till JDK 7, the Local inner class can access only the final local variable of the enclosing block. 
	   However, From JDK 8, it is possible to access the non-final local variable of enclosing block in the local inner class.
	   
	4) A local class has access to the members of its enclosing class.
	
	5) Local inner classes can extend an abstract class or implement an interface. 
 	=============================================================================================================================
 	區域內部類別之規定：
 	
 	1) 內部類別中，限制了開發者對於變數的定義
 	
 	2) 區域內部類別，不可由內部類別以外，來對內部類別初始化。
 	   例如:
 	   		OuterClassA {
 	   		
 	   			new InnerClassB(); // Unallowable  
 	   			
 	   			InnerClassB {
 	   			  
 	   			}
 	   		}
 	 
 	 3) JDK 1.7 以前 (含 1.7 version)，區域內部類別，只能調用其包覆的 "final 區域變數"。但到了 JDK 1.8 以上 (含 1.8 version)
 	    區域內部類別，不僅能調用其包覆的 final 區域變數，還能調用在區域內部類別中，其包覆的 "非 final 區域變數"。 
 	 		
 	 4) 區域類別可調用其成員 (變數/方法)
 	 
 	 5) 區域內部類別可繼承 "抽象類別" 或 "介面類別" 
 	=============================================================================================================================
 	
 	
*/
// Outer class (外部類別)
public class Outer {
	
	private String serialNumber;   // Serial number of Card
	
	// "static member variable" could be in the Outer class (類別變數可放置於外部類別)
	// No. of Card
	static int number = 100;       
	
	public Outer(String serialNumber) {
	
		this.serialNumber = serialNumber;
	
	}
	
	// Generally speaking of the general Inner Class, the "static member" - "static int variable" or "static void method(){ ... }" NOT Allowable !
	// 一般來說，一般內部類別中，不允許『靜態的成員變數』，也就是 "static int variable" 或 "static void method(){ ... }"
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
		
		/*	In the general Inner Class, "static member" NOT Allowable
			
			public static void method() {
				
			}
			 
		*/
		
		public void print() {
			
			String name = "Card Info.";
			
			System.out.printf("%s: No.: %s, Name on Card: %s, Serial-Number: %s, Confidentiality Level: %d\n", name, Outer.number, this.nameOfCardOwner, serialNumber, confidentialityLevel);
			
			System.out.printf("No. of Card: %d", number);
			
		}	
	}
}
