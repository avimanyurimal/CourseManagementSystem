package FirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PassChange {
    public void passChange(String newP, String oldP, String userMail, String tableName) {
        String url = "jdbc:mysql://localhost:3306/course_management_system";
        String baseUsername = "root";
        String basePassword = "";
        String table = tableName;
        String oldPassword = oldP;
        String newPassword = newP;
        String passEmail = userMail;

        try {
            Connection c = DriverManager.getConnection(url, baseUsername, basePassword);
            Statement s = c.createStatement();
            String query = "CREATE DATABASE IF NOT EXISTS course_management_system";
            s.executeUpdate(query);
            System.out.println(oldPassword);
            System.out.println(newPassword);
            
            String updateQuery = "UPDATE course_management_system." + table + " SET " +
                    "Password = '" + newPassword + "'" + 
                    "WHERE Email = '" + passEmail + "'"; 
            s.executeUpdate(updateQuery);
            s.close();
            c.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}