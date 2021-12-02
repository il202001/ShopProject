  package GUIsBroke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI {
    private JPasswordField passwordInput;
    private JPanel LoginGuiMain;
    private JTextField usernameInput;
    private JButton loginButton;
    private JButton forgotPasswordButton;
    private JButton registerButton;
    JFrame login = new JFrame("LoginGUI");
    RegisterGUI registerObj = new RegisterGUI();

    public LoginGUI() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("wasup");
            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerObj.setVisible(true);
                login.setVisible(false);
            }
        });
    }

    public void setVisible(boolean b) {
        login.setContentPane(new LoginGUI().LoginGuiMain);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.pack();
        login.setSize(500,500);
        login.setVisible(b);
        System.out.println("hi amd bye");
    }
}
