package hms;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblEmail;
	private JTextField textField_1;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnLogIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setTitle("HMS-Sign up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 120, 730, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(196, 105, 138, 32);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBounds(354, 107, 196, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblEmail = new JLabel("        Email: ");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEmail.setBounds(196, 174, 138, 32);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(354, 174, 196, 29);
		contentPane.add(textField_1);
		
		lblPassword = new JLabel("    Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPassword.setBounds(186, 241, 148, 32);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		passwordField.setBounds(354, 243, 196, 29);
		contentPane.add(passwordField);
		
		JLabel lblPassword_1 = new JLabel("Confirm Password: ");
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPassword_1.setBounds(132, 303, 202, 32);
		contentPane.add(lblPassword_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		passwordField_1.setBounds(354, 305, 196, 29);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 22));
		btnNewButton.setBounds(274, 400, 143, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Signup");
		lblNewLabel_1.setForeground(new Color(102, 102, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(294, 24, 104, 32);
		contentPane.add(lblNewLabel_1);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				
				l.show();
				dispose();
			}
			
		});
		btnLogIn.setVerticalAlignment(SwingConstants.TOP);
		btnLogIn.setFont(new Font("Sylfaen", Font.PLAIN, 22));
		btnLogIn.setBounds(274, 460, 143, 32);
		contentPane.add(btnLogIn);
	}
}
