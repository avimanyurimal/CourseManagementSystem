package FirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class courseDelete {
	public void deletingCourse(String id) {
		String url = "jdbc:mysql://localhost:3306/course_management_system";
	    String baseUsername = "root";
	    String basePassword = "";
	    
	    try {
	    	String courseId = id;
	    	Connection c = DriverManager.getConnection(url,baseUsername,basePassword);
	    	Statement s = c.createStatement();
	    	String delete = "DELETE FROM course_management_system.Course WHERE id = '" + courseId + "'";
	        s.executeUpdate(delete);
	    	
	    } catch (SQLException e) {
	    	System.out.println(e);
	    }
	}
	
}