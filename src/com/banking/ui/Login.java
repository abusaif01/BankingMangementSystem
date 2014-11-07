package com.banking.ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.banking.database.DBConnection;

public class Login extends JFrame {
	
	public Login()
	{
		//panels 
		JPanel loginMainPanel = new JPanel();
		loginMainPanel.setLayout(new GridLayout(2,1));
		loginMainPanel.setBackground(Color.BLUE);
		JPanel logoPanel = new JPanel();
		logoPanel.setLayout(new BorderLayout());
		logoPanel.setBackground(Color.WHITE);
		
		//logo 
		ImageIcon adminLogo = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\admin.png");
		JLabel logoLabel = new JLabel(adminLogo);
		logoLabel.setBackground(Color.WHITE);
		logoPanel.add(logoLabel,BorderLayout.NORTH);	
		
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new GridLayout(3,2));
		
		JLabel adminName = new JLabel("User Name :");
		adminName.setForeground(Color.BLUE);
		JLabel adminPass = new JLabel("Password :");
		adminPass.setForeground(Color.BLUE);
		final JTextField nameField = new JTextField();
		final JTextField passField = new JTextField();
		panel1.add(adminName);
		panel1.add(nameField);
		panel1.add(adminPass);
		panel1.add(passField);
		panel1.setBackground(Color.WHITE);
		JButton clear = new JButton("Clear");
		clear.setBackground(Color.WHITE);
		panel1.add(clear);
		JButton login= new JButton("<<Login>>");
		login.setBackground(Color.WHITE);
		panel1.add(login);
		
		loginMainPanel.add(logoPanel);
		loginMainPanel.add(panel1);
		
		add(loginMainPanel);
		
		
		//------------admin login page button's action
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				nameField.setText(null);
				passField.setText(null);
			}
			
		});
		
		login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				DBConnection obj = new DBConnection();
				boolean tf;
				tf=obj.checkAdminLogin(nameField.getText(), passField.getText());
				System.out.println("bool :: "+tf);
				if(tf)
				{
					Admin adminPage= new Admin();
					adminPage.setVisible(true);
					adminPage.setSize(700,400);
					adminPage.setLocationRelativeTo(null);
					dispose();
				}
				else 
					{
					JFrame wrongMessage = new JFrame("Wrong Pass");
					JLabel label= new JLabel("                 Given UserName or Password is Wrong");
					label.setForeground(Color.RED);					
					wrongMessage.add(label);
					wrongMessage.setVisible(true);
					wrongMessage.setSize(400, 100);
					wrongMessage.setLocationRelativeTo(null);
					
					}
			}
			
		});
	}
	
	

}
