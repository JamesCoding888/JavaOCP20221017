# Java SE 11 Developer
------------------------------------------------------------------------------
> Toolkits
- Integrated Development Environment (IDE): Eclipse 2021-06
- JDK: Java SE 11
- Database: MySQLWorkbench 8.0.26 

> Recommended Book
- Java 8 Lambdas [[https://lemus.webs.upv.es/wordpress/wp-content/uploads/2018/03/java8lambdas.pdf](https://www.amazon.com/Java-Lambdas-Functional-Programming-Masses/dp/1449370772)]

> Certificates
- <img width="203" alt="Screen Shot 2022-12-02 at 12 37 42 AM" src="https://user-images.githubusercontent.com/83496093/205109003-2d5cff3b-67fc-4e48-a47a-78c8c57f00db.png">

> A kindly reminder of following annotation with "TBD" or "Continue", will need to be modified.
- Please ctrl + F to search for "TBD" and "Continue" string


------------------------------------------------------------------------------
#  Video of Each Lecture
> day1
-
> day2
-
> day3
-
> day4
-
> day5
-
> day6
-
> day7
-
> day8
-
> day9
-
> day10
-
> day11
-
> day12
-
> day13
-
> day14
- 
> day15
-
> day16
-
> day17
-
> day18
-
> day19
-
> day20
-
> day21
-



------------------------------------------------------------------------------
# day1 Java Basic
1. Set-up environment with Eclipse Workspace
2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day1">Lesson learned of following programming:</a>
> Hello.java:
- Description: 

		To make sure the whole system of Eclipse is functional work after running on this code.
		
		在 Eclipse Workspace 建立的新專案 Hello.java，並確認此程式可成功執行且印出 "Hello World"


> BMIUtil.java:
- Description: 

		Create an Util of BMI.
		
		建立 BMI 計算工具


> CalcBMI.java:
- Description: 
		
		Giving the both of BMI-method calculation but different concept.

		如 BMIUtil.java 所述， 此節調整為 BMI method 工具，供開發者使用


> CalcMath.java:
- Description: 
		
		This program is giving three design of methods (eg, calcSum, calcAvg and calcSD) to calculate the add-up score and average score and 
		standard deviation of students 

		此程式建立 calcSum、 calcAvg  calcSD 方法，來計算學生的加總分數、平均分數和標準差

------------------------------------------------------------------------------
# day2 Java Basic: 1-D array 
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day2">Lesson learned of following programming for Accessibility:</a>
> Let's talk about accessibilty of Java as following checklist. 
- 在探討 day2 的程式碼之前，請讀者留意 Java 的讀取權限，如圖示
![image](https://user-images.githubusercontent.com/83496093/197315755-e25fed8a-5e11-420d-9f72-a5748a1fcd3b.png)

- Description: 

		This lesson we introduce the accessibility of java from following sample code. 
		
		此課程介紹底下範例，讓讀者更清楚了解 Java 的讀取權限之應用
		1) Apple.java
		2) Banana.java
		3) Cherry.java
		4) Fruit.java


2. Lesson learned of the Application of Array:
> ArrayDemo1.java:
- Description: 

		This program will go to tell you how to initiate the array variable and check the length of Array object that has been initiated.
		
		本程式將說明如何將一維陣列初始化，並計算陣列物件的長度

> ArrayDemo2.java:
- Description: 

		1) This program goes to tell you how to use for-loop and for-Each to print out of value from Array object, and also giving a lecture on 
		   using length of Array object to print out the value of Array object.
		
		   介接如何使用 for-loop 和 for-each 的方式，將陣列中的值印出，另外方式是藉由抓取陣列的長度，將陣列的值印出
		
		2) Also, you will learn the Array API - Arrays.toString(name_of_ArrayObject), under "package java.util;".
		
		   將學到如何使用 Oracle 提供的 API - Arrays.toString(name_of_ArrayObject)，在 package java.util 中
		
		3) Also, you shall understand the modern Java 8 (Version: 1.8) that provides an API - 
		   Arrays.stream(name_of_ArrayObject).forEach(value_of_ArrayObject -> System.out.print(value_of_ArrayObject + ", ")), under "package 
		   java.util;".
		
		   介紹 Java 1.8 提供的 API - Arrays.stream(name_of_ArrayObject).forEach(value_of_ArrayObject -> System.out.print(value_of_ArrayObject + 
		   ", "))，在 Oracle 中的 package java.util，將陣列中的值印出 		

> ArrayDemo3.java:
- Description:

		Of this program, we design methods to get the result of Sum, Average, Maximum and Minimum value from Array object. Please see the 
		following methods that presented in this session 
		
		此程式建立了 4 個 method 去獲取分數之和、平均、最小值和最大值
		1) getSum(int[] array)
		2) getAvg(int[] array)
		3) getMin(int[] array)
		4) getMax(int[] array)

> ArrayDemo4.java:
- Description:


		Since you already understood of how to design your own method(s) as previously lecture, then plz check out the following API with 
		regards to "Arrays.stream" 
		
		讀者應能從上節 ArrayDemo3.java 了解如何自行建立 method(s)，本節將介紹如何使用 Arrays.stream 來實作 ArrayDemo3.java 提到的範例
		1) Arrays.stream(name_of_ArrayObject).count()
		2) Arrays.stream(name_of_ArrayObject).sum()
		3) Arrays.stream(name_of_ArrayObject).average().getAsDouble()
		4) Arrays.stream(name_of_ArrayObject).max().getAsInt()
		5) Arrays.stream(name_of_ArrayObject).min().getAsInt()

> ArrayDemo5.java:
- Description: 


		This program will give you a tool which is API of "IntSummaryStatistics".
		
		讀者可從本節學到如何使用 Oracle 內建的 API - IntSummaryStatistics，此 Class 包被放置在此路徑中 java.util.stream.IntStream.summaryStatistics()，裡
		面提供了幾個好用的工具，例如計算總數、加總、平均、最大值和最小值
		
		You shall make a note of following built-in API from IntSummaryStatistics as
		1) Arrays.stream(name_of_ArrayObject).summaryStatistics().getCount()
		2) Arrays.stream(name_of_ArrayObject).summaryStatistics().getSum()
		3) Arrays.stream(name_of_ArrayObject).summaryStatistics().getAverage()
		4) Arrays.stream(name_of_ArrayObject).summaryStatistics().getMax()
		5) Arrays.stream(name_of_ArrayObject).summaryStatistics().getMin()

------------------------------------------------------------------------------
# day3 Java Advanced: Application of String & Stream API  
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day3">Lesson learned of following programming with regards to String2Array and Stream's API:</a>
- Description: 

		The coming of sample codes of “StringArrayDemo(s)”, will give a guidance of reader for understanding the API of String, Array and 
		Stream (Java 1.8).

		讀者可從本節 sample code - “StringArrayDemo(s)” 中，學習如何運用 String、Array 和 Stream (Java 1.8) 的 API

> StringArraydemo.java:
- Description: 

		This program will tell you, 
		1) how to use "String[] java.lang.String.split(String regex)" for collecting the each name into String[]
		2) how to use "Arrays.toString(name_of_stringArray)"
		3) calculation of arrayLength, p.s., name_of_array.length
		4) calculation of stringLength, p.s., name_of_string.length()


> StringArraydemo2.java:
- Description: 

		This program will follow up the previously StringArraydemo.java but updated in Java 1.8

> StringArraydemo3.java:
- Description: 

		This program will give a lecture on how to use "Integer.parseInt" （which is meaning by "Parses the string argument as a signed decimal 
		integer"）to catch the score of students that are over or equal to 60, and turn into calculating their average score.
		
		此程式說明如何運用 "Integer.parseInt" (此 API 將 String 的引數轉成十進制的值)，來去抓取學生分數係大於或等於 60 分的人數，並將這些及格分數另外做總及格平均分
		數的計算

> StringArraydemo4.java:
- Description: 

		This program will follow up the previously StringArraydemo3.java but giving a differently demostration of calculation of average Score 
		(which is >= 60) in Java 1.8.
		1) mapToInt(score -> Integer.parseInt(score))
		2) filter(score -> score >= 60)
		3) average()
		4) getAsDouble()


> StringBuilderDemo.java:
- Description: 
		
		This program is giving an introduction of StringBuffer and StringBuilder.

> StringBuilderDemo2.java:
- Description: 
		
		This program gives a lecture on how to use StringBuilder Util.

> StringDemo1.java:
- Description: 


		This program will introduce how to compare with two differently String variables of their memory and value.
		1) string_name1 == string_name2
		2) string_name1.equals(string_name2)
		3) string_name1.equalsIgnoreCase(string_name2) 


> StringDemo2.java:
- Description: 


		In this code, two String objects are created: string1 and string2. string1 is created using the new keyword, which creates a new object 
		on the heap, while string2 is created using a string literal, which is stored in the string pool.

		The == operator compares the references of the two objects, and since string1 and string2 refer to different objects, the result of 
		string1 == string2 is false.
		
		The equals() method compares the contents of the two strings, so string1.equals(string2) returns true because both strings contain the 
		same characters.
		
		The intern() method is used to put a String object into the string pool, and it returns a reference to the string pool object. In the 
		code above, string1.intern() returns a reference to the string "Java" in the string pool, which is the same as string2. 
		
		Therefore, string1.intern() == string2 returns true.
		
		It's worth noting that while using intern() can be useful in certain situations, it can also have negative performance implications, so 
		it should be used judiciously.

> StringDemo3.java:
- Description: 


		The code above defines a class StringDemo3 with a main() method.

		In the main() method, a String variable message is initialized with the value " she sell sea shell on the sea shore ". 
		
		The trim() method is then called on message to remove leading and trailing whitespace characters, and the resulting string is printed 
		using println().
		
		The length() method is then called on message to get the length of the string, which is printed using printf().
		
		The substring() method is then demonstrated with two examples. 
		
		The first example uses the substring() method to extract a substring of message starting at index 9 and ending at index 12 (not 
		inclusive of the character at index 12), 
		
		which corresponds to the substring "sea". The resulting substring is printed using printf().
		
		The second example extracts each character of the String variable name by calling substring() with appropriate start and end indexes 
		for each character. 
		
		Finally, the code attempts to extract a substring starting at index 5 and ending at index 6 of name, which results in a 
		java.lang.StringIndexOutOfBoundsException 
		
		since the string is only 5 characters long and there is no character at index 5.
		
		Overall, the substring() method can be useful for extracting substrings from a String, but care must be taken to ensure that the 
		indexes are valid.

> StringDemo4.java:
- Description: 

		The program defines a class StringDemo4 with a main() method and a addUtil() method.
		
		In the main() method, a String variable language is initialized with the value "Javascrip".
	 	
	 	Then, the addUtil() method is called with language as an argument. The addUtil() method concatenates the string " to be node.js" to the 
		end of the string parameter and returns the resulting string.
		
		The main() method then prints the concatenated string using the println() method.
		
		One thing to note is that the String class in Java is immutable, which means that once a String object is created, it cannot be 
		modified. Therefore, when string += " to be node.js"; is executed in the addUtil() method, a new String object is created with the 
		concatenated value, and string is updated to refer to the new object. This means that the original String object referenced by language 
		in the main() method is not modified.
		
		
		In general, it is recommended to use a StringBuilder or StringBuffer when concatenating strings in Java, as these classes are mutable 
		and can provide better performance when performing multiple concatenations.

------------------------------------------------------------------------------
# day4 Java Advanced: Application of Stream API for calculation with 1-D array and 2-D array
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day4">Lesson learned of following programming for Array:</a> 
- Description: 

		The coming of sample codes of MultiArrayDemo(s) will give a lectures on the application of multiple array

		本次 day4 將介紹如何使用多維陣列 (eg., 一維和二維陣列) 之應用

> MultiArrayDemo1.java:
- Description: 

		This program will introduce how to initialize for an array, and print out the memory and value of multiple Array

		此程式將介紹如何將陣列初始化，並印出陣列的記憶體位址和多維陣列的值

> MultiArrayDemo2.java:
- Description: 

		This program creates method of print and getSum util 
		
		此程式建立 print 和 getSum 的工具，當需要用這些工具 (也就是 method)，將可直接調用

> MultiArrayDemo3.java:
- Description: 

		This program will give a lecture on BMI calculator of multi-ple array 
		
		此程式介紹使用多維陣列，來收集體重和身高的參數，並建立一個多維陣列的 BMI 計算器，將每組的 BMI 參數產出

> MultiArrayDemo4.java:
- Description: 

		Following the previously MultiArrayDemo3.java, we modify the order of initialized array, and re-design the for-loop algorithm to 
		generate the each group of BMI. Also, one API of Arrays.deepToString(name_of_array) for your reference
		
		依據先前的 MultiArrayDemo3.java 介紹，我們修改了初始化陣列的順序，並重新設計一個 for-loop 的演算法，將每組的 BMI 參數產出。另外此節介紹了一個內建 API - 
		Arrays.deepToString(name_of_array)，可直接將陣列的值抓出，並由 System.out.println(Arrays.deepToString(name_of_array)) 印出陣列的 value(s)。

		備註: name_of_array 係指陣列的變數名稱

> MultiArrayDemo5.java:
- Description: 

		Of this program, we give a lecture on converting a 2-D array (Column: 3, Row: 2) to 2-D array (Column: 2, Row: 3). 
		
		此程式介紹一組二維陣列 (列: 3, 行: 2) 的內容，轉換成 2 維陣列 (列: 2, 行: 3)。對於讀者而言，本節為了訓練陣列大小編排的邏輯概念，所設置。但在開發中，建議仍採用 
		Java 1.8 提供的 API 來做設計，因為設計者胥撰寫 for-loop 或 for-each 的迴圈架構，其迴圈的順序對於抓取陣列的位置和內容，至關重要，但對於維護上，並不是一個上
		策，假設開發者過了兩個月後，再回來閱讀程式碼時，將花上許多時間來回顧當時撰寫此程式碼的心路歷程。再者，用迴圈的撰寫方式，邏輯上較不直接 (若與 Java 1.8 的 API 相
		比)

