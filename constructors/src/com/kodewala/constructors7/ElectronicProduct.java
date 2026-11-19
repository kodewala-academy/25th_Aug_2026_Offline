package com.kodewala.constructors7;

public class ElectronicProduct extends Product 
{
    int warranty;
    
	public ElectronicProduct(String _name, int _price, String _productId, int _warrany) 
	{
		// super
          super(_name, _price, _productId); // init the default fields
          this.warranty= _warrany;
	}

}
