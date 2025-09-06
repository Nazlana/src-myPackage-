package myPackage;
import java.util.*;
public class Vector3 {
public static void main(String args[]) {
	Vector <Integer> v= new Vector<Integer>();
	v.add(100);
	v.add(200);
	v.add(300);
	v.add(400);
	v.add(500);
	v.add(600);
	v.add(700);
	v.add(800);
	v.add(900);
	System.out.println("Values in vectors: "+v);
	System.out.println("Remove first occurance of element 200: "+v.remove((Integer)200));
	System.out.println("Values in vector:" +v);
	System.out.println("Remove element at index 4: "+v.remove(4));
	System.out.println("new value first in vector: "+v);
	v.removeElementAt(6);
	v.removeElement(800);
	System.out.println("Vector element after removal:" +v);
	System.out.println("Hash code of this vector: "+v.hashCode());
	System.out.println("Element at index 1 is "+v.get(1));
}
}