> MultiArrayDemo6.java & MultiArrayDemo7.java:
- Description: 

		We introduce the application of API from Arrays in Java 1.8, from MultiArrayDemo6 class and MultiArrayDemo6 class.
		1) Arrays.stream
		2) flatMapToInt
		3) flatMapToDouble
		4) mapToDouble
		5) peek
		6) forEach 


------------------------------------------------------------------------------
# day5 Java Advanced: Introduction of Object-Oriented Programming (OOP) Patterns with including application of Stream API 
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day5">This lesson we give a differently Object-oriented design patterns and also create a roughly Account System from Bank for your reference</a>
> OO1.java 
- Description: 

		This program we would like sharing to reader about initializing the global variables by Constructor
		
		此課程介紹如何使用建構子將全域變數初始化

> OO2.java
- Description: 

		This program we would like sharing to reader about initializing the global variables by Object
		
		此程式介紹如何由物件變數將全域變數初始化

> OO3.java
- Description: 


		This program we create Constructors and also initialize the global variables at the same time
		
		此程式介紹如何由建構子將全域變數初始化


> OO4.java
- Description: 

		According to the previously program (i.e., OO3.java), you will learn how to print out the value of global variable from void method
		
		依先前課程 (也就是 003.java)，您將可學到如何將全域變數的值，由 void 方法印出

> OO5.java
- Description: 

		This program creates 1-D array of Student with 10 Fixed length (which is 10 differently memory) and initialize the global variable from 
		object of 1-D array
		
		此程式將學到，如何建立固定長度 (也就是 10 個不同的記憶體) 的一維陣列之 Student 物件，並由一維陣列中的物件，將全域變數 (也就是 name 和 score) 初始化

> OO6.java
- Description: 
		
		This program creates 1-D array of Student with Dynamic Memory
		
		此程式將介紹，如何建立一個動態的一維陣列的 Student 物件

> OO7.java
- Description: 

		This program creates 1-D array of Student with Dynamic Memory and use Java 1.8 Stream API to calculate the average score of students by 
		mapToDouble
		
		此程式介紹，使用一個動態的一維陣列的 Student 物件，並結合 Java 1.8 Stream API - mapToDouble，來計算學生的平均分數

> OO8.java
- Description: 

		This program creates two differently length of 1-D array in dynamic memory of Student and collect them into one object of 2-D array. 
		And also, you will learn how to use Java 1.8 Stream API to calculate the average score of students
		A kindly reminder, we need to understand how differently does we use Java 1.8 Stream API - flatMap and flatMapToDouble
		
		此程式介紹，建立兩個動態的一維陣列的 Student 物件，並將其放入至二維陣列中來管理，並結合 Java 1.8 Stream API，來計算學生的平均分數
		請讀者特別留意，Java 1.8 Stream API - flatMap 和 flatMapToDouble 之應用

> OO9.java & Account.java & Student.java
- Description: 
		
		You will learn how to design a roughly Account System of Bank for withdraw and deposit money from your Account. The OOP (Object-
		Oriented Programming) is likely to 4th pattern of OOP (which is OO4.java). Furthermore, we share a concept of how to handle with error 
		message during this lesson.

		本程式設計一個簡易版的銀行轉帳系統，運用了之前課程 (OO4.java) 提到的設計架構。此外，也介紹一般使用者和工程人員關於處理錯誤訊息的處理方式


------------------------------------------------------------------------------
# day6 Java Advanced: Using ArrayList and Scanner to design an ERP Office System for Check-in
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day6/ScannerPractice">Scanner API Practice</a>

> ScannerDemo.java 
- Description:  
		
		
	 	This program we introduce the API of Scanner of hasNext(T pattern), hasNext() and scan.next().  
	 
	 	此程式介紹如何使用 Scanner 的 API - hasNext(T pattern)、hasNext() 和 scan.next()  
		

> ScannerFilter.java 
- Description:  

		This Java program reads input from the user using a Scanner object and then collects the input into different lists 
 	
	 	based on the type of input. 
 	
 		The program then adds the lists to a larger list called "list4TimingController" and prints the contents of that list.
 


> ScannerForPractice_Loop_And_If.java 
- Description:  

		This is a Java program that uses the Scanner class to read input from the user and control the execution of the program 
 		using loops and conditional statements (i.e., break and return).
	
		'break' : break loop
		'return' : Terminate operation of current method




> ScannerLimiter.java 
- Description:  

		This is a Java program that uses a Scanner object to take user input and limit the number of iterations in a while-loop.
 

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day6/ScannerException">Introduction of Scanner Exception</a>

> IntroductionOfFinal.java
- Description:  

		This Java program demonstrates the use of the final keyword in various contexts.
 	

		=================================================================
 	
		final is a non-access modifier applicable only to the following:

			1) a variable: To Create a Constant Variable, and Must be initialized

			2) a method: Prevent method Overriding

			3) a class: Prevent Inheritance

			4) final variable Must be initialized at early beginning or inside Constructor
		   
		   
 		=================================================================
 	
		關於 final 變數之用法如下:

			1) 用來宣告一個類別、函數、或者變數

			2) 類別: 當宣告在類別上時，該類別就無法被繼承！

			3) 函數: 當一個函數被宣告為 final 時，則繼承他的子類別無法覆寫

			4) final 變數，必須被初始化，其初始化之方式有兩種，一種在一開始設計變數時就給定，另一種則是在建構子中

		=================================================================


> ScannerIllegalStateException.java 
- Description: 
	
		This program is a demo of IllegalStateException. 
	 	Because the Scanner in method of getAge() was closed, then caused NO Scanner could be used in the method of getName(). 
 		Then, you will get IllegalStateException.
 	
		此程式碼模擬如何得到 IllegalStateException。
		當 getAge method 中，將 Scanner closed 後，再執行 getName method 時，因 Scanner 已經關閉了，
		導致在執行 getName method 時，無 Scanner 可用，因此跳出 IllegalStateException
 


> ScannerNoSuchElementException.java 
- Description:  

		This program is a demo of NoSuchElementException. 

		Because the Scanner in method of getAge() was closed, then caused NO Scanner could be used in the method of getName(). 
		Then, you will get NoSuchElementException.

		此程式碼模擬如何得到 NoSuchElementException。
		當 getAge method 中，將 Scanner closed 後，再執行 getName method 時，因 Scanner 已經關閉了，
		導致在執行 getName method 時，無 Scanner 可用，因此跳出 NoSuchElementException


> ScannerResolvedIllegalStateExceptionNoSuchElementException.java 
- Description:  

		This sample code could resolve the NoSuchElementException and IllegalStateException 
 		
 		此程式碼解決 NoSuchElementException and IllegalStateException 的問題

	
		When a Scanner is closed, it will close its input source if the source implements the Closeable interface.
		 
		Clearly, if we have reached the end of input, or if the source is closed, 
	  	then we get the NoSuchElementException().
	  	 
	  	Please see the specification of Oracle 1.5 as following:
	  	-> Class 
	  			public final class Scanner implements Iterator<String>, Closeable { ... }
	  	 			
	  	-> throwFor method
					
					private void throwFor() {
						  skipped = false;
						  if ((sourceClosed) && (position == buf.limit()))
						      throw new NoSuchElementException();
						  else
						      throw new InputMismatchException();
						  }
					}



3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day6/erp">Designing an Office Check-in System with function of CRUD by API - ArrayList, you will learn in this lesson</a>

> ArrayListDemo1.java 
- Description:  

		This program introduces how to use API of "ArrayList"
	
		此節將介紹如何使用 ArrayList 的 API



> ArrayListDemo2.java 
- Description:  


	 	Following the previously program (i.e., ArrayListDemo1.java),   
		this  design an Office Check-in System with function of CRUD by ArrayList - API.
	 	
		此課程延續 ArrayListDemo1.java，設計一個 CRUD 的簽到系統，使用 ArrayList API



4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day6/streetesting">Introduction of Stress Testing</a>
> ArrayListOfHeapMemoryTest.java 
- Description:  


		The given code demonstrates three different scenarios for testing the heap memory of JVM with the ArrayList collection.

		Overall, the program demonstrates different ways to handle the heap memory limitations while using ArrayList in Java.
	
		在做壓力測試時，需清楚了解系統之最嚴苛的使用狀況下，最多可分配多少的 RAM 給 JVM 使用。 

------------------------------------------------------------------------------
# day7 Java Advanced: Application of Stream API with Inheritance, Encapsulation, Auto-boxing and Annotation of Override
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day7">This lesson we give a following introduction:</a>

		1) Inheritance
		2) Encapsulation
		3) Auto-boxing
		4) Annotation of Override


> Person.java 
- Description:  


		This is a Java class called "Person" that defines a superclass. The superclass has two private instance variables called "name" and 
		"age". 
		
		The instance variables can only be accessed within the same class due to their accessibility in "private".
		
		It should be noted that this code was written before Java 1.5 and therefore does not support auto-boxing and the "@Override" 
		annotation.
		
		Java 1.5 之前版本，不支援 
		1) auto-boxing
		2) Annotation of "@Override"


> Student.java 
- Description:  

		This is a Java class called "Student" that inherits from the superclass "Person".
		
		The class has an additional private instance variable called "score", which can be accessed using the getter and setter methods.
		
		It should be noted that this code was written before Java 1.5 and therefore does not use the "@Override" annotation.
		


> Teacher.java 
- Description:  

		This is a Java class called "Teacher" that also inherits from the superclass "Person". 

		The class has an additional private instance variable called "salary", which can be accessed using the getter and setter methods.
  
  		It should be noted that this code was written before Java 1.5 and therefore does not use the "@Override" annotation.
  		


> Main.java 
- Description:  

 		Overall, this code demonstrates object-oriented programming concepts such as inheritance, encapsulation, and polymorphism in Java.
		
		This lesson we give a following introduction:
 		1) Inheritance
 		2) Encapsulation
 		3) Auto-boxing
 		4) Annotation of Override



2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day7_2">This lesson we give a following introduction:</a>

		1) Inheritance
		2) Encapsulation
		3) Auto-boxing
		4) Annotation of Override
		5) Application of Stream API to calculate the average age and score


> Person.java 
- Description: 

		This is a superclass called "Person" that both the "Student" and "Teacher" classes inherit from. It contains private instance variables 
		for the name and age of a person, as well as public getter and setter methods for these variables.
		
		The constructor of the Person class takes two arguments, a String name and an integer age, and initializes the corresponding instance 
		variables.
		
		The Person class also overrides the default toString() method inherited from the Object class with a custom implementation that returns 
		a string representation of the Person object.
		
		This class also notes that features like auto-boxing and unboxing, as well as the "@Override" annotation, are not supported in versions 
		of Java prior to version 1.5.
		

> Student.java 
- Description:  

		This is a Java code for a class called Student that extends the Person class. 
		



> Teacher.java 
- Description:  

		The code defines two child classes, Student and Teacher, which inherit from the parent class Person. 

		Both child classes have additional instance variables and methods specific to them.
		
		Overall, this code demonstrates the use of inheritance to define classes that share common attributes and behaviors from a parent 
		class, while also extending those classes to add specific attributes and behaviors unique to each child class.
			 


> Main.java 
- Description:  

		The code initializes objects of the Student and Teacher classes using their constructors, and then calls their toString() methods to 
		print out their attributes, 
		
		which includes their name, age, and either score or salary depending on the class. This code demonstrates inheritance, encapsulation, 
		and the use of constructors and the toString() method. 
		
		The code does not demonstrate auto-boxing or the @Override annotation since it is written in Java 1.5 which does not support those 
		features.

		This lesson we give a following introduction:
		1) Inheritance
	 	2) Encapsulation
		3) Auto-boxing
		4) Annotation of Override



> Classroom.java
- Description:  

		This is a Java class named "Classroom" which is designed to manage a classroom's information including its ID, teacher, and students. 
		
		The class has several methods, including constructors with arguments, getters, and setters for the ID and teacher, as well as methods 
		
		for adding and removing students from an ArrayList object.
		
		The class also includes two methods for calculating the average score of students and the average age of the teacher and students. 
		
		The former uses Java's Stream API to retrieve the score of each student and then calculate the average, while the latter calculates the 
		average age of all students and the teacher, 
		
		depending on the number of students present.




> Main2.java 
- Description:  

		This is a Java program that demonstrates concepts of object-oriented programming such as inheritance, encapsulation, auto-boxing, 
		annotation of override, and the use of the Stream API to calculate the average age and score.
		
		This lesson we give a following introduction:
 		1) Inheritance
 		2) Encapsulation
 		3) Auto-boxing
 		4) Annotation of Override
 		5) Application of Stream API to calculate the average age and score


------------------------------------------------------------------------------
# day8 Java Advanced: Primitive type, Wrapper Class (including Application of Java 1.8 - Stream API), Overloading and Inheritance 
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day8">Introduction of primitive type, wrapper class, overloading and inheritance:</a>




> DemoInheritanceAndConstructors.java 
- Description:  

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



> Overloading01.java 
- Description:  


		Method overloading is a feature of Java in which a class has more than one method of the same name and their parameters are different.
		In other words, we can say that Method overloading is a concept of Java in which we can create multiple methods of the same name in the 
		same class, but type differently or length of parameters differently will decide which method will be invoked.

		Java supports method overloading through two mechanisms:

		1) By changing the data type of parameters 
		2) By changing the number of parameters

		=================================================================

		方法重載是 Java 的一個特性:
		1) 意思是一個類有多個同名方法，但帶入的型別不同 
		2) 參數長度不同，而決定要呼叫哪一個方法


> Overloading02.java 
- Description:  

 		This is a Java program that demonstrates method overloading in a food ordering scenario. 
 		
 		The program defines a class called Overloading02 that has four different methods all named menu, but with different parameter types and 
		numbers.
 		
 		此範例講述方法重載 (參數長度不同)



