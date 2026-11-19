package com.kodewala.exception5;

public class AccountMgmt 
{
    void openAccount(String name, String address)
    {
    	System.out.println("AccountMgmt.openAccount() START");
    	
    	activateAccount("234567456");
    	
    	System.out.println("AccountMgmt.openAccount() END");
    }
    
    private void activateAccount(String accNo) 
    {
    	System.out.println("AccountMgmt.activateAccount() START");
   
    	checkAccountStatus(null);
   
    	System.out.println("AccountMgmt.activateAccount() END");
    }
    
    private boolean checkAccountStatus(String accNo)
    {
    	try 
    	{
    	accNo.startsWith("SBI"); // NPE --> Risky code 
    	}
    	catch (NullPointerException e) 
    	{
    		// throw --> create new exception object and throw it to the caller
		    throw new NullPointerException("something is null"); // checked --> must be handled at the time of compilation
	}
    // 10 lines 
    	return false;
    }
    
    
    
    
    
    
    
    
    
    
}
