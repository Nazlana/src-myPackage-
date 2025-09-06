package myPackage;
import javax.swing.JOptionPane;
public class PayrollDialog {
	public static void main(String args[]) {
		String inputString, name;
		int hours;
	    double payRate, grossPay;
	    name= JOptionPane.showInputDialog("What is" + " your name?");
	    inputString= JOptionPane.showInputDialog("How many hours" + "did you work this week?");
	    hours= Integer.parseInt(inputString);
	    inputString=JOptionPane.showInputDialog("What is" + " your hourly pay rate?");
	    payRate=Double.parseDouble(inputString);
	    grossPay= hours * payRate;
	    JOptionPane.showMessageDialog(null, "Hello " + name +". Your gross pay is $"+ grossPay );
	    System.exit(0);
	}

}
