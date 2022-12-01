package Java11.chapter01_dataTypes;

/*
	What is result of running the following programming?
	
	A. 5
	B. 10
	C. 15
	D. 20
	E. 25
	F. 30
*/

public class VarTest {
	public static void main(String[] args) {
		var i = 10;
		var j = 5;
		final var k = 10;
		i+=(j*5 + i) / j - 2;
		System.out.println(i);	
	}
}








/*
 
 	Answer: C
	本節考的是 "var" type 之應用
	對於不熟悉 var 的讀者，可參 package: Java11.chapter01_dataTypes 的 VarDemo.java 說明
	
*/