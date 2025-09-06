package myPackage;

import java.util.Scanner;

public class palindromicWords {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a word: ");
	String str= scan.nextLine();
	String reverse="";
	for(int i=str.length()-1 ; i>=0 ; i--) {
		reverse+=str.charAt(i);
	}
	if(reverse.equals(str)) {  //String don't use ==(comparison). 
		System.out.println(str + " is a palindromic word");
	}else {
		System.out.println(str + " is not a palindromic words");
	}
	
}
}
