package myPackage;
import java.awt.*;
import javax.swing.*;

public class SimpleFrame2 {
public static void main(String args[]) {
	JFrame frame= new JFrame();
	frame.setForeground(Color.WHITE); // metin ve bileşen rengi (ön plan rengi)
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pencere kapatılırsa program sonlanır
	frame.setLocation(new Point(80,50)); 
	//frame.setLocationRelativeTo(null);----> Ekranın ortasında açılır 
	frame.setSize(new Dimension(300,200)); // width and height
	//frame.setSize(300, 300); // ikiside aynı sonucu verir biri Dimension nesnesi ile çalışır diğeri int değerler ile 
	frame.setTitle("First Frame");
	frame.setVisible(true);
	//frame.setTitle("New First Frame");// en son yazığını kabul eder
	
}
}
