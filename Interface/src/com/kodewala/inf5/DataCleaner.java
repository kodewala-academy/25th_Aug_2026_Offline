package com.kodewala.inf5;

public class DataCleaner 
{
   public void clean(Object obj) // Object obj = new User();
   {
	   if(obj instanceof Cleanable)
	   {
		   System.out.println("Allowed to perform the data cleaning!!!");
		   // 100 lines ......
	   }
	   else
	   {
		   System.err.println(" Not Allowed to perform cleaning activity!!!");
	   }
   }
}
