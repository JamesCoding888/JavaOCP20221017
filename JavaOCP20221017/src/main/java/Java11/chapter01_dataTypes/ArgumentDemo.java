package Java11.chapter01_dataTypes;

/*
 	1. What is result?
	A) Object value 22
	B) Object value 26
	C) Byte value 22
	D) Short value 26
	E) The compilation fails due to an error in line 1.
	
	
	2. What is result of adding code snippet?
		
		public void process(int v) {
			System.out.println("integer value " + v);		
		}
		
	A) Object value 22
	B) Object value 26
	C) Byte value 22
	D) Short value 26
	E) The compilation fails due to an error in line 1.
	F) integer value 26
	
	
*/
public class ArgumentDemo {
	public void process(byte v) {
		System.out.println("Byte value " + v);		
	}
	// code snippet
	
	public void process(short v) {
		System.out.println("Short value " + v);		
	}
	public void process(Object v) {
		System.out.println("Object value " + v);		
	}
	public static void main(String[] args) {
		byte x = 11;
		short y = 15;
		new ArgumentDemo().process(x+y); // line 1
	}
}





/*
 	1. Answer: B
 	2. Answer: F

 	
*/
