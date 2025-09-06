package myPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExamples {
public static void main(String[] args) {
	int a=0,b;
	int arr[] = new int [3];
	Scanner scan=new Scanner(System.in);
	try {
		a= 2/0;
		arr[3]=10;
		System.out.print("Enter b:");
		b= scan.nextInt(); //if enter String, InputMismatchException 
		
		
	}
	 catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array index out of bounds exception");
			System.out.println(e.toString()); //hem hatayı hem mesajı verir
			System.out.println(e.getMessage());//yalnızca mesaj
		
		}catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Arithmetic exception ");
		System.out.println(e.getMessage());
	}
	catch (InputMismatchException e) {
		System.out.println("You did not enter int");
		// TODO: handle exception
	}
	System.out.println("Program is finished");
}
}
