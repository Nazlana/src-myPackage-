package myPackage;

import java.util.Scanner;

public class FlightTicket {

	public static void main(String[] args) {
		int km,age, type;
		double price, ageDiscount, typeDiscount;  
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter kilometers:");
		km=s.nextInt();
		System.out.println("Enter your age:");
		age=s.nextInt();
		System.out.println("Enter flight type (1=Round trip 2=One way):");
		type=s.nextInt();
		
		price= km*0.10;
		
		if(km>0 && age>0 && (type==1 || type ==2 )) {
			
			if(age<15) {
			    ageDiscount = price * 0.5;
			    price-=ageDiscount; 
			}else if(age>=15 && age<24) {
			   ageDiscount = price* 0.1 ;
			   price-=ageDiscount; 
			} else if(age>65) {
				ageDiscount=price*0.3;
				price-=ageDiscount;
			}
			
			if(type==1) {
				typeDiscount=price*0.1;
				price-=typeDiscount;
			}
			
		}else {
			System.out.println("Invalid data");
		}
		
		System.out.println("Amount to be paid: "+ price + "$");

		

	}

}
