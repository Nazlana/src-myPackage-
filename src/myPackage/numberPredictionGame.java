package myPackage;

import java.util.Random;
import java.util.Scanner;

public class numberPredictionGame {
public static void main(String[] args) {
	int guess, rights=5;
	Random random=new Random();
	Scanner scan = new Scanner(System.in);
	int num= random.nextInt(100); //0-100
	boolean gameSituation=false;
	
	System.out.println(num);
	System.out.println("Welcome to Number Prediction Game!!");
	System.out.println("I kept a number between 0-99");
	
	while (rights>0) {
		System.out.print("Your guess: ");
		guess=scan.nextInt();
		
		if(guess<0 || guess>99 ) {
			System.out.print("Please, Enter a number between 0-99");
		
			continue;
		}
		if(guess==num) {
			gameSituation = true;
			
		}else {
			System.out.println("Wrong!! Your Left Right: "+ --rights);
			
			
		}

	
     if(gameSituation) {
    	 System.out.println("Congratulations !!!");
    	 System.out.println("Your number : "+ num);
    	 System.out.println("Your left right : "+ rights);
    	 break; 
     }else {
		System.out.println(" Try Again!! ");
	}
	
}
	}
}
