package myPackage;
import java.util.*;
public class LinkedList1 {
public static void main(String args[]) {
	LinkedList<String>list= new LinkedList<String>();
	list.add("Nazlan");
	list.add("Nazlı");
	list.add("Nazan");
	Iterator i = list.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
}

def selamla
  puts "Merhaba!"
end
