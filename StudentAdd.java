package FirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class StudentAdd {
	public void addStudent(String fName, String lName, String Email, String Password, String phone, String course ) {
		String url = "jdbc:mysql://localhost:3306/course_management_system";
        String baseUsername = "root";
        String basePassword = "";
        
       String first = fName;
       String last = lName;
       String mail = Email;
       String pass = Password;
       String user = "Student";
       String number = phone;
       String module = course;
        try {
        	Connection c = DriverManager.getConnection(url,baseUsername,basePassword);
        	Statement s = c.createStatement();
        	String studentTable = "CREATE TABLE IF NOT EXISTS course_management_system.student(ID INT AUTO_INCREMENT PRIMARY KEY, FirstName varchar(50), LastName varchar(50), Email varchar(120), Password varchar(50), User varchar(50), Phone varchar(120), Course varchar(1000))";
        	s.execute(studentTable);
        	String insertCourse = "INSERT INTO course_management_system.student (FirstName, LastName, Email, Password, User, Phone , Course) VALUES (?, ?, ?, ?, ?,?,?)";
        	PreparedStatement pstmt = c.prepareStatement(insertCourse); 
        	pstmt.setString(1, first);
        	pstmt.setString(2, last);
        	pstmt.setString(3, mail);
        	pstmt.setString(4, pass);
        	pstmt.setString(5, user);
        	pstmt.setString(6, number);
        	pstmt.setString(7, module);
        	pstmt.executeUpdate(); 
        } catch(Exception e) {
        	System.out.print(e);
        }
        
		
	}
}