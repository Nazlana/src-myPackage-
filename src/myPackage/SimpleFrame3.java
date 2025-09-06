package myPackage;
import java.awt.*;
import javax.swing.*;
public class SimpleFrame3 {
public static void main(String[] args) {
	JFrame f= new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(new Dimension (300,100));
	f.setTitle("A Frame");
	
	JButton b1= new JButton();
	b1.setText("I'm a button");
	b1.setBackground(Color.BLUE);
	f.add(b1);
	
	JButton b2= new JButton();
	b2.setText("Click me!");
	b2.setBackground(Color.RED);
	f.add(b2);
	//Only appeared 1 button on the screen. This is a LAYOUT PROBLEM. 
	//TO SOLVE;
	f.setLayout(new FlowLayout()); // Buttonları sağa ve sola hizalar
	f.setVisible(true);
}
}

