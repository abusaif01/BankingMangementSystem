package com.banking.model;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

import com.banking.database.DBConnection;

public class SearchByUsername extends JFrame{
	
	private ResultSet rs;
	private Statement st;
	String name;
	
	public SearchByUsername()
	{	
		//components
		final JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8,1));
		final JTextField userName = new JTextField();		
		final String username = userName.getText();
		final JLabel labelName = new JLabel();
		final JLabel labelEmail = new JLabel();
		final JLabel labelPassword = new JLabel();
		final JLabel labelId = new JLabel();
		final JLabel labelBalance = new JLabel();
		JButton search=new JButton("search");
		final JButton advanceSearch=new JButton("Customize");
		panel.add(userName);
		panel.add(search);
		panel.add(labelId);
		panel.add(labelName);
		panel.add(labelEmail);
		panel.add(labelPassword);
		panel.add(labelBalance);
		add(panel);
		
		
		search.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				DBConnection connection = new DBConnection();
				connection.searchName(userName.getText());
				labelName.setText("Customer Name : "+connection.getCustomerName());
				labelName.setForeground(Color.black);
				labelEmail.setText("Customer Email : "+connection.getCustomerEmail());
				labelEmail.setForeground(Color.blue);
				labelPassword.setText("Customer Password : "+connection.getCustomerPassword());
				labelPassword.setForeground(Color.BLACK);
				labelId.setText("Account Id : "+connection.getCustomerId());
				labelId.setForeground(Color.RED);
				labelBalance.setText("Account Balance : "+connection.getCustomerBalance());
				labelBalance.setForeground(Color.RED);
				panel.add(advanceSearch);
			}
			
		});		
	}

}
