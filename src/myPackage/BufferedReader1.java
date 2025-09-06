package myPackage;
import java.io.*;
public class BufferedReader1 {
public static void main(String args[]) {
	FileReader fr= new FileReader("D:\\data.txt");
	BufferedReader br= new BufferedReader(fr);
	int i;
	while((i=br.read())!=-1) {
		System.out.println((char)i);
	}
	br.close();
	fr.close();
	
}
}
