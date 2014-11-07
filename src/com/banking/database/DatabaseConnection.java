package com.banking.database;
import java.sql.*;


public class DatabaseConnection {
	//jdbc driver name and datavase url
	 //final String jdbc_driver = "com.mysql.jdbc.Driver";

	 public Connection getConnection(){
		 final String db_url = "jdbc:mysql://localhost/test";
		 final String user = "root";
		 final String pass = "";
		  Connection conn;
		  try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				System.out.println("Connecting to database....");
				
				conn = DriverManager.getConnection(db_url,user,pass);
					
				return conn;
			}catch(NumberFormatException e)
			  {
					
			  }
		    catch (ClassNotFoundException e)
			  {
					   
			  }
			  	catch(SQLException e)
			  {
			  		
			  }
		  	catch(Exception e){
			      e.printStackTrace();
			   }
		  
		 return null;
	 }
	
//	public static void main(String[] args){
//		
//		DatabaseConnection dbConnection=new DatabaseConnection();
//		Connection connection=dbConnection.getConnection();
//		Statement stmt;
//		try {
//			stmt = connection.createStatement();
//			String sql;
//			sql="SELECT customr_id,customer_name,account_no,amount FROM info";
//			ResultSet rs =stmt.executeQuery(sql);
//			while(rs.next()){
//				int id=rs.getInt("customr_id");
//				int amount=rs.getInt("amount");
//				String name=rs.getString("customer_name");
//				String account_no=rs.getString("account_no");
//				
//				System.out.println(id+" "+name+" "+" "+account_no+" "+amount);
//			
//			} 
//		}catch (SQLException e) {
//			e.printStackTrace();
//		
//		
//	}
//	
//	}
}
	
