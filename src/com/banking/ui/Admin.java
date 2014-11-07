package com.banking.ui;


import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

import com.banking.database.DBConnection;
import com.banking.model.SearchByUsername;
import com.sun.glass.events.KeyEvent;

public class Admin extends JFrame {
	
	public Admin()
	{		
		JMenuBar mb=new JMenuBar();    //adding menubar items
		
		JMenu file = new JMenu("Account"); 
		file.setForeground(Color.BLUE);
		mb.add(file);
		mb.setBackground(Color.WHITE);
		JMenu user = new JMenu("User");
		user.setForeground(Color.DARK_GRAY);
		mb.add(user);
		JMenu transaction = new JMenu("Transactions");
		transaction.setForeground(Color.BLUE);
		mb.add(transaction);
		JMenu view = new JMenu("View");
		view.setForeground(Color.DARK_GRAY);
		mb.add(view);
		JMenu others = new JMenu("Others");
		others.setForeground(Color.BLUE);
		mb.add(others);
		
		//common icon for MenuItem
		ImageIcon imgCommon = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\logout.gif");
		ImageIcon imgSearch = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\Search.gif");
		ImageIcon imgExit = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\exit.gif");
		ImageIcon imgUpdatePass = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\updatePass.gif");
		ImageIcon imgNew = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\new.gif");
		ImageIcon imgAll = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\all.gif");
		ImageIcon imgTransfer = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\transfer.gif");
		
		
		//adding menuItem to menu 

		//-->>adding MenuItem to menu Account
		JMenuItem newAccount= new JMenuItem("New Account"); //adding menuItem for File
		newAccount.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		newAccount.setIcon(imgNew);
		JMenuItem searchAccount= new JMenuItem("Search/Update Account"); //adding menuItem for File
		searchAccount.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		searchAccount.setIcon(imgSearch);
		JMenuItem allAccount = new JMenuItem("All Customers");
		allAccount.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		allAccount.setIcon(imgAll);
		
		
		file.add(newAccount);
		file.add(searchAccount);
		file.add(allAccount);	
		
		//-->>adding menuItem to User menu

		//adding MenuItem to menu Account
		JMenuItem newUser= new JMenuItem("New User"); //adding menuItem for File
		newUser.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		newUser.setIcon(imgNew);
		JMenuItem searchUser= new JMenuItem("Search/Update User"); //adding menuItem for File
		searchUser.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		searchUser.setIcon(imgSearch);
		JMenuItem allUser = new JMenuItem("All Users");
		allUser.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		allUser.setIcon(imgAll);
		
		
		user.add(newUser);
		user.add(searchUser);
		user.add(allUser);
		
		//-->>adding menuItem to menu : Transaction
		JMenuItem deposite = new JMenuItem("Deposite");
		deposite.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		deposite.setIcon(imgCommon);
		JMenuItem withdraw = new JMenuItem("Withdraw");
		withdraw.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
		withdraw.setIcon(imgCommon);
		JMenuItem transfer = new JMenuItem("Transfer");
		transfer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
		transfer.setIcon(imgTransfer);
		
		transaction.add(deposite);
		transaction.add(withdraw);
		transaction.add(transfer);
		
		//-->>adding JmenuItem to Menu : view
		ImageIcon imgBar = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\Bars.gif");
		JMenuItem balanceSheet = new JMenuItem("Balance Sheet");
		balanceSheet.setIcon(imgBar);
		
		view.add(balanceSheet);
		
		//-->>adding menuitem to menu "others"
		
		ImageIcon imgLogout = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\logout.gif");
		JMenuItem logout = new JMenuItem("logout");
		logout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
		logout.setIcon(imgLogout);
		others.add(logout);
		JMenuItem resetPassword = new JMenuItem("Change Password");
		resetPassword.setIcon(imgUpdatePass);
		resetPassword.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
		others.add(resetPassword);
		JMenuItem exit2 = new JMenuItem("Exit");
		exit2.setIcon(imgExit);
		exit2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
		others.add(exit2);
		
		//-->>adding menu item to menu "Transaction"
		
		
		
		setJMenuBar(mb);
		
		//adding action to the menuItems
		newAccount.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					dispose();
				}
		});
		
		
		//-->>adding action to menu "Others"
		///adding action to menuItem "logout"
		logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				Login adminLogin = new Login();
				adminLogin.setSize(400,200);
				adminLogin.setLocationRelativeTo(null);
				adminLogin.setVisible(true);
			}
			
		});
		
		//adding action to menuItem "Exit2"
		exit2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		//adding action to menuItem "Reset Password"
		resetPassword.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		
		
		
		//panels(1,2,3)-------------------------------------------*******************--------------------------------
		
		JPanel panel1= new JPanel();
		panel1.setLayout(new GridLayout(3,1));
		JPanel panel2= new JPanel();
		panel2.setLayout(new GridLayout(1,1));
		JPanel panel3= new JPanel();
		panel3.setLayout(new BorderLayout(1,2));
		
		
		JButton search = new JButton("Search & Edit");
		search.setSize(50, 50);
		search.setBackground(Color.WHITE);
		search.setForeground(Color.BLUE);
		JButton registration= new JButton("Account Transaction");
		registration.setSize(10, 20);
		registration.setBackground(Color.WHITE);
		registration.setForeground(Color.BLUE);
		JButton about = new JButton("Admin Panel Help");
		about.setSize(50, 50);
		about.setBackground(Color.WHITE);
		about.setForeground(Color.BLUE);
		
		//adding components to panel1(right side panel)
		panel1.setBackground(Color.BLUE);		
		panel1.add(search);
		panel1.add(registration);
		panel1.add(about);
		
		///////////call search class by the admin search button
		search.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				SearchByUsername obj = new SearchByUsername();
				obj.setSize(400, 400);
				obj.setVisible(true);
				obj.setLocationRelativeTo(null);								
			}
			
		});
		
		
		
		ImageIcon img = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\admin.jpg");
		JLabel label1=new JLabel(img);
		panel2.add(label1);
		panel2.setBackground(Color.WHITE);
		add(panel1);
		panel3.add(panel1,BorderLayout.EAST);
		panel3.add(panel2,BorderLayout.CENTER);
		add(panel3);
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin home=new Admin();
		home.setVisible(true);
		home.setSize(700,500);
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.setTitle("Admin Panel");
		home.setLocationRelativeTo(null);
		
		
		
		
		
		//home.setJMenuBar(mb);
		
	}

}
