package com.banking.model;

public class User {

	private String customerName;
	private String customerPassword;
	private String customerId;
	private String customerEmail;
	//private String account_number;
	
	
	//constructor
	public User(String name,String password,String id,String email)
	{
		
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return this.customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerEmail() {
		return this.customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	//open acc and close acc
	public void openAccount()
	{
		
	}
	
	public void closeAccount()
	{
		
	}
	
	
	
}
