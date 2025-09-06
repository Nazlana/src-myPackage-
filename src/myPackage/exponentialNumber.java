package myPackage;
import java.util.Scanner;
public class exponentialNumber {
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int num1,num2,result=1;
	System.out.print("Enter n: (n^m) ");
	num1=scan.nextInt();
	System.out.print("Enter m: (n^m) " );
	num2=scan.nextInt();
	int i=1;
	while(i<=num2) {
		result= result*num1;
		i++;
	}
System.out.println("Result: "+result);

}
}
