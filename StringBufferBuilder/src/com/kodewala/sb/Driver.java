package com.kodewala.sb;

public class Driver {

	public static void main(String[] args) {

		StringBuilder sb0 = new StringBuilder("Kodewala"); // StringBuilder Object --> mutable

		StringBuilder sb1 = new StringBuilder("Kodewala"); //
		for (int i = 0; i < 10; i++) 
		{
		//	sb0.append(" Acadmey " + i); // same object is being modified. now new object created.
		}

		System.out.println(sb0.equals(sb1));

	}

}
