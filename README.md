# Java SE 11 Developer
------------------------------------------------------------------------------
> Toolkits
- Integrated Development Environment (IDE): Eclipse 2021-06
- JDK: Java SE 11

> Recommended Book
- Java 8 Lambdas [[https://lemus.webs.upv.es/wordpress/wp-content/uploads/2018/03/java8lambdas.pdf](https://www.amazon.com/Java-Lambdas-Functional-Programming-Masses/dp/1449370772)]

> Certificates
- <img width="203" alt="Screen Shot 2022-12-02 at 12 37 42 AM" src="https://user-images.githubusercontent.com/83496093/205109003-2d5cff3b-67fc-4e48-a47a-78c8c57f00db.png">



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
> day22
-
> day23
-
> day24
-
> day25
-
> day26
-


------------------------------------------------------------------------------
# day1 Java Basic
1. Set-up environment with Eclipse Workspace
2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day1">Lesson learned of following programming:</a>
> Hello.java:
- Description: To make sure the whole system of Eclipse is functional work after running on this code.
- 在 Eclipse Workspace 建立的新專案 Hello.java，並確認此程式可成功執行且印出 "Hello World"


> BMIUtil.java:
- Description: Create an Util of BMI.
- 建立 BMI 計算工具


> CalcBMI.java:
- Description: Giving the both of BMI-method calculation but different concept.
- 如 BMIUtil.java 所述， 此節調整為 BMI method 工具，供開發者使用


> CalcMath.java:
- Description: This session is giving three design of methods (eg, calcSum, calcAvg and calcSD) to calculate the add-up score and average score and standard deviation of students 
- 此節建立 calcSum、 calcAvg  calcSD 方法，來計算學生的加總分數、平均分數和標準差

------------------------------------------------------------------------------
# day2 Java Basic: 1-D array 
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day2">Lesson learned of following programming for Accessibility:</a>
> Let's talk about accessibilty of Java as following checklist. 
- 在探討 day2 的程式碼之前，請讀者留意 Java 的讀取權限，如圖示
![image](https://user-images.githubusercontent.com/83496093/197315755-e25fed8a-5e11-420d-9f72-a5748a1fcd3b.png)

- Description: This lesson we introduce the accessibility of java from following sample code. 
- 此節介紹底下範例，讓讀者更清楚了解 Java 的讀取權限之應用
- 1) Apple.java
- 2) Banana.java
- 3) Cherry.java
- 4) Fruit.java


2. Lesson learned of the Application of Array:
> ArrayDemo1.java:
- Description: This session will go to tell you how to initiate the array variable and check the length of Array object that has been initiated.
- 本節將說明如何將一維陣列初始化，並計算陣列物件的長度

> ArrayDemo2.java:
- Description: 
- a. This session goes to tell you how to use for-loop and for-Each to print out of value from Array object, and also giving a lecture on using length of Array object to print out the value of Array object.
- 介接如何使用 for-loop 和 for-each 的方式，將陣列中的值印出，另外方式是藉由抓取陣列的長度，將陣列的值印出
- b. Also, you will learn the Array API - Arrays.toString(name_of_ArrayObject), under "package java.util;".
- 將學到如何使用 Oracle 提供的 API - Arrays.toString(name_of_ArrayObject)，在 package java.util 中
- c. Also, you shall understand the modern Java 8 (Version: 1.8) that provides an API - Arrays.stream(name_of_ArrayObject).forEach(value_of_ArrayObject -> System.out.print(value_of_ArrayObject + ", ")), under "package java.util;".
- 介紹 Java 1.8 提供的 API - Arrays.stream(name_of_ArrayObject).forEach(value_of_ArrayObject -> System.out.print(value_of_ArrayObject + ", "))，在 Oracle 中的 package java.util，將陣列中的值印出

> ArrayDemo3.java:
- Description:
- Of this session, we design methods to get the result of Sum, Average, Maximum and Minimum value from Array object. Please see the following methods that presented in this session 
- 此節建立了 4 個 method 去獲取分數之和、平均、最小值和最大值
- 1) getSum(int[] array)
- 2) getAvg(int[] array)
- 3) getMin(int[] array)
- 4) getMax(int[] array)

> ArrayDemo4.java:
- Description:
- Since you already understood of how to design your own method(s) as previously lecture, then plz check out the following API with regards to "Arrays.stream" 
- 讀者應能從上節 ArrayDemo3.java 了解如何自行建立 method(s)，本節將介紹如何使用 Arrays.stream 來實作 ArrayDemo3.java 提到的範例
- 1) Arrays.stream(name_of_ArrayObject).count()
- 2) Arrays.stream(name_of_ArrayObject).sum()
- 3) Arrays.stream(name_of_ArrayObject).average().getAsDouble()
- 4) Arrays.stream(name_of_ArrayObject).max().getAsInt()
- 5) Arrays.stream(name_of_ArrayObject).min().getAsInt()

