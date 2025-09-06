package myPackage;

import java.util.Scanner;

public class AverageOfArrayElements {
public static void main(String[] args) {
	
	int []grades= new int[7];
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Welcome! Please, Enter your grades: ");
	
	System.out.print("Turkish: ");
	grades[0]=scan.nextInt();
	
	System.out.print("Math: ");
	grades[1]= scan.nextInt();
	
	System.out.print("Physics: ");
    grades[2]= scan.nextInt();
    
    System.out.print("History: ");
    grades[3]=scan.nextInt();
    
    System.out.print("Chemistry: ");
    grades[4]=scan.nextInt();
    
    System.out.print("Biology: ");
    grades[5]=scan.nextInt();
    
    System.out.print("English: ");
    grades[6]=scan.nextInt();
    
    int sum=0;
    for(int value: grades) {
    	sum += value;
    	
    }
    System.out.println("Total of all lectures: "+ sum);
	System.out.println("AVerage of grades: "+ sum/grades.length);		
			
			
}	
}
