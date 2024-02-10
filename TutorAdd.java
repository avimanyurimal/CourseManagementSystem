package FirstProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class TutorAdd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField email;
	private JTextField number;
	private JTextField courseTeaching;
	private JPasswordField teacherPass;
	private JPanel panel;
	private JLabel lblAddTutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TutorAdd frame = new TutorAdd();
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
	public TutorAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(112, 12, 505, 507);
		contentPane.add(panel);
		panel.setLayout(null);
		
		firstName = new JTextField();
		firstName.setBounds(287, 70, 166, 29);
		panel.add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setBounds(287, 125, 166, 29);
		panel.add(lastName);
		lastName.setColumns(10);
		
		email = new JTextField();
		email.setBounds(287, 179, 166, 29);
		panel.add(email);
		email.setColumns(10);
		
		teacherPass = new JPasswordField();
		teacherPass.setBounds(287, 232, 166, 29);
		panel.add(teacherPass);
		
		number = new JTextField();
		number.setBounds(287, 290, 166, 29);
		panel.add(number);
		number.setColumns(10);
		
		courseTeaching = new JTextField();
		courseTeaching.setBounds(287, 356, 166, 29);
		panel.add(courseTeaching);
		courseTeaching.setColumns(10);
		
		JButton addTeacher = new JButton("Add Teacher");
		addTeacher.setBounds(185, 419, 140, 35);
		panel.add(addTeacher);
		
		JLabel lblFirstname = new JLabel("FirstName");
		lblFirstname.setForeground(SystemColor.controlLtHighlight);
		lblFirstname.setBounds(108, 72, 110, 24);
		panel.add(lblFirstname);
		lblFirstname.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setForeground(SystemColor.controlLtHighlight);
		lblLastname.setBounds(108, 127, 110, 24);
		panel.add(lblLastname);
		lblLastname.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(SystemColor.controlLtHighlight);
		lblEmail.setBounds(108, 181, 110, 24);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(SystemColor.controlLtHighlight);
		lblPassword.setBounds(108, 234, 110, 24);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(SystemColor.controlLtHighlight);
		lblPhone.setBounds(108, 292, 110, 24);
		panel.add(lblPhone);
		lblPhone.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(SystemColor.controlLtHighlight);
		lblCourse.setBounds(108, 355, 110, 24);
		panel.add(lblCourse);
		lblCourse.setFont(new Font("Dialog", Font.BOLD, 20));
		
		lblAddTutor = new JLabel("Add Tutor");
		lblAddTutor.setFont(new Font("Dialog", Font.BOLD, 20));
		lblAddTutor.setForeground(SystemColor.controlLtHighlight);
		lblAddTutor.setBounds(108, 25, 133, 29);
		panel.add(lblAddTutor);
		addTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname = firstName.getText();
				String lname = lastName.getText();
				String userEmail = email.getText();
				String phone = number.getText();
				String module = courseTeaching.getText();
				char[] pass = teacherPass.getPassword();
				String password = new String(pass);
				Tutor t = new Tutor();
				t.tutors(fname,lname,userEmail, module, password, phone);
				Dashboard.tutorsData();
				dispose();
				
				
			}
		});
	}
}