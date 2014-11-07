package com.banking.ui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Home extends JFrame {
	
	public Home()
	{	
		//--------------------home page panels and Layout------------------------------------
		
		JPanel panel1= new JPanel();
		panel1.setLayout(new GridLayout(3,1));
		JPanel panel2= new JPanel();
		panel2.setLayout(new GridLayout(1,1));
		JPanel panel3= new JPanel();
		panel3.setLayout(new BorderLayout(1,2));
		
		
		
		//home page buttons-----------------------------------------------***-----------------
		
		JLabel l= new JLabel("Admin Login");
		l.setForeground(Color.blue);
		JButton login = new JButton();
		login.add(l);
		login.setSize(50, 50);
		login.setBackground(Color.WHITE);
		JButton userManual= new JButton("User Manual");
		userManual.setSize(50, 50);
		userManual.setForeground(Color.blue);
		userManual.setBackground(Color.white);
		JButton about = new JButton("About AB Bank");
		about.setForeground(Color.blue);
		about.setSize(50, 50);
		about.setBackground(Color.white);
		panel1.add(login);
		panel1.add(userManual);
		panel1.add(about);
		
		//home page image ------------------------------------------------------***************_--------------------
		ImageIcon img = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\ab.jpg");
		JLabel label1=new JLabel(img);
		panel2.add(label1);
		add(panel1);
		panel3.add(panel1,BorderLayout.EAST);
		panel3.add(panel2,BorderLayout.CENTER);
		panel1.setBackground(Color.BLUE);
		panel3.setBackground(Color.blue);
		panel2.setBackground(Color.black);
		add(panel3);
		
		//----------------------------------Home Page Button Actions------------------------------
		login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Login log=new Login();
				log.setSize(400,260);
				log.setLocationRelativeTo(null);
				log.setVisible(true);
			}
			
		});
		
	}
	
	
	
	
	//-----------------------main Method-------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home home=new Home();
		home.setVisible(true);
		home.setSize(1000,700);
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.setTitle("WelCome to AB Bank");
		home.setLocationRelativeTo(null);
		home.setBackground(Color.BLUE);
		
		
		
		
		//home.setJMenuBar(mb);
		
	}

}
