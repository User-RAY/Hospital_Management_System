package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Patient extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patient frame = new Patient();
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
	public Patient() {
		setTitle("HMS-Patient Section");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 120, 730, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Patient Registration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientForm p = new PatientForm();
				p.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(130, 124, 440, 56);
		contentPane.add(btnNewButton);
		
		JButton btnPatientDatabase = new JButton("Patient Database");
		btnPatientDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientDb pdb = new PatientDb();
				 
				 pdb.show();
				 dispose();
			}
		});
		btnPatientDatabase.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPatientDatabase.setBounds(130, 315, 440, 56);
		contentPane.add(btnPatientDatabase);
	}
}
