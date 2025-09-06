package myPackage;
import java.awt.*;
import javax.swing.*;
public class FrameExam{
public static void main(String args[]) {
	JFrame frame= new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(new Dimension(320,150));
	frame.setLocationRelativeTo(null);
	frame.setTitle("Example");
	
	Container contentPane = frame.getContentPane();  
	contentPane.setLayout(null); 
    contentPane.setBackground(Color.GRAY);
    
    JLabel text= new JLabel("Name: "); 
    text.setBounds(30,30,80,30);
	contentPane.add(text);
	
	JTextField textField= new JTextField();
	textField.setBounds(90, 30, 150, 30);
	contentPane.add(textField);
	
	JButton button=new JButton("Submit");
	button.setBounds(100, 70, 100, 30);
	contentPane.add(button);
	
	frame.setVisible(true);
}
}
