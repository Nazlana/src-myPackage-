package myPackage;
import java.util.Scanner;
public class areaAndCircumferenceofCircle {
public static void main(String args[]) {
double radius,pi=3.14;
Scanner input= new Scanner(System.in);
System.out.print("Enter radius: ");
radius=input.nextDouble();
double area= pi*radius*radius;
System.out.println("Area of Circle: "+area);
double circumference= 2*pi*radius;
System.out.println("Cİrcumference of Circle: "+circumference);

}
}