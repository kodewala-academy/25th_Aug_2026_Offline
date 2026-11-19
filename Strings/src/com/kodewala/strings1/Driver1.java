package com.kodewala.strings1;

class User {
	String firstName;

	public User(String firstName) {
		super();
		this.firstName = firstName;
	}

	
	
}

public class Driver1 {

	public static void main(String[] args) {

		String city1 = "Bangalore"; // one Object created --> abc123
		
		city1 = "Pune";

		String city2 = "Bangalore"; // use the existing --> abc123

		String city3 = "Bangalore"; // use the existing --> abc123

		String city4 = "Bangalore"; // use the existing --> abc123

		String city5 = "Bangalore"; // use the existing --> abc123

		// System.out.println(city1 == city2);

		System.out.println(city1.equals(city2)); //

		User user1 = new User("Kodewala");
		User user2 = new User("Kodewala");
		
		System.out.println(user1.equals(user2)); // 
	}

}
