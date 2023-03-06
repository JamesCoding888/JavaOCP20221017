package Java11.chapter01_dataTypes;

/*
	What is result of compile?
	A)hey oh hi yo ey
	B)heyoh hi yo ey
	C)hey oh hi
	D)hey oh 
	E)None of above

*/



public class StringBuilderPractice04 {
	
	static StringBuilder sb1 = new StringBuilder("yo ");
	StringBuilder sb2 = new StringBuilder("hi ");
	
	StringBuilder foo(StringBuilder s) {
		System.out.print(s + " oh " + sb2);
		return new StringBuilder("ey");
	}
	
	public static void main(String[] args) {

		
		sb1 = sb1.append(new StringBuilderPractice04().foo(new StringBuilder("hey"))); 
		System.out.println(sb1);  

	}
}






/*
 	Answer: A)
 	本節練習，探討 StringBuilder 之用法，主要訓練邏輯思考
	了解 foo 有參數方法回傳 new StringBuilder("ey")  與 sb1 物件進行 append 時，先執行 sb1 再串接 "ey"	
*/