package myPackage;
import javax.swing.*;
public class CompositeEx {
	public static void main(String args[]) {
		JFrame frame= new JFrame();
		
		String name= JOptionPane.showInputDialog(frame, "Enter your name: ");
		if(name!=null) {
		int confirm= JOptionPane.showConfirmDialog(frame,"Do you confirm your name?", "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION );
		if(confirm==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(frame, "Your name is confirmed!");
		}
		else {
			JOptionPane.showMessageDialog(frame, "Your name is not confirmed");
		  }
	   }	
    }

}
