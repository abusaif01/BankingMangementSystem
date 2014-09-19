package com.banking.model;

public class Account {

	private String account_name;
	private int account_number;
	public double balance;
	
	//conventional getter and setter 
	
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//account methods
	public double creditMoney(double credit)
		{
			this.balance=this.balance+credit;
			return this.balance;
		}

	public double debitMoney(double debit)
		{
			this.balance-=debit;
			return this.balance;
					
		}
	public double displayBalance()
	{		
		return this.balance;
	}
	
}
