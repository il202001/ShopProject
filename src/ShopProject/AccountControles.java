package ShopProject;

import static DataBaseManagement.SQLExecute.*;
import static ShopProject.shopproject.*;
import java.security.MessageDigest;
import java.sql.ResultSet;

public class AccountControles {

    public static void CheckLogin(String email, String password) {
        try {
            String sql = "SELECT userID FROM LoginDetails WHERE email =  '"+email+"' AND password = '"+/*hashPassword(password)*/password+"'";
            ResultSet rs = executeQuery(getConection(), sql);
            if (rs.next()){
                curentUserID = rs.getString("userID");
            }
            System.out.println(curentUserID);
        }catch (Exception e){
            System.out.println("Not a user /n ---" +e);
        }
    }

    public static String hashPassword(String password) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < digest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        password = hexString.toString();
        return password;
    }
}
