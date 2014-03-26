import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

/**
 * Created by hieudh on 3/25/14.
 */
public class testConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "user";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


   // Read more: http://mrbool.com/how-to-connect-with-mysql-database-using-java/25440#ixzz2wxMeZU6V
}
