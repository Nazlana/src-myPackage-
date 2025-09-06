package myPackage;
import java.util.*;
public class City {
public static void main(String args[]) {
	ArrayList<String>cities= new ArrayList<String>();
	cities.add("Ankara");
	cities.add("İstanbul");
	cities.add(2,"Bursa");
	cities.add("İzmir");
	cities.add("Muğla");
	System.out.println("Cities: ");
	for(String c: cities) {
		System.out.println(c);
	} 
	
}
}
