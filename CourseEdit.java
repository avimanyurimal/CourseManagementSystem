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
import java.awt.SystemColor;

public class CourseEdit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField moduleNumber;
	private JTextField courseName;
	private JTextField seats;
	private JTextField batch;
	private JTextField yearsStudy;
	private JTextField courseId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseEdit frame = new CourseEdit();
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
	public CourseEdit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(171, 27, 493, 491);
		contentPane.add(panel);
		panel.setLayout(null);
		
		courseId = new JTextField();
		courseId.setBounds(277, 61, 147, 32);
		panel.add(courseId);
		courseId.setColumns(10);
		
		moduleNumber = new JTextField();
		moduleNumber.setBounds(277, 125, 147, 32);
		panel.add(moduleNumber);
		moduleNumber.setColumns(10);
		
		courseName = new JTextField();
		courseName.setBounds(277, 187, 147, 32);
		panel.add(courseName);
		courseName.setColumns(10);
		
		seats = new JTextField();
		seats.setBounds(277, 255, 147, 32);
		panel.add(seats);
		seats.setColumns(10);
		
		batch = new JTextField();
		batch.setBounds(277, 321, 147, 32);
		panel.add(batch);
		batch.setColumns(10);
		
		JButton btnUpdateCourse = new JButton("Update Course");
		btnUpdateCourse.setBounds(154, 436, 147, 43);
		panel.add(btnUpdateCourse);
		
		yearsStudy = new JTextField();
		yearsStudy.setBounds(277, 383, 147, 32);
		panel.add(yearsStudy);
		yearsStudy.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Dialog", Font.BOLD, 20));
		lblId.setForeground(SystemColor.controlLtHighlight);
		lblId.setBounds(120, 61, 95, 32);
		panel.add(lblId);
		
		JLabel lblModuleName = new JLabel("Module Name");
		lblModuleName.setForeground(SystemColor.controlLtHighlight);
		lblModuleName.setBounds(120, 124, 152, 32);
		panel.add(lblModuleName);
		lblModuleName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setForeground(SystemColor.controlLtHighlight);
		lblCourseName.setBounds(120, 186, 137, 32);
		panel.add(lblCourseName);
		lblCourseName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setForeground(SystemColor.controlLtHighlight);
		lblSeats.setBounds(120, 254, 137, 32);
		panel.add(lblSeats);
		lblSeats.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblBatch = new JLabel("Batch");
		lblBatch.setForeground(SystemColor.controlLtHighlight);
		lblBatch.setBounds(120, 320, 137, 32);
		panel.add(lblBatch);
		lblBatch.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblYearStudy = new JLabel("Years");
		lblYearStudy.setForeground(SystemColor.controlLtHighlight);
		lblYearStudy.setBounds(120, 382, 137, 32);
		panel.add(lblYearStudy);
		lblYearStudy.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblEditCourse = new JLabel("Edit Course");
		lblEditCourse.setForeground(SystemColor.controlLtHighlight);
		lblEditCourse.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEditCourse.setBounds(120, 12, 121, 45);
		panel.add(lblEditCourse);
		btnUpdateCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = courseId.getText();
				String courseModule = moduleNumber.getText();
				String nameCourse =  courseName.getText();
				String courseSeat = seats.getText();
				String studentBatch = batch.getText();
				String  studyYear = yearsStudy.getText();
				CourseUpdate cu = new CourseUpdate();
				cu.updatingCourse(id,nameCourse, courseModule, studentBatch, courseSeat ,studyYear);
				Dashboard.courseData();
				dispose();
				
			}
		});
	}
}