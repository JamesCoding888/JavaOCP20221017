package com.ocp.day6.ScannerException;

/*
 	=================================================================
 	
 	final is a non-access modifier applicable only to the following:
 		
 		1) a variable: To Create an Constant Variable, and Must be initialized
 		   			 		   
 		2) a method: Prevent method Overriding
 		
 		3) a class: Prevent Inheritance
 	
 	=================================================================
 	
 	關於 final 變數之用法如下:
 		
 		1) 用來宣告一個類別、函數、或者變數
	
		2) 類別: 當宣告在類別上時，該類別就無法被繼承！
	
		3) 函數: 當一個函數被宣告為 final 時，則繼承他的子類別無法覆寫
		
	=================================================================
	
*/

// Prevent Inheritance (無法被繼承)
final class Alcoholic_Beverages{
	/*
	  A method of drinkAlcoholicBeveragesInDrivingCar (一支喝酒不開車之方法)
	    
	    1) This method Only could be invoked by "new Alcoholic_Beverages()"  
	       此方法只能用 "new Alcoholic_Beverages()" 來呼叫
	    
	    2) This method is NOT able to be Overrided, since the "final class Alcoholic_Beverages" Already is a Constant Class
		   不可被改寫，因為 "final class Alcoholic_Beverages" 已經係常數類別，無法被繼承，既然無法被繼承，怎能被改寫
	
		3) final variable Must be initialized at early beginning or inside Constructor
		   final 變數，必須被初始化，其初始化之方式有兩種，一種在一開始設計變數時就給定，另一種則是在建構子中
		   
	*/
	public void drinkAlcoholicBeveragesInDrivingCar() {
		System.out.println("Don't Drink And Drive !!! ");
	}
}

class Father{

	// final variable Must be initialized at early beginning or inside Constructor
	//
	final String carName = "Tesla";
	
	// Prevent method Overriding by child class (i.e., "public void driveCar(int speed)" of Son.class)
	// 函數被宣告為 final 時，則繼承他的子類別 (也就是 Son.class) 無法覆寫
	final public void driveCar(int speed) {
		System.out.printf("My %s could reach to %d miles per hour !\n", carName, speed);
	}
	
	
}

// Of the Inheritance - "extends", please take your time to study the package: com.ocp.day7
// 關於繼承之用法 (extends)，請閱讀 package: com.ocp.day7
class Son extends Father{
	
	// Cannot override the final method from Father
	/* Please remove the annonation of " '/'* ... *'/' " (請將註解移除，才能測出 error 的訊息)
		
		public void driveCar(int speed) { // Error here
			System.out.println("Sorry Son, you are too young to drive Car at this moment !");
		}
	
	*/
}

// The type IntroductionOfFinal class cannot be subclass of the "final class Alcoholic_Beverages"
// IntroductionOfFinal 類別，無法繼承 Alcoholic_Beverages 類別，因為 Alcoholic_Beverages 係個常數類別 (i.e., final class)，無法被繼承
public class IntroductionOfFinal 
//	extends Alcoholic_Beverages   // Please remove annotation of "//", then you will see error message
{ 

	// To Create an Constant Variable
	// final variable Must be initialized at early beginning or inside Constructor
	final int CONSTANT_VARIABLE; 
	
	public IntroductionOfFinal() {
		this.CONSTANT_VARIABLE = 60;
	}
	
	public static void main(String[] args) {
		IntroductionOfFinal i = new IntroductionOfFinal();
		new IntroductionOfFinal();
		new Son().driveCar(i.CONSTANT_VARIABLE);
		new Alcoholic_Beverages().drinkAlcoholicBeveragesInDrivingCar();
	}
	
	
}

/*
	Console:
			My Tesla could reach to 60 miles per hour !
			Don't Drink And Drive !!! 
 

			
	
*/
