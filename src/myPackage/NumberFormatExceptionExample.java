package myPackage;

public class NumberFormatExceptionExample {
	public static void main(String args[]) {
		String str= "Nazlan";
		try {
			int num= Integer.parseInt(str);
			System.out.println("Parsed number: "+num);		
			
		} catch(NumberFormatException e) {
			System.out.println("ERROR!:" + e + " Unable to parse the string as an integer");
		}
	}

}
