package com.kodewala.hotstar;

import com.kodewala.hotstar.user.User;

public class Driver 
{

	public static void main(String[] args) {
		
		for (int i = 0; i < 109000; i++) { // 100 users are using the application
			User user = new User();
		}
		
		
		System.out.println(" Total live users are : "+ User.liveUserCount);
		
	}

}
