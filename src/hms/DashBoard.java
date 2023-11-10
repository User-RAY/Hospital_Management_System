package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.Border;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashBoard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard();
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
	public DashBoard() {
		setTitle("HMS-DashBoard");
		setForeground(new Color(255, 255, 255));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 120, 730, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DashBoard");
		lblNewLabel.setForeground(new Color(0, 204, 204));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(292, 39, 148, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  Patient");
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		Border border1 = BorderFactory.createLineBorder(Color.BLUE, 2);
		
		lblNewLabel_1.setBorder(border);
		
		lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				 lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				 
				
			}
		});
		
		lblNewLabel_1.addMouseListener (new MouseAdapter () { 
		    public void mouseEntered (MouseEvent e) { 
		    	
		    	lblNewLabel_1.setForeground (Color.RED); 
		    	lblNewLabel_1.setBorder(border1);
		    } 
		   
		    public void mouseExited (MouseEvent e) { 
		    	lblNewLabel_1.setBorder(border);
		    	lblNewLabel_1.setForeground (Color.BLACK); 
		    } 
			@Override
			public void mouseClicked(MouseEvent e) {
				Patient p = new Patient();
				 
				 p.show();
				 dispose();
			}
		});
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(126, 231, 105, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Doctor");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(512, 231, 94, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Appointment");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(292, 361, 148, 37);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(DashBoard.class.getResource("/images/gifgit (4).gif")));
		lblNewLabel_2.setBounds(116, 97, 125, 125);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon(DashBoard.class.getResource("/images/gifgit (3).gif")));
		lblNewLabel_2_1.setBounds(481, 111, 125, 125);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon(DashBoard.class.getResource("/images/gifgit (2).gif")));
		lblNewLabel_2_2.setBounds(292, 231, 125, 125);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Log out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				
				l.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(47, 480, 111, 32);
		contentPane.add(btnNewButton);
	}
}
