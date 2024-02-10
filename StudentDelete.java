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

public class StudentDelete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField studentId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDelete frame = new StudentDelete();
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
	public StudentDelete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(25, 25, 401, 250);
		contentPane.add(panel);
		panel.setLayout(null);
		
		studentId = new JTextField();
		studentId.setBounds(196, 78, 145, 39);
		panel.add(studentId);
		studentId.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(108, 76, 70, 39);
		panel.add(lblId);
		lblId.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JButton btnDelete = new JButton("Delete ");
		btnDelete.setBounds(138, 147, 134, 37);
		panel.add(btnDelete);
		
		JLabel lblDeleteStudent = new JLabel("Delete Student");
		lblDeleteStudent.setForeground(SystemColor.controlLtHighlight);
		lblDeleteStudent.setFont(new Font("Dialog", Font.BOLD, 20));
		lblDeleteStudent.setBounds(102, 12, 170, 28);
		panel.add(lblDeleteStudent);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = studentId.getText();
				DeleteStudent ds = new DeleteStudent();
				ds.deleteing(id);
				Dashboard.dataStudent();
				dispose();
			}
		});
	}

}