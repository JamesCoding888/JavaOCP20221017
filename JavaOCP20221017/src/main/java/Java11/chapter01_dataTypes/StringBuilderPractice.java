package Java11.chapter01_dataTypes;
public class StringBuilderPractice {
	
	static StringBuilder sb1 = new StringBuilder("yo ");
	StringBuilder sb2 = new StringBuilder("hi ");
	
	StringBuilder foo(StringBuilder s) {
		System.out.print(s + " oh " + sb2);
		return new StringBuilder("ey");
	}
	
	public static void main(String[] args) {
//		第一練習： 了解 StringBuilder 之 "append" API 用法
/*    
 
		sb1 = sb1.append("123");  		
		System.out.println(sb1); //yo 123
*/
		
//		第二練習： 了解 foo 有參數方法回傳 new StringBuilder() 與 sb1 物件進行 append 時，先執行 sb1 再串接 "ey"
/*		
		sb1 = sb1.append(new StringBuilderPractice().foo(new StringBuilder())); // oh hi 
		System.out.println(sb1); //  oh hi yo ey
*/

//		第三練習： 了解 foo 有參數方法回傳 new StringBuilder("ey")  與 sb1 物件進行 append 時，先執行 sb1 再串接 "ey"		
/*      
		sb1 = sb1.append(new StringBuilderPractice().foo(sb1));  //yo  oh hi 
		System.out.println(sb1); //yo  oh hi yo ey
*/

//		第四練習： 同第三練習
/*		
		sb1 = sb1.append(new StringBuilderPractice().foo(new StringBuilder("hey"))); //hey oh hi
		System.out.println(sb1);  //yo ey
*/
	}
}






/*
	本節練習，探討 StringBuilder 之用法，主要訓練邏輯思考
	共有四個練習題，請讀者將註解分別移除後，執行程式碼，確認與自己判斷的產出結果，是否一致	
*/