> ArrayDemo5.java:
- Description: This session will give you a tool which is API of "IntSummaryStatistics".
- 讀者可從本節學到如何使用 Oracle 內建的 API - IntSummaryStatistics，此 Class 包被放置在此路徑中 java.util.stream.IntStream.summaryStatistics()，裡面提供了幾個好用的工具，例如計算總數、加總、平均、最大值和最小值
- You shall make a note of following built-in API from IntSummaryStatistics as
- 1) Arrays.stream(name_of_ArrayObject).summaryStatistics().getCount()
- 2) Arrays.stream(name_of_ArrayObject).summaryStatistics().getSum()
- 3) Arrays.stream(name_of_ArrayObject).summaryStatistics().getAverage()
- 4) Arrays.stream(name_of_ArrayObject).summaryStatistics().getMax()
- 5) Arrays.stream(name_of_ArrayObject).summaryStatistics().getMin()

------------------------------------------------------------------------------
# day3 Java Advanced: Application of String & Stream API  
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day3">Lesson learned of following programming with regards to String2Array and Stream's API:</a>
- Description: The coming of sample codes of “StringArrayDemo(s)”, will give a guidance of reader for understanding the API of String, Array and Stream (Java 1.8).
- 讀者可從本節 sample code - “StringArrayDemo(s)” 中，學習如何運用 String、Array 和 Stream (Java 1.8) 的 API

> StringArraydemo.java:
- Description: This session will tell you, 
- 1) how to use "String[] java.lang.String.split(String regex)" for collecting the each name into String[]
- 2) how to use "Arrays.toString(name_of_stringArray)"
- 3) calculation of arrayLength, p.s., name_of_array.length
- 4) calculation of stringLength, p.s., name_of_string.length()


> StringArraydemo2.java:
- Description: This session will follow up the previously StringArraydemo.java but updated in Java 1.8

> StringArraydemo3.java:
- Description: This session will give a lecture on how to use "Integer.parseInt" （which is meaning by "Parses the string argument as a signed decimal integer"）to catch the score of students that are over or equal to 60, and turn into calculating their average score.
- 此節說明如何運用 "Integer.parseInt" (此 API 將 String 的引數轉成十進制的值)，來去抓取學生分數係大於或等於 60 分的人數，並將這些及格分數另外做總及格平均分數的計算

> StringArraydemo4.java:
- Description: This session will follow up the previously StringArraydemo3.java but giving a differently demostration of calculation of average Score (which is >= 60) in Java 1.8.
- 1) mapToInt(score -> Integer.parseInt(score))
- 2) filter(score -> score >= 60)
- 3) average()
- 4) getAsDouble()


> StringBuilderDemo.java:
- Description: This session is giving an introduction of StringBuffer and StringBuilder.

> StringBuilderDemo2.java:
- Description: This session gives a lecture on how to use StringBuilder Util.

> StringDemo1.java:
- Description: This session will introduce how to compare with two differently String variables of their memory and value.
- 1) string_name1 == string_name2
- 2) string_name1.equals(string_name2)
- 3) string_name1.equalsIgnoreCase(string_name2) 


> StringDemo2.java:
- Description: This session is not big deal but only one NEW API of .intern() for your reference
- 1) string_name1.intern() == string_name2

> StringDemo3.java:
- Description: This session will introduce "public String substring(int beginIndex, int endIndex)"

> StringDemo4.java:
- Description: This session creates a "String addUtil()" for your reference.

------------------------------------------------------------------------------
# day4 Java Advanced: Application of Stream API for calculation with 1-D array and 2-D array
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day4">Lesson learned of following programming for Array:</a> 
- Description: The coming of sample codes of MultiArrayDemo(s) will give a lectures on the application of multiple array
- 本次 day4 將介紹如何使用多維陣列 (eg., 一維和二維陣列) 之應用

> MultiArrayDemo1.java:
- Description: This session will introduce how to initialize for an array, and print out the memory and value of multiple Array
- 此節將介紹如何將陣列初始化，並印出陣列的記憶體位址和多維陣列的值

> MultiArrayDemo2.java:
- Description: This session creates method of print and getSum util 
- 此節建立 print 和 getSum 的工具，當需要用這些工具 (也就是 method)，將可直接調用

> MultiArrayDemo3.java:
- Description: This session will give a lecture on BMI calculator of multi-ple array 
- 此節介紹使用多維陣列，來收集體重和身高的參數，並建立一個多維陣列的 BMI 計算器，將每組的 BMI 參數產出

> MultiArrayDemo4.java:
- Description: Following the previously MultiArrayDemo3.java, we modify the order of initialized array, and re-design the for-loop algorithm to generate the each group of BMI. Also, one API of Arrays.deepToString(name_of_array) for your reference
- 依據先前的 MultiArrayDemo3.java 介紹，我們修改了初始化陣列的順序，並重新設計一個 for-loop 的演算法，將每組的 BMI 參數產出。另外此節介紹了一個內建 API - Arrays.deepToString(name_of_array)，可直接將陣列的值抓出，並由 System.out.println(Arrays.deepToString(name_of_array)) 印出陣列的 value(s)。

