package FirstProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class CourseAdd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField courseName;
	private JTextField batch;
	private JTextField seats;
	private JTextField studyYear;
	private JTextField moduleNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseAdd frame = new CourseAdd();
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
	public CourseAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(142, 46, 552, 529);
		contentPane.add(panel);
		panel.setLayout(null);
		
		courseName = new JTextField();
		courseName.setBounds(309, 99, 197, 35);
		panel.add(courseName);
		courseName.setColumns(10);
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setForeground(SystemColor.controlLtHighlight);
		lblCourseName.setBounds(144, 98, 136, 30);
		panel.add(lblCourseName);
		lblCourseName.setFont(new Font("Dialog", Font.BOLD, 20));
		
		batch = new JTextField();
		batch.setBounds(309, 175, 197, 35);
		panel.add(batch);
		batch.setColumns(10);
		
		JLabel lblBatch = new JLabel("Batch");
		lblBatch.setForeground(SystemColor.controlLtHighlight);
		lblBatch.setBounds(145, 178, 116, 32);
		panel.add(lblBatch);
		lblBatch.setFont(new Font("Dialog", Font.BOLD, 20));
		
		seats = new JTextField();
		seats.setBounds(311, 260, 195, 35);
		panel.add(seats);
		seats.setColumns(10);
		
		studyYear = new JTextField();
		studyYear.setBounds(309, 348, 197, 35);
		panel.add(studyYear);
		studyYear.setColumns(10);
		
		moduleNumber = new JTextField();
		moduleNumber.setBounds(311, 427, 195, 35);
		panel.add(moduleNumber);
		moduleNumber.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(207, 484, 136, 35);
		panel.add(btnAdd);
		
		JLabel lblNoOfSeats = new JLabel("No. of seats");
		lblNoOfSeats.setForeground(SystemColor.controlLtHighlight);
		lblNoOfSeats.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNoOfSeats.setBounds(144, 260, 136, 35);
		panel.add(lblNoOfSeats);
		
		JLabel lblTotalYears = new JLabel("Total years");
		lblTotalYears.setForeground(SystemColor.controlLtHighlight);
		lblTotalYears.setBounds(144, 347, 117, 36);
		panel.add(lblTotalYears);
		lblTotalYears.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblModuleNumber = new JLabel("Module Number");
		lblModuleNumber.setForeground(SystemColor.controlLtHighlight);
		lblModuleNumber.setFont(new Font("Dialog", Font.BOLD, 20));
		lblModuleNumber.setBounds(144, 426, 163, 36);
		panel.add(lblModuleNumber);
		
		JLabel lblAddNewCourse = new JLabel("Add New Course");
		lblAddNewCourse.setForeground(SystemColor.controlLtHighlight);
		lblAddNewCourse.setBounds(144, 24, 181, 42);
		panel.add(lblAddNewCourse);
		lblAddNewCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewCourse.setFont(new Font("Dialog", Font.BOLD, 20));
		lblAddNewCourse.setBackground(new Color(0, 191, 255));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nameCourse = courseName.getText();
				String year = batch.getText();
				String seat = seats.getText();
				String study = studyYear.getText();
				String module = moduleNumber.getText();
				Course cs = new Course();
				cs.course(nameCourse,year,seat, study, module);
				Dashboard.courseData();
				dispose();
			}
		});
	}
}