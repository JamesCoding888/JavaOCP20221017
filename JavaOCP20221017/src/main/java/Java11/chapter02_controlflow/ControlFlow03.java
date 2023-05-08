package Java11.chapter02_controlflow;

/*
	What is the result?
	
	A. 5 4 3 2 1 4 3 2
	B. 5 4 3 2 1
	C. 5 4 3
	D. Nothing
	E. 5
	F. 5 4 3 2 1 4 3 2 1 3 2 1 2 1 1 


*/

public class ControlFlow03{
	public static void main(String[] args) {
		int i = 10;
		do {
			for(int j = i/2 ; j>0 ; j--) {
				System.out.print(j+" ");
			}
			i-=2;
		} while(i>0);
	}
}







/*
 
 	Answer: F
	
	
*/