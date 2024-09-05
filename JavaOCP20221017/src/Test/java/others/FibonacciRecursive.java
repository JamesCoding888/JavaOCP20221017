package others;
import java.util.Scanner;
public class FibonacciRecursive {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);    	
		System.out.print("Please input how many recursive action do you need to:");
		int n = scan.nextInt(); // 輸出的費波那契數列前 n 項
      for (int i = 1; i < n; i++) {
          System.out.print(fibonacci(i) + " ");
      }
  }

  public static int fibonacci(int n) {
      if (n <= 1) {
          return n;
      } else {
          return fibonacci(n - 1) + fibonacci(n - 2);
      }
  }
}