> PrimitiveClass.java 
- Description:  

		This lesson we introduce the Primitive type
		本節介紹基本 "基本資料型別"

		A primitive data type specifies the size and type of variable values, 
		and it has no additional methods. 
		基本型別 (或稱原始型別) 指定變數值的大小和類型，無其它方法。

		There are eight primitive data types in Java (Java 中有八種原始資料型別):    		
		Data Type		Size			Description
		byte			1 byte			Stores whole numbers from -128 to 127
		short			2 bytes			Stores whole numbers from -32,768 to 32,767
		int			4 bytes			Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long			8 bytes			Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float			4 bytes			Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double		8 bytes			Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean		1 bit			Stores true or false values
		char			2 bytes			Stores a single character/letter or ASCII (American Standard Code for Information 
								Interchange, 美國信息交換標準編碼) values							
								Introduction of ASCII -> https://zh.wikipedia.org/wiki/ASCII


		<A kindly reminder>
		1) boolean: 
				The boolean data type has only two possible values: true and false. 
				Use this data type for simple flags that track true/false conditions. 
				This data type represents 1-bit of Size.
				There are some subtle differences between programming languages (e.g., C and Java), for your information.
				For C language, Boolean variable is stored as 16-bit (2-byte) values.

					
				boolean 資料型別，只有兩種值: true 和 false
				使用此資料型別，作為簡易偵測條件之 '真' 和 '否' 
			    	boolean 資料型別在 Java 中，只佔 1 bit 記憶體空間
			    	我們需特別注意編程語言（例如 C 和 Java）之間的一些細微差別
			    	關於 C 語言之 boolean 資料型別則佔 16-bit (2-byte) 記憶體	    	    


		2) char: 
				The char data type is a single 16-bit Unicode character. 
			 	It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
				char 資料型別，係單個 16 位元 Unicode 字符。
			 	統一編碼的最小值為 '\u0000'（或 0），最大值為 '\uffff'（或 65,535)。



> WrapperClass1.java 
- Description:  

		This Java program demonstrates the difference between using wrapper classes in versions 1.0-1.4 and versions 1.5 and above. 
		
		In versions 1.0-1.4, there is no support for auto-boxing and unboxing, so developers must manually upcast and downcast between 
		primitive types and their corresponding wrapper classes. 
		
		In versions 1.5 and above, auto-boxing and unboxing are supported, making it easier and more intuitive to work with primitive types and 
		their corresponding wrapper classes. 
		
		本程式介紹 "包覆類別"


> WrapperClass2.java 
- Description:  

 		This code demonstrates how to use the Arrays class and Stream API in Java 1.8 to work with arrays of primitive types and their 
		corresponding wrapper classes.
 	
 		本程式介紹 "包覆類別" 及 Java 1.8 - Stream API 之應用


------------------------------------------------------------------------------
# day9 Java Advanced: Varargs, DAO (Data Access Object), Singleton and Polymorphism
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day9_1">Introduction the application of Varargs:</a>

		Before Java 1.5, whenever we wanted to pass an arbitrary number of arguments, we had to pass all arguments in an array or implement N 
		methods (one for each additional parameter). 
		1) public String format() { ... }
		2) public String format(String value) { ... }
		3) public String format(String value_1, String value_2) { ... }
		
		After Java 1.5, a shorthand for methods that support an arbitrary number of parameters of 
		one type was introduced, which is as follows:
		1) public String format() {String ... values}

> VarargsDemo1.java 
- Description: 

		This program we introduce the application of Varargs:
		==============================================================================================================
		Before Java 1.5, whenever we wanted to pass an arbitrary number of arguments, 
		we had to pass all arguments in an array or implement N methods (one for each additional parameter):

		1) public String format() { ... }

		2) public String format(String value) { ... }

		3) public String format(String val1, String val2) { ... }

		==============================================================================================================
		After Java 1.5 (including 1.5 version), provides a short-hand for methods that support an arbitrary number of parameters of one type
		1) public String format() {String ... values}

		==============================================================================================================
		Overall, this program provides a good example of how varargs can simplify code and allow methods to be more flexible in accepting 
		arguments.


> VarargsDemo2.java 
- Description: 

		The program above demonstrates method overloading with varargs. 
		
		There are two methods with the same name "test", but one takes an arbitrary number of int arguments and the other takes two int 
		arguments.
		
		本程式設計相同的方法名稱，但不同的參數	

> VarargsDemo3.java 
- Description: 	

		This program we design a method with one fixed argument  
		but support an arbitrary number of parameters of one type (i.e., int) for another

		本程式設計一個方法，其中一個固定的輸入參數為 int 型別，另外一個則是可變參數

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day9_1">Introduction the application of DAO and Singleton:</a>
> Dao.java 
- Description: 

		The Data Access Object (DAO) pattern is a structural pattern that allows us to isolate the application/business layer from the 
		persistence layer (usually a relational database but could be any other persistence mechanism) using an "abstract API". Regarding the 
		information above, it's at very beginning moment for you, since we do NOT include any "abstract API" during this lesson. But, no worry, 
		we will review this topic at the following later day. 

> SingleDao.java 
- Description: 

		This program you wil learn how to design Singleton pattern.
		To create a singleton-class, this class must implement the following properties:
		1) Create a private constructor of the class to restrict object created outside of the singleton-class.
		2) Create a private attribute (eg., "private static SingleDao SingleDao_Instance = new SingleDao()") of the class type that refers to 
		   the single  object.
		3) Create a public static method (eg., "public static SingleDao getSingleDaoInstance()") that allows us to create and access the object 
		   we created.  Inside the method, we will create a condition that prohibits us from creating more than one object.

		What's this mean by, "allows us to create and access the object we created" ? It's likely you share a Single Global Instance and 
		provide a Global Point of Access to SingleDao.class.
	  
> UserDao.java 
- Description: 

		This UserDaoclass is implementing the Dao.class and SingleDao.class
		
		A kindly Reminder: 
		(1) You may get a different Console message from the annotation of this UserDao.java, because the programming of generating value of 
		id_number from "Dao.java" is via "new Random().nextInt()"
		
		Of the "SingleDao.java", we design a Singleton pattern into this class, and you will see the generated id_number is SAME!

		(2) Since we created a public static method (i.e., "public static SingleDao getSingleDaoInstance()") to prohibit developer from 
		creating more than one object for accessing the inside object of "SingleDao.java".
	
3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day9_2">Introduction the application of Polymorphism_1:</a>

		Polymorphism is one of the four fundamental principles of object-oriented programming (OOP), along with encapsulation, inheritance, and 
		abstraction. It allows objects of different classes to be treated as if they were objects of a common superclass or interface, 
		providing flexibility and reusability in code.

		In OOP, Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance. 
		Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This 
		allows us to perform a single action in different ways.

		One of the most common examples of polymorphism is method overriding, where a subclass provides its own implementation of a method that 
		is already defined in its superclass. This allows objects of the subclass to be used in place of objects of the superclass, without 
		requiring any changes to the code that uses them.

		Another example of polymorphism is method overloading, where a class provides multiple methods with the same name but different 
		parameters. This allows the same method name to be used for different purposes, based on the types of the arguments passed to it.

		In Java, polymorphism is achieved through the use of inheritance, interfaces, and dynamic method dispatch. Dynamic method dispatch is a 
		mechanism by which a call to an overridden method is resolved at runtime, rather than at compile time. This allows the method to be 
		invoked on objects of different classes, based on the type of the object at runtime.


> TestPolymorphismOfAnimal.java, Cat.java, Lion.java, Cow.java, Horse.java, Feet.java 
- Description: 

		Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

		Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This 
		allows us to perform a single action in different ways.

		For example, think of a super-class called Cat that has a method called animalSound(). Sub-classes of Animals could be Lion...etc - And 
		they also have their own implementation of an animal sound (the Lion "roar", etc.)


		The following the structures of Polymorphism are:


			Super-class:	Cat       Feet     Feet

					 ^	   ^        ^
					 |	   |        |

			Sub-class:	Lion	   Cow     Horse





4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day9_2">Introduction the application of Polymorphism_2:</a>
- This lesson you will learn a roughly design of different positions at company and some variables/methods only for specific position


> Employee.java 
- Description: 
		
 		This is an example of a Java class named "Employee", 
 		
 		which serves as a superclass (or parent class) for other classes that inherit its properties and methods.
 		
 		Overall, this class provides a basic template that can be used to create more specific classes for different types of employees within 
		the company. 
 		
 		By inheriting from this superclass, these classes will have access to its properties and methods, and can override them or add new ones 
		as needed.


> Manager.java 
- Description: 


		This is an example of a Java subclass named "Manager" that extends the "Employee" superclass. 
		
		The "Manager" class has its own instance variable named "budget", which is assigned a value of 100,000. 
		
		This variable represents the budget that is allocated for the manager to use in their role.


> Supervisor.java 
- Description: 

		This is an example of another Java subclass named "Supervisor" that also extends the "Employee" superclass. 
		
		The "Supervisor" class has its own instance variable named "stock_option", 
		
		which represents the employee stock option (ESO) granted to the supervisor as part of their compensation package. 
		
		The variable is assigned a value of 120,000. 


> Test01.java 
- Description: 

		This is an example of a nested cast, where the "supervisor" instance is first cast to its superclass "Employee", and then to the 
		"Manager" subclass. 
		
		However, this cast will result in a runtime exception "java.lang.ClassCastException", because the "Supervisor" class cannot be cast to 
		the "Manager" class, as they are unrelated subclasses.

> Test02.java 
- Description: 

		The code attempts to access various instance variables from each of these instances, and print them to the console.
	
		The "salary" instance variable is accessed for each instance, which is inherited from the "Employee" superclass, so it is present in 
		all three instances.

		For the "manager" and "supervisor" instances, the code attempts to access the "budget" and "stock_option" instance variables, 
		respectively, 
		
		which are not present in the "Employee" superclass. This will result in a compiler error, because the variable is not defined in the 
		superclass, and is specific to the subclass.
		

> Test03.java 
- Description: 

		Invoke the method of jobDescription from object of employee, manager and supervisor, to get the value of job description.

> Test04.java 
- Description: 

		The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

		The instanceof in java is also known as type comparison operator because it compares the instance with type. 

		Notice:
			1) It returns either true or false. 
			2) If we apply the instanceof operator with any variable that has null value, 
			   it returns false.

> Test05.java 
- Description: 

		The Test05 class takes an instance of the Employee, Manager, and Supervisor classes as input and calls the printBudget method with each 
		of them as arguments. 
		
		The printBudget method takes an Employee object as an argument and checks whether it is an instance of Manager or Supervisor. 
		
		If it is an instance of Manager, it downcasts the Employee object to Manager and prints out the value of the budget variable from the 
		Manager class. 
		
		If it is an instance of Supervisor, it downcasts the Employee object to Supervisor and prints out the value of the stock_option 
		variable from the Supervisor class.
		
		Overall, the Test05 class is an example of how to check whether an object is an instance of a particular class or subclass, 
		
		and how to downcast an object to a subclass to access its variables or methods.		 





------------------------------------------------------------------------------
# day10 Java Advanced: Abstract and Interface
1. Introduction of abstract:


		1) Abstraction can be achieved with either abstract classes or interfaces
		2) The abstract keyword is a non-access modifier, used for classes and methods:
		3) Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
		4) Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited 
		   from).

2. Introduction of interface:

		1) Another way to achieve abstract
		2) interface method (does not have a body), the body is provided by the "implement" class
		3) To access the interface methods, the interface must be "implemented" by another class with the "implements" keyword (instead of 
		   "extends")
		4) On implementation of an interface, you must override all of its methods
		5) Interface attributes are by "public static final"
		6) An interface CANNOT contain a constructor (that is, interface cannot be used to create objects)
		7) An interface doesn't have any memory space of its own. It is just a blueprint or a contract that defines a set of methods that must 
		   be implemented by a class that implements the interface. 
		   When a class implements an interface, it provides the actual implementation for the methods defined in the interface, and it is the 
		   object of that class that will have memory space allocat	
	

		Why And When To Use Interfaces?
		1) For security - we can hide certain details and only show the important details of an object (interface).
		2) Java does not support "multiple inheritance" (i.e., a class can only inherit from one superclass, e.g., A extends B). However, 
		   interface can be achieved with interfaces, since the class can implement multiple interfaces, e.g., A implements B, C, D

4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day10_1">The following sample code for your information of relationship between abstract and interface:</a>
> InterfaceAnimal.java
- Description: 

		Introduction of this program:
			1) In the given code snippet, we have an interface called InterfaceAnimal. It declares three abstract methods eat(), play(), 
			   and name(). 
			   These methods don't have any implementation and will be implemented by any class that implements this interface.
			2) The interface also has a constant COPY_RIGHT declared as public static final String COPY_RIGHT = "Discovery.com". 
			   It means that any class implementing this interface will have access to this constant.

			3) The interface also has a default method copyRight() declared as default void copyRight() { ... }. 
			   It means that any class implementing this interface will have this method with a default implementation that prints the 
			   value of COPY_RIGHT.

			4) An interface cannot have a constructor. This is because an interface is not a class and cannot be instantiated, 
			   so it doesn't make sense to have a constructor in an interface.

> AbstractAnimal.java
- Description: 

		Create an abstrace of Animal to introduce the rules of abstract

> Cat.java
- Description: 

		Create Cat.class to inherit AbstractAnimal.class, and also override the method of interfaceAnimal

> Dog.java
- Description: 

		Create Dog.class to inherit AbstractAnimal.class, and also override the method of interfaceAnimal

> PetStore.java
- Description: 

		Create PetStore.class to implement AbstractAnimal and InterfaceAnimal


5. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day10_2">The following sample code for your information of how to design abstract class(es) to inherit interface class, and also each of abstract method or actual method being overrided by another class(es) or current class. Please check out the following UML design Pattern.</a>

	<img width="203" alt="Class Diagram_Military" src="https://user-images.githubusercontent.com/83496093/204460202-efc085ac-a1d2-47f1-bb03-495fbf622803.png">





> Weapon.java
- Description: 

		Create interface of Weapon.class for its sub-class(es) to implement

> Car.java
- Description: 

		Create abstract of Car.class (which inheritance with interface Weapon), and also being implemented by sub-class(es) (e.g., Tank.class 
		and Truck.class)

> Airplane.java
- Description: 

		Create abstract of Airplane.class (which inheritance with interface Weapon), and also being implemented by sub-class(es) (e.g., 
		JetAircraft.class and Drone.class)

> Tank.java
- Description: 

		Create Tank.class, which inherits abstract Car.class and interface Weapon.class

> Truck.java
- Description: 

		Create Truck.class, which inherits abstract Car.class and interface Weapon.class 

> JetAircraft.java
- Description: 

		Create JetAircraft.class, which inherits abstract Airplane.class and interface Weapon.class 

> Drone.java
- Description: 

		Create Drone.class, which inherits abstract Airplane.class and interface Weapon.class 



------------------------------------------------------------------------------
# day11 Java Advanced: The Decorator and Observer's Pattern
Decorator Pattern (A menu of Subway Order System):
- We design a Scanner object for customer to choose three fixed option of bread (i.e., Wheat, Honey Oat, or Italian and Parmesan Oregano). 
- Firstly, you will see the many different initiated objects from o1 to o11. Please read the line at 40 and 48-57. 
- Each of initiated object will be the argument of the next Constructor. It's likely all of them are wrapped up as decoration of furniture at house. 
- For an instance of your house, you may need a big door, chairs, a oval table, a set of sofa, two Televisions, and many bulbs...etc. Those of furniture of house, it seems that you can add or remove whenever you want. For this said, we create a sample code of Subway Order System. You could choose what kind of bread you need, and also what flavors you would like to decorate into the bread. 
- Just in case, you like to remove one of flavors (e.g., egg), then make an annotation of object of Egg.
- By the way, if you forgot how operation of Scanner and nextLine() could be, please refer to the previously package at com.ocp.day6.ScannerPractice

1. The decorator pattern as following SubwayUML below:

	<img width="203" alt="SubwayUML" src="https://user-images.githubusercontent.com/83496093/210288800-2d7092ac-040c-4a44-8c7a-404ae920af10.png">



	
	
2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day11_1/decorator">Following sample codes of Decorator Pattern for your information:</a>
> Food.java
- Description: 

		The global variable of "name" and "price", we place here in the Food.class, for implement by subclass. Also, there are two methods 
		given by abstraction, because these methods without body (so-called virtual method) are, developer expected them to be implemented. 


> AgentOfFood.java
- Description: 

		For a purpose of designing the abstraction class here, please imagine that your project (e.g., Menu of Order System) is almost to be 
		DONE, but suddenly your client request additional function which could query the flavors and price of meal. Engineer is NOT willing to 
		update the original structure of programming because the mostly is settled. Hereinafter, you could design an abstraction class (i.e., 
		AgentOfFood.class) to create a function that client required to.  

		Any reason of solution we choose, is abstraction class? Since cannot initiate the object of abstraction class by itself, we need the 
		subclass of abstraction class to invoke the variable/method of abstraction class.
		And therefore, we could avoid the original structure of programming from updating, but merely have subclass inherit the abstraction 
		class (i.e., AgentOfFood).	

		For the sake of designing an abstraction class, you may have many requirements from different clients, then you merely manage the 
		package of abstraction class without any impact on the original design.

		設計此抽象類別之用意，請讀者想像一個情境，假設您目前執行的專案為『點餐訂單系統』且已接近完工，卻接到客戶要求，需在訂單系統中增加一個功能 (可查詢顧客點的餐點配菜和
		餐點價格)，但基於程式架構已完成，工程師為了不影響訂單系統的程式架構，這時可使用抽象類別 (也就是本程式中的 AgentOfFood.class) 來設計。
		那為什麼選用抽象類別，因為抽象類別無法將物件實體化，也就是不可從任意類別中，使用 new AgentOfFood()，其原因是，抽象類別係為了由子類別實體化的物件，來呼叫抽象類
		別中的變數或方法，如此，可避免設計者去修改既有程式碼的商業邏輯，而僅僅只需讓底層的類別去繼承抽象類別，這樣既保有原來的架構，後期在維護上也能因應不同的客戶之需求，
		建立其它的抽象類別之功能。最後設計者只需管理抽象類別包，都不需動到底層的架構
	
> Bread.java
- Description:  
		
		Bread.class is the base of all objects from o1 to o11.  

> Flavors.java
- Description:  

		While initiating the object, e.g., new Ham(), new Lettuces(), or new Egg(), Flavors.class, likely a Container, will collect object(s) 
		from its subclass, by "protected Food food;".

> Egg.java
- Description:  

		Egg.class is subclass of Flavors.class. While you initiate the object of Egg, then the global variables of "name" (i.e., protected 
		String name) and "price" (i.e., protected String name) will be implemented.

> Ham.java
- Description:  

		Ham.class is subclass of Flavors.class. While you initiate the object of Ham, then the global variables of "name" (i.e., protected 
		String name) and "price" (i.e., protected String name) will be implemented.

> Lettuces.java
- Description:  

		Lettuces.class is subclass of Flavors.class. While you initiate the object of Lettuces, then the global variables of "name" (i.e., 
		protected String name) and "price" (i.e., protected String name) will be implemented.

> OliveOil.java
- Description:  

		OliveOil.class is subclass of Flavors.class. While you initiate the object of OliveOil, then the global variables of "name" (i.e., 
		protected String name) and "price" (i.e., protected String name) will be implemented.

> Tomato.java
- Description:  

		Tomato.class is subclass of Flavors.class. While you initiate the object of Tomato, then the global variables of "name" (i.e., 
		protected String name) and "price" (i.e., protected String name) will be implemented.

> Onion.java
- Description:  

		Onion.class is subclass of Flavors.class. While you initiate the object of Onion, then the global variables of "name" (i.e., protected 
		String name) and "price" (i.e., protected String name) will be implemented.

> Tuna.java
- Description:  

		Tuna.class is subclass of Flavors.class. While you initiate the object of Tuna, then the global variables of "name" (i.e., protected 
		String name) and "price" (i.e., protected String name) will be implemented.

Observer Pattern (CipherText for RecipientCommuincation):
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day11_1/observer">Following sample codes of Observer Pattern and UML for your information:</a>

	<img width="203" alt="ObserverUML" src="https://user-images.githubusercontent.com/83496093/206376348-f554bbc5-910a-4c9f-8bbd-50f1a249f2a8.png">




	
> Observer.java
- Description:  

		This is the definition of a Java interface called Observer.

		The interface has a single method called update, which takes a String parameter named message. 

		The method does not have an implementation because interfaces only define the method signature but not the implementation.

		Any class that implements this interface will be required to provide its own implementation of the update method. 

		The purpose of this interface is to define a common contract for classes that need to observe and react to changes in a system or data.

> Subject.java
- Description:  
	
		This is the definition of a Java interface called Subject.
	
		The interface defines three methods: add, remove, and notifyObserver. All three methods are declared without implementation because 
		this is an interface.
	 
			1. add method:

				The add method takes an object that implements the Observer interface as a parameter, and its purpose is to add the 
				observer to the list of observers that the subject will notify when a change occurs.

			2. remove method:

				The remove method takes an object that implements the Observer interface as a parameter, and its purpose is to remove 
				the observer from the list of observers that the subject will notify when a change occurs.
				
			3. notifyObserver method:

				The notifyObserver method takes a String parameter named message. Its purpose is to notify all the observers that a 
				change has occurred by calling the update method on each observer and passing the message parameter.

		By defining this interface, any class that needs to act as a subject in the observer pattern can implement this interface and provide 
		its own implementation of these three methods.



> NewsTopic.java
- Description:  

		This is a Java class called NewsTopic that implements the Subject interface.

		The class has a private field called collectElementsFromObserver that is a List of Observer objects. This list is used to manage the 
		observers that are interested in receiving notifications from the subject.

		The class provides implementations for the three methods defined in the Subject interface.

			1. add method:

			   The add method adds an Observer object to the list of observers managed by the subject.

			2. remove method:

			   The remove method removes an Observer object from the list of observers managed by the subject.


			3. notifyObserver method:

			   The notifyObserver method notifies all the observers in the list by calling the update method on each observer and passing 
			   the message parameter.

		By implementing the Subject interface, this class can act as a subject in the observer pattern, and other classes can register 
		themselves as observers by calling the add method. When a change occurs, the subject can notify all the registered observers by calling 
		the notifyObserver method. The observers will receive the notification and can take appropriate actions based on the information 
		provided in the message parameter.

> Recipient.java
- Description:  

		This is a Java class called Recipient that implements the Observer interface.

		By implementing the Observer interface, this class can act as an observer in the observer pattern.

		The class has a private field called name that represents the name of the recipient.

		The class provides an implementation for the update method defined in the Observer interface.

		1. update method:

		   The update method takes a String parameter named message, which represents the message sent by the subject. 

		   The method simply prints a message to the console indicating that the recipient has received the message and displays the name of 
		   the recipient and the message itself.

		   When a change occurs in the subject, the update method will be called on each registered observer, including instances of this 
		   class. 

		   In the update method, the recipient can take appropriate actions based on the information provided in the message parameter.

> RecipientCommunication.java
- Description:  

		This is a Java class called RecipientCommunication that demonstrates the use of the observer pattern using the NewsTopic and Recipient 
		classes.

		In this example, each recipient is added to the list of observers managed by the subject, and then removed after receiving a 
		notification. 

		This demonstrates the dynamic nature of the observer pattern, where observers can be added and removed as needed, depending on the 
		requirements of the application.


------------------------------------------------------------------------------
# day11 Java Advanced: Equals & HashCode 
1. Introduction of how to improve the hashCode() Implementation could be, as following sample codes with overriding the method of<a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day11_2"> "public int hashCode(){ ... }" </a> to avoid "Hash Collision" from two different objects being equally.


2. Sincerely recommended a Book for your reference - "Effective Java 3rd Edition". You will be even better to understand the "Hash Collision" and "hashCode algorithm".
Link -> "https://www.amazon.com/Effective-Java-3rd-Joshua-Bloch/dp/0134685997" 	
 	

> EqualsFunction.java
- Description:  

		The code we provided demonstrates the usage of the equals() method and the hashCode() method in Java.

		It's important to note that the hash code calculation and the possibility of hash collisions may vary depending on the Java Virtual 
		Machine (JVM) version and implementation. 

		The behavior described in the comments is specific to the execution environment using Java-11 with JRE 16.0.1. 


> EqualsHashCode.java, OverrideEqualsHashCodeFunction.java
- Description: 

		The method of "public int hashCode(){ ... }" being overrided with the value of prime: 31, was chosen because it is an odd prime. 
		If it were even and the multiplication overflowed, information would be lost, because multiplication by 2 is equivalent to shifting. 
		The advantage of using a prime is less clear, but it is traditional. A nice property of 31 is that the multiplication can be replaced 
		by a shift and a subtraction for better performance on some architectures: 31 * i == (i << 5) - i. Modern VMs do this sort of 
		optimization automatically. Reference of "Effective Java (3rd Edition), Joshua Bloch
		


------------------------------------------------------------------------------
# day12 Java Advanced: Outer Class, Inner Class and Anonymous
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day12/InnerClass/innerclass">Introduction of Inner class</a>

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
	
> Outer.java, InnerClassTest.java
- Description:  

		Describe the rules and features of local inner classes in Java.

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day12/InnerClass/methodLocal">Introduction of method-local inner class to invoke the local variable</a>

> LocalVariableInvokedByInnerClass.java
- Description: 

		If local variable (i.e., number) expected to be invoked by Inner class, its value MUST be like characteristic as final, that is, value 
		SHALL be constant. Please read the content of LocalVariableInvokedByInnerClass$1Inner.java, which was generated by decompiler tool, at 
		"package: com.ocp.day12.InnerClass.method.decompiler".
		
		若區域變數 (此範例係指 number)，欲被內部類別調用，其區域變數的值，必須具備 final 的特性，也就是說，此區域變數必須是常數。即使區域變數不宣告為 final，編譯器將 
		LocalVariableInvokedByInnerClass.java 轉換成 LocalVariableInvokedByInnerClass.class 時，則會將 final 補上。請參 package: 
		com.ocp.day12.InnerClass.method.decompiler 的 LocalVariableInvokedByInnerClass$1Inner.java，此產出的 
		LocalVariableInvokedByInnerClass$1Inner.java 檔，係經由 decompiler 工具，將編譯後產出的 LocalVariableInvokedByInnerClass.class 反編譯回 
		LocalVariableInvokedByInnerClass$1Inner.java 檔，如此可驗證上述所提。

> LocalVariableInvokedByInnerClass$1Inner.java
- Description: 

		If local variable expected to be invoked by Inner class, its value MUST be like characteristic as final, that is, value SHALL be 
		constant. Please read the content of LocalVariableInvokedByInnerClass$1Inner.java, which was generated by decompiler tool, at package: 
		com.ocp.day12.InnerClass.method.decompiler.

> LocalVariableInvokedByInnerClassTest.java
- Description: 

		Test the sample code of LocalVariableInvokedByInnerClass.class

3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day12/InnerClass/staticInnerClass">Introduction of static Inner class</a>

> StaticInnerClassTest.java 
> Outer.java
- Description: 

		Please read the content of sample code

4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day12/anonymous">Introduction of Anonymous Inner Class & Lambda Expression</a>

> Calc.java
- Description: 

		Created a Functional Interface - Only has ONE abstraction method

> CalcImplement.java
- Description: 

		Created a method to override the abstraction method of Calc.class

