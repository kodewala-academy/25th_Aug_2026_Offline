package com.kodewala.oops.inheritance2;

public class Driver {

	public static void main(String[] args) {

		Product product = new Product("Iphone", "This is iphone", 12, "In-Stock");

	//	product.viewProductDetails();

		ElectronicProduct electronicProduct = new ElectronicProduct("Iphone", "This is iphone", 12, "In-Stock", true,
				2);
		
		electronicProduct.viewElectronicProductDetails();
	}

}
