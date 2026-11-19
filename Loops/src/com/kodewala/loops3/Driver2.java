package com.kodewala.loops3;

public class Driver2 {

	public static void main(String[] args) {
		// 100k cities

		String[] cities = { "Lucknow", "Patna", "Mumbai", "Delhi", "Hyderabad", "Surat", "Kolkata", "Hyderabad",
				"Jaipur", "Lucknow", "Chandigarh", "Bhopal", "Bangalore", "Surat", "Bangalore", "Coimbatore", "Mysore",
				"Kochi", "Bangalore", "Patna" };

		// find if Bangalore is part of the list or not

		for(int index=0; index < cities.length; index++)
		{
			String currentCity = cities[index];
			if(currentCity.equals("Bangalore"))
			{
				System.out.println(" Bangalore is the part of city list");
				break; // break the loop --> you will come out of the loop
			}
		}
		
	}

}
