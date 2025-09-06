package myPackage;
import javax.swing.*;
public class MessageEx {
JFrame frame;
MessageEx(){
	frame=new JFrame();
	JOptionPane.showMessageDialog( frame, "Hello World!");
}
public static void main(String args[]) {
	new MessageEx();
}
}
