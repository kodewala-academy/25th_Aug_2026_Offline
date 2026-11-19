package com.kodewala.strings1;

public class Driver {

	public static void main(String[] args) 
	{
		// Create a String Object
		String firstName = "Kodewala"; // Obj created in SCP -->firstName's address --> xyz321
        String lastName = "Kodewala";  // Object with content "Kodewala" already created
                                       // and lastName will refer to existing object.
                                       // lastName is also pointing to address xyz321
        
	//	String city = new String("Bangalore");
        
        System.out.println(firstName == lastName); // == will compare the address of an object
        
        
	}

}
