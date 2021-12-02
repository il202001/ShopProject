package DataBaseManagement;

import java.util.Scanner;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLExecute {
    
    private static final String DatabaseLocation = System.getProperty("user.dir") + "\\ShopPoject.accdb";
    private static Connection con;
    
    public static Connection getConection() {
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            return con;
        }catch (Exception e){
            System.out.println("Error in the repository class: " +e);
        }
        return null;
    }
    
    public static ResultSet executeQuery(Connection con, String query){
        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        }catch (Exception e){
            System.out.println("sql query" +e);
            return null;
        }
    }
    
    public static void executeUpdateQuery(Connection con, String query){
        try{
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.executeUpdate(query);
        }catch(Exception e){
            System.out.println("Error in ExecuteUpdateQuery"+e);
        }
    }
}
