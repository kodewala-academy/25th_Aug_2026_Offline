package com.kodewala.exception;

public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Driver1.main() START");
		Driver1 driver1 = new Driver1();

		driver1.doSomething();
		System.out.println("Driver1.main() END");
	}

	public void doSomething() {
		System.out.println("Driver1.doSomething() START");
		String name = null;
        int amount=100;
		try {
			// Risky code --> code which may throw an exception.
			amount = amount/10; // AE 
			System.out.println(name.length()); // NPE -> not handled
			
			System.out.println(" After length()"); // Ignored
			// ....
		} catch (NullPointerException e) // This can catch Exception's object and its child objects
		{
			System.out.println(" Name is null....");
			e.printStackTrace();

		}
		catch (ArithmeticException e) // This can catch Exception's object and its child objects
		{
			System.out.println(" amount can not be / by zero");
			e.printStackTrace();
  
		}
		catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Driver1.doSomething() END");
	}

}
