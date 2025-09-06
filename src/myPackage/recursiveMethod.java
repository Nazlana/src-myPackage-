package myPackage;

public class recursiveMethod {
	/* r(1)=1
	 * r(2)=2 + r(1)
	 * ...
	 * r(10)= 10 + r(9)
	 */
	
 static int r(int x) {
	 if(x==1) {
		 return 1;
	 }
	 return x + r(x-1);
 }
	
	public static void main(String[] args) {
	System.out.println(r(10));
}
	
	
}
