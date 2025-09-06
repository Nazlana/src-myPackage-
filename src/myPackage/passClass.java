package myPackage;

import java.util.Scanner;

public class passClass {
public static void main(String args[]) {
	Scanner scan= new Scanner(System.in);
	int math,turkish,science,social,physical;
	System.out.print("Enter your math grade: ");
	math= scan.nextInt();
	System.out.print("Enter your turkish grade: ");
	turkish= scan.nextInt();
	System.out.print("Enter your science grade: ");
	science= scan.nextInt();
	System.out.print("Enter your social grade: ");
	social= scan.nextInt();
	System.out.print("Enter your physical grade: ");
	physical= scan.nextInt();
	
	double average= (math + turkish+ science+ social+ physical ) / 5;
	System.out.print("Your average grades: "+ average + " So, ");
	if(average>50) {
		System.out.println("Success! Passed the Class");
	}else {
		System.out.println("Fail the class!!");
	}
}
}
