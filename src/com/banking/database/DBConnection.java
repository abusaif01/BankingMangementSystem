package com.banking.database;

import java.sql.*;


public class DBConnection {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnection()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(null,"root","");
            st = con.createStatement();
			
		}catch(Exception ex){
			System.out.println("Error : "+ex);
			
		}
	
	}

	private void getData() {
		// TODO Auto-generated method stub
		try{
		String query="Select * from customers";
		
		
		rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("name");
		
		}catch(Exception ex){
			System.out.println("Error 2: "+ex);
		}
		
		
	}
	
	private String adminName;
	private String adminPassword;
	private ResultSet rsa;
	
	public boolean checkAdminLogin(String name,String pass)
	{
		try {
			String query="Select * from admins";
			rsa=st.executeQuery(query);
			
			while(rsa.next())
			{
				String adminNameDatabase=rsa.getString("name");
				String adminPassDatabase=rsa.getString("password");
				
				//display test
				System.out.println("admin :: "+adminNameDatabase+" "+adminPassDatabase);
				System.out.println("Given :: "+name+" "+pass);
				
				if((name.equals(adminNameDatabase)) && (pass.equals(adminPassDatabase)))
				{
					return true;
				}
			}
			
			//String adminName=rsa.getString("name");
			
			//System.out.println("name ::: "+adminName);
		}catch(Exception ex)
		{
			System.out.println("Admin Login Error : "+ex);
		}
		return false;
	}
	
	////search option with username -------------------------------------------------**************************-------------------------------------------
	///giving result for namesearch
	public String customerName;
	public String customerEmail;
	public String customerPassword;
	public String customerId;
	public String customerBalance;
	
	public void searchName(String Username)
	{
		try{
			String query="Select * from customers where name=\'"+Username+"\'";
			rs=st.executeQuery(query);
			rs.next();
			customerName=rs.getString("name");
			customerEmail=rs.getString("email");
			customerPassword=rs.getString("password");
			customerId=rs.getString("id");
			customerBalance=(String)rs.getString("account balance");
			
		}catch(Exception ex)
		{
			System.out.println("Search Error :"+ex);
		}
		
	}
	
	public String getCustomerName()
	{
		if(customerName.equals(null)) return "not found";
		else return customerName;
	}
	
	public String getCustomerEmail()
	{
		return customerEmail;
	}
	
	public String getCustomerPassword()
	{
		return customerPassword;
	}
	
	public String getCustomerId()
	{
		return customerId;
	}
	
	public String getCustomerBalance()
	{
		return customerBalance;
	}

	
	public static void main(String args[])
	{
		DBConnection obj = new DBConnection();
		obj.getData();
		boolean tf;
		tf=obj.checkAdminLogin("rakib", "123456");
		//System.out.println(tf);
		obj.searchName("rakib hasan");
		
		
	}
}

	
