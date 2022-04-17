package com.testNG_Practice;

import org.testng.annotations.Test;

public class Timeout_Exception {
	
    @Test(timeOut = 8000)
	private void browser_Execution() throws Throwable {
    	
    	Thread.sleep(2000);              //browser launch
    	
    	System.out.println("Browser launch");
    	
    	Thread.sleep(1000);               //url
	
        System.out.println("url launch");
        
        Thread.sleep(2000);              //data entered in the field
        
        System.out.println("Credentials entered");
        
        Thread.sleep(1000);                //real static wait
        
        System.out.println("next page");
        
        
        
        
	}
	
	
	
}
