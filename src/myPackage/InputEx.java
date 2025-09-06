package myPackage;
import javax.swing.*;

public class InputEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Yaşınızı girin:");
        // Ek: input null değilse işleyebilirsin
        System.out.println("Girilen yaş: " + input);
    }
}
