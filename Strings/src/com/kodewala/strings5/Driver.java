package com.kodewala.strings5;

public class Driver {

	public static void main(String[] args) 
	{
	 String s1 = "This " + "is from" + " Kodewala Academy Bangalore";
	   
	 //  String s1 = "This is from Kodewala Academy Bangalore";
	   System.out.println(s1);
	   
	   
	   String s2 = "Kodewala"; // scp
	   String s10 = "Kodewala"; // scp
	   String s3 = "Acadmey"; // scp
	   
	   String s4 = s2 + s3; // heap   --> new StringBuulder();
	   System.out.println(s4);
	   
	   String s5 ="KodewalaAcadmey"; // scp
	   
	   System.out.println(s5 == s4.intern() ); // false
	   
	   

	}

}
