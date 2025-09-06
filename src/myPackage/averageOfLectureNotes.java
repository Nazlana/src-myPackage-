package myPackage;
import java.util.*;
public class averageOfLectureNotes {
 public static void main(String args[]) {
  Scanner scan= new Scanner(System.in);
  int midterm, finalex, quiz, project ;
  System.out.print("Enter your midterm score:");
  midterm= scan.nextInt();
  System.out.print("Enter your final score:");
  finalex= scan.nextInt();
  System.out.print("Enter your quiz score:");
  quiz= scan.nextInt();
  System.out.print("Enter your project result:");
  project= scan.nextInt();
  
  double average= midterm*0.3 + finalex*0.4 + quiz*0.1 + project*0.2; 
  System.out.println("You are total grades: " + average);
  if(average>90 && average <=100) {
	  System.out.println("Your letter grade is A");
  } else if (average >80 && average <=90 ) {
	  System.out.println("Your letter grade is B+");
  }else if (average >70 && average <=80 ) {
	  System.out.println("Your letter grade is B");
  }else if (average >60 && average <=70 ) {
	  System.out.println("Your letter grade is C");
  }else if (average >50 && average <=60 ) {
	  System.out.println("Your letter grade is D");
  }else{
	  System.out.println("Your letter grade is F");
  }

   String result = (average>50)?"Successfull":"Fail"; 
System.out.println(result);
}
}