package ShopProject;

import GUIs.LoginGUI;

import javax.swing.*;
import java.awt.*;

public class shopproject {
    
    public static String curentUserID;

    public static void main(String[] args) {
        LoginGUI login = new LoginGUI();

        login.setVisible(true);
        System.out.println("Hello");
    }

}
