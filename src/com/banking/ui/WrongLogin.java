package com.banking.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class WrongLogin extends JFrame{
	
	public WrongLogin()
	{
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout(20,20));
		ImageIcon imgExit = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\exit.gif");
		JLabel imageCross = new JLabel(imgExit);
		panel.add(imageCross,BorderLayout.WEST);
		JLabel wrongMessage = new JLabel("Wrong UserName or password ");
		wrongMessage.setForeground(Color.RED);
		panel.add(wrongMessage,BorderLayout.CENTER);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				UserLoginUI.main(null);
			}
		});
		panel.add(button,BorderLayout.SOUTH);
		add(panel);
		
	}
	

	
}
