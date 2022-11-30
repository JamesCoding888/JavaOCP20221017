package Java11_819.chapter01_dataTypes;

/* 
	Which of the following answers is correct?
	
	A. 75 
	B. 7 5
	C. 35
	D. 3 5
	E. 25
	F. 2 5
	G. The programming is unable to compile.
	H. None of the above
	
	
	
*/



public class Airplane {
	static int start = 2;
	final int end;
	public Airplane(int x) {
		x = 4;
		end = x;
	}
	
	public void fly(int distance) {
		System.out.print(end - start + " ");
		System.out.print(distance);
	}
	
	public static void main(String ... start) {
		new Airplane(30).fly(5);
	}
}







/*
	The answer is F.
	
	說明如下：
	line: 23，final variable 之應用和說明，請參 package: com.ocp.day6.ScannerException 之 IntroductionOfFinal.java
	line: 34，(String ... start) 之 Varargs 語法，請參 "com.ocp.day9_1.Varargs" 說明
*/