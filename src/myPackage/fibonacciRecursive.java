package myPackage;

public class fibonacciRecursive {
 static int fibonacci(int n){ // 1  1  2  3  5  8  13  21 
     if (n==1 || n==2) {
		return 1;
	}
     return fibonacci(n-1)+fibonacci(n-2);
 }
	 public static void main(String[] args) {
		System.out.println("Step 6: "+ fibonacci(6));
	}
	 
}
