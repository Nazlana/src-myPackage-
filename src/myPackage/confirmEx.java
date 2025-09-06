package myPackage;
import javax.swing.*;
public class confirmEx {
public static void main(String args[]) {
	JFrame frame= new JFrame();
	JOptionPane.showConfirmDialog(frame,"Do you want to save?", "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION );
}
}
