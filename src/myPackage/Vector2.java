package myPackage;
import java.util.*;
public class Vector2 {
public static void main(String args[]) {
	Vector<String>v=new Vector<String>();
	v.add("Dog");
	v.addLast("Rat");
	v.add("Cat");
	System.out.println("Size is " +v.size());
    System.out.println("Default Capacity is "+v.capacity());
    System.out.println("elements of vector:" +v);
    //----------------------------------------------------------
    v.addElement("Lion");
	v.addFirst("Tiger");
	v.addLast("Mouse");
	v.add("Deer");
	System.out.println("Size after addition: "+v.size());
	System.out.println("Capacity after addition: "+v.capacity());
	System.out.println("Elements of vector after addition: "+v);
	//-------------------------------------------------------------
	if(v.contains("Deer")) {
		System.out.println("Deer is present at the index " +v.indexOf("Deer"));
	}else {
		System.out.println("Deer is absent");
	}
	System.out.println("The first animal of the vector is"+v.firstElement());
	System.out.println("The last animal of the vector is"+v.lastElement());
}
}
