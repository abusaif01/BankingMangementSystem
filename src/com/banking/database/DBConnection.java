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
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JAVA","root","");
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
		
		String name=rs.getString("name");
		
		
		System.out.println("\n\n\n\n "+name);
		
		}catch(Exception ex){
			System.out.println("Error 2: "+ex);
		}
		
		
	}
	
	
	public static void main(String args[])
	{
		DBConnection obj = new DBConnection();
		obj.getData();
	}
}

	
