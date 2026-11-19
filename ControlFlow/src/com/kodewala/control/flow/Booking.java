package com.kodewala.control.flow;

/**
 * This class is responsible for accepting booking from user.
 */
public class Booking {
	// More than 6 pax per PNR is not allowed.
	public String doBooking(String from, String to, int noOfPax) {
		String pnr = null;
		if (noOfPax > 6) // if true then only below code gets executed.
		{
			// Do not allow to book
			System.err.println(" As per IRCTC policy, only 6 pax are allowed per PNR");

		} else {
			// Confirming the Booking
			pnr = "3346789654";
			System.out.println(" confirming the booking : " + pnr);
			System.out.println(" Staus : CONFIREMD");
			System.out.println(" SEAT : 23 A1");
		}

		// ...
		// ...
		return pnr;
	}
}
