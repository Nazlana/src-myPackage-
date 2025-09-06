package myPackage;
import java.util.*;
public class RepeatedNumberArrayList {
public static void main(String args[]) {
	ArrayList <Integer> numbers= new ArrayList<Integer>();
	numbers.add(5);
	numbers.add(3);
	numbers.add(8);
	numbers.add(7);
	numbers.add(8);
	numbers.add(3);
	ArrayList<Integer> duplicates = new ArrayList<>();

    for (int i = 0; i < numbers.size(); i++) {
        int current = numbers.get(i);

        
        for (int j = i + 1; j < numbers.size(); j++) {
            if (current == numbers.get(j)) {
               
                if (!duplicates.contains(current)) {
                    duplicates.add(current);
                }
               
            }
        }
    }

    System.out.println("Repeated numbers: " + duplicates);
	}
}
