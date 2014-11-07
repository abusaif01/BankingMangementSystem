package com.banking.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.banking.controllers.UserLogin;


public class UserLoginUI extends JFrame{
	
	private static String name = null;
	private String password = null;
	
	public UserLoginUI()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		JLabel labelName = new JLabel("User Name :");
		JLabel labelPass = new JLabel("Password :");
		final JTextField loginName = new JTextField();
		final JTextField loginPassword = new JTextField();
		JButton btnClear = new JButton("Clear");
		JButton btnLogin = new JButton("<< Login >>");
		panel.add(labelName);
		panel.add(loginName);
		panel.add(labelPass);
		panel.add(loginPassword);
		panel.add(btnClear);
		panel.add(btnLogin);
		
		add(panel);
		
		
		//System.out.println(name);
		
		btnLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				name=loginName.getText();
				password = loginPassword.getText();
				
				new UserLogin(name,password);
				
				dispose();
			}
			
			
		});
		
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				loginName.setText(null);
				loginPassword.setText(null);
			}
			
			
		});
	}

	
	
	public static void main(String []args)
	{
		
		UserLoginUI a = new UserLoginUI();
		a.pack();
		a.setVisible(true);
		a.setLocationRelativeTo(null);
	}

}
