package FirstProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class EditingTutor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField tutorEmail;
	private JTextField tutorPhone;
	private JTextField course;
	private JLabel lblId;
	private JTextField tutorID;
	private JPanel panel;
	private JLabel lblEditTutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditingTutor frame = new EditingTutor();
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
	public EditingTutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(199, 24, 572, 535);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tutorID = new JTextField();
		tutorID.setBounds(267, 69, 182, 35);
		panel.add(tutorID);
		tutorID.setColumns(10);
		
		JButton tutorEdit = new JButton("Update");
		tutorEdit.setBounds(193, 484, 156, 35);
		panel.add(tutorEdit);
		
		fname = new JTextField();
		fname.setBounds(267, 138, 182, 35);
		panel.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setBounds(267, 212, 182, 35);
		panel.add(lname);
		lname.setColumns(10);
		
		tutorEmail = new JTextField();
		tutorEmail.setBounds(267, 285, 182, 35);
		panel.add(tutorEmail);
		tutorEmail.setColumns(10);
		
		tutorPhone = new JTextField();
		tutorPhone.setBounds(267, 357, 182, 35);
		panel.add(tutorPhone);
		tutorPhone.setColumns(10);
		
		course = new JTextField();
		course.setBounds(267, 430, 182, 35);
		panel.add(course);
		course.setColumns(10);
		
		lblId = new JLabel("ID");
		lblId.setForeground(SystemColor.controlLtHighlight);
		lblId.setBounds(97, 75, 127, 23);
		panel.add(lblId);
		lblId.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(SystemColor.controlLtHighlight);
		lblFirstName.setBounds(97, 144, 127, 23);
		panel.add(lblFirstName);
		lblFirstName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(SystemColor.controlLtHighlight);
		lblLastName.setBounds(97, 218, 127, 23);
		panel.add(lblLastName);
		lblLastName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(SystemColor.controlLtHighlight);
		lblEmail.setBounds(97, 291, 127, 23);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(SystemColor.controlLtHighlight);
		lblPhone.setBounds(97, 363, 127, 23);
		panel.add(lblPhone);
		lblPhone.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(SystemColor.controlLtHighlight);
		lblCourse.setBounds(97, 436, 127, 23);
		panel.add(lblCourse);
		lblCourse.setFont(new Font("Dialog", Font.BOLD, 20));
		
		lblEditTutor = new JLabel("Edit Tutor");
		lblEditTutor.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEditTutor.setForeground(SystemColor.controlLtHighlight);
		lblEditTutor.setBounds(97, 28, 141, 35);
		panel.add(lblEditTutor);
		tutorEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tutorID.getText();
				String first = fname.getText();
				String last = lname.getText();
				String email = tutorEmail.getText();
				String phone = tutorPhone.getText();
				String module = course.getText();
				updateTutor ut = new updateTutor();
				ut.updatingTutor(id,first,last, email, phone,module);
				Dashboard.tutorsData();
				dispose();
				
			}
			
			
		});
	}
}