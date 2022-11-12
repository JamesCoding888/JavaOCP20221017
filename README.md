# JavaOCP NoteBook
Integrated Development Environment (IDE): Eclipse 2021-06

JDK: Java SE 11

Recommended Book: Java 8 Lambdas [https://lemus.webs.upv.es/wordpress/wp-content/uploads/2018/03/java8lambdas.pdf]

Video Lectures of each session will be coming soon

本教學專案 JavaOCP20221017 之影片介紹，將陸續推出，請親愛的讀者盡請期待 ~~~

------------------------------------------------------------------------------
day1:
1. Set-up environment with Eclipse Workspace
2. Lesson learned of following programming:
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
day2: 
1. Lesson learned of following programming for Accessibility:
> Let's talk about accessibilty of Java as following checklist. 
- 在探討 day2 的程式碼之前，請讀者留意 Java 的讀取權限，如圖示
![image](https://user-images.githubusercontent.com/83496093/197315755-e25fed8a-5e11-420d-9f72-a5748a1fcd3b.png)

- Description: We do create three different .java as Apple, Banana and Cherry for verification of accessiblity.
- 本節建立的 .java 範例，係為了驗證讀取權限

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
- Description:
- This session will give you a tool which is API of "IntSummaryStatistics". You shall make a note of following built-in API from IntSummaryStatistics as
- 1) Arrays.stream(name_of_ArrayObject).summaryStatistics().getCount()
- 2) Arrays.stream(name_of_ArrayObject).summaryStatistics().getSum()
- 3) Arrays.stream(name_of_ArrayObject).summaryStatistics().getAverage()
- 4) Arrays.stream(name_of_ArrayObject).summaryStatistics().getMax()
- 5) Arrays.stream(name_of_ArrayObject).summaryStatistics().getMin()

------------------------------------------------------------------------------
day3:
1. Lesson learned of following programming for combination of String2Array and Stream's API:
- Description: The coming of sample codes of StringArrayDemo(s), will give a guidance of reader for understanding the API of String, Array and Stream (Java 1.8).

> StringArraydemo.java:
- Description: This session will tell you, 
- 1) how to use "String[] java.lang.String.split(String regex)" for collecting the each name into String[]
- 2) how to use "Arrays.toString(name_of_stringArray)"
- 3) calculation of arrayLength, p.s., name_of_array.length
- 4) calculation of stringLength, p.s., name_of_string.length()


> StringArraydemo2.java:
- Description: This session will follow up the previously StringArraydemo.java but updating to Java 1.8

> StringArraydemo3.java:
- Description: This session will give a lecture on how to use "Integer.parseInt" （which is meaning by "Parses the string argument as a signed decimal integer"）to catch the score of students that are over or equal to 60, and turn into calculating their average score.
- 此傑講述如何運用 "Integer.parseInt" (此 API 將 String 的引數轉成十進制的值)，來去抓取學生分數係大於或等於 60 分的人數，並將這些及格分數另外做總及格平均分數的計算

> StringArraydemo4.java:
- Description: This session will follow up the previously StringArraydemo3.java but giving a differently demostration of calculation of average Pass Score in Java 1.8.
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
day4:
1. Lesson learned of following programming for Array:
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

