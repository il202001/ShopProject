package Objects;

import static DataBaseManagement.SQLExecute.*;
import java.sql.Connection;
import java.sql.ResultSet;

public class typeControle {

    public int currentType = 1;

    public String NextType() {
        try {
            String sql = "SELECT prodName"
                    + "From Type"
                    + "WHERE typeID = '"+currentType+"'";
            Connection con = getConection();
            ResultSet rs = executeQuery(con, sql);
            if (rs.next()){
                String prodName = rs.getString("prodName");
                rs.close();
                con.close();
                return(prodName);
                
            }
        } catch (Exception e) {
            System.out.println("no more types " + e);
        }

        return (null);
    }

}
