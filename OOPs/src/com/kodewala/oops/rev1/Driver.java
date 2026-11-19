package com.kodewala.oops.rev1;

class Delivery extends Object {

	public void doDeliver() {
		System.out.println("Delivery.doDeliver()..... Delivery");
	}

}

class ExpressBee extends Delivery {

	public void doDeliver() {
		System.out.println("ExpressBee.doDeliver()..... ExpressBee ");
	}
}

class EKart extends Delivery

{

	public void doDeliver() {
		System.out.println("EKart.doDeliver()..... EKart");
	}
}

public class Driver {
	public static void main(String[] args) {
//	 Delivery delivery = new Delivery(); // int amount = 100;

		// Compile time --> it will check the method in Delivery class
		// Runtime --> it will call the method of Delivery class
//	 delivery.doDeliver(); // Compile time --> 

		// Parent class can refer child class object
		Delivery delivery1 =(Delivery) new ExpressBee();
		// Compile --> it will check the method in Delivery class
		// runtime --> it will call the method of ExpressBee class
		delivery1.doDeliver();
		
		Delivery del = new ExpressBee();
		
		ExpressBee expressBee = (ExpressBee) del;
		expressBee.doDeliver();
		
		
		
	}

}