> TestAnonymousInnerCalc.java
- Description: 

		Created an Anonymous Inner Class to override the method of "a class" or "an interface". 

> SpeedLimits.java
- Description: 

		Created a Functional Interface - Only has ONE abstraction method

> SpeedLimitsImplement.java
- Description: 

		Created a method to override the abstraction method of SpeedLimits.class

> TestAnonymousInnerSpeedLimits.java
- Description: 

		This sample code we introduce how to implement the abstraction method by "Anonymous Inner Class" and "Lambda Expression"

> TestAnonymousInnerSpeedLimitsByPredicate.java.
- Description: 

		This sample code we introduce how to implement the abstraction method by "Anonymous Inner Class" and "Lambda Expression" with Java 1.8 
		released API - IntPredicate and IntConsumer. 





------------------------------------------------------------------------------
# day13 Java Advanced: API - IntStream, Consumer, Supplier, BiConsumer, ObjIntConsumer, Predicate, IntPredicate, BiPredicate, Function, BiFunction, UnaryOperator, BinaryOperator, IntBinaryOperator, DoubleBinaryOperator
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day13">Introduction of functional interfaces, lambdas, and method references in Java. </a>

> StreamDemo.java
- Description:  

		The code we provided demonstrates the use of Java 1.8 - Stream API to perform operations on an array of strings.

		Overall, the code calculates and prints the number of framework names in the frameworks array whose lengths are greater than or equal 
		to 10. 

		It also prints the length of each framework name as a side effect using the peek operation.

> ConsumerDemo.java
- Description:  

		The code we provided demonstrates the use of various functional interfaces in Java 8 and later versions.

		These functional interfaces are part of the Java 1.8 functional programming features and can be used in scenarios where you need to 
		pass behavior as arguments to methods or lambda expressions. 

		They provide a way to define reusable code blocks and enhance code readability and maintainability.


> PredicateDemo.java
- Description:  

		The code we provided demonstrates the use of the Predicate, IntPredicate, and BiPredicate functional interfaces in Java.

> FunctionDemo.java
- Description:  

		The code we provided demonstrates the usage of various functional interfaces in Java.

		The code demonstrates different ways to define and use lambda expressions and functional interfaces in Java.	 		

> SupplierDemo.java
- Description:  

		The code we provided demonstrates the usage of the Supplier functional interface in Java. 

		The Supplier interface is part of the java.util.function package and is a functional interface that represents a supplier of results. 

		It has a single abstract method called get() which returns a result.

		Overall, the code demonstrates how to use the Supplier functional interface to create a supplier of results, both with a simple string 
		value and with formatted date and time strings.


> GenericOperatorTest.java
- Description: 

		The code we provided demonstrates the usage of the diamond operator (<>) and anonymous classes in Java.

		Diamond Operator (<>):
	
			The diamond operator was introduced in Java 7 and is used to infer the type arguments of a generic class instance creation. It 
			allows you to omit the explicit type arguments when the type can be inferred from the context.
	



------------------------------------------------------------------------------
# day14 Java Advanced: Enum , HashSet, LinkedHashSet, LinkedList, Iterator and HashCode

- Recap the development of Java Document:
- <img width="1020" alt="Published Date of Java API" src="https://user-images.githubusercontent.com/83496093/219851662-8f4194d0-d414-40b4-a756-2e0ee016b5a7.png">

















1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day14/enumLesson">Introduction of Enum</a>
> TestCoin.java, EnumForUSCurrency.java
- Description:
 	
		Introduction of enum class:

			1. Enum is introduced in Java 1.5 as a new type whose fields consists of a fixed set of constants 

			2. fields - The fields in the enum class are given private accessibility. 

			3. Constructors:
			   Accessibility of Constructors, MUST be in "private", eventually we do NOT specify an access modifier the enum constructor as 
			   default, but finally JRE will help to pad with "private" on constructors

			4. Constants: 
			   The constants of the enum class are defined at the top, with each constant followed by its associated value in parentheses. 

			5. The type enum class cannot be the superclass of SubClass; a superclass must be a regular class. Please refer to the 
			   "TestCoin.java"


	


> TestPositions.java, EnumPositions.java
- Description:  
		The given code is written in Java and defines a class called TestPositions and an enum called EnumPositions.

		Overall, this code demonstrates the use of enums and switch statements in Java to handle different job positions and perform actions 
		based on the selected position.


2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day14/hashSet">Introduction of Set</a> 

> HashSetDemo1.java
- Description:  

		The given code is this example of using HashSet, LinkedHashSet, and LinkedList in Java.
 	
		Overall, the code demonstrates the usage of HashSet, LinkedHashSet, and LinkedList, as well as the iteration and stream operations on 
		these collections.

> HashSetDemo2.java
- Description: 

		
		The code we provided demonstrates the use of a LinkedHashSet and an Iterator to perform various operations on a set of numbers.

		Overall, the code showcases different ways to iterate over a set and perform operations on its elements, including removing elements 
		and calculating the sum using an iterator and Java 8 Streams.

> HashSetDemo3.java
- Description: 

		This Java program demonstrates the use of LinkedHashSet and nested sets.

> Load Factor & Capacity
- Description: 

		Load Factor and Initial Capacity

3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day14/pojo">Introduction of POJO with application HashSet and LinkedHashSet</a>

> TestNumPOJO.java, NumPOJO.java, NumNonPOJOWithoutHashCode.java
- Description: 

		The NumPOJO.java with overriding the method of hashCode but neither of NumNonPOJOWithoutHashCode.java, are implemented by 
		TestNumPOJO.java. You will see the different consoles because of running the each of hashCode, respectively. For more detail info., 
		please get into the programming of hyper-link above.



------------------------------------------------------------------------------
# day15 Java Advanced: Vector, Stack, LinkedList, ListIterator, TreeSet, Set, compareTo, Comparable, Comparator, Efficiency Testing of group of objects from Collection 

1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/vector">Introduction of Vector</a>
> VectorDemo.java
- Description:  
	
		The given code is a Java program that demonstrates the use of the Vector class in Java.

		Overall, this code demonstrates the usage of the Vector class in Java and how to handle capacity and resizing. 

		It also highlights the importance of correctly managing the size and index when removing elements from a collection while iterating 
		over it.


2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/stack">Introduction of Stack</a>
> StackDemo01.java
- Description:  

		The code we provided demonstrates the use of the java.util.Stack class in Java.

		In summary, the code demonstrates various operations on a stack, including pushing elements, 
		searching for elements, peeking at the top element, and popping elements in a last-in-first-out (LIFO) order.

> StackDemo02.java
- Description:  
	
		The provided code is a Java program that demonstrates the use of a stack data structure to reverse the input characters and takes input 
		from the user using the Scanner class.

3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/list">Introduction of LinkedList</a>

> LinkedListDemo01.java
- Description:  

		The given code demonstrates the usage of a LinkedList in Java and various operations performed on it. 
		
		That's the overview of the code provided. It demonstrates how to create a LinkedList, add elements, iterate over it using a 
		ListIterator, and perform modifications on the list.



> LinkedListDemo02.java
- Description: 

		The provided code demonstrates the usage of a LinkedList in Java and shows the correct approach to remove null elements from the list 
		using a ListIterator. 

		A reminder to reader, shall NOT invoke method of ".remove(int index)" inside for-loop/for-each, because the following object of list is 
		Dynamic.

			List<String> list = new LinkedList<>();


4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/queue">Introduction of Queue</a>

> QueueDemo.java
- Description:  

		The code we provided demonstrates the usage of the Queue interface in Java.

		In summary, the code demonstrates how to use the Queue interface in Java to add, access, and remove elements from a queue using 
		different methods such as add, offer, peek, poll, and remove.


5. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/treeset">Introduction of TreeSet</a>

> TreeSetDemo01.java
- Description:  

		The code we provided demonstrates the usage of a TreeSet in Java. 
	
		A TreeSet is an implementation of the Set interface that maintains its elements in sorted order.



> TreeSetDemo02.java
- Description:  

		The given code is written in Java and demonstrates the use of LinkedHashSet and TreeSet to store and order elements.

> TreeSetDemo03.java
- Description:  

		The given code demonstrates the usage of the TreeSet class in Java. 

		It creates a TreeSet object, adds elements to it, and then traverses the elements using an iterator.
		

6. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/comparable">Introduction of Comparable</a>

> Employee.java
- Description:  TBD

> SortType.java
- Description:  TBD

> TreeSetComparable.java
- Description:  TBD

7. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/comparator">Introduction of Comparator</a>

> Comparator4Books.java
- Description:  TBD




8. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/efficiency">Efficiency Testing of Sub-classes from Collection</a>
- *** TBD - Notice here !!! The UML digrames will be revised with adding x-axis and y-axis, against the Efficiency/Security and Released Date of each API, for more precisely ***
- <img width="203" alt="Screen Shot 2022-12-28 at 10 24 23 AM" src="https://user-images.githubusercontent.com/83496093/209747502-93a2e299-728b-48ec-a567-abe1ae6b0ae2.png">




> ListEfficiency.java
- Description: 

		The executed efficiency of List in this sample code, you will learn the instantiated object of List from 1) always use the same object 
		of list to proceed the loop function, 2) always use the newly object of list to proceed the loop function. 

> TreeSetEfficiency.java
- Description: 

		The executed efficiency of TreeSet is faster than List by 6 times, almost. Pleease check out the sample code for more detail. 

> ArrayListEfficiency.java
- Description:  TBD

> VectorEfficiency.java
- Description:  TBD

> StackEfficiency.java
- Description:  TBD

> LinkedListEfficiency.java
- Description:  TBD

> LinkedHashSetEfficiency.java
- Description:  TBD

> HashSetEfficiency.java
- Description:  TBD

> QueueEfficiency.java
- Description:  TBD

> DequeEfficiency.java
- Description:  TBD

> PriorityQueueEfficiency.java
- Description:  TBD

> ArrayDequeEfficiency.java
- Description:  TBD


> ***** Another sample codes , TBD *****


------------------------------------------------------------------------------
# day16 Java Advanced: Hashtable, Enumeration, LinkedHashMap, HashMap, TreeMap, Collectors and Arrays.asList
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day16/map">Introduction of Sub-classes from Map - Hashtable, Enumeration, LinkedHashMap, and HashMap</a>

> HashTableDemo.java
- Description:  TBD

> HashMapDemo1.java
- Description:  TBD

> HashMapDemo4double.java
- Description:  TBD

> HashMapDemo4int.java
- Description:  TBD

> LinkedHashMapDemo.java
- Description:  TBD

> Load Factor & Initial Capacity (hashMap).docx
- Description:  

		Load Factor and Initial Capacity for hashMap


2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day16/map/comparable">Introduction of Sub-classes from Map - TreeMap and HashMap with an application of Comparable</a>

> TreeMapDemoComparable.java
- Description:  TBD

> HashMapDemoComparable01.java
- Description:  TBD

> HashMapDemoComparable02.java
- Description:  TBD

> HashMapDemoComparable03.java
- Description:  TBD

> Student.java
- Description:  TBD

> Exam.java
- Description:  TBD



3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day16/collections">Introduction of Collections - with an application of Comparator</a>

> CollectionsDemo.java
- Description:  TBD