- 備註: name_of_array 係指陣列的變數名稱

> MultiArrayDemo5.java:
- Description: Of this session, we give a lecture on converting a 2-D array (Column: 3, Row: 2) to 2-D array (Column: 2, Row: 3). 
- 此節介紹一組二維陣列 (列: 3, 行: 2) 的內容，轉換成 2 維陣列 (列: 2, 行: 3)。對於讀者而言，本節為了訓練陣列大小編排的邏輯概念，所設置。但在開發中，建議仍採用 Java 1.8 提供的 API 來做設計，因為設計者胥撰寫 for-loop 或 for-each 的迴圈架構，其迴圈的順序對於抓取陣列的位置和內容，至關重要，但對於維護上，並不是一個上策，假設開發者過了兩個月後，再回來閱讀程式碼時，將花上許多時間來回顧當時撰寫此程式碼的心路歷程。再者，用迴圈的撰寫方式，邏輯上較不直接 (若與 Java 1.8 的 API 相比)

> MultiArrayDemo6.java & MultiArrayDemo7.java:
- Description: We will introduce the application of API from Arrays in Java 1.8. You shall learn a combination of following
- 1) Arrays.stream
- 2) flatMapToInt
- 3) flatMapToDouble
- 4) mapToDouble
- 5) peek
- 6) forEach


------------------------------------------------------------------------------
# day5 Java Advanced: Introduction of Object-Oriented Programming (OOP) Patterns with including application of Stream API 
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day5">This lesson we give a differently Object-oriented design patterns and also create a roughly Account System from Bank for your reference</a>
> OO1.java 
- Description: This lecture we would like sharing to reader about initializing the global variables by Constructor
- 此節介紹如何使用建構子將全域變數初始化

> OO2.java
- Description: This lecture we would like sharing to reader about initializing the global variables by Object
- 此節介紹如何由物件變數將全域變數初始化

> OO3.java
- Description: This lecture we create Constructors and also initialize the global variables at the same time
- 此節介紹如何由建構子將全域變數初始化


> OO4.java
- Description: According to the previously lecture (i.e., OO3.java), you will learn how to print out the value of global variable from void method
- 依先前課程 (也就是 003.java)，您將可學到如何將全域變數的值，由 void 方法印出

> OO5.java
- Description: We create 1-D array of Student with 10 Fixed length (which is 10 differently memory) and initialize the global variable from object of 1-
  D array
- 此節將學到，如何建立固定長度 (也就是 10 個不同的記憶體) 的一維陣列之 Student 物件，並由一維陣列中的物件，將全域變數 (也就是 name 和 score) 初始化

> OO6.java
- Description: We create 1-D array of Student with Dynamic Memory
- 此節將介紹，如何建立一個動態的一維陣列的 Student 物件

> OO7.java
- Description: We create 1-D array of Student with Dynamic Memory and use Java 1.8 Stream API to calculate the average score of students by mapToDouble
- 此節介紹，使用一個動態的一維陣列的 Student 物件，並結合 Java 1.8 Stream API - mapToDouble，來計算學生的平均分數

> OO8.java
- Description: We create two differently length of 1-D array in dynamic memory of Student and collect them into one object of 2-D array. And also, you will learn how to use Java 1.8 Stream API to calculate the average score of students
- A kindly reminder, we need to understand how differently does we use Java 1.8 Stream API - flatMap and flatMapToDouble
- 此節介紹，建立兩個動態的一維陣列的 Student 物件，並將其放入至二維陣列中來管理，並結合 Java 1.8 Stream API，來計算學生的平均分數
- 請讀者特別留意，Java 1.8 Stream API - flatMap 和 flatMapToDouble 之應用

> OO9.java & Account.java & Student.java
- Description: You will learn how to design a roughly Account System of Bank for withdraw and deposit money from your Account. The OOP (Object-Oriented 
  Programming) is likely to 4th pattern of OOP (which is OO4.java). Furthermore, we share a concept of how to handle with error message during this lesson.
- 本節設計一個簡易版的銀行轉帳系統，運用了之前課程 (OO4.java) 提到的設計架構。此外，也介紹一般使用者和工程人員關於處理錯誤訊息的處理方式


------------------------------------------------------------------------------
# day6 Java Advanced: Using ArrayList and Scanner to design an ERP Office System for Check-in
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day6/ScannerPractice">Scanner API Practice</a>

> ScannerDemo.java 
- Description:  ...
-

> ScannerFilter.java 
- Description:  ...
- 



> ScannerForPractice_Loop_And_If.java 
- Description:  ...
- 



> ScannerLimiter.java 
- Description:  ...
- 

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day6/ScannerException">Introduction of Scanner Exception</a>

> IntroductionOfFinal.java
- Description: ...
- 


> ScannerIllegalStateException.java 
- Description: 本節使用了 final 變數，需請讀者先閱讀 IntroductionOfFinal.java，再回來此節
- 


> ScannerNoSuchElementException.java 
- Description:  ...
- 


> ScannerResolvedIllegalStateExceptionNoSuchElementException.java 
- Description:  ...
- 


