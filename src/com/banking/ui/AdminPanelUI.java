package com.banking.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.*;

public class AdminPanelUI extends JFrame{
	
	public AdminPanelUI()
	{
		//Menu bar
				JMenuBar mb = new JMenuBar();
				
				//JMenuBar menu 
				JMenu menuAccount = new JMenu("Account");
				menuAccount.setForeground(Color.BLUE);
				mb.add(menuAccount);
				JMenu menuUser = new JMenu("User");
				mb.add(menuUser);
				JMenu menuTransaction = new JMenu("Transaction");
				menuTransaction.setForeground(Color.BLUE);
				mb.add(menuTransaction);
				JMenu menuView = new JMenu("View");
				mb.add(menuView);
				JMenu menuOthers = new JMenu("Others");
				menuOthers.setForeground(Color.BLUE);
				mb.add(menuOthers);				
				mb.setBackground(Color.WHITE);
				setJMenuBar(mb);
				
				
				//common icon for MenuItem
				ImageIcon imgCommon = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\logout.gif");
				ImageIcon imgSearch = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\Search.gif");
				ImageIcon imgExit = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\exit.gif");
				ImageIcon imgUpdatePass = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\updatePass.gif");
				ImageIcon imgNew = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\new.gif");
				ImageIcon imgAll = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\all.gif");
				ImageIcon imgTransfer = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\transfer.gif");
				
				
				
				///adding menu item to menu 
				
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
				
				
				menuAccount.add(newAccount);
				menuAccount.add(searchAccount);
				menuAccount.add(allAccount);
				
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
				
				
				menuUser.add(newUser);
				menuUser.add(searchUser);
				menuUser.add(allUser);
				
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
				
				menuTransaction.add(deposite);
				menuTransaction.add(withdraw);
				menuTransaction.add(transfer);
				
				//-->>adding JmenuItem to Menu : view
				ImageIcon imgBar = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\Bars.gif");
				JMenuItem balanceSheet = new JMenuItem("Balance Sheet");
				balanceSheet.setIcon(imgBar);
				
				menuView.add(balanceSheet);
				
				//-->>adding menuitem to menu "others"
				
				ImageIcon imgLogout = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\logout.gif");
				JMenuItem logout = new JMenuItem("logout");
				logout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
				logout.setIcon(imgLogout);
				menuOthers.add(logout);
				JMenuItem resetPassword = new JMenuItem("Change Password");
				resetPassword.setIcon(imgUpdatePass);
				resetPassword.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
				menuOthers.add(resetPassword);
				JMenuItem exit2 = new JMenuItem("Exit");
				exit2.setIcon(imgExit);
				exit2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
				menuOthers.add(exit2);
				
				////main panel
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
				
				
				ImageIcon img = new ImageIcon("D:\\programming\\Java_windows\\git\\BankingMangementSystem\\src\\images\\admin.jpg");
				JLabel label1=new JLabel(img);
				panel2.add(label1);
				panel2.setBackground(Color.WHITE);
				add(panel1);
				panel3.add(panel1,BorderLayout.EAST);
				panel3.add(panel2,BorderLayout.CENTER);
				add(panel3);
	}
	
	public AdminPanelUI(String name,int id,String pass,String email)
	{
		
		
		
		System.out.println(name);
		System.out.println(pass);
		System.out.println(id);
		System.out.println(email);
		
			
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminPanelUI adminUI = new AdminPanelUI();
		adminUI.setTitle("Admin Panel");
		adminUI.setSize(300, 200);
		adminUI.setVisible(true);
		adminUI.setLocationRelativeTo(null);
		adminUI.setSize(800, 600);
	}

}
