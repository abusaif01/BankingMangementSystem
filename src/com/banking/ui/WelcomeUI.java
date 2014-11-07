package com.banking.ui;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class WelcomeUI extends JFrame {

	public WelcomeUI()
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
				ImageIcon img = new ImageIcon("D:\\programming\\Java_windows\\Test1\\src\\images\\ab.jpg");
				JLabel label1=new JLabel(img);
				panel2.add(label1);
				add(panel1);
				panel3.add(panel1,BorderLayout.EAST);
				panel3.add(panel2,BorderLayout.CENTER);
				panel1.setBackground(Color.BLUE);
				panel3.setBackground(Color.blue);
				panel2.setBackground(Color.black);
				add(panel3);
				
				
				///========Adding actions to the Buttons==========
				
	}
	
	
	public static void main(String agrs[])
	{
		WelcomeUI welcomePage = new WelcomeUI();
		welcomePage.setVisible(true);
		welcomePage.pack();
		welcomePage.setLocationRelativeTo(null);
	}
}
