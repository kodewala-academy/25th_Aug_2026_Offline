package com.kodewala.oops.polymorphism1;

public class Driver1 {

	public static void main(String[] args) 
	
	{
		

	}
	 // will return any type of object(Person, Account, String, User, Delivery)
	public Object getObject(String type)
	{
		 Object obj = new Account();
		return obj;
	}
	
	// UC-1 --> acc  --> Object obj = new Account(); --> Account acc = (Account) obj --> (parent);

}
