package myPackage;
import java.util.*;
public class ArrayLİstExample2 {
public static void main(String args[]) {
	ArrayList<String>list= new ArrayList<String>();
	list.add("Mango");
	list.add("Banana");
	list.add("Apple");
	System.out.println("First element:"+ list.get(0));
	list.set(1, "Cherry");
	for(String fruit:list) System.out.println(fruit);
	
}
}
