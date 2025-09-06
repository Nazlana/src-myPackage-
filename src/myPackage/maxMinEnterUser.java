package myPackage;
import java.util.*;
public class maxMinEnterUser {
public static void main(String args[]) {
	ArrayList<Integer>numbers=new ArrayList<Integer>();
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter elements of ArrayList: ");
	for(int i=0;i<5;i++) {
		int num=scan.nextInt();
		numbers.add(num);
	}
	System.out.println("Elements of ArrayList:");
	
	Collections.sort(numbers);
	
	for(Integer a: numbers) {
		System.out.println(a);
	}
	System.out.println("Min Element:" + numbers.get(0) );
	Integer max= numbers.get(numbers.size()-1); 
	System.out.println("Max Element:" + max);
}
}
