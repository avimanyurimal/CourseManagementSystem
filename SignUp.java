package FirstProject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField first;
	private JTextField last;
	private JTextField email;
	private JPasswordField pass;
	private JComboBox ComboBox;
	private JTextField phoneNumber;
	private JTextField courseText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setForeground(SystemColor.controlLtHighlight);
		panel.setBounds(149, 24, 544, 492);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel WelcomeSignup = new JLabel("Welcome Signup");
		WelcomeSignup.setBounds(117, 12, 274, 39);
		WelcomeSignup.setForeground(SystemColor.controlLtHighlight);
		panel.add(WelcomeSignup);
		WelcomeSignup.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel firstName = new JLabel("First Name");
		firstName.setForeground(SystemColor.controlLtHighlight);
		firstName.setBounds(117, 71, 155, 28);
		panel.add(firstName);
		firstName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		phoneNumber = new JTextField();
		phoneNumber.setBounds(274, 270, 143, 28);
		panel.add(phoneNumber);
		phoneNumber.setColumns(10);
		
		
		pass = new JPasswordField();
		pass.setBounds(274, 218, 143, 28);
		panel.add(pass);
		
		email = new JTextField();
		email.setBounds(274, 178, 143, 28);
		panel.add(email);
		email.setColumns(10);
		
		last = new JTextField();
		last.setBounds(274, 125, 143, 28);
		panel.add(last);
		last.setColumns(10);
		
		first = new JTextField();
		first.setBounds(274, 73, 143, 28);
		panel.add(first);
		first.setColumns(10);
		
		courseText = new JTextField();
		courseText.setBounds(274, 322, 143, 31);
		panel.add(courseText);
		courseText.setColumns(10);
		
		ComboBox = new JComboBox();
		ComboBox.setBounds(274, 371, 143, 24);
		panel.add(ComboBox);
		ComboBox.setModel(new DefaultComboBoxModel(new String[]{"Select user","Admin", "Teacher", "Student"}));
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(284, 413, 133, 25);
		panel.add(btnLogin);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(117, 413, 143, 25);
		panel.add(btnSignUp);
		
		
		JLabel LastName = new JLabel("Last Name");
		LastName.setBounds(117, 119, 155, 33);
		panel.add(LastName);
		LastName.setForeground(SystemColor.controlLtHighlight);
		LastName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel userEmail = new JLabel("Email");
		userEmail.setBounds(117, 172, 114, 33);
		panel.add(userEmail);
		userEmail.setForeground(SystemColor.controlLtHighlight);
		userEmail.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel userPassword = new JLabel("Password");
		userPassword.setBounds(117, 212, 155, 33);
		panel.add(userPassword);
		userPassword.setForeground(SystemColor.controlLtHighlight);
		userPassword.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(117, 270, 155, 24);
		panel.add(lblPhoneNumber);
		lblPhoneNumber.setForeground(SystemColor.controlLtHighlight);
		lblPhoneNumber.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(117, 323, 114, 23);
		panel.add(lblCourse);
		lblCourse.setForeground(SystemColor.controlLtHighlight);
		lblCourse.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(117, 371, 93, 19);
		panel.add(lblUser);
		lblUser.setForeground(SystemColor.controlLtHighlight);
		lblUser.setFont(new Font("Dialog", Font.BOLD, 20));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpAction();			
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				dispose();
			}
		});
		
	}
	public void SignUpAction() {
		String firstName = first.getText();
		String LastName = last.getText();
		String userEmail = email.getText();
		char[] pa = pass.getPassword();
		String password = new String(pa);
		String combo = (String)ComboBox.getSelectedItem();
		String number = phoneNumber.getText();
		String course = courseText.getText();
		
		
		String fn = "[A-Z]{1}[a-zA-Z]+";
		Pattern f = Pattern.compile(fn);
		Matcher fna = f.matcher(firstName);
		boolean fp = fna.matches();
		
		String ln = "[A-Z]{1}[a-zA-Z]+";
		Pattern l = Pattern.compile(ln);
		Matcher lna = l.matcher(LastName);
		boolean lp = lna.matches();
		
		
//		String ema = "[a-z]{1}[a-zA-Z1-9]+[@]gmail[.]com";
		String ema = ".*@gmail\\.com";

		Pattern em = Pattern.compile(ema);
		Matcher emaa = em.matcher(userEmail);
		boolean ma = emaa.matches();
		
		
//		String pn = "[a-zA-Z]{1}[a-zA-Z1-9@]+";
		String pn = ".*";
		Pattern pan = Pattern.compile(pn);
		Matcher mp = pan.matcher(new String(password));
		boolean mpa = mp.matches();
		
		
		if(!firstName.equals("") && !LastName.equals("") && !userEmail.equals("") && !(new String(password)).equals("") && number.length()<=10) {
			if( fp==true && lp==true && ma==true && mpa==true) {
				System.out.println(firstName);
				System.out.println(LastName);
				System.out.println(userEmail);
				System.out.println(password);
				System.out.println(combo);
				System.out.print(number);
				String url = "jdbc:mysql://localhost:3306/course_management_system";
		        String baseUsername = "root";
		        String basePassword = "";
		         try {
		             Connection con = DriverManager.getConnection(url, baseUsername, basePassword);
		             Statement stn = con.createStatement();
		             System.out.println("Connection established");
		             String q = "CREATE DATABASE IF NOT EXISTS course_management_system";
		             stn.execute(q); 
		            if(combo.equals("Student")) {
		            	String table = "CREATE TABLE IF NOT EXISTS course_management_system.student(ID INT AUTO_INCREMENT PRIMARY KEY, FirstName varchar(50), LastName varchar(50), Email varchar(120), Password varchar(50), User varchar(50), Phone varchar(120), Course varchar(1000))";
		            	stn.execute(table);
		            	String insertValues = "INSERT INTO course_management_system.student (FirstName, LastName, Email, Password, User, Phone, course) VALUES (?, ?, ?, ?, ?, ?, ?)";
		            	PreparedStatement pstmt = con.prepareStatement(insertValues);
		            	pstmt.setString(1, firstName);
		            	pstmt.setString(2, LastName);
		            	pstmt.setString(3, userEmail);
		            	pstmt.setString(4, password);
		            	pstmt.setString(5, combo);
		            	pstmt.setString(6, number);
		            	pstmt.setString(7, course);
		            	pstmt.executeUpdate();
		                 if(table!=null) {
		                	 System.out.println("Table created");
		                 }
		                 System.out.println("values inserted");
		            } else if(combo.equals("Teacher")) {
		            	String teacherTable = "CREATE TABLE IF NOT EXISTS course_management_system.teacher(ID INT AUTO_INCREMENT PRIMARY KEY, First_Name varchar(100), Last_Name varchar(1000), Email varchar(1000), Password varchar(1200), User varchar(50), Phone varchar(120), Course varchar(1000))";
		            	stn.execute(teacherTable);
		            	String insertValues = "INSERT INTO course_management_system.teacher (First_Name, Last_Name, Email, Password, User, Phone, Course) VALUES (?, ?, ?, ?, ?, ?, ?)";
		            	PreparedStatement p = con.prepareStatement(insertValues);
		            	p.setString(1, firstName);
		            	p.setString(2, LastName);
		            	p.setString(3, userEmail);
		            	p.setString(4, password);
		            	p.setString(5, combo);
		            	p.setString(6, number);
		            	p.setString(7, course);
		            	p.executeUpdate();
		                     if(teacherTable!=null) {
		                    	 System.out.println("Table created");
		                     }
		                     System.out.println("values inserted");
		            } else if(combo.equals("Admin")) {
		            	String adminTable = "CREATE TABLE IF NOT EXISTS course_management_system.admin(ID INT AUTO_INCREMENT PRIMARY KEY,FirstName varchar(50), LastName varchar(50), Email varchar(120), Password varchar(50), User varchar(50), Phone varchar(20))";
		            	stn.execute(adminTable);

		            	String insertValues = "INSERT INTO course_management_system.admin (FirstName, LastName, Email, Password, User, Phone) VALUES (?, ?, ?, ?, ?, ?)";
		            	PreparedStatement p2 = con.prepareStatement(insertValues);
		            	p2.setString(1, firstName);
		            	p2.setString(2, LastName);
		            	p2.setString(3, userEmail);
		            	p2.setString(4, password);
		            	p2.setString(5, combo);
		            	p2.setString(6, number);
		            	p2.executeUpdate();
		                     if(adminTable!=null) {
		                    	 System.out.println("Table created");
		                     }
		                     System.out.println("values inserted");
		            }
		           
		         } catch (SQLException e) {
		             System.out.println("Connection not established");
		             e.printStackTrace();
		         }
				
				JOptionPane.showMessageDialog(null, "Sign Up success");
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect format of Password or email or phone number");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Please fill the box");
		}
		
		 
	}
}


