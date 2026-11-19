package com.kodewala.loops3;

public class Driver3 {

	public static void main(String[] args) {
		// 100k
		int[] numbers = { 10, -25, 35, -40, 55, -60, 75, -80, 95, -100, 15, -30, 45, -50, 65, -70, 85, -90, 20, -35 };
		
		// multiply +ve number by 10
		
		for(int index=0; index < numbers.length; index++)
		{
			int currentNumber  = numbers[index];
			
			if(currentNumber <0)
			{
				continue; // skip the current iteration
			}
			System.out.println(currentNumber*10); // biz --> 100 lines 
		}

	}

}
