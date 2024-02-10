package FirstProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class UpdateStudent extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField First;
	private JTextField last;
	private JTextField mail;
	private JTextField number;
	private JTextField course;
	private JTextField ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent frame = new UpdateStudent();
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
	public UpdateStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.controlLtHighlight);
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(73, 26, 504, 497);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ID = new JTextField();
		ID.setBounds(264, 105, 166, 30);
		panel.add(ID);
		ID.setColumns(10);
		
		First = new JTextField();
		First.setBounds(264, 147, 166, 30);
		panel.add(First);
		First.setColumns(10);
		
		last = new JTextField();
		last.setBounds(264, 189, 166, 30);
		panel.add(last);
		last.setColumns(10);
		
		mail = new JTextField();
		mail.setBounds(264, 242, 166, 30);
		panel.add(mail);
		mail.setColumns(10);
		
		number = new JTextField();
		number.setBounds(264, 295, 166, 30);
		panel.add(number);
		number.setColumns(10);
		
		course = new JTextField();
		course.setBounds(264, 350, 166, 30);
		panel.add(course);
		course.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(SystemColor.controlLtHighlight);
		lblId.setBounds(105, 105, 109, 22);
		panel.add(lblId);
		lblId.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(SystemColor.controlLtHighlight);
		lblFirstName.setBounds(105, 154, 141, 15);
		panel.add(lblFirstName);
		lblFirstName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(SystemColor.controlLtHighlight);
		lblLastName.setBounds(105, 207, 109, 15);
		panel.add(lblLastName);
		lblLastName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(SystemColor.controlLtHighlight);
		lblEmail.setBounds(105, 260, 109, 15);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(SystemColor.controlLtHighlight);
		lblPhone.setBounds(105, 302, 109, 15);
		panel.add(lblPhone);
		lblPhone.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(SystemColor.controlLtHighlight);
		lblCourse.setBounds(105, 357, 109, 15);
		panel.add(lblCourse);
		lblCourse.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton update = new JButton("Update Details");
		update.setBounds(160, 402, 162, 40);
		panel.add(update);
		
		JLabel lblUpdateStudentDetails = new JLabel("Update Student Details");
		lblUpdateStudentDetails.setBounds(105, 35, 234, 30);
		panel.add(lblUpdateStudentDetails);
		lblUpdateStudentDetails.setForeground(SystemColor.controlLtHighlight);
		lblUpdateStudentDetails.setFont(new Font("Dialog", Font.BOLD, 20));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname = First.getText();
				String lname = last.getText();
				String email = mail.getText();
				String phone = number.getText();
				String module = course.getText();
				studentEdit se = new studentEdit();
				String id = ID.getText();
				se.editStudent(id,fname,lname, email, phone, module);
				Dashboard.dataStudent();
				dispose();
			}
		});
	}

}