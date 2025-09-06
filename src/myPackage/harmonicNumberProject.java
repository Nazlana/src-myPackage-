package myPackage;

import java.util.Scanner;

public class harmonicNumberProject { // 1 + 1/2 + 1/3 + 1/4 +.....+ 1/n
  public static void main(String args[]) {
	  Scanner s=new Scanner(System.in);
	  double h, harmonic=0.0;
	  System.out.print("Enter harmonic number: ");
	  h=s.nextDouble();
	  System.out.print("Harmonic "+ h + ":");
	  while(h>0) {
		  harmonic= harmonic + 1/h;
		  h--;
	  }
	  System.out.println(harmonic);
	  
  }
}
