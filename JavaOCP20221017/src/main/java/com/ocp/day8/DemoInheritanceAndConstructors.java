package com.ocp.day8;

/*
	   A Java file contains only ONE public class with a particular name. 
	   If you create another class with same name it will be a duplicate class. 
	   Still if you try to create such class then the compiler will generate a compile time error.
	  
	   In fact, you can’t create TWO public classes in a single file, 
	   Only one class should be public and it should be the name of the class.
	   If you try to create two public classes in same file,
	   the compiler generates a compile time error.
	  
	   請讀者注意，Java 在進行 compiler 時，一個 Java 檔案中，只允許一個 public class，如果有兩個 public class，
	   compiler 是不會通過的
	  
	   E.g., class Father -> public class Father  // error
*/


class Love {
	// Global Variables (全域變數)
	int expectedNumberOfChild;
	int timeOfMakingLove;
	
	// A default constructor is a constructor which can be called with no arguments 
	// (either defined with an empty parameter list, or with default arguments provided for every parameter). 
	// 無參數默認建構子 (也就是無 "public" Love() { ... } )
	Love() {
		System.out.printf("爸爸還想要再生 %d 個孩子\n", expectedNumberOfChild);
		System.out.printf("今晚來點 %d 次狼～ 嘿嘿～\n", timeOfMakingLove);
	}

	// Constructor with argument (which is expectedNumberOfChild and timeOfMakingLove) 
	// 有參數建構子
	Love(int expectedNumberOfChild, int timeOfMakingLove) {
		this();
		this.expectedNumberOfChild = expectedNumberOfChild;
		this.timeOfMakingLove = timeOfMakingLove;
		System.out.printf("爸爸還想要再生 %d 個孩子\n", expectedNumberOfChild);
		System.out.printf("今晚來點 %d 次狼～ 嘿嘿～\n", timeOfMakingLove);
	}
	
}

class Father extends Love {
	// A default constructor is a constructor which can be called with no arguments 
	// (either defined with an empty parameter list, or with default arguments provided for every parameter). 
	// 無參數默認建構子 (也就是無 "public" Father() { ... } )
	Father() {
		this(30); 			
	}
	
	// Constructor with argument (which is ageOfFather)
	// 有參數建構子，將 ageOfFather 參數帶入
	Father(int ageOfFather) {
		// Invoke the Constructor with argument of Parent class (i.e., Love.class)
		// 呼叫父類別的有參數建構子
		super(1, 7);
		System.out.printf("爸爸今年 %d 歲\n", ageOfFather);
		
	}
}

// Inheritance of Father.class
// 繼承父類別
class Son extends Father {
	// Constructor with argument (which is ageOfSon)
	// 有參數建構子，將 ageOfSon 參數帶入
	Son(int ageOfSon){ 
		this(); // Invoke the non-Constructor of current class (i.e., Son.class) 呼叫同類別中的無參數建構子
		System.out.printf("兒子今年 %d 歲\n", ageOfSon);
	}
	
	// A default constructor is a constructor which can be called with no arguments 
	// (either defined with an empty parameter list, or with default arguments provided for every parameter). 
	// 無參數默認建構子 (也就是無 "public" Son() { ... } )
	Son() {
		/*
		   super() and this() keyword, both are used to make constructor calls, let's see the difference: 
		   1) While giving a following programming into Constructor as this(), super(), super( ... ) or this( ... ). 
		   	  JRE won't automatically add "super()" into Constructor.
		   2) super() is used to call non-Constructor of Parent’s class
		   2) this() is used to call the non-Constructor of Current class
		   3) this() or super() should be at first statement of Constructor 
		      and also both are NOT able to be used at same time !
		      
		      E.g.,
		      System.out.println("Compile Time Error");
		      super();		      
	 	   	
	 	   	  E.g.,
		      super();
		      this(10);
	 	   
	 	   讀者請留意 this() 和 super() 使用規定:
	 	   1) 建構子中，已經寫了 this()、super()、super( ... )、this( ... )，
	 	   	  JRE 不自動加上默認的 super() 至建構子中，因為系統判定開發者期望在宣告此建構子時，
	 	      將執行裡面的程式碼。
	 	   2) super() 呼叫父類別的無參數建構子
	 	   3) this() 呼叫同一個類別中的無參數建構子
	 	   3) super() 或 this() 不可同時並存在同一個建構子中 且 必須在建構子中的第一行，否則 compiler 不會過，如下程式碼
				  
		      E.g.,
		      System.out.println("Compile Time Error");
		      super();		      
	 	   	
	 	   	  E.g.,
		      super();
		      this(10);
		*/
		super(); // Invoke the non-Constructor method of Parent's class (Father.class) (呼叫父類別的無參數建構子)
	}
	
}


public class DemoInheritanceAndConstructors {
	// Entry-point
	// 程式進入點
	public static void main(String[] args) {
		// Constructors with arguments - int x
		// 有參數建構子
		Son son = new Son(10);
		System.out.println("兒子呀～ 不可以色色");
	}
	
}


/*
	Console:
			爸爸還想要再生 0 個孩子
			今晚來點 0 次狼～ 嘿嘿～
			爸爸還想要再生 1 個孩子
			今晚來點 7 次狼～ 嘿嘿～
			爸爸今年 30 歲
			兒子今年 10 歲
			兒子呀～ 不可以色色
		
*/
