package myPackage;

import java.util.Scanner;

public class ActivityRecommendation {

	public static void main(String[] args) {
		int temperature;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter temperature: ");
		temperature=scan.nextInt();
		if(temperature<4) {
			System.out.println("You can ski");
		}else if(temperature>5 && temperature<=30) {
			System.out.println("You can go cinema");
		}else {
			System.out.println("You can swim");
			
			
		}

	}

}
