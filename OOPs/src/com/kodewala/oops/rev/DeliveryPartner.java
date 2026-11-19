package com.kodewala.oops.rev;

/**
 * Represents a delivery partner responsible for handling
 * delivery-related operations.
 *
 * @author Suresh
 * @since 1.8
 */
public class DeliveryPartner extends Object
{
	/**
	 * Executes the delivery process by coordinating the necessary steps
	 * required to deliver the order to the customer.
	 *
	 * <p>This method contains the complete delivery workflow, including
	 * delivery processing and related business logic.</p>
	 *
	 * @implNote Contains the implementation of the delivery workflow.
	 */
	public void doDelivery() // 500 lines of code 
	{
		System.out.println("DeliveryPartner.doDelivery()");
	}
}

class XpressBee extends DeliveryPartner
{
	// can reuse here + can override the method of parent class
	@Override
	public void doDelivery() // 500 lines of code 
	{
		System.out.println("DeliveryPartner.doDelivery()");
	}
}

class EKart
{
	
}

