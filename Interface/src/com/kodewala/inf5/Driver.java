package com.kodewala.inf5;

public class Driver {

	public static void main(String[] args) {
	
		User user = new User("KW1234", "Kodewala Academy");
		
		DataCleaner cleaner = new DataCleaner();
		
		// cleaning the user object...
		cleaner.clean(user);

	}

}
