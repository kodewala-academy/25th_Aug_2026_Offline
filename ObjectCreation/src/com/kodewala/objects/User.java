package com.kodewala.objects;

public class User {
	String userName;
	String userId;
	String mobileNumber;

	// static block will get executed just after the class loading.
	static
	{
		System.out.println(" i am in static init block1");
	}
	
	static
	{
		System.out.println(" i am in static init block2");
	}
	
	static
	{
		System.out.println(" i am in static init block3");
	}
	
	public User(String userName, String userId, String mobileNumber) 
	{
		super(); // either super or this
		System.out.println("User.User(String userName, String userId, String mobileNumber).. Constructor");
		this.userName = userName;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}
	
	

}
