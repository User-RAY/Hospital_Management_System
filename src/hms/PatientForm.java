package hms;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class PatientForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientForm frame = new PatientForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	

	 public void Connect()
	    {
	        try {
	            //Class.forName("com.mysql.jdbc.Driver");
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root","");
	        }
	        catch (ClassNotFoundException ex) 
	        {
	          ex.printStackTrace();
	        }
	        catch (SQLException ex) 
	        {
	               ex.printStackTrace();
	        }

	    }
	
	 	Connection con;
		PreparedStatement pst;
		ResultSet rs;

	/**
	 * Create the frame.
	 */
	public PatientForm() {
		Connect();
		
		
		setTitle("HMS-PatientForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 120, 730, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(52, 84, 113, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setBounds(52, 121, 113, 27);
		contentPane.add(lblLastName);
		
		JLabel lblDob = new JLabel("DOB:");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDob.setBounds(101, 158, 52, 27);
		contentPane.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGender.setBounds(81, 194, 113, 27);
		contentPane.add(lblGender);
		
		JLabel lblBloodGroup = new JLabel("Blood Group:");
		lblBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBloodGroup.setBounds(40, 242, 113, 27);
		contentPane.add(lblBloodGroup);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(96, 291, 113, 27);
		contentPane.add(lblEmail);
		
		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPhoneNo.setBounds(62, 325, 113, 27);
		contentPane.add(lblPhoneNo);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddress.setBounds(77, 362, 88, 27);
		contentPane.add(lblAddress);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(175, 83, 261, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(175, 121, 261, 27);
		contentPane.add(textField_1);
		
		textField_2 =new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(175, 157, 261, 27);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(175, 290, 261, 27);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(175, 324, 261, 27);
		contentPane.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(175, 197, 261, 27);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(176, 242, 261, 27);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname,lname,dob,gender,bg,email,phone,address;
				
				fname = textField.getText();
				lname = textField_1.getText();				
				dob = textField_2.getText();
				email = textField_3.getText();
				phone = textField_4.getText();
				address = textField_5.getText();
				
				 gender = (String) comboBox.getSelectedItem(); 
				 bg = (String) comboBox_1.getSelectedItem(); 
				
				try {
			        pst = con.prepareStatement("insert into patientdb(FirstName,LastName,DOB,Gender,BloodGroup,Email,PhoneNo,Address)values(?,?,?,?,?,?,?,?)");
			        pst.setString(1, fname);
			        pst.setString(2, lname);
			        pst.setString(3, dob);
			        pst.setString(4, gender);
			        pst.setString(5, bg);
			        pst.setString(6, email);
			        pst.setString(7, phone);
			        pst.setString(8, address);
			        System.out.println(fname);
			        System.out.println(lname);
			        System.out.println(dob);
			        System.out.println(gender);
			        System.out.println(bg);
			        System.out.println(email);
			        System.out.println(phone);
			        System.out.println(address);
			       
			        
			        pst.executeUpdate();
			        JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
			        
			                       
			        textField.setText("");
			        textField_1.setText("");
			        textField_2.setText("");
			        textField_3.setText("");
			        textField_4.setText("");
			        textField_5.setText("");
			        textField.requestFocus();
			       }
			    catch (SQLException e1) 
			        {            
			       e1.printStackTrace();
			    }
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(263, 438, 125, 37);
		contentPane.add(btnNewButton);
		
		
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(175, 361, 261, 27);
		contentPane.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard in = new DashBoard();
				in.show();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.setBounds(545, 74, 125, 37);
		contentPane.add(btnNewButton_1);
	}
}
