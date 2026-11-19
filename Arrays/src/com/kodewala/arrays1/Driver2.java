package com.kodewala.arrays1;

public class Driver2 {

	public static void main(String[] args) {
		
		User user1 = new User("Kodewala", "987654321");
		User user2 = new User("Shubham", "87654323456");
		User user3 = new User("Sanjay", "0987654345678");
		User user4 = new User("Neha", "23456765432");
		User user5 = new User("Amir", "09876567654");
		
        // store user objects in an array.
		User users[] = new User[5];
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		users[4] = user5;
		
		System.out.println(users);
	}

}