3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day6/erp">Designing an Office Check-in System with function of CRUD by API - ArrayList, you will learn in this session</a>

> ArrayListDemo1.java 
- Description:  ...
- 


> ArrayListDemo2.java 
- Description:  ...
- 

4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day6/streetesting">Introduction of Stress Testing</a>
> ArrayListOfHeapMemoryTest.java 
- Description:  ...

------------------------------------------------------------------------------
# day7 Java Advanced: Application of Stream API with Inheritance, Encapsulation, Auto-boxing and Annotation of Override
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day7">This lesson we give a following introduction:</a>
- 1) Inheritance
- 2) Encapsulation
- 3) Auto-boxing
- 4) Annotation of Override


> Person.java 
- Description:  ...
- 

> Student.java 
- Description:  ...
- 


> Teacher.java 
- Description:  ...
- 


> Main.java 
- Description:  ...
- 

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day7_2">This lesson we give a following introduction:</a>
- 1) Inheritance
- 2) Encapsulation
- 3) Auto-boxing
- 4) Annotation of Override
- 5) Application of Stream API to calculate the average age and score


> Person.java 
- Description: ... 
- 

> Student.java 
- Description:  ...
- 


> Teacher.java 
- Description:  ...
- 


> Main.java 
- Description:  ...
- 



> Classroom.java
- Description: ...
- 




> Main2.java 
- Description:  ...
- 


------------------------------------------------------------------------------
# day8 Java Advanced: Primitive type, Wrapper Class (including Application of Java 1.8 - Stream API), Overloading and Inheritance 
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day8">This lesson we give a following introduction:</a>
...



> DemoInheritanceAndConstructors.java 
- Description:  ...
- 



> Overloading01.java 
- Description:  ...
- 


> Overloading02.java 
- Description:  ...
- 



> PrimitiveClass.java 
- Description:  ...
- 


> WrapperClass1.java 
- Description:  ...
- 


> WrapperClass2.java 
- Description:  ...
- 


------------------------------------------------------------------------------
# day9 Java Advanced: Varargs, DAO (Data Access Object), Singleton and Polymorphism
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day9_1">Introduction the application of Varargs:</a>
- Before Java 1.5, whenever we wanted to pass an arbitrary number of arguments, we had to pass all arguments in an array or implement N methods (one for each additional parameter):
- 1) public String format() { ... }
- 2) public String format(String value) { ... }
- 3) public String format(String value_1, String value_2) { ... }
- After Java 1.5 (including 1.5 version), provides a short-hand for methods that support an arbitrary number of parameters of one type
- 1) public String format() {String ... values}

> VarargsDemo1.java 
- Description: You will learn how to design a 1-D array of Varargs method and 2-D array of Varargs to add up all values.

> VarargsDemo2.java 
- Description: This lesson we design a same name of Varargs method but differently arbitrary number of arguments 

> VarargsDemo3.java 
- Description: 	This lesson we design a method with one fixed argument but support an arbitrary number of parameters of one type (i.e., int) for another 

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day9_1">Introduction the application of DAO and Singleton:</a>
> Dao.java 
- Description: The Data Access Object (DAO) pattern is a structural pattern that allows us to isolate the application/business layer from the persistence layer (usually a relational database but could be any other persistence mechanism) using an "abstract API". Regarding the information above, it's at very beginning moment for you, since we do NOT include any "abstract API" during this lesson. But, no worry, we will review this topic at the following later day. 

> SingleDao.java 
- Description: This lesson you wil learn how to design Singleton pattern.
- To create a singleton-class, this class must implement the following properties:
- 1) Create a private constructor of the class to restrict object created outside of the singleton-class.
- 2) Create a private attribute (eg., "private static SingleDao SingleDao_Instance = new SingleDao()") of the class type that refers to the single  object.
- 3) Create a public static method (eg., "public static SingleDao getSingleDaoInstance()") that allows us to create and access the object we created.  Inside the method, we will create a condition that prohibits us from creating more than one object.
- What's this mean by, "allows us to create and access the object we created" ? It's likely you share a Single Global Instance and provide a Global Point of Access to SingleDao.class.
	  
> UserDao.java 
- Description: This UserDaoclass is implementing the Dao.class and SingleDao.class
- A kindly Reminder: 
- (1) You may get a different Console message from the annotation of this UserDao.java, because the programming of generating value of id_number from "Dao.java" is via "new Random().nextInt()"
- Of the "SingleDao.java", we design a Singleton pattern into this class, and you will see the generated id_number is SAME!
- (2) Since we created a public static method (i.e., "public static SingleDao getSingleDaoInstance()") to prohibit developer from creating more than one object for accessing the inside object of "SingleDao.java".
	
3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day9_2">Introduction the application of Polymorphism_1:</a>
- ...


> Cat.java 
- Description: ...

> Lion.java 
- Description: ...

> Cow.java 
- Description: ...

> Horse.java 
- Description: ...

> Feet.java 
- Description: ...

> TestPolymorphismOfAnimal.java 
- Description: ...

