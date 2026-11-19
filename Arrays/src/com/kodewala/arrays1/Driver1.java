package com.kodewala.arrays1;

/**
 * Demonstrates the creation, initialization, and traversal of a String array.
 * 
 * <p>
 * This program stores city names in an array and identifies cities
 * whose names start with the character {@code 'S'}.
 * </p>
 *
 * @author Suresh
 * @since 1.0
 */
public class Driver1 {

	public static void main(String[] args) {
       
		// create an array which will store city  name --> "Bangalore" , "Chennai"
         
		String cities[] = new String[7];
       
		// Storing the cities
		cities[0] = "Bangalore";
		cities[1] = "Chennai";
		cities[2] = "Srinagar";
		cities[3] = "Mumbai";
		cities[4] = "Delhi";
		cities[5] = "Surat";
		cities[6] = "Simla";
		
		for(int index=0; index < cities.length; index++ )
		{
			if(cities[index].startsWith("S"))
			{
				System.out.println(" City starting with 'S' : "+cities[index]);
			}
		}
	}

}
