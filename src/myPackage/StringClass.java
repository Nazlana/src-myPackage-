package myPackage;

public class StringClass {
public static void main(String[] args) {
	char[]str= {'N','A','Z','L','A','N'};
	String text=new String(str);
	System.out.println(text);
	System.out.println(str.length); //char
	System.out.println(text.length()); //String
	char[] str2={'A','F', 'Ş', 'A', 'R' };
	String text2=new String(str2);
	// System.out.println(str.concat(str2)); DONT USE XX
	System.out.println(text.concat(text2));
	System.out.println(text + text2);
	System.out.println(text.indexOf('L'));
	System.out.println(text.charAt(1));
	System.out.println(text.endsWith("LA"));
	System.out.println(text.toLowerCase());
	
	
}
}
