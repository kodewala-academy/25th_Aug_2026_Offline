package com.kodewala.oops;

public class Driver
{

	public static void main(String[] args) 
	{
		Payment payment = new Payment(1000);
        
		
		//  modifying the data...
		
		payment.doCredit(200);
		
		// directly modifying the data of payment class
		//payment.balance = 2000000; // changing the balance
	//	System.out.println(payment.balance);
		
		// reading the data...
		System.out.println(payment.getBalance());
	}

}