4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day9_2">Introduction the application of Polymorphism_2:</a>
- This lesson you will learn a roughly design of different positions at company and some variables/methods only for specific position


> Employee.java 
- Description: Create a Super-class (Employee)

> Manager.java 
- Description: Create a Sub-class (Manager) to inherite Super-class (Employee)

> Supervisor.java 
- Description: Create a Sub-class (Supervisor) to inherite Super-class (Employee)

> Test01.java 
- Description: No inheritance between Supervisor and Manager, we cannot move the object of Supervisor to Employee, and then downcast the object from Employee to Manager; otherwise, java.lang.ClassCastException.

> Test02.java 
- Description: Only invoke the value from salary variable in Employee, because of polymorphism.

> Test03.java 
- Description: Invoke the method of jobDescription from object of employee, manager and supervisor, to get the value of job description.

> Test04.java 
- Description: "instanceof" operator to test whether the object is an instance of the specified type.

> Test05.java 
- Description: We create a static method of printBudget to test whether the object from employee, manager and supervisor is an instance of the specified type. 





------------------------------------------------------------------------------
# day10 Java Advanced: Abstract and Interface
1. Introduction of abstract:
- 1) Abstraction can be achieved with either abstract classes or interfaces</a>
- 2) The abstract keyword is a non-access modifier, used for classes and methods:
- 3) Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
- 4) Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

2. Introduction of interface:
- 1) Another way to achieve abstract
- 2) interface method (does not have a body), the body is provided by the "implement" class
- 3) To access the interface methods, the interface must be "implemented" by another class with the "implements" keyword (instead of "extends")
- 4) On implementation of an interface, you must override all of its methods
- 5) Interface attributes are by "public static final"
- 6) An interface CANNOT contain a constructor (that is, interface cannot be used to create objects)
	
3. Why And When To Use Interfaces?
- 1) For security - we can hide certain details and only show the important details of an object (interface).
- 2) Java does not support "multiple inheritance" (i.e., a class can only inherit from one superclass, e.g., A extends B). However, interface can be achieved with interfaces, since the class can implement multiple interfaces, e.g., A implements B, C, D

4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day10_1">The following sample code for your information of relationship between abstract and interface:</a>
> InterfaceAnimal.java
- Description: Create an interface of Animal to introduce the rules of interface

> AbstractAnimal.java
- Description: Create an abstrace of Animal to introduce the rules of abstract

> Cat.java
- Description: Create Cat.class to inherit AbstractAnimal.class, and also override the method of interfaceAnimal

> Dog.java
- Description: Create Dog.class to inherit AbstractAnimal.class, and also override the method of interfaceAnimal

> PetStore.java
- Description: Create PetStore.class to implement AbstractAnimal and InterfaceAnimal


5. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day10_2">The following sample code for your information of how to design abstract class(es) to inherit interface class, and also each of abstract method or actual method being overrided by another class(es) or current class. Please check out the following UML design Pattern.</a>

	<img width="203" alt="Class Diagram_Military" src="https://user-images.githubusercontent.com/83496093/204460202-efc085ac-a1d2-47f1-bb03-495fbf622803.png">





> Weapon.java
- Description: Create interface of Weapon.class for its sub-class(es) to implement

> Car.java
- Description: Create abstract of Car.class (which inheritance with interface Weapon), and also being implemented by sub-class(es) (e.g., Tank.class and Truck.class)

> Airplane.java
- Description: Create abstract of Airplane.class (which inheritance with interface Weapon), and also being implemented by sub-class(es) (e.g., JetAircraft.class and Drone.class)

> Tank.java
- Description: Create Tank.class, which inherits abstract Car.class and interface Weapon.class

> Truck.java
- Description: Create Truck.class, which inherits abstract Car.class and interface Weapon.class 

> JetAircraft.java
- Description: Create JetAircraft.class, which inherits abstract Airplane.class and interface Weapon.class 

> Drone.java
- Description: Create Drone.class, which inherits abstract Airplane.class and interface Weapon.class 



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

	<img width="203" alt="Screen Shot 2022-12-03 at 4 08 51 PM" src="https://user-images.githubusercontent.com/83496093/205431346-399cd33f-a28d-4c1d-a81f-48b9637132d1.png">
	
2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day11_1/decorator">Following sample codes of Decorator Pattern for your information:</a>
> Food.java
- Description: The global variable of "name" and "price", we place here in the Food.class, for implement by subclass. Also, there are two methods given by abstraction, because these methods without body (so-called virtual method) are, developer expected them to be implemented. 


