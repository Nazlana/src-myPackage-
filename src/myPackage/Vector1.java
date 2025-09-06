package myPackage;
import java.util.*;
public class Vector1 {
public static void main(String args[]) {
	Vector<String>v= new Vector<String>();
	v.add("Apple");
	v.addElement("Cherry");
	v.add("Banana");
	for(String i: v ) System.out.println("Element of vector:" + i);
	
}
}