> SQL - VIEW Sales_Order_Detail.docx
- Description: 

		Creating an object of "Collections.unmodifiableList" for developer to query the element of List. This concept is likely to create a 
		VIEW Table in - database, please check out the File: "SQL - VIEW Sales_Order_Detail.docx". But, to be noticed here, the concept of add, 
		set, delete, clear and remove from methods of List (i.e., the object of List is returned from "Collections.unmodifiableList"), is 
		different from VIEW Table in database.			

		The VIEW Table in database:
		The rows of column that developer does query the VIEW table (i.e., Table of v_Sales_Order_Detail in File: "SQL - VIEW 
		Sales_Order_Detail.docx"), is completely from the original data of Table: Sales_Order_Detail. Developer can add, query, update, and 
		delete in the VIEW table, repectively.	

		DB Engineer creates VIEW table, is likely to limit the accessed privilege of column(s) and only present the columns in need for 
		developer


4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day16/collector">groupingBy of Collector</a>

> MapGroupingBy.java (TBD)
- Description:  TBD

> PurchasedOrder.java (TBD)
- Description:  TBD

> ArraysAsListDemo.java
- Description:  
		
		Difference between Arrays.asList() and ArrayList

5. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day16/efficiency">Efficiency Testing of Sub-classes from Map</a>  

- *** TBD - Notice here !!! The UML digrames will be revised with adding x-axis and y-axis, against the Efficiency/Security and Released Date of each API, for more precisely ***
- <img width="203" alt="Map - data structure" src="https://user-images.githubusercontent.com/83496093/211237775-2aaa3bc1-7dc2-4c17-9b0d-fa20862d9571.png">





> TreeMapEfficiency.java
- Description:  TBD

> HashMapEfficiency.java
- Description:  TBD

> LinkedHashMapEfficiency.java
- Description:  TBD


------------------------------------------------------------------------------
# day17 Java Advanced: RuntimeException, Exception, Throwable
<br>![Throwable subclasses_20230413](https://user-images.githubusercontent.com/83496093/231677905-d1c3b810-6d8f-487f-a678-1d58722ed34b.png)<br>

1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day17/exception">Introduction of Exception</a>

> ExceptionDemo1.java
- Description:  

		Methods can throw a customized exception or a sub-classes exception from Exception or RuntimeException.

> ExceptionDemo2.java
- Description:  

		Demonstrate of try-catch and finally statement 

> ExceptionInputMismatchDemo.java
- Description:  

		Demostration of how to use if/else conditions and try/catch block for catching the bugs and throwing out the error messages. 

> ExceptionWithTermination01.java
- Description:  

		The try-catch and finally statement for exception handling, the block code of "finally" MUST be executed eventually the code block of 
		catch statement does NOT handle any exception/error. 
	

		Of this lesson, we are going to demonstrate a function of "return" and "System.exit(0)" with application of try-catch and finally 
		statement.

> ExceptionWithTermination02.java 
- Description:  

		Application of System.exit(0) in try-catch and finally statement. Also, this session is involved the API of java.nio (BufferedReader 
		and FileReader - more detail of java.nio in the following lecture)

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day17/exception/runtimeexception">Introduction of sub-classes from RuntimeException</a>

> RuntimeExceptionDemo.java
- Description:  

		Demonstrate the application of RuntimeException

> IndexOutOfRangeExceptionDemo.java
- Description:  

		Demostration of how to write a precisely exception without throwing exception by RuntimeException

> ExceptionDenominatorDemo.java
- Description: 

		Demostration of subclasses from RuntimeException

3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day17/exception/application/loginpage">Application of Exception for Login System</a> <br>
> LoginException.java <br>
- Description:  

		Creating a LoginException for reDirection to end-user to proceed the next step. But, if end-user tries to submit username and password 
		in 3 times and failure, the system will terminate the verification of login process.

> LoginExceptionDemo.java <br>
- Description:  

		Create a verification of login system from back-end

4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day17/exception/application/data">Application of Exception for Data Analysis</a> <br>
> Toxin.java <br>
- Description:  

		Definition of object(s) that will be collected by Gson object

> DataAnalysisException.java <br>
- Description:  

		You will learn from this lesson:  
			1. API of Gson (external API, released by Google) 
			2. API of gson.fromJson 
			3. API of URL 
			4. API of useDelimiter 
			5. Open source of json content on-line 
			Link as following -> https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx

> DelimiterSample.java
- Description:  

		This sample code is integrated with DataAnalysisException.java. Suggested to reader before reading DataAnalysisException.java, please 
		study this sample code. 

> SplitSample.java
- Description:  

		The application of split you will learn from this lesson.


------------------------------------------------------------------------------
# day18 Java Advanced: Assertion
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day18/assertion">Introduction of assert keyword</a><br>
> Area.java
- Description: 

		Created methods of getArea() and getPerimeters() for returning the calculation to main class.

> AssertionDemo.java
- Description: 

		The application of assert keyword of Java 1.4 

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/Test/java/day18">Introduction of Junit Test</a>
> TestArea.java
- Description:  

		Create many different methods for Junit Test

------------------------------------------------------------------------------
# day19 Java Advanced: Java DataBase Connection (JDBC)
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day19/jdbc/connection">Introduction of JDBC</a>
> TestConnection4MySQL.jaba
- Description: 

		Of this lesson, you will learn the JDBC Architechture. 
		
		Note: This lesson will need to udpate following operation of JDBC 4.0 META-INF > service > java.sql.Driver [Continue] 

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day19/jdbc/select">Introduction of SELECT statement</a>
> Select.java
- Description: 

		Application of query according to SELECT statement of MySQL 

[Continue]
> Select4ClientDataSource1.java <br>
- Description: 

		Application of query with combination of external resource from "org.apache.derby.jdbc.ClientDataSource" 
		
		Note: Begining of this lesson, we did convert Dynamic Web Project to Maven Project. 

> Select4ClientDataSource2.java <br>
- Description: 

		Same as Select4ClientDataSource1 but different process without "Class.forName("org.apache.derby.jdbc.ClientDriver")"
		
		Note: Begining of this lesson, we did convert Dynamic Web Project to Maven Project. 

[Continue]
> DBTest.java <br>
- Description: <br>

[Continue]
> Dao.java <br>
- Description: <br>

[Continue]
> Department.java <br>
- Description: <br>

[Continue]
> Employee.java <br>
- Description: <br> 

------------------------------------------------------------------------------
# day20 Java Advanced: Thread, Runnable, Callable, FutureTask, CyclicBarrier, ThreadPoolExecutor, ScheduledExecutorService, Executor, ExecutorService, Fibonacci, ForkJoinTask, Synchroization, Concurrency


1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/thread">Introduction of Thread</a>

> ThreadFlow.java. 
- Description:  

		The given code represents a multi-threaded program in Java.

		Note that the execution order may vary slightly between runs since the threads are running concurrently.

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/thread/daemon">Introduction of Daemon Thread</a>
> DaemonThreadExample1.java <br>
- Description: 
		
		Of this lesson, we create a daemon thread that runs an infinite loop, printing a message every second. We set the daemon flag to true 
		which is likely calling method of setDaemon(true) to mark the thread as a daemon thread. 
		
		In the main thread, we print a message and sleep for 5 seconds before printing another message. 
		
		Because the daemon thread is running in the background and does not block the main thread, the program will exit after the main thread 
		finishes execution, even though the daemon thread is still running. 
		
		For the specifically operation of Daemon thread, please refer to the DaemonThreadExample2.java 

> DaemonThreadExample2.java and Log.java <br>
- Description:  

		If you call the setDaemon(true) method after stating of the thread, the method of "public final void setDaemon(boolean on) {...}" will 
		throw IllegalThreadStateException. 

3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/thread/priority">Introduction of Thread Priority</a><br>
> ThreadPriority.java and Log.java <br>
- Description:  

		Thread priority is used by the underlying operating system to determine the order in which threads are scheduled to execute.

4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/thread/guessnumber">Application of using multiple threads to guess the lucky ball</a>
> Guesses.java <br>
- Description:  

		Instantiate the instance of LuckyBall and initiate the fields of id_num, name, number and threadName. 

> LuckyBall.java <br>
- Description:  

		Design a method of Algorithm for record of how many times of each thread being conducted into guessing the Lucky Ball from users. 

5. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/runnable/daemon">Introduction of Runnable</a> <br>
Continue of DaemonThreadExample1.java, we updated the inheritance of Log.java from "extends to Thread" to "implements Runnable" <br>
Because only one super class could be extended to, what if we need to extend to any other class, respectively? We will do implement Runnable interface!  
 	
> In general speaking, we do encourage the use of Runnable over Thread: <br>

	1) While extending the Thread class, we're NOT overriding any of Thread's methods. However, we do override the method of Runnable (which Thread 
	conducts implementation of Runnable). 
	   
	This is a clear violation of IS-A Thread principle. For more detailed info of violation of IS-A Thread principle, please read the following 
	description: 
	   
	The "IS-A Thread" principle refers to the concept that a class that extends the Thread class is a type of thread, and should therefore be used 
	as a thread in the same way that the Thread class is used. 

	The principle of IS-A is a fundamental principle of object-oriented programming, which states that a subclass should be able to be used 
	anywhere that its superclass is expected. 

	In the case of threading, if a class extends the Thread class, it should be able to be used in the same way that the Thread class is used. 

	However, when extending the Thread class, it is generally not recommended to override the Thread class's run() method directly. Instead, it is 
	recommended to implement the Runnable interface and pass an instance of the class to a Thread object's constructor. 

	This is because the Thread class provides other functionality besides just running a thread, such as managing thread states and handling thread 
	interruptions. 

	By implementing the Runnable interface and passing it to a Thread object, we can separate the code that will actually run in the thread from 
	the underlying thread management functionality provided by the Thread class. 

	So, while it is technically possible to override the Thread class's run() method when extending the Thread class, it is generally not 
	recommended and can be considered a violation of the IS-A Thread principle. 

	The preferred approach is to implement the Runnable interface and separate the thread management functionality from the code that runs in the 
	thread. 

	2) Beginning of Java 1.8, Runnable can be represented as lambda expressions 

> DaemonRunnableExample1.java and LogImpl1.java <br>
- Description: 

		Continue of DaemonThreadExample1 

> DaemonRunnableExample2.java and LogImpl2.java <br>
- Description: 

		Continue of DaemonThreadExample2  


6. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/synchronizedmethod">Synchronized Methods</a> <br>
		
> SynchronizedCounter.java <br>
- Description:  
		
		A synchronized method is a method in Java that can only be accessed by one thread at a time. When a thread invokes a synchronized 
		method, it acquires the lock for that method, which prevents other threads from accessing the method until the lock is released. Here's 
		an example of a synchronized method:

		In this example, we create two threads thread1 and thread2 that increment the Counter object 1000 times each using the increment() 
		method. We start the threads using the start() method, which causes them to execute concurrently.

		We then use the join() method to wait for both threads to finish before printing the final count using the getCount() method. Because 
		the increment() method is synchronized, we can safely update the count from multiple threads without causing race conditions or other 
		concurrency issues.

		This example should output a final count of 20000 if the Counter class is implemented correctly.


> SynchronizedCounter2.java <br>
- Description:  
		
		How to make non-synchronized method to be likely with same synchronized function? Please read the code of three consoles, respectively.
		
 
> <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/synchronizedmethod/cookiesdispatcher">Cookies.java, CookieNotifyTest.java, Eat.java and Put.java</a>
- Description:  

		These sample codes that simulate a plate of cookies that can be eaten by a dog and refilled by an owner, and also test the 
		synchronization of the eat() and put() methods in the Cookies class to ensure that the dog and the owner interact with the plate of 
		cookies correctly. 


> <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/synchronizedmethod/e_commerce">Customer.java, Item.java, Order.java, OrderAcceptor.java, OrderProcessor.java and OrderQueue.java</a>
- Description:  

		You have a multi-threaded application that processes orders for an e-commerce website. One thread might be responsible for accepting 
		new orders and adding them to a queue, while another thread might be responsible for processing orders from the queue and updating the 
		website's inventory.

> <a
href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/synchronizedmethod/e_commence2">Customer2.java, Item.java, Order.java, OrderAcceptor2.java, OrderProcessor2.java and OrderQueue2.java</a>
- Description:  

		We refined the code of OrderQueue2, OrderAcceptor2, and OrderProcessor2 from e_commerce package, to avoid experiencing deadlock.
	

7. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/runnable/application/bank">Application of ATM w/ synchronized and w/o synchronized's principle</a>
> ATM.java, Withdraw.java, JointAccout.java <br>
- Description:  

		Of this application of transaction demonstration, you will learn a strictly bug while using non-synchroized during transaction. To make 
		a method synchronized, simply add the synchronized keyword to its declaration



8. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/callable">Introduction of Callable and FutureTask</a>
> Lottery.java    <br>
- Description:  
		
		The Lottery class implements Callable<Set<Integer>> which means that it can be used as a task that returns a set of integers and may 
		throw an exception. The Lottery class contains a method call() which is called when the Lottery object is executed as a task.

> LotteryMain.java <br>
- Description:  

		The program is an example of using a FutureTask with a Callable to generate a set of random numbers as "Lucky Balls" for a lottery 
		game. 

> FutureTaskDemo1.java <br>
- Description:  

		The FutureTaskDemo1 class is an example of how to use FutureTask and Thread in Java. 

> FutureTaskDemo2.java <br>
- Description:  

		The FutureTaskDemo2 class is an example of how to use FutureTask and ExecutorService in Java. 

	
9. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/closeable">Introduction of Closeable</a><br>

> MainClose.java and CloseImpl.java <br>
- Description:  
	
		Classes that implement the Closeable interface are designed to be used with a try-with-resources statement,  which ensures that the 
		resources are automatically released when the block of code that uses them is exited, either normally or due to an exception being 
		thrown. 
		The try-with-resources statement was introduced in Java 1.7 as a convenient and safe way to handle resource management in Java 
		programs.

10. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/cyclicbarrier">Introduction of CyclicBarrier</a><br>
	
> CyclicBarrierDemo.java and JointAccountWithCyclicBarrier.java
- Description:  
		
		CyclicBarrier is a synchronization aid in Java that allows a set of threads to wait for each other to reach a certain point of 
		execution before continuing.   
 	
		It is a barrier that all threads must wait at until all of them have reached that point, and then the barrier is released, and all 
		threads can continue executing.

		A CyclicBarrier is initialized with a fixed number of parties, which is the number of threads that need to reach the barrier. 

		As each thread arrives at the barrier, it calls the await() method, which causes it to wait until all other threads have also arrived 
		at the barrier. 

		Once all the threads have arrived, the barrier is released, and all threads can continue executing.	

		Application of CyclicBarrier:

			1) CyclicBarrier can be useful in situations where you have multiple threads that need to work in parallel on a particular task and need to synchronize their execution at certain points, and then wait for each other to complete before moving on to the next stage of processing.

			2) It is also useful in cases where you need to split a larger task into smaller sub-tasks and want to wait until all sub-tasks are completed before proceeding at a later stage.
	
> Transaction.java
- Description:  
		
		For a group of members to start a transaction, you can use a CyclicBarrier.
	
> CyclicBarrierImplThread.java
- Description:  

		This code demonstrates how to use the CyclicBarrier class to synchronize multiple threads in a concurrent program. 

> CyclicBarrierImplRunnable.java
- Description:  
	
		This implementation, it is similar to the one (i.e., CyclicBarrierImplThread.java) with threads, but uses Runnable tasks instead of 
		directly creating threads. 

> CyclicBarrierImplCallable.java
- Description:  
		
		This example is missing the code to submit the Callable tasks to a thread pool for execution, that's why the console you see it's 
		continually awaiting another 2 tasks to reach the barrier. 		

		In the current implementation, the tasks are being executed sequentially in the main thread, which is why you see the console-lines 
		"main is doing some work" and "main is waiting at the barrier" instead of the messages from the Worker tasks. 	

		To execute the tasks in parallel using a thread pool, you can use a ExecutorService to submit the tasks and wait for their completion 
		using Future objects. 	
		
		Please refer to the sample code of "CyclicBarrierImplCallableWithThreadPool.java" 

> CyclicBarrierImplCallableWithoutThreadPool.java
- Description:  
		
		
		This approach creates a new thread for each task and is NOT very efficient, especially if we need to execute a large number of tasks. 
		
		A better approach is to use a thread pool, which can manage a group of threads and reuse them to execute multiple tasks.
		
		Please refer to CyclicBarrierImplCallableWithThreadPool.java and CyclicBarrierImplCallableWithThreadPool2.java for a better approach.


