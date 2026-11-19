package com.kodewala.oops.overriding1;

public class Account 
{
   int minBalance=10000;
   
   public String openAccount(String name, int initBal)
   {
	   // Some ... 100 lines of code --> X
	   System.out.println("Account.openAccount()...........");
	   return "some string";
   }
}


class SavingAccount extends Account
{
	// 1.	Method name should be same.
	// 2.   Type, Order and Number of args should be same
	// 3.   Return type should be same except covariant 
	// 4.   4.	Access modifier --> should be same or widen(public --> public , 
	//          protected --> protected or public )
    @Override // you are telling compiler that- i am overriding the method. please check all the rules.
    public String openAccount(String _name, int _initBal)
	{
		// 200 lines of the code --> X+1
		System.out.println("SavingAccount.openAccount()................");
		return "some other string";
	}
	
}
