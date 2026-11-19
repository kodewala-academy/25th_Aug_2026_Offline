package com.kodewala.constructors4;

class SuperUser  extends Object
{
	SuperUser(int a)
	{
	super(); // calling super class no args constructor
	// execute remaining steps if any
	//....
	}
}

public class User extends SuperUser {
	String userName;
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) {
		super(23); // calling super class constructor without arg.
		// first line of constructor is either super or this. If you are not writing super or this.
		// then compiler will consider super()
		this.userId = _userId;
		this.userName = _userName;
		this.mobile = _mobile;
	}

	
}
