package myPackage;

public class Method1 {
public static void main(String[] args) {
	f(3);
	power(2, 3);
}



	static void f(int num1) {
		int result= (num1 + 2)*6 ;
		// return result; void, return dönmez X 
		System.out.println(result);
	}
	static void power(int num1, int num2) {
		int result=1;
		for(int i=1;i<=num2;i++) {
			result*=num1;
		}
		System.out.println("Result: "+result);
	}

}
