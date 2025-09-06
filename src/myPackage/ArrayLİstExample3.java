package myPackage;
import java.util.*;

public class ArrayLİstExample3 {
 public static void main(String args[]) {
	 List<String> list= new ArrayList<String>();
	 list.add("Mango");
	 list.add("Banana");
	 list.add("Apple");
	 Collections.sort(list);
	 for(String fruit:list) System.out.println(fruit);
	 System.out.println("Sorting numbers....");
	 List<Integer>list2= new ArrayList<Integer>();
	 list2.add(21);
	 list2.add(12);
	 list2.add(51);
	 list2.add(5);
	 Collections.sort(list2);
	 // for(Integer number:list2) System.out.println(number); -----Sıralanmasını sağlar
	 System.out.println(list2); // [5,12,21,51] şeklinde yazar
	 
 }
}
