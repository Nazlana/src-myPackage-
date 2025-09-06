package myPackage;
import java.io.*;
public class Bufferedreader2 {
public static void main(String args[]) throws Exception{
	InputStreamReader r= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(r);
	System.out.println("enter your name:");
	String name= br.readLine();
	System.out.println("Welcome" +name);
	}
}
