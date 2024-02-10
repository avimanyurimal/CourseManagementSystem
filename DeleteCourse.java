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

public class DeleteCourse extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CourseID;
	private JPanel panel;
	private JLabel lblDeleteCourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteCourse frame = new DeleteCourse();
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
	public DeleteCourse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setForeground(SystemColor.controlLtHighlight);
		panel.setBounds(42, 31, 422, 241);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton courseDelete = new JButton("Delete Course");
		courseDelete.setBounds(139, 157, 135, 25);
		panel.add(courseDelete);
		
		CourseID = new JTextField();
		CourseID.setBounds(197, 75, 129, 31);
		panel.add(CourseID);
		CourseID.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel.setBounds(113, 72, 45, 31);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		
		lblDeleteCourse = new JLabel("Delete Course");
		lblDeleteCourse.setFont(new Font("Dialog", Font.BOLD, 20));
		lblDeleteCourse.setForeground(SystemColor.controlLtHighlight);
		lblDeleteCourse.setBounds(113, 12, 161, 31);
		panel.add(lblDeleteCourse);
		courseDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = CourseID.getText();
				courseDelete cd = new courseDelete();
				cd.deletingCourse(id);
				Dashboard.courseData();
				dispose();
				
			}
		});
	}
}