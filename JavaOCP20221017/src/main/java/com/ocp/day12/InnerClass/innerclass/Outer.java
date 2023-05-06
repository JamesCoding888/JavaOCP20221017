package com.ocp.day12.InnerClass.innerclass;
/*
 	============================================================================================================================= 
 	Rules of Local Inner Class:

	1) The scope of the local inner class is indeed restricted to the block they are defined in. 
	   It means that the class can only be accessed and used within the block of code where it is defined.
	
	2) A local inner class cannot be instantiated from outside the block where it is created in.
	   For an example of following: 	
	   		
	   		OuterClassA {
 	   		
 	   			new InnerClassB(); // Unallowable  
 	   			
 	   			InnerClassB {
 	   			  
 	   			}
 	   		}
 	   		
	3) Prior to JDK 8, local inner classes could only access the final local variables of the enclosing block. 
	   However, starting from JDK 8, they can also access non-final local variables. 
	   This allows more flexibility in using local variables within the inner class.
	   
	4) A local class (inner class) has access to the members of its enclosing class. 
	   In the given example, the InnerCardOwner class has access to the private serialNumber field of the Outer class.
	
	5) Local inner classes can extend an abstract class or implement an interface. 
	   This enables the inner class to inherit or implement behavior defined in the abstract class or interface.
 	=============================================================================================================================
 	區域內部類別之規定：
 	
 	1) 區域內部類別的範圍限定在其所定義的區塊內。這意味著該類別只能在定義它的程式碼區塊內部被存取和使用。
 	
 	2) 區域內部類別不能從創建它的區塊外部實例化。在提供的例子中，試圖在 OuterClassA 區塊之外創建 InnerClassB 的實例是不允許的。
 	   例如:
 	   		OuterClassA {
 	   		
 	   			new InnerClassB(); // Unallowable  
 	   			
 	   			InnerClassB {
 	   			  
 	   			}
 	   		}
 	 
 	 3) 在 JDK 8 之前，區域內部類別只能存取封閉區塊的 final 區域變數。
 	    然而，從 JDK 8 開始，它們還可以存取非 final 區域變數。這樣可以更靈活地在內部類別中使用區域變數。
 	 		
 	 4) 區域類別（內部類別）可以調用其封閉類別的成員 (變數/方法)。
 	    在給定的例子中，InnerCardOwner 類別可以存取 Outer 類別的私有 serialNumber 欄位。
 	 
 	 5) 區域內部類別可繼承 "抽象類別" 或 "實作介面"。
 	    這使得內部類別可以繼承或實作在抽象類別或介面中定義的行為。
 	 
 	  
 	 
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
