package GUIsBroke;

import javax.swing.*;

public class RegisterGUI {
    private JPanel registerGuiPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JTextField textField3;
    private JButton signUpButton;
    JFrame register = new JFrame("RegisterGUI");


    public void setVisible(boolean b) {
        register.setContentPane(new RegisterGUI().registerGuiPanel);
        register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        register.pack();
        register.setSize(500,500);
        register.setVisible(b);

        System.out.println("hi amd bye");
    }
}