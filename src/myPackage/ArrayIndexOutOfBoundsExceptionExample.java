package myPackage;

public class ArrayIndexOutOfBoundsExceptionExample {
public static void main(String args[]) {
	int num[]= {1,3,5,7,9};
	try {
		int index=6;
		int value= num[index];
		System.out.println("Value of index " + index + ": " + value);
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ERROR: Index is out of bounds.");
	}
}
}
