package login;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by hieudh on 3/25/14.
 */
public class Login implements Serializable{
    public Login(){
    }

    public boolean checkLogin(String username, String password) {
        try {
            Connection con = connectDB.connect();
            String sql = "Select * From user Where userid = ? and password = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            boolean result = rs.next();
            rs.close();
            stm.close();
            con.close();

            if (result) {
                return true;
            }

            if(!con.isClosed())
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            con.close();
        }catch(Exception ex){
            System.out.println("Unable to connect to database" + ex);
        }
        return false;
    }

    public boolean insert(String uId, String passW, String uName,
                          String uGender, String uEmail) {
        try {
            Connection con = connectDB.connect();
            String insertUser = "Insert Into user('userid', 'name', 'email', 'gender', 'password') "
                    + "Value (?, ?, ?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(insertUser);
            stm.setString(1, uId);
            stm.setString(2, uName);
            stm.setString(3, uEmail);
            stm.setString(4, uGender);
            stm.setString(5, passW);
            int result = stm.executeUpdate();
            stm.close();
            if (result>0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}