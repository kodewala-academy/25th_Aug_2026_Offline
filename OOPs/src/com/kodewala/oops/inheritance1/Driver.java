package com.kodewala.oops.inheritance1;

class Employee
{
	String name="Amit";
	String address ="Bangalore";
	
	private String empCode="IC1234";
	
	public void markIn(String empId)
	{
		System.out.println(" Marking IN "+ empId);
	}
}

class Manager extends Employee // Manager IS-A Employee
{
	public void doSomething()
	{
		System.out.println(name); // using the parent class attributes
		System.out.println(address);
	//	System.out.println(empCode);
		markIn(address); // using the parent class method
	}
}


public class Driver {

	public static void main(String[] args) 
	{
		

	}

}
