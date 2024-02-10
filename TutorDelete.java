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

public class TutorDelete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tutorId;
	private JPanel panel;
	private JLabel lblDeleteTutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TutorDelete frame = new TutorDelete();
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
	public TutorDelete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(31, 12, 409, 225);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(SystemColor.controlLtHighlight);
		lblId.setBounds(92, 68, 52, 38);
		panel.add(lblId);
		lblId.setFont(new Font("Dialog", Font.BOLD, 16));
		
		tutorId = new JTextField();
		tutorId.setBounds(179, 71, 168, 38);
		panel.add(tutorId);
		tutorId.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(104, 131, 168, 38);
		panel.add(btnDelete);
		
		lblDeleteTutor = new JLabel("Delete Tutor");
		lblDeleteTutor.setForeground(SystemColor.controlLtHighlight);
		lblDeleteTutor.setFont(new Font("Dialog", Font.BOLD, 20));
		lblDeleteTutor.setBounds(92, 25, 143, 28);
		panel.add(lblDeleteTutor);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tutorId.getText();
				deleteTutors dt = new deleteTutors();
				dt.deletingTutors(id);
				Dashboard.tutorsData();
				dispose();
				
			}
		});
	}
}