> AgentOfFood.java
- Description: For a purpose of designing the abstraction class here, please imagine that your project (e.g., Menu of Order System) is almost to be DONE, but suddenly your client request additional function which could query the flavors and price of meal. Engineer is NOT willing to update the original structure of programming because the mostly is settled. Hereinafter, you could design an abstraction class (i.e., AgentOfFood.class) to create a function that client required to.  
Any reason of solution we choose, is abstraction class? Since cannot initiate the object of abstraction class by itself, we need the subclass of abstraction class to invoke the variable/method of abstraction class.
And therefore, we could avoid the original structure of programming from updating, but merely have subclass inherit the abstraction class (i.e., AgentOfFood).	
For the sake of designing an abstraction class, you may have many requirements from different clients, then you merely manage the package of abstraction class without any impact on the original design.
- 設計此抽象類別之用意，請讀者想像一個情境，假設您目前執行的專案為『點餐訂單系統』且已接近完工，卻接到客戶要求，需在訂單系統中增加一個功能 (可查詢顧客點的餐點配菜和餐點價格)，但基於程式架構已完成，工程師為了不影響訂單系統的程式架構，這時可使用抽象類別 (也就是本程式中的 AgentOfFood.class) 來設計。
那為什麼選用抽象類別，因為抽象類別無法將物件實體化，也就是不可從任意類別中，使用 new AgentOfFood()，其原因是，抽象類別係為了由子類別實體化的物件，來呼叫抽象類別中的變數或方法，如此，可避免設計者去修改既有程式碼的商業邏輯，而僅僅只需讓底層的類別去繼承抽象類別，這樣既保有原來的架構，後期在維護上也能因應不同的客戶之需求，建立其它的抽象類別之功能。最後設計者只需管理抽象類別包，都不需動到底層的架構
	
> Bread.java
- Description:  Bread.class is the base of all objects from o1 to o11.  

> Flavors.java
- Description:  While initiating the object, e.g., new Ham(), new Lettuces(), or new Egg(), Flavors.class, likely a Container, will collect object(s) from its subclass, by "protected Food food;".

> Egg.java
- Description:  Egg.class is subclass of Flavors.class. While you initiate the object of Egg, then the global variables of "name" (i.e., protected String name) and "price" (i.e., protected String name) will be implemented.

> Ham.java
- Description:  Ham.class is subclass of Flavors.class. While you initiate the object of Ham, then the global variables of "name" (i.e., protected String name) and "price" (i.e., protected String name) will be implemented.

> Lettuces.java
- Description:  Lettuces.class is subclass of Flavors.class. While you initiate the object of Lettuces, then the global variables of "name" (i.e., protected String name) and "price" (i.e., protected String name) will be implemented.

> OliveOil.java
- Description:  OliveOil.class is subclass of Flavors.class. While you initiate the object of OliveOil, then the global variables of "name" (i.e., protected String name) and "price" (i.e., protected String name) will be implemented.

> Tomato.java
- Description:  Tomato.class is subclass of Flavors.class. While you initiate the object of Tomato, then the global variables of "name" (i.e., protected String name) and "price" (i.e., protected String name) will be implemented.

> Onion.java
- Description:  Onion.class is subclass of Flavors.class. While you initiate the object of Onion, then the global variables of "name" (i.e., protected String name) and "price" (i.e., protected String name) will be implemented.

> Tuna.java
- Description:  Tuna.class is subclass of Flavors.class. While you initiate the object of Tuna, then the global variables of "name" (i.e., protected String name) and "price" (i.e., protected String name) will be implemented.

Observer Pattern (CipherText for RecipientCommuincation):
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day11_1/observer">Following sample codes of Observer Pattern and UML for your information:</a>

	<img width="203" alt="ObserverUML" src="https://user-images.githubusercontent.com/83496093/206376348-f554bbc5-910a-4c9f-8bbd-50f1a249f2a8.png">




	
> Observer.java
- Description:  ...

> Subject.java
- Description:  ...

> NewsTopic.java
- Description:  ...

> Recipient.java
- Description:  ...

> RecipientCommunication.java
- Description:  ...

------------------------------------------------------------------------------
# day11 Java Advanced: Equals & HashCode 
1. Introduction of how to improve the hashCode() Implementation could be, as following sample codes with overriding the method of<a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day11_2"> "public int hashCode(){ ... }" </a> to avoid "Hash Collision" from two different objects being equally.


2. Sincerely recommended a Book for your reference - "Effective Java 3rd Edition". You will be even better to understand the "Hash Collision" and "hashCode algorithm".
Link -> "https://www.amazon.com/Effective-Java-3rd-Joshua-Bloch/dp/0134685997" 	
 	

> EqualsFunction.java
- Description:  ...

> EqualsHashCode.java
- Description:  ...

> OverrideEqualsHashCodeFunction.java
- Description: The method of "public int hashCode(){ ... }" being overrided with the value of prime: 31, was chosen because it is an odd prime. 
- If it were even and the multiplication overflowed, information would be lost, because multiplication by 2 is equivalent to shifting. The advantage of using a prime is less clear, but it is traditional. A nice property of 31 is that the multiplication can be replaced by a shift and a subtraction for better performance on some architectures: 31 * i == (i << 5) - i. Modern VMs do this sort of optimization automatically. Reference of "Effective Java (3rd Edition), Joshua Bloch
		


------------------------------------------------------------------------------
# day12 Java Advanced: Outer Class, Inner Class and Anonymous
1. <a href="[https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day12/InnerClass](https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day12/InnerClass/innerclass)">Introduction of Inner class</a>

