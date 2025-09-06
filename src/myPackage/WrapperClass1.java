package myPackage;
public class WrapperClass1 {
/* Wrapper class == İnteger,Boolean,Character,Byte,Long,Float,Double
 *  Primitive class== int, boolean, char,byte,short,long,float,double
 *  primitive--->object == autoboxing 
 *  object----->primitive == unboxing */

	public static void main(String args[]) {
		int a=20,b=30;
		int sum= a+b;
		System.out.println(sum);
		Integer i=Integer.valueOf(a);
		Integer j= a;
		System.out.println(a+""+i+""+j);
	}
	
}
