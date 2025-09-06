package myPackage;
import java.io.*;
public class BufferedReader3 {
public static void main(String args[]) throws Exception{
	InputStreamReader r= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(r);
	String name= " ";
	while(!name.equals("stop")) {
	System.out.print("enter data:");
	name=br.readLine();
	System.out.println("date is " +name);
	}
	br.close();
	r.close();
}
} 