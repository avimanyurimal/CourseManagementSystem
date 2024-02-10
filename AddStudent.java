package FirstProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class AddStudent extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField email;
	private JTextField phone;
	private JTextField course;
	private JPasswordField pass;
	private JPanel panel;
	private JLabel lblAddStudents;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
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
	public AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(132, 29, 400, 493);
		contentPane.add(panel);
		panel.setLayout(null);
		
		firstName = new JTextField();
		firstName.setBounds(217, 47, 150, 33);
		panel.add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setBounds(217, 109, 150, 33);
		panel.add(lastName);
		lastName.setColumns(10);
		
		email = new JTextField();
		email.setBounds(217, 177, 150, 33);
		panel.add(email);
		email.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(217, 243, 150, 33);
		panel.add(pass);
		
		phone = new JTextField();
		phone.setBounds(217, 309, 150, 33);
		panel.add(phone);
		phone.setColumns(10);
		
		course = new JTextField();
		course.setBounds(217, 375, 150, 33);
		panel.add(course);
		course.setColumns(10);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.setBounds(133, 442, 150, 39);
		panel.add(btnAddStudent);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(SystemColor.controlLtHighlight);
		lblFirstName.setBounds(59, 52, 123, 22);
		panel.add(lblFirstName);
		lblFirstName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(SystemColor.controlLtHighlight);
		lblLastName.setBounds(59, 114, 123, 22);
		panel.add(lblLastName);
		lblLastName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(SystemColor.controlLtHighlight);
		lblEmail.setBounds(59, 182, 123, 22);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(SystemColor.controlLtHighlight);
		lblPassword.setBounds(59, 248, 123, 22);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblPhone = new JLabel("Phone ");
		lblPhone.setForeground(SystemColor.controlLtHighlight);
		lblPhone.setBounds(59, 314, 123, 22);
		panel.add(lblPhone);
		lblPhone.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(SystemColor.controlLtHighlight);
		lblCourse.setBounds(59, 380, 123, 22);
		panel.add(lblCourse);
		lblCourse.setFont(new Font("Dialog", Font.BOLD, 20));
		
		lblAddStudents = new JLabel("Add Students");
		lblAddStudents.setFont(new Font("Dialog", Font.BOLD, 20));
		lblAddStudents.setForeground(SystemColor.controlLtHighlight);
		lblAddStudents.setBounds(59, 12, 143, 22);
		panel.add(lblAddStudents);
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String first = firstName.getText();
				String last = lastName.getText();
				String mail = email.getText();
				char[] pa = pass.getPassword();
				String pass = new String(pa);
				String number = phone.getText();
				String subject = course.getText();
				StudentAdd st = new StudentAdd();
				st.addStudent(first,last, mail, pass, number, subject);
				Dashboard.dataStudent();
				dispose();
				
			}
		});
	}
}