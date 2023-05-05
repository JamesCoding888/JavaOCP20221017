package com.ocp.day8;

/*
	In Java, a source file can only contain one public class, and the name of that class must match the name of the file. If you try to 
  	create another public class with the same name in the same file, you will get a compile-time error. This is because Java uses the name 
  	of the public class to identify the file and to load the class into memory when it is needed.

  	It is possible to have multiple classes in a single file, but only one of them can be public. The other classes must have default 
  	(package-private) access or be explicitly declared as private or protected. These classes can be used within the same package, but they 
  	cannot be accessed from outside the package.
  
  	一個源文件只能包含一個 public 類，且該類的名稱必須與文件名匹配。如果您嘗試在同一文件中創建另一個具有相同名稱的 public 類，則會收到編譯時錯誤。這是因為 Java 使
  	用公共類的名稱來識別文件並在需要時加載類到內存中。
	
  	在同一個文件中可以有多個類，但其中只能有一個是 public。其他類必須具有默認（包私有）訪問權限，或者明確聲明為 private 或 protected。這些類可以在同一個包 
  	(package) 中使用，但無法從包外訪問。
 	
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