> CyclicBarrierImplCallableWithThreadPool.java
- Description:  Using an ExecutorService with a thread pool is a good approach to manage the execution of multiple Callable tasks efficiently.


> CyclicBarrierImplCallableWithThreadPool2.java
- Description:  In this sample code, we create a thread pool with 3 threads using the Executors.newFixedThreadPool(3) method.

> Summaries:

		CyclicBarrier is a useful tool for synchronizing threads and coordinating their execution. The implementation of CyclicBarrier can be 
		done using Thread, Runnable, or Callable. 

		It may not be suitable for simple tasks where no return value is needed.
		Overall, the choice of implementation (Thread, Runnable, or Callable) depends on the complexity of the task and whether a return value 
		is needed. For simple tasks, the Thread or Runnable approach may be sufficient, while for more complex tasks that require a result, the 
		Callable approach is recommended. It is also important to consider the efficiency of thread management and resource usage, in which 
		case submitting tasks to an ExecutorService is recommended.

		Here are the pros and cons of each approach:
![CyclicBarrier](https://user-images.githubusercontent.com/83496093/226577396-0aa03131-3e46-4013-a147-5c0df37ad441.png)


	
11. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/executor/describe">The structure of the Executor and its main subclasses</a> <br>
[Continue]: please insert the image of Structure for Executor
> ExecutorDescribe.java
	
		

 	
 	interface:
 		
 		1) Executor
 			
 		   		i. The Executor interface is at the top of the executor hierarchy.
 		   		
 		   		ii. The Executor interface defines a single method, execute(Runnable), for executing tasks in a separate thread or 
				thread pool.
 		
 		2) ExecutorService extends Executor
 		
 				i. The ExecutorService interface extends Executor and adds methods for managing the lifecycle of the executor, such as 
				starting and stopping it.
 				
 		3) ScheduledExecutorService extends ExecutorService
 		
 				i. The ScheduledExecutorService interface extends ExecutorService and adds methods for scheduling tasks to be executed 
				at a specific time or with a specific delay.
 				
 	abstract:
 		
 		1) AbstractExecutorService implements ExecutorService
 		
 				i. The AbstractExecutorService class provides a skeletal implementation of the ExecutorService interface, making it 
				easier to implement custom executor services.
 				
 	class:
 	
 		1) ThreadPoolExecutor implements ExecutorService
 			
 				i. The ThreadPoolExecutor class is a concrete implementation of the ExecutorService interface that manages a pool of 
				worker threads. 
 				
 				ii. It provides methods for setting the core and maximum pool size, as well as other properties of the thread pool.
 				
 				
 		2) ScheduledThreadPoolExecutor implements ScheduledExecutorService
 		
 				i. The ScheduledThreadPoolExecutor class is a concrete implementation of ScheduledExecutorService that manages a thread 
				pool and can schedule tasks to be executed at a specific time or with a specific delay.
 				
 		
 		3) ForkJoinPool implements ExecutorService
 				
 				i. The ForkJoinPool class is a specialized implementation of ExecutorService that is designed for parallel processing 
				of tasks that can be divided into smaller subtasks.
 				
 		4) SingleThreadExecutor implements ExecutorService
 				
 				i. The SingleThreadExecutor class is an implementation of ExecutorService that executes tasks using a single thread.
 				
 		5) WorkStealingPool implements ExecutorService
 				
 				i. The WorkStealingPool class is an implementation of ExecutorService that manages a pool of worker threads that can 
				steal tasks from each other to improve load balancing.
 				
 		6) ManagedBlocker implements ExecutorService
 		
 				i. The ManagedBlocker class is an implementation of ExecutorService that provides support for thread blocking and 
				unblocking.
 		


> <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/executor/demo">ExecutorDemo.java and ExecutorTask.java</a>
- Description:  

		This code demonstrates the use of the Executor interface to execute multiple Runnable tasks asynchronously. The Executor interface 
		provides a way to decouple task submission from task execution, allowing the tasks to be executed in parallel without blocking the main 
		thread.
	
	


12. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/executor/scheduledexecutorservice">Introduction of ScheduledExecutorService and ScheduledFuture</a>

		
		ScheduledExecutorService is an interface in the Java programming language that provides a way to schedule tasks to be executed at a 
		specified time or with a fixed delay. It is part of the java.util.concurrent package and is commonly used in multi-threaded applications 
		where tasks need to be executed periodically or at a specific time.


		The ScheduledExecutorService interface provides methods for scheduling tasks to be executed, such as schedule(), scheduleAtFixedRate(), 
		and scheduleWithFixedDelay(). These methods take a Runnable or Callable object as a parameter and specify the time or delay at which the 
		task should be executed. The ScheduledExecutorService manages the execution of these tasks in a background thread, allowing the 
		application to continue running without interruption.


		ScheduledFuture is an interface that represents a delayed result of a scheduled task. When a task is scheduled using the 
		ScheduledExecutorService, a ScheduledFuture object is returned that can be used to check the status of the task, cancel the task, or 
		retrieve the result of the task once it has completed. The ScheduledFuture interface extends the Future interface, which is used to 
		represent the result of an asynchronous computation.


		Using the ScheduledExecutorService and ScheduledFuture interfaces, developers can easily schedule tasks to be executed at a specific 
		time or with a fixed delay, and manage the execution of those tasks in a background thread. This makes it easier to write efficient and 
		responsive multi-threaded applications that can perform tasks at specific intervals or times.
	
	
	
	
	
> <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/executor/scheduledexecutorservice">NewSingleThreadScheduledExecutorDemo.java, Lottery1.java, Lottery2.java, Lottery3.java</a>
- Description:
	
		Introduction of this sample code:
 	
 		This NewSingleThreadScheduledExecutorDemo class demonstrates the use of the ScheduledExecutorService interface to schedule tasks for 
		
		execution. 
 	
 		It creates a new instance of ScheduledExecutorService using the newSingleThreadScheduledExecutor() method of the Executors class, 
 	
 		which returns a single-threaded executor. 
 	
 		It then schedules three tasks to run after a delay of one second each using the schedule() method of the ScheduledExecutorService 
		
		interface.
 			 
	 		1) The first task is an instance of the Lottery1 class	 		  	 		  
	 		
	 		2) The second task is an instance of the Lottery2 class
	 		
	 		3) The third task is an instance of the Lottery3 class
	 		

		The result of obtaining tasks:
			
			1) The first and third's task are obtained using the get() method of the ScheduledFuture interface
			
			2) The second task is obtained using the getResult() method of the Lottery2 class	
 
	
	
	
	
	
	

> <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/executor/scheduledexecutorservice/scheduleWithFixedDelayAndscheduleAtFixedRate">NewSingleThreadScheduledExecutorDemo2.java, Lottery1.java, Lottery2.java</a>
- Description:
	
		The NewSingleThreadScheduledExecutorDemo2 class demonstrates the use of a ScheduledExecutorService instance that executes two tasks: 
		
		Lottery1 and Lottery2. 
 	
	 	ScheduledExecutorService is a Java interface that provides methods to schedule the execution of tasks at a specified time or with a 
		
		fixed delay/interval.
 	
	 	Please notice the following code is unreachable. 
 	
			scheduledFuture4LotteryTask2.get(); // wait for Lottery2 to complete
			System.out.println("Lottery2 task completed time: " + new Date());
			scheduledExecutorService.shutdown();

 		This is because scheduledFuture4LotteryTask2.get() will block the thread until the task is complete, but the task is scheduled to run 
		
		indefinitely every second using scheduleAtFixedRate(). Therefore, scheduledFuture4LotteryTask2.get() will never complete, and the 
		
		subsequent code to print the completion time and shutdown the executor service will never execute.
	
	
	
	
	
13. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/threadpoolexecutor">Introduction of ThreadPoolExecutor</a><br>	

> <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/threadpoolexecutor/job">JobDemo4newCachedThreadPool.java, Task1,java, and Task2,java</a>
- Description:
		
		1. This code implements a thread pool using the ThreadPoolExecutor class in Java. 
	   The program creates a thread pool using the Executors.newCachedThreadPool() method, 
	   which creates a thread pool that creates new threads as needed and reuses previously constructed threads when they are available.
	
		2. The program then submits 5 tasks to the thread pool, alternating between Task1 and Task2. 
	   Each task simulates some work by sleeping for a random amount of time between 1 and 5 seconds using TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1).
	
		3. After all tasks have been submitted, the program initiates a graceful shutdown of the thread pool using executors.shutdown(). 
	   The program then waits for 5 seconds for all tasks to be completed using executors.awaitTermination(5, TimeUnit.SECONDS). 
	   If any threads inside the thread pool are not executed completely, the program outputs the thread name that is awaiting for remaining thread(s) being executed. 
	   Otherwise, the program prints out "All tasks were executed and completed, so Pool thread was closed!".
	   
		4. The Task1 and Task2 classes implement the Runnable interface, which allows them to be executed in a thread pool. 
	   Each task simulates some work by sleeping for a random amount of time between 1 and 5 seconds using TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1). 
	   When the task is executed, it outputs a message to the console indicating that it has been assigned to the thread pool and another message indicating that it has been executed.
	

	


> <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/threadpoolexecutor/lottery">JobDemo4newFixedThreadPool.java, Task.java</a>
- Description:
	
		Of this lesson, we demonstrate two type of thread pool - 'newCachedThreadPool' and 'newFixedThreadPool', differently.  
 	
	 	Which one is better depends on the specific requirements of the program. 
 	
 		In general, it's a good idea to experiment with different thread pool configurations and measure their performance to determine the best fit for a specific program.
	
	



> <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/invokeallAndinvokeany">ExecutorService4InvokeDemo.java, Lottery3.java</a>
- Description:
	
		This is a Java code example that demonstrates the use of the ExecutorService.invokeAll() and ExecutorService.invokeAny() methods.
 	
		invokeAll() and invokeAny() are both methods of the ExecutorService interface in Java, which allow you to submit a collection of tasks 
		to a thread pool for execution. 	
	
		The main difference between the two methods is in their return types and behavior:
 	
	 	
			invokeAll():
	 			 		
				1) invokeAll() takes a collection of Callable tasks, and returns a list of Future objects. 
	 			 		
					The Future objects can be used to retrieve the result of each task after it has completed.
	 		   
					i.e., invokeAll() submits all tasks for execution and waits for all of them to complete.
	 	 		 	 	

			invokeAny():
	 	  	 	  	
				1) invokeAny() also takes a collection of Callable tasks, but it returns the result of the first task that completes 
				   successfully. 
	 	  	
				   It does not return a Future object for each task.
	
		
		Overall, this code demonstrates how to submit multiple tasks to a thread pool using the invokeAll method and obtain their results, 
		
		as well as how to obtain the result of the first completed task using the invokeAny method.
	
	
	
	

	
14. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/forkjoin">Introduction of Fork/Join framework</a><br>	
	
	
		Introduction of Fork/Join framework:
	
			The Fork/Join framework is a Java concurrency mechanism that enables the parallel execution of tasks in a recursive divide-and-
			conquer approach. 
		
			It is designed to efficiently handle workloads that can be broken down into smaller, independent pieces that can be processed in 
			parallel.
		
			One of the key benefits of the Fork/Join framework is that it can take advantage of multiple processors and cores, 	
			which can significantly improve the performance of parallelizable algorithms. 
		
			Additionally, the framework automatically balances the workload among the available threads, ensuring that each thread is 
			working on a comparable amount of work.
 		
	 		Overall, the Fork/Join framework is a powerful tool for writing efficient, parallelizable code in Java.
 		
 		
			The Fork/Join framework consists of two main components: 

				1) ForkJoinPool 

						The ForkJoinPool is a thread pool that manages the execution of ForkJoinTasks.

				2) ForkJoinTask

						The ForkJoinTask is an abstract class that represents a task that can be divided into smaller subtasks. 

						When a ForkJoinTask is executed, it may split itself into multiple subtasks, which are then executed in 
						parallel by the threads in the ForkJoinPool.
 			  		

> <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/forkjoin/recursivetask">ForkJoinTaskDemo.java, Task.java</a>
- Description:
		
		This program demonstrates how to use the Fork/Join framework to calculate the sum of an array of integers.
	
	
	
	
	
	
15. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day20/fibonacci">Introduction of Fibonacci</a><br>	
	
	
		 Introduction of Fibonacci:
	 	
			1) Fibonacci can be used as an example problem for demonstrating different programming concepts and techniques.

			   For example, the Fibonacci sequence can be used to demonstrate recursion, dynamic programming, and parallel programming. 

			2) Implementing the Fibonacci sequence can be a good exercise for beginner programmers to learn these concepts.

			3) Note that for larger values of THRESHOLD, the recursive algorithm can be very slow and may cause a stack overflow error. 

			   In practice, it is often better to use an iterative algorithm or a more efficient algorithm, such as dynamic programming, to 
			   
			   compute large Fibonacci numbers.

			4) Also, the Fibonacci sequence is often used as an example of a problem that can be solved using the fork/join framework.

			   The ForkJoinTask class provides a way to divide a task into smaller sub-tasks that can be executed in parallel on multiple 
			
			   processors. 
 	
 			  		

> <a href="https://github.com/JamesCoding888/JavaOCP20221017/blob/master/JavaOCP20221017/src/main/java/com/ocp/day20/fibonacci/FibonacciExecutionTime.java">FibonacciExecutionTime.java</a>
- Description:
		
 		
 		The following code demonstrates three different ways of computing the nth Fibonacci number, using recursion, iteration, and dynamic 
		programming, and compares the execution times of each approach.
 		
 		For the sample code with fork/join framework to compute the nth Finonacci number, please refer to FibonacciForkJoin.java.
 		
	
	

