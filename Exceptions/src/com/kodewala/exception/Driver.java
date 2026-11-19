package com.kodewala.exception;

class Account {

}

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main().. START");

		String name = args[0];

		int marks = Integer.parseInt(args[1]);

		System.out.println(name);
		System.out.println(marks);

		int amount = 100;
		int part = 0;
		int total = amount / part;

		System.out.println(total);

		Account account = null;

		System.out.println(name);
		// System.out.println(address);
		// String name = null; // This may be null ?

		// name.length() --> performing operation on name and
		// calculating the total length
		// System.out.println(account.hashCode()); // 8 --> name.whatever() --> Exit

		System.out.println(" TO-DO....");
		System.out.println(" TO-DO....");
		System.out.println(" TO-DO....");
		System.out.println(" TO-DO....");
		System.out.println("Driver.main().. END");
	}

}
