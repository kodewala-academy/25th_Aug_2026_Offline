package com.kodewala.constructors3;

class SuperUser  extends Object
{
	
}


public class User extends SuperUser  
{
	String userName; // state / data / variables / attributes 
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) 
	{
	   this(300); // calling same class(User) constructor   
       this.userId=_userId;
       this.userName=_userName;
       this.mobile = _mobile;
	}
	
	User(int age)
	{
		System.out.println(" User() ..no arg");
	}
	
}
