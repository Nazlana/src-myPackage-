package myPackage;
import java.util.*;
public class JavaScanner {
public static void main(String args[]) {
	String s= "hello, This is a Java Program";
	Scanner scan= new Scanner(s);
	System.out.println("Boolean result: " +scan.hasNext());
	System.out.println("String result: " +scan.nextLine());
	scan.close();
	System.out.println("--------Enter your details-----------");
	Scanner in= new Scanner(System.in);
	System.out.print("Enter your name: ");
	String name= in.next();
	System.out.println("Name: "+name);
	System.out.print("Enter your age: ");
	int age= in.nextInt();
	System.out.println("Age: "+age);
	System.out.print("Enter your salary: ");
	double salary= in.nextDouble();
	System.out.println("Salary: "+salary); 
	in.close();
	
}
}
