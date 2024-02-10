package FirstProject;


import java.sql.*;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.util.regex.*;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField userEmail;
	private JPasswordField userPass;
	private static JComboBox ComboField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(124, 22, 594, 412);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setForeground(SystemColor.controlLtHighlight);
		lblLoginPage.setBounds(135, 41, 141, 27);
		panel.add(lblLoginPage);
		lblLoginPage.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(135, 298, 150, 25);
		panel.add(loginBtn);
		
		JButton singupBtn = new JButton("SignUp");
		singupBtn.setBounds(320, 298, 150, 25);
		panel.add(singupBtn);
		
		userPass = new JPasswordField();
		userPass.setBounds(294, 225, 176, 34);
		panel.add(userPass);
		
		JLabel Password = new JLabel("Password");
		Password.setForeground(SystemColor.controlLtHighlight);
		Password.setBounds(135, 221, 101, 34);
		panel.add(Password);
		Password.setFont(new Font("Dialog", Font.BOLD, 20));
		
		userEmail = new JTextField();
		userEmail.setBounds(294, 160, 176, 34);
		panel.add(userEmail);
		userEmail.setColumns(10);
		
		
		
		JLabel username = new JLabel("Email");
		username.setForeground(SystemColor.controlLtHighlight);
		username.setBounds(135, 160, 128, 34);
		panel.add(username);
		username.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel.setBounds(137, 98, 128, 34);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		
		ComboField = new JComboBox();
		ComboField.setBounds(294, 99, 176, 39);
		panel.add(ComboField);
		ComboField.setModel(new DefaultComboBoxModel(new String[] {"Select user", "Admin", "Teacher", "Student"}));
		singupBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp s = new SignUp();
				s.setVisible(true);
				dispose();
			}
		});
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userLogIn();
				Activities.activity();
			}
			
		});
	}
	public static String comboVal() {
		String combo2 = (String)ComboField.getSelectedItem();
		return combo2;
	}
	public static String mail() {
		String email =  userEmail.getText();
		return email;
	}
	public void userLogIn() {
		String email = userEmail.getText();
		char[] userPassword = userPass.getPassword();
		String pass = new String(userPassword);
		String comboo = (String)ComboField.getSelectedItem();
		if(!email.equals("") && !pass.equals("")) {
			String url = "jdbc:mysql://localhost:3306/course_management_system";
	        String baseUsername = "root";
	        String basePassword = "";
	        try {
	        	 Connection logData = DriverManager.getConnection(url, baseUsername, basePassword);
	             Statement s = logData.createStatement();
	            if(comboo.equals("Student")) {
	            	 String querry = "SELECT Password FROM student where Email = '" + email + "'";
		             ResultSet result = s.executeQuery(querry);
		             if (result.next()){
		            	 String storedPass = result.getString("Password");
		            	 if(storedPass.equals(pass)) {
		            		 JOptionPane.showMessageDialog(null, "Login sucessful");
		            		 dispose();
		     				StudentDashboard sd = new StudentDashboard();
		     				sd.setVisible(true);
		            	 }
		            	 else {
			            	 JOptionPane.showMessageDialog(null, "Login failed");
			             } 
		             }else {
		            	 JOptionPane.showMessageDialog(null, "User not found");
		             }
	            } else if(comboo.equals("Teacher")) {
	            	 String querry2 = "SELECT Password FROM teacher where Email = '" + email + "'";
		             ResultSet result2 = s.executeQuery(querry2);
		             if (result2.next()){
		            	 String storedPass2 = result2.getString("Password");
		            	 if(storedPass2.equals(pass)) {
		            		 JOptionPane.showMessageDialog(null, "Login sucessful");
		            		 dispose();
		     				TeacherDashboard td = new TeacherDashboard();
		     				td.setVisible(true);
		            	 }
		            	 else {
			            	 JOptionPane.showMessageDialog(null, "Login failed");
			             }		            	 
		             }else {
		            	 JOptionPane.showMessageDialog(null, "User not found");
		             }
	            } else if(comboo.equals("Admin")) {
	            	 String querry3 = "SELECT Password FROM admin where Email = '" + email + "'";
		             ResultSet result3 = s.executeQuery(querry3);
		             if (result3.next()){
		            	 String storedPass = result3.getString("Password");
		            	 if(storedPass.equals(pass)) {
		            		JOptionPane.showMessageDialog(null, "Login sucessful");
		            		dispose();
		     				Dashboard d = new Dashboard();
		     				d.setVisible(true);
		            	 }
		            	 else {
			            	 JOptionPane.showMessageDialog(null, "Login failed");
			             }
		             }else {
		            	 JOptionPane.showMessageDialog(null, "User not found");
		             }
	            } 
	        }catch(Exception e) {
	        	JOptionPane.showMessageDialog(null, e);
	        }
		} else {
			JOptionPane.showMessageDialog(null, "Fill the box");
		}		
	}
}