package myPackage;

public class ExceptionExample {
	public static void main(String args[]) {
		try {
			int data=100/0;
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		int dividend=10, divisor=0 ;
		try {
			int result= dividend/divisor;
			System.out.println("Result: "+result);
			
		} catch(ArithmeticException e) {
			System.out.println("Exception: "+ e);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Rest of the code");
	}

}
