package myPackage;
import java.util.Scanner;
public class userLogin {
public static void main(String args[]) {
Scanner scan =new Scanner(System.in);
System.out.println("Enter user name: ");
String user_name= scan.nextLine();
System.out.println("Enter password: ");
String password= scan.nextLine();
 if(user_name.equals("java") && password.equals("123")) {
	System.out.println("Login is successfull");
 }else {
	System.out.println("Try Again!");
  }

 }
}
