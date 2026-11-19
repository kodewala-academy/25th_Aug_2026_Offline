package com.kodewala.oops.polymorphism1;

class User
{
	
}

class AdminUser extends User // AdminUser IS-A type of User
{
	
}

class FinanceUser extends AdminUser
{
	
}

public class Driver 
{

	public static void main(String[] args) 
	{

		User u1 = new User(); // User class is referring User class object.	
		AdminUser au1 = new AdminUser();
		
		
		User au2 =(User) new AdminUser(); // Parent class can refer child class object --> auto up-casting
		
		Object au3 = new FinanceUser();
		
		
		AdminUser au = (AdminUser) new User(); // Child class is referring parent class object --> down casting
	}

}
