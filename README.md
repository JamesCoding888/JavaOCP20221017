# JavaOCP NoteBook
Integrated Development Environment (IDE): Eclipse 2021-06

JDK: Java SE 11

Recommended Book: Java 8 Lambdas [https://lemus.webs.upv.es/wordpress/wp-content/uploads/2018/03/java8lambdas.pdf]

------------------------------------------------------------------------------
day1:
1. Set-up environment with Eclipse Workspace
2. Lesson learned of following programming:
> Hello.java:
- Description: To make sure the whole system of Eclipse is functional work after running on this code.

> BMIUtil.java:
- Description: Create an Util of BMI.

> CalcBMI.java:
- Description: Giving the both of BMI-method calculation but different concept.

> CalcMath.java:
- Description: 計算平均和計算標準差之方法撰寫

day2: 
1. Lesson learned of following programming for Accessibility:
> Let's talk about accessibilty of Java as following checklist.
![image](https://user-images.githubusercontent.com/83496093/197315755-e25fed8a-5e11-420d-9f72-a5748a1fcd3b.png)

- Description: We do create three different .java as Apple, Banana and Cherry for verification of accessiblity.

2. Lesson learned of the Application of Array:
> ArrayDemo1.java:
- Description: This session will go to tell you how to initiate the array variable and check the length of Array object that has been initiated.

> ArrayDemo2.java:
- Description: 
- a. This session goes to tell you how to use for-loop and for-Each to print out of value from Array object, and also giving a lecture on using length of Array object to print out the value of Array object.
- b. Also, you will learn the Array API - Arrays.toString(name_of_ArrayObject), under "package java.util;".
- c. Also, you shall understand the modern Java 8 (Version: 1.8) that provides an API - Arrays.stream(name_of_ArrayObject).forEach(value_of_ArrayObject -> System.out.print(value_of_ArrayObject + ", ")), under "package java.util;".

> ArrayDemo3.java:
- Description:
- a. This session will use a built-in methods to get the results of Count of length, Sum, Average, Maximum and Minimum value from Array object. Therefore, you will get four differently methods as following:
- 1) getSum(int[] array)
- 2) getAvg(int[] array)
- 3) getMin(int[] array)
- 4) getMax(int[] array)

> ArrayDemo4.java:
- Description:
- a. Since you already understood of how to design your own method(s) as previously lecture, then plz check out the API of "Arrays.stream" to do the work as ArrayDemo3.java. 
- Plz make a note of 
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
- Description: This session will give a lecture on "Integer.parseInt" and calculation of average Pass Score.

> StringArraydemo4.java:
- Description: This session will follow up the previously StringArraydemo3.java but giving a differently demostration of calculation of average Pass Score in Java 1.8.
- 1) mapToInt(score -> Integer.parseInt(score))
- 2) filter(score -> score >= 60)
- 3) average()
- 4) getAsDouble()


> StringBuilderDemo.java:
- Description: This session is giving an introduction of StringBuffer and StringBuilder.

