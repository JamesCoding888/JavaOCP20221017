package Java11_819.chapter01_dataTypes;
public class StrBldr {
	
	static StringBuilder sb1 = new StringBuilder("yo ");
	StringBuilder sb2 = new StringBuilder("hi ");
	
	StringBuilder foo(StringBuilder s) {
		System.out.print(s + " oh " + sb2);
		return new StringBuilder("ey");
	}
	
	public static void main(String[] args) {
//		第一練習： 了解 StringBuilder 的 append API 之用法
/*    
 
		sb1 = sb1.append("123");  		
		System.out.println(sb1); //yo 123
*/
		
//		第二練習： 了解 foo 有參數方法回傳 new StringBuilder()  與 sb1 進行 append 時，先執行 sb1 再結合 "ey"
/*		
		sb1 = sb1.append(new StrBldr2().foo(new StringBuilder())); // oh hi 
		System.out.println(sb1); //  oh hi yo ey
*/

//		第三練習： 了解 foo 有參數方法回傳 new StringBuilder("ey")  與 sb1 進行 append 時，先執行 sb1 再結合 "ey"		
/*      
		sb1 = sb1.append(new StrBldr2().foo(sb1));  //yo  oh hi 
		System.out.println(sb1); //yo  oh hi yo ey
*/

//		第四練習： 同第三練習
/*		
		sb1 = sb1.append(new StrBldr2().foo(new StringBuilder("hey"))); //hey oh hi
		System.out.println(sb1); 
*/
	}
}
