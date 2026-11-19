package com.whats.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatsapp.message.Message;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Suresh\\OneDrive\\Desktop\\Academy\\workspaces\\25th_Aug_2026_Offline\\Serialization\\message.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Message message = (Message) ois.readObject();

		System.out.println("De Ser :  " + message.getMessage() +" and user id "+message.getUserId());
	}

}
