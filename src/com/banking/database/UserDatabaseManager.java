package com.banking.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.banking.model.User;



public class UserDatabaseManager {
	Connection connection;
	Statement statement;
	public User readUserFromDatabse(String name,String password)
	{
		User user=new User();
		initConnection();
		String sql;
		sql="SELECT * FROM user WHERE name='"+name+"' and password='"+password+"\'";
		
		System.out.println(sql);
		try {
			ResultSet result=statement.executeQuery(sql);
			int i=1;
			
			if(!result.first()) {
				user.setName("invalid");
				user.setId(0);
				user.setPassword("invalid");
				user.setEmail("invalid");
				
			}
			else {
				
				 user.setName(result.getString(i++));
				 user.setPassword(result.getString(i++));
				 user.setId(result.getInt(i++));
				 user.setEmail(result.getString(i++));
				
			}
			
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return null;
	}
	
	public User[] getListOfAllUserFromDatabse()
	{
		return null;
	}
	
	public void insertUserIntoDatabse(User user)
	{
		
	}
	
	private void initConnection()
	{
		connection=new DatabaseConnection().getConnection();
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void closeConnection()
	{
		
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	//testing with main function 
	/*
	public static void main(String args[])
	{
		String name= "hasan";
		String pass="12345";
		 
		UserDatabaseManager obj1 = new UserDatabaseManager();
		User user1=obj1.readUserFromDatabse(name,pass);
		System.out.println(user1.getEmail());
		
		
	}*/
}
