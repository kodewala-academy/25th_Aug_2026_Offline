package com.kodewala.oops.inheritance3;

class Account
{
	public void openAccount(String userId, String email) // X --> X+1
	{
		System.out.println("Account.openAccount()");
	}
}

class SavingAccount extends Account
{
    @Override  // changing the super class method's functionalities.
	public void openAccount(String userId, String email)
	{
		System.out.println("SavingAccount.openAccount()");
	}
}
class SrCitAccount extends SavingAccount
{
	@Override
	public void openAccount(String userId, String email)
	{
		System.out.println("SrCitAccount.openAccount()");
	}
}
class PensionAccount extends SrCitAccount
{
	@Override
	public void openAccount(String userId, String email)
	{
		System.out.println("PensionAccount.openAccount()");
	}
}


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
