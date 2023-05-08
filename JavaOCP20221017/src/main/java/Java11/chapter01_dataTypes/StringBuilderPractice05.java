package Java11.chapter01_dataTypes;
/*
	What is result?
	A) 4
	B) 3
	C) 2
	D) An exception is thrown at runtime. 
	E) 5

*/
public class StringBuilderPractice05 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		sb.append("HOWDY");
		sb.insert(0, ' ');
		sb.replace(3, 5, "LL");
		sb.insert(6, "COW");
		sb.delete(2, 7); 
		System.out.println(sb.length()); 	
	}
}






/*
 	Answer: A)
 	本節練習，探討 StringBuilder 之用法，主要訓練邏輯思考
 	
 	執行每行的結果如下:
	sb.insert(0, ' '); // _HOWDY
	sb.replace(3, 5, "LL"); // _HOLLY
	sb.insert(6, "COW"); // _HOLLYCOW
	sb.delete(2, 7); // _HOW
	System.out.println(sb.length()); // 4	
*/


