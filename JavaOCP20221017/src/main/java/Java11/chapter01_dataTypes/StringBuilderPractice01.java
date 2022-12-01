package Java11.chapter01_dataTypes;
/*
	What is result of compile?
	A)yo 1
	B)yo 12
	C)yo 123
	D) yo 123
	
*/

public class StringBuilderPractice01 {
	
	static StringBuilder sb1 = new StringBuilder("yo ");
	StringBuilder sb2 = new StringBuilder("hi ");
	
	StringBuilder foo(StringBuilder s) {
		System.out.print(s + " oh " + sb2);
		return new StringBuilder("ey");
	}
	
	public static void main(String[] args) {
		sb1 = sb1.append("123");  		
		System.out.println(sb1); 
	}
}





/*

	Answer: C)

	本節練習，探討 StringBuilder 之用法，主要訓練邏輯思考
		
*/