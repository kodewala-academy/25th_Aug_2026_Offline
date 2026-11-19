package com.kodewala.loops3;

import java.util.Scanner;

public class Driver {
	// between 0 to 100
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int luckyNumber = 13;
		int userEntered = 0;

		while (luckyNumber != userEntered) // if this is true then only loop will be executed
		{
          System.out.println(" Please enter the number...");
          userEntered = sc.nextInt();
          
          if(userEntered == luckyNumber)
          {
        	  System.out.println(" You won!!!!");
          }
          else
          {
        	  System.err.println(" Please try again...");
          }
		}
	}

}
