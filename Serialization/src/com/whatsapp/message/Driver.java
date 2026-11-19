package com.whatsapp.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

		
		
		Message message = new Message("MSG1", "mujhe kyu message kar rahe ho", "User1234");
		
		MessageSerialization messageSerialization = new MessageSerialization();
		messageSerialization.serializeMsg(message);

	}

}
