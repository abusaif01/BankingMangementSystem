package com.banking.controllers;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.banking.database.UserDatabaseManager;
import com.banking.model.User;
import com.banking.ui.AdminPanelUI;
import com.banking.ui.WrongLogin;

public class UserLogin {
	
	public UserLogin(String userName,String userPassword)
	{
		UserDatabaseManager obj = new UserDatabaseManager();
		User user = obj.readUserFromDatabse(userName, userPassword);
		
		System.out.println(user.getName());
		
		if(user.getName().equals("invalid"))
		{
			WrongLogin wl = new WrongLogin();
			wl.setTitle("Wrong Message");
			wl.setSize(280, 100);
			wl.setVisible(true);
			wl.setLocationRelativeTo(null);
			
		}
		
		
		else 
		{				
			AdminPanelUI admin = new AdminPanelUI(user.getName(), user.getId(), user.getPassword(), user.getEmail());
			admin.setSize(400, 200);
			admin.setVisible(true);
			admin.setLocationRelativeTo(null);
			
		}
	}

	

}
