package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame Login;
	private JTextField Login_username;
	private JLabel lblRegister;
	private JPasswordField Login_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JFrame("Circle");
		Login.setBounds(100, 100, 600, 450);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Circle Login");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		lblNewLabel.setBounds(175, 75, 210, 50);
		Login.getContentPane().add(lblNewLabel);
		
		Login_username = new JTextField();
		Login_username.setText("username");
		Login_username.setBounds(202, 150, 150, 30);
		Login.getContentPane().add(Login_username);
		Login_username.setColumns(10);
		
		lblRegister = new JLabel("Register");
		lblRegister.setForeground(Color.BLUE);
		lblRegister.setBounds(390, 157, 61, 16);
		Login.getContentPane().add(lblRegister);
		
		Login_password = new JPasswordField();
		Login_password.setToolTipText("");
		Login_password.setText("password");
		Login_password.setBounds(202, 199, 150, 30);
		Login.getContentPane().add(Login_password);
		
		Login_username.addFocusListener(new FocusHandler());
        Login_password.addFocusListener(new FocusHandler());
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setBounds(219, 260, 117, 29);
		Login.getContentPane().add(btnSubmit);
		Login.setVisible(false);
	}
	class FocusHandler extends FocusAdapter{
    	public void focusGained(FocusEvent e) {
    		if(e.getSource()==Login_username){
    			if("username".equals(Login_username.getText()))
    				Login_username.setText("");
    		}
    		if(e.getSource()==Login_password){
    			if("password".equals(Login_password.getText()))
    				Login_password.setText("");
    		}
    	}
    	
    	public void focusLost(FocusEvent e) {
    		if(e.getSource()==Login_username){
    			if("".equals(Login_username.getText()))
    				Login_username.setText("username");
    		}
    		if(e.getSource()==Login_password){
    			if("".equals(Login_password.getText()))
    				Login_password.setText("password");
    		}
    	}
    }
}
