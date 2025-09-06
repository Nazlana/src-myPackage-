package myPackage;

import java.util.Scanner;

public class FactorialCalculateProject {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int fnum=scan.nextInt();
		int result=1;
		System.out.print(fnum + "!=");
		while(fnum >0) {
			result*=fnum;
			fnum--;
		}
		System.out.println(result);
	    scan.close(); 

	}

}
