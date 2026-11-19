package com.kodewala.strings6;

 class AccountMgmt // This class can not become parent.
{
	final int UPI_LIMIT = 100000; // Constant in java
	 
	public final  void doSomething1()
	{
		UPI_LIMIT = 200000; // able to change the values
	}
	/*
	 * public void doSomething2() { // some func...... andriod }
	 */
}

class Account extends AccountMgmt
{

	
	private final void doSomething2()
	{
		
	}
	public final void doSomething2(String s)
	{
		
	}
	 final void doSomething2(String s, int a)
	{
		
	}
}


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
