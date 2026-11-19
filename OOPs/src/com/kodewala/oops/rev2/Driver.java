package com.kodewala.oops.rev2;

public class Driver {

	public static void main(String[] args) {
		
		DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
		
		deliveryProcessor.processDelivery(new ShipRocket());
		
		
	}

}
