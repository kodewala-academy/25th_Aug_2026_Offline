package com.kodewala.control.flow2;

public class Driver {

	public static void main(String[] args) 
	{
		Driver driver = new Driver();
		
		int day = Integer.parseInt(args[0]); // command line input and parsing it 
		
		driver.identifyDay(day);
	}

	// Identify the day based on the number supplied
	public void identifyDay(int number) {
		switch (number) {
		case 1:
			System.out.println("MON");
			break;
		
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("TH");
			break;
		case 5:
			System.out.println("FR");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 7:
			System.out.println("SUN");
			break;
		default:
			System.out.println(" Unknown Day!! Please provide right input[1-7]");
			break;
		}
	}
}
