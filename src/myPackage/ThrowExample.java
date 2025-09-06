package myPackage;

public class ThrowExample {
 static void checkAge(int age) {
	 if (age<18) {
		 throw new ArithmeticException( age + ": You must be at least 18");
	 } else {
		 System.out.println( age + ": You are old enough!");
	 }
 }
 public static void main(String args[]) {
	 checkAge(20);
	 checkAge(15);
 }
}
