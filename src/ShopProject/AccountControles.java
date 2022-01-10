 package ShopProject;

import static DataBaseManagement.SQLExecute.*;
import static ShopProject.shopproject.*;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;

public class AccountControles {

    public static boolean CheckLogin(String email, String password) {
        try {
            String sql = "SELECT userID "
                    + "FROM LoginDetails "
                    + "WHERE email =  '"+email+"' AND password = '"+/*hashPassword(password)*/password+"'";
            Connection con = getConection();
            ResultSet rs = executeQuery(con, sql);
            if (rs.next()){
                curentUserID = rs.getString("userID");
                System.out.println(curentUserID);
                rs.close();
                con.close();
                return(true);
            }
            rs.close();
            con.close();
            return(false);
            
        }catch (Exception e){
            System.out.println("Not a user /n ---" +e);
            
        }
        return(false);
    }
    
    public static void RegisterUser(String Email, String Password, String ClarifyPassword, String Adress){
        try {
            String emailCheck = "SELECT email"
                    + "FROM LoginDetails"
                    + "WHERE email = '" + Email + "'";
            ResultSet rsEmailCheck = executeQuery(getConection(), emailCheck);

        } catch (Exception noemail) {
            /*try {
                String sql = "SELECT userID "
                        + "FROM LoginDetails "
                        + "WHERE email =  '" + email + "' "
                        + "AND password = '" +/*hashPassword(password) password + "'";
                ResultSet rs = executeQuery(getConection(), sql);
                if (rs.next()) {
                    curentUserID = rs.getString("userID");
                }
                System.out.println(curentUserID);
            } catch (Exception e) {
                System.out.println("Not a user /n ---" + e);
            }*/
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
