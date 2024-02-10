package FirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {
	public void deleteing(String id) {
		String url = "jdbc:mysql://localhost:3306/course_management_system";
	    String baseUsername = "root";
	    String basePassword = "";
	    
	    try {
	    	String studentId = id;
	    	Connection c = DriverManager.getConnection(url,baseUsername,basePassword);
	    	Statement s = c.createStatement();
	    	String deleteTutor = "DELETE FROM course_management_system.student WHERE id = '" + studentId + "'";
	        s.executeUpdate(deleteTutor);
	    	
	    } catch (SQLException e) {
	    	System.out.println(e);
	    }
	}
}