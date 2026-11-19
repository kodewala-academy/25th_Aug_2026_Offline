package com.kodewala.oops;

// This class is not well encapsulated
public class Payment {
	private int balance; // Data or Variable --> other classes can change this variable w/o your(Payment) class permission

	public Payment(int balance) 
	{
		super();
		this.balance = balance;
	}
	
	// setter 
	public void doDebit(int _amount)
	{
		// Modifying the data
		this.balance = this.balance - _amount;
	}
	
	public void doCredit(int _amount) // allow to change the data with controlled access.
	{
		if(_amount >0) {
		// Modifying the data
		balance = balance + _amount;
		}
	}
	
	public int getBalance()
	{
		return balance;
	}

}