> Outer.java
- Description:  ...

> InnerClassTest.java
- Description:  ...

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day12/InnerClass/methodLocal">Introduction of method-local inner class to invoke the local variable</a>

> LocalVariableInvokedByInnerClass.java
- Description: If local variable (i.e., number) expected to be invoked by Inner class, its value MUST be like characteristic as final, that is, value SHALL be constant. Please read the content of LocalVariableInvokedByInnerClass$1Inner.java, which was generated by decompiler tool, at "package: com.ocp.day12.InnerClass.method.decompiler".
- 若區域變數 (此範例係指 number)，欲被內部類別調用，其區域變數的值，必須具備 final 的特性，也就是說，此區域變數必須是常數。即使區域變數不宣告為 final，編譯器將 LocalVariableInvokedByInnerClass.java 轉換成 LocalVariableInvokedByInnerClass.class 時，則會將 final 補上。請參 package: com.ocp.day12.InnerClass.method.decompiler 的 LocalVariableInvokedByInnerClass$1Inner.java，此產出的 LocalVariableInvokedByInnerClass$1Inner.java 檔，係經由 decompiler 工具，將編譯後產出的 LocalVariableInvokedByInnerClass.class 反編譯回 LocalVariableInvokedByInnerClass$1Inner.java 檔，如此可驗證上述所提。

> LocalVariableInvokedByInnerClass$1Inner.java
- Description: If local variable expected to be invoked by Inner class, its value MUST be like characteristic as final, that is, value SHALL be constant. Please read the content of LocalVariableInvokedByInnerClass$1Inner.java, which was generated by decompiler tool, at package: com.ocp.day12.InnerClass.method.decompiler.

> LocalVariableInvokedByInnerClassTest.java
- Description: Test the sample code of LocalVariableInvokedByInnerClass.class

3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day12/InnerClass/staticInnerClass">Introduction of static Inner class</a>

> StaticInnerClassTest.java 
> Outer.java
- Description: Please read the content of sample code

4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day12/anonymous">Introduction of Anonymous Inner Class & Lambda Expression</a>

> Calc.java
- Description: Created a Functional Interface - Only has ONE abstraction method

> CalcImplement.java
- Description: Created a method to override the abstraction method of Calc.class

> TestAnonymousInnerCalc.java
- Description: Created an Anonymous Inner Class to override the method of "a class" or "an interface". 

> SpeedLimits.java
- Description: Created a Functional Interface - Only has ONE abstraction method

> SpeedLimitsImplement.java
- Description: Created a method to override the abstraction method of SpeedLimits.class

> TestAnonymousInnerSpeedLimits.java
- Description: This sample code we introduce how to implement the abstraction method by "Anonymous Inner Class" and "Lambda Expression"

> TestAnonymousInnerSpeedLimitsByPredicate.java.
- Description: This sample code we introduce how to implement the abstraction method by "Anonymous Inner Class" and "Lambda Expression" with Java 1.8 released API - IntPredicate and IntConsumer. 





------------------------------------------------------------------------------
# day13 Java Advanced: API - IntStream, Consumer, Supplier, BiConsumer, ObjIntConsumer, Predicate, IntPredicate, BiPredicate, Function, BiFunction, UnaryOperator, BinaryOperator, IntBinaryOperator, DoubleBinaryOperator
1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day13">Introduction ...</a>

> StreamDemo.java
- Description:  ...

> ConsumerDemo.java
- Description:  ...

> PredicateDemo.java
- Description:  ...

> FunctionDemo.java
- Description:  Since interface of BinaryOperator inherits interface of BiFunction, developer could implement the abstraction method of BiFunction even BinaryOperator originally have neither. By the way, if you expected to override the method of interface from BinaryFunction, suggested to use object type of BinaryOperator, then you could override the abstraction method from both of interface, at same time.
- 請讀者留意，BinaryOperator 介面無此抽象方法 "R apply(T t, U u);"，但因 BinaryOperator 繼承 BiFunction 介面，因此可覆寫其抽象方法。順帶一提，若實作 BinaryFunction 介面的抽象方法，建議物件型別改用 BinaryOperator，如此可同時擁有覆寫 BinaryOperator 和 BinaryFunction 介面中的抽象方法

> SupplierDemo.java
- Description:  ...




------------------------------------------------------------------------------
# day14 Java Advanced: Enum , HashSet, LinkedHashSet, LinkedList, Iterator and HashCode

