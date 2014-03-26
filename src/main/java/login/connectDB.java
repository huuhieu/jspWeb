package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by hieudh on 3/25/14.
 */
public class connectDB {
    public static Connection connect() throws SQLException, ClassNotFoundException {
        String conURL = "jdbc:mysql://localhost:3306/user";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(conURL, "root", "");
    }
}
