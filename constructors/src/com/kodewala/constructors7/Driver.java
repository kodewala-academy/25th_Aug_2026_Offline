package com.kodewala.constructors7;

public class Driver {

	public static void main(String[] args) {

		ElectronicProduct electronicProduct = new ElectronicProduct("Iphone", 180000, "PC001", 2);

		System.out.println(electronicProduct.name);
		System.out.println(electronicProduct.price);
		System.out.println(electronicProduct.productId);
		System.out.println(electronicProduct.warranty);
	}

}
