package myPackage;
import java.util.*;
public class sumFiveElement {
public static void main(String args[]) {
	Scanner scan= new Scanner(System.in);
	ArrayList<Integer>numbers= new ArrayList<Integer>();
	for(int i=0; i<5; i++) {
    System.out.println("Enter number");
    int num= scan.nextInt();
    numbers.add(num);
	}
	int summation=0;
	for (int sum:numbers) {
		summation+=sum;
	}
System.out.println("Summation of 5 numbers: "+ summation);

}
}
