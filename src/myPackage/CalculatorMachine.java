package myPackage;
import java.util.Scanner;
public class CalculatorMachine {
public static void main(String args[]) {
	Scanner scan= new Scanner(System.in);
	double num1,num2;
	System.out.print("Enter first number: ");
	num1=scan.nextDouble();
	System.out.print("Enter second number: ");
	num2=scan.nextDouble();
	System.out.println("1:Summation\n 2:Subtraction\n 3:Muliplication\n 4:Division\n");
	System.out.println("Choose your operation:");
	int operator= scan.nextInt();
	System.out.print("Result:");
	switch(operator) {
	case 1:
		System.out.println(num1+num2);
		break;
	case 2:
		System.out.println(num1-num2);
		break;
	case 3: 
		System.out.println(num1*num2);
		break;
	case 4: 
		System.out.println(num1/num2);
		break;

	default:
		System.out.println("You did not choose an operator");
		
	
	
	}
	
}
}
