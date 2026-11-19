package com.kodewala.constructors2;

public class Driver1 {

	public static void main(String[] args)
	{
		System.out.println("Driver1.main() START "); // log file 
		NotificationService notificationService = new NotificationService();
		
		notificationService.sendNotification("sms" , "98765432345678");
		notificationService.sendNotification("email", "kodewala@gmail.com");
		notificationService.sendNotification("other", "98654345678");
		
		System.out.println("Driver1.main() END "); // log file 
	}

}
