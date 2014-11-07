package com.banking.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;

public class SelectAllFromTable {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	private ResultSetMetaData metaData;
	
	public SelectAllFromTable(String tableName)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JAVA","root","");
	         st = con.createStatement();
	         
		}catch(Exception ex){
			System.out.println("Database Connection Error : "+ex);
		}
		
		try{
		String query = "Select * from "+tableName;
		rs=st.executeQuery(query);
		rs.next();
		
		metaData=(ResultSetMetaData) rs.getMetaData();
	
		//counting rows
		int rows=rs.getRow();
		
		//System.out.println("Rows "+rows);
		///counting total number of columns
		
		int columns = metaData.getColumnCount() ;
		String columnName[] = new String[columns];
		String fieldContent[][] = new String[rows][columns];
		
		//assigning column name 
		for(int i=1;i<=columns;i++)
		{
			
			columnName[i-1]=metaData.getColumnLabel(i);
			//System.out.println(columnName[i-1]);
		}
		
		
		for(int j=0;j<rows;j++)
		{
			for(int i=1;i<=columns;i++)
				{
					System.out.println(" c "+columnName[i-1]);
					String str=rs.getString(columnName[i-1]);
					//fieldContent[j][i-1]=
					System.out.print(str+" : ");
					
				}
			System.out.println();
		}
		
		}catch(Exception ex)
		{
			System.out.println("Query execution Error : "+ex);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectAllFromTable obj = new SelectAllFromTable("customers");
		
		
	}

}
