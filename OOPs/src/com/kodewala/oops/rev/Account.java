package com.kodewala.oops.rev;

public class Account {
	private int balance;
    
	public final int MAX_TXN_AMT_IN_24_HRS=100000;
    
	// this method will modify the balance
	public   void credit() {
		// check the balance of sender
		checkBalance();
		// check the pin of sender
		validatePin("tghf43");
		// debit the amount
		// credit the amount --> 0 ---> 100
		System.out.println("Account.credit()... doing fund transfer..");
		
	}

	private int checkBalance() {
		System.out.println("Account.checkBalance()");
		return 2000;
	}

	private boolean validatePin(String userId) {
		System.out.println("Account.validatePin()....");
		return true;
	}
}