- Recap the development of Java Document:
![image](https://user-images.githubusercontent.com/83496093/208557806-0a98b1a9-5f94-4e12-b414-45580cfb8103.png)












1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day14/enumLesson">Introduction of Enum</a>
> TestCoin.java
- Description:  ...

> EnumForUSCurrency.java
- Description:  ...

> EnumPositions.java
- Description:  ...

> TestPositions.java
- Description:  ...

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day14/hashSet">Introduction of Set</a> 

> HashSetDemo1.java
- Description:  Giving a sample code to overview the application of HashSet, LinkedHashSet and LinkedList

> HashSetDemo2.java
- Description: In this session, you will learn how to remove the element by Iterator and calculate the total scores by Iterator and Stream API

> HashSetDemo3.java
- Description: Application of LinkedHashSet

> Load Factor & Capacity
- Description: Load Factor and Initial Capacity

3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day14/pojo">Introduction of POJO with application HashSet and LinkedHashSet</a>

> NumPOJO.java
- Description: The NumPOJO.java with overriding the method of hashCode but neither of NumNonPOJOWithoutHashCode.java, are implemented by TestNumPOJO.java. You will see the different consoles because of running the each of hashCode, respectively. For more detail info., please get into the programming of hyper-link above.

> NumNonPOJOWithoutHashCode.java
- Description: Same as description of NumPOJO.java.

> TestNumPOJO.java
- Description: Same as description of NumPOJO.java.


------------------------------------------------------------------------------
# day15 Java Advanced: Vector, Stack, LinkedList, ListIterator, TreeSet, Set, compareTo, Comparable 

1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/vector">Introduction of Vector</a>
> VectorDemo.java
- Description:  ...

2. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/stack">Introduction of Stack</a>
> StackDemo01.java
- Description:  ...

> StackDemo02.java
- Description:  ...

3. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/list">Introduction of LinkedList</a>

> LinkedListDemo01.java
- Description:  ...

> LinkedListDemo02.java
- Description:  ...

4. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/queue">Introduction of Queue</a>

> QueueDemo.java
- Description:  ...

5. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/treeset">Introduction of TreeSet</a>

> TreeSetDemo01.java
- Description:  ...


> TreeSetDemo02.java
- Description:  ...

> TreeSetDemo03.java
- Description:  Demonstration of treeSet with Iterator, and also you will see a storage of Tree for string based on letter

6. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day15/efficiency">Efficiency Testing of Sub-classes from Collection</a>
- Notice here !!! The UML digrames will be revised with adding x-axis and y-axis against the Efficiency/Security and Released Date of each API, for more precisely
- <img width="1003" alt="Screen Shot 2022-12-28 at 10 24 23 AM" src="https://user-images.githubusercontent.com/83496093/209747502-93a2e299-728b-48ec-a567-abe1ae6b0ae2.png">




> ListEfficiency.java
- Description: The executed efficiency of List in this sample code, you will learn the instantiated object of List from 1) always use the same object of list to proceed the loop function, 2) always use the newly object of list to proceed the loop function. 

> TreeSetEfficiency.java
- Description: The executed efficiency of TreeSet is faster than List by 6 times, almost. Pleease check out the sample code for more detail. 

> ArrayListEfficiency.java
- Description:  ...

> VectorEfficiency.java
- Description:  ...

> StackEfficiency.java
- Description:  ...

> LinkedListEfficiency.java
- Description:  ...

> LinkedHashSetEfficiency.java
- Description:  ...

> HashSetEfficiency.java
- Description:  ...

> QueueEfficiency.java
- Description:  ...

> DequeEfficiency.java
- Description:  ...

> PriorityQueueEfficiency.java
- Description:  ...

> ArrayDequeEfficiency.java
- Description:  ...


> ***** Another sample codes , TBD *****


------------------------------------------------------------------------------
# day16 Java Advanced: ... , ... Coming Soon




------------------------------------------------------------------------------
# day17 Java Advanced: Exception

1. <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/com/ocp/day17/exception">Introduction of Exception</a>

> HandleNumberException.java
- Description:

> TestException.java
- Description







------------------------------------------------------------------------------
# day18 Java Advanced: ... , ... Coming Soon




------------------------------------------------------------------------------
# day19 Java Advanced: ... , ... Coming Soon




------------------------------------------------------------------------------
# day20 Java Advanced: ... , ... Coming Soon




------------------------------------------------------------------------------
# day21 Java Advanced: ... , ... Coming Soon





------------------------------------------------------------------------------
# day22 Java Advanced: ... , ... Coming Soon





------------------------------------------------------------------------------
# day23 Java Advanced: ... , ... Coming Soon






------------------------------------------------------------------------------
# day24 Java Advanced: ... , ... Coming Soon






------------------------------------------------------------------------------
# day25 Java Advanced: ... , ... Coming Soon






------------------------------------------------------------------------------
# day26 Java Advanced: ... , ... Coming Soon





------------------------------------------------------------------------------
# Java SE 11 Developer Exam - <a href="https://github.com/JamesCoding888/JavaOCP20221017/tree/master/JavaOCP20221017/src/main/java/Java11/chapter01_dataTypes">Data Types</a>

> StringBuilderPractice01.java
- Description:  ...

> StringBuilderPractice02.java
- Description:  ...

> StringBuilderPractice03.java
- Description:  ...

> StringBuilderPractice04.java
- Description:  ...

> ComparatorPractice.java
- Description:  ...

> Airplane.java
- Description:  ...

> VarTest.java
- Description:  ...

> VarDemo.java
- Description:  ...

> varCanAndCannot.java
- Description:  ...