> <a href="https://github.com/JamesCoding888/JavaOCP20221017/blob/master/JavaOCP20221017/src/main/java/com/ocp/day20/fibonacci/FibonacciForkJoin.java">FibonacciForkJoin.java</a>
- Description:
		
 		
 		Here's an example of solving the Fibonacci sequence using the fork/join framework.
 	
	 	In this example, we extend the RecursiveTask class and override the compute() method to compute the nth Fibonacci number. 
 	
 		In summary, this code shows an implementation of the fork/join framework to compute the nth number in the Fibonacci sequence 
 	
	 	by breaking down the computation into smaller subtasks that can be executed asynchronously.
	
	

	
> <a href="https://github.com/JamesCoding888/JavaOCP20221017/blob/master/JavaOCP20221017/src/main/java/com/ocp/day20/fibonacci/FibonacciForkJoinWithInvokeAll.java">FibonacciForkJoinWithInvokeAll.java</a>
- Description:
		
 		
 		Here's an example of solving the Fibonacci sequence using the fork/join framework.
 	
		In this example, we extend the RecursiveTask class and override the compute() method to compute the nth Fibonacci number.

		The invokeAll method is called on the list of subtasks, which will execute them all asynchronously in separate threads. 

		In summary, this code shows an implementation of the fork/join framework to compute the nth number in the Fibonacci sequence 

		by breaking down the computation into smaller subtasks that can be executed asynchronously.

	
	
> <a href="https://github.com/JamesCoding888/JavaOCP20221017/blob/master/JavaOCP20221017/src/main/java/com/ocp/day20/fibonacci/FibonacciForkJoinWithForkJoinPool.java">FibonacciForkJoinWithForkJoinPool.java</a>
- Description:
		
 		
 		The code is an implementation of the Fibonacci sequence using the fork/join framework in Java. The Fibonacci sequence is a series of 
		numbers where each number is the sum of the two preceding ones, starting from 0 and 1.
	

		The class FibonacciForkJoinWithForkJoinPool extends the RecursiveTask class, which represents a task that can be split into smaller 
		subtasks and executed asynchronously in separate threads. 

		Also, the class FibonacciForkJoinWithForkJoinPool allows for more control over the number of threads used.

		In Summary of both of the FibonacciForkJoinWithInvokeAll and FibonacciForkJoinWithForkJoinPool classes:

			1) Both of classes use the fork/join framework to compute the nth Fibonacci number recursively in parallel. 

			   However, they differ in the way the subtasks are executed and the number of threads used.

			2) FibonacciForkJoinWithInvokeAll:

			   Use the invokeAll() method to execute the subtasks asynchronously in separate threads. 

			   The two subtasks are created and added to a list, which is then passed to the invokeAll() method. 

			   The invokeAll() method returns when all the subtasks are complete, and the results are obtained using the join() method.

			3) FibonacciForkJoinWithForkJoinPool:

			   Use the ForkJoinPool class to execute the subtasks. The ForkJoinPool class is instantiated with the desired number of 
			   threads, and the invoke() method is called on the main task to execute the computation. 

			   The invoke() method returns the result of the computation, which is obtained using the join() method.

			   FibonacciForkJoinWithForkJoinPool also has a maximum number of threads limit. The number of threads created is based on the 
			   number of processors available and also the maximum limit set as MAXIMUM_NUMBER_THREADS.

			   The ForkJoinPool will create threads up to this limit, and if there are more subtasks than threads available, some of the 
			   subtasks will have to wait for a thread to become available before they can be executed.

	

	
	
	
	
	
------------------------------------------------------------------------------
# day21 Java Advanced: IO, File, FileReader, BufferedReader, FileWriter, BufferedWriter, URL, InputStream, FileOutputStream, NIO, Path, Paths

> Directory.java
- Description: 
	
	
	
		This Java program checks whether the specified paths represent directories or files 

		using the isDirectory() and isFile() methods of the File class.

		Overall, this program demonstrates how to use the isDirectory() and isFile() methods of the File class 

		to check whether a path represents a directory or a file.

> FileCreated.java
- Description: 
	
	
		This program uses the Java File class to create and check for the existence of a file.

		It is useful when we need to create a new file in the file system, 

		such as for storing data or configuration files for our Java application.

> FolderCreated.java
- Description: 
	
	
	
		The given code is a Java program that creates a new folder in a specific location on the file system  

		if it does not already exist.
	

> UniqueTemporaryFileCreated.java
- Description: 
	
	
	
		This Java program creates a temporary file using the createTempFile() method of the File class.
 		
		Overall, this program demonstrates how to create a temporary file using the createTempFile() method of the File class, and how to check 
		
		whether the file was successfully created and deleted.
	

> FixedTemporaryFileCreated.java
- Description: 
	
	
		Continue the previously lesson: 
 	
 		We used tempFile.createNewFile() instead of File.createTempFile(prefix, suffix, directoryOfTemp) is that 
 		
 		it allows us to specify the exact name of the temporary file that we want to create.
 		
		When we use File.createTempFile(prefix, suffix, directoryOfTemp), a unique file name is generated automatically, 
 		
 		which can be useful in preventing naming conflicts. 
 		
 		However, if we want to create a temporary file with a specific name or a specific naming convention, 
 		
 		we can use tempFile.createNewFile() instead.

> FileWriterDemo.java
- Description: 
	
		This Java program generates a file named "lottery.txt" in the "data" subdirectory of the directory path specified in the "root" variable. 
 	
	 	The file contains 10 lines of lottery numbers, with each line having 6 unique numbers between 1 and 42.
	
	
> FileReaderDemo.java
- Description: 
	
		This program demonstrates how to use the FileReader class in Java to read the contents of a file character by character.  
 	
 		The program prompts the user to choose between two options: displaying all the data in the file on one line or showing each line 
		
		separately.
	
	


> AnalyzeLotteryNumbers.java
- Description: 

		
		This program analyzes lottery numbers by counting the occurrences of each number in the given input data. 
 	
 		The input data is a string that represents a list of numbers separated by commas and spaces. 
 	
 		The program splits the string into an array of individual number strings, creates a linked hash map with 
		
		keys as the numbers from 1 to 42 and values as 0, 
 	
		and then iterates through the array to increment the value of each corresponding key in the map.
 	
	

	
> CopyContent.java
- Description: 

		
		This Java program reads the content of a file named "lottery.txt" located in the subdirectory "data"  

		and creates a copy of its content in a new file named "lottery_Copy.txt" located in the same directory. 

		The program uses FileReader and FileWriter classes to read and write the file content, respectively.
 	

		
> DownloadImage.java
- Description: 

		
		This Java program downloads an image from a URL and saves it to a specified location on the local filesystem.
 	
	

> DownloadImage4LargerSize.java
- Description: 

		
		To make the code more efficient for downloading larger files, 
 		
 		you can increase the size of the byte buffer used to read and write the data. 
 		
 		Instead of reading and writing one byte at a time, you can read and write a larger chunk of data at once.
 		
 		In this updated version of the code, we use a buffer of 4096 bytes (4KB) to read and write the data. 
 		
 		This should be more efficient than reading and writing one byte at a time.
 		
 		Additionally, we use the read method of the input stream to read as much data as possible into the buffer, 
 		
 		and we use the write method of the output stream to write the entire buffer to the file.

		This updated code will be more efficient for downloading larger files. 
		
		However, it's still important to note that downloading very large files can take a long time, 
		
		and there may be network limitations or other factors that could impact the download speed.
 

	
> RenderedOpSampleCode1.java
- Description: [Continue]

		
	
> RenderedOpSampleCode2.java
- Description: [Continue] 
		

> ExecutionTimeCalculator.java
- Description: 
	
	
		This code creates an ExecutionTimeCalculator class with a main method that measures the execution time of two code 
		
		samples using the System.nanoTime() method. 
 	
		To properly measure the running time of two code samples, you need to insert the code for each sample between the 		
		startTime and endTime measurements.
	
BufferedReaderExecutionTime.java
- Description: 
	
		
		This Java program reads data from a text file named "lottery.txt" located in the "data" subdirectory of the directory 
		
		specified by the variable "root".


> BufferedWriterDemo.java
- Description: 
	
	
		This Java code creates a file named "log.txt" in the directory. 
 	
	 	It then writes three lines of text to the file using a BufferedWriter.
	

	
> BufferedWriterDemo2.java
- Description: 
	
	
		Continue BufferedWriterDemo.java: 
 	
		This Java code creates a file named "log3.txt" in the directory. 

		It then writes three lines of text to the file using a BufferedWriter.

		We used "logs" string to split into an array of strings using the "," delimiter, and assigned to the "dataSplit" variable.

	
	
> BufferedWriterExecutionTime.java
- Description: 	
	
	
		The provided code is an example of using a BufferedWriter to write data to a file. 
 	
		It creates a BufferedWriter object that wraps around a FileWriter object to write text to a file.

		In this code, the BufferedWriter object is created by passing a FileWriter object to its constructor. 

		The FileWriter object is used to specify the file path and to allow for appending data to the file. 

		The write() method of the BufferedWriter object is used to write the text to the file, 

		and the close() method is automatically called when the try block is exited.

	
		
> PathReader.java
- Description: 	
	
	
		This Java program reads and manipulates paths using the java.nio.file.Path and java.nio.file.Paths classes.
 	
	
> PathReader2.java
- Description: 	
	
	
		This is a Java program that demonstrates some basic operations on file paths using the java.nio.file.Path class.	
 
	
> BufferedReaderDemo.java
- Description:
	

		This Java program uses the BufferedReader class to read the contents of a file located at a specific path.
	
	

> NewBufferedReaderDemo.java
- Description:
		
	
		This is a Java program that demonstrates how to use the BufferedReader class to read the contents of a file.
	
	
	
> FileReadAllLineDemo.java
- Description: 
	
		
		This Java program reads all the lines from a text file using the Files.readAllLines() method, and then prints each line to the console 
		
		using a Java 8 stream.
	
	
> FileLinesDemo.java
- Description: 
	
	
		This Java program demonstrates how to read and print the lines of a text file using the Files.lines() method.	
	
	
		
> CopyAndDeleteFile.java
- Description: 
	
	
		This Java program copies a file from a source path to a destination path and then deletes both the original file and the copied file.

		Note that the specific file paths in this program are system-dependent and may need to be changed to match the file paths on your own 
		
		system.
	

	
> FileReadAllBytesDemo.java
- Description: 
	
	
		This is a Java program that reads the contents of a text file and prints them to the console.
	
		
> CopyFileWithInputStream.java
- Description: 
	
	
		This Java program downloads an image from a URL and saves it to a local file using the Java NIO Files class.
	
	
		
> CopyFileEnhancedEfficiency.java
- Description: 
	
	
		This Java program demonstrates four different options to copying a file from a URL to a local destination file, and measures the 
		elapsed time for each option. 
 	
 			1) The program first defines a URL string url pointing to an image file, and creates a URI object uri from the url string. 
 	
	 		2) The program also specifies the path to the destination file where the image will be saved using a Path object destination.
	
			3) The program performs four different options to copying the image file to the destination file:
	
		 	   For each option, the program records the start and end times of the copying process using System.nanoTime(), and calculates 	
			   the elapsed time in milliseconds. 
			
			   The program then prints the elapsed time for each option.
	
				Option 1:
				 	
					Use a BufferedInputStream to copy the file in a single thread.
				
				Option 2:
					
					Use a BufferedInputStream, but with a larger buffer size than option 1.
				
				Option 3:
				 	
				 	Use multiple threads to copy the file. The program uses an ExecutorService to create a thread pool with four 
					threads, and submits a DownloadTask to the thread pool, which downloads the file and returns the Path of the 
					downloaded file. 
				 	
				 	The program then retrieves the downloaded Path from the Future object returned by the submit method.
				 			 	
				 	
				 	DownloadTask class:
				
						The program also defines a nested class DownloadTask, which implements the Callable interface, 
						
						and is used for option 3 to download the file using a separate thread. 
						
						The DownloadTask takes a URI object and a Path object as its constructor arguments, and downloads the 
						
						file using a BufferedInputStream, and saves the file to the specified destination file. The 
						
						DownloadTask returns the Path of the downloaded file.
				
				Option 4:
				 	
				 	Cache the downloaded file, so that if the destination file already exists, the file is not downloaded again.
		
	

	
			
> FilesWriteAndReadString.java
- Description: 
	
	
		 	This Java program demonstrates how to use the java.nio.file.Files class to write a string to a file and then read the same 
			file.
	
			The java.nio.file.Files class in Java 11, introduced the new writeString and readString methods for writing and reading a 
			string to/from a file, respectively.

			Both methods throw an IOException if an error occurs while accessing the file.

				1) The writeString method creates a new file at the specified path using the Files.createFile(path) method, and then 
				   writes the provided string to the file using the CharSequence argument. 

				   The StandardOpenOption.WRITE option is used to open the file for writing.

				2) The readString method reads the contents of the file at the specified path as a string and returns the result.


> FileWalkDemo.java
- Description: 
	
	
			This Java program demonstrates how to use the Files.walk() method to recursively traverse a directory tree and process each 
			file in the tree. 

			The program looks for files with a .txt extension, prints their absolute paths, creation time, and size, and increments a 
			counter to keep track of the number of .txt files processed.

			Overall, this program provides a simple example of how to use the Files.walk() method to recursively traverse a directory tree
			and process each file in the tree. 

			It demonstrates how to filter files based on their extension and how to access their attributes such as creation time and size.
	
	
	
	
	
	
	
	
	
	
------------------------------------------------------------------------------
# Java SE 11 Developer Exam - <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/Java11/chapter01_dataTypes">Data Types</a>

> StringBuilderPractice01.java


> StringBuilderPractice02.java


> StringBuilderPractice03.java


> StringBuilderPractice04.java


> StringBuilderPractice05.java


> ComparatorPractice.java


> ArgumentDemo.java


> Airplane.java


> VarTest.java


> VarDemo.java


> varCanAndCannot.java


<a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/Java11/chapter02_controlflow">Control flow</a>

> ControlFlow01.java


> ControlFlow02.java


> ControlFlow03.java

------------------------------------------------------------------------------
