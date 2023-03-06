package Java11.chapter01_dataTypes;
/*
	What is result of compile?
	A)oh hiyo ey
	B)oh hi yo ey
	C) oh hi yo ey
	D)oh hi yoey
	E)None of above

*/


public class StringBuilderPractice02 {
	
	static StringBuilder sb1 = new StringBuilder("yo ");
	StringBuilder sb2 = new StringBuilder("hi ");
	
	StringBuilder foo(StringBuilder s) {
		System.out.print(s + " oh " + sb2);
		return new StringBuilder("ey");
	}
	
	public static void main(String[] args) {			
		sb1 = sb1.append(new StringBuilderPractice02().foo(new StringBuilder())); 
		System.out.println(sb1); 
	}
}






/*
 	Answer: C)
	本節練習，探討 StringBuilder 之用法，主要訓練邏輯思考
	了解 foo 有參數方法回傳 new StringBuilder() 與 sb1 物件進行 append 時，先執行 sb1 再串接 "ey"	

*/