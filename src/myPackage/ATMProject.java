package myPackage;

import java.util.Scanner;
public class ATMProject {
public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	int amount, in, balance=1000;
	System.out.println("Welcome!!");
	System.out.println("Your Current Balance:"+ balance+ "TL");
	
	while(balance>0) {
		
		System.out.println();
		System.out.println("1- Deposit Money");
		System.out.println("2- Withdraw Money");
		System.out.println("3- Balance Inguiry");
		System.out.println("4- Sign Out");
		System.out.print("Select the action you want to do: ");
		in =s.nextInt();
		
	   if (in==1) {
		  System.out.print("The amount you  want to deposit: ");
		  amount= s.nextInt();
		  balance+=amount;
		  
	    }else if (in==2) {
	    	System.out.print("The amount you want to withdraw: ");
	    	amount= s.nextInt();
	    	if (amount>balance) {
	    		System.out.println("Insufficient balance");
			}else {
				balance-=amount;
			}
			
		}else if (in==3) {
			System.out.println("Your current balance:"+balance+"TL");
			
		}else if (in==4) {
			System.out.println("Signing out..");
			break; //*****
		} 
		
		else {
			System.out.println("You have entered incalid transaction");
		}
	
     }
	System.out.println("We will wait again!");
}	
}
