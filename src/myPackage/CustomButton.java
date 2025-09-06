package myPackage;
import javax.swing.*; 

public class CustomButton{
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        String[] options = {"Sign In", "Guest", "Log Out"};

        int choice = JOptionPane.showOptionDialog(
            frame,
            "How do you want to proceed?",
            "Entry Selection",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0] 
        );

        if (choice == 0) {
            JOptionPane.showMessageDialog(frame, "Welcome, you've checked in!");
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(frame, "You continue as a guest.");
        } else if (choice == 2) {
            JOptionPane.showMessageDialog(frame, "The transaction is canceled.");
        } else {
            System.out.println("The window is closed.");
        }
    }
}
