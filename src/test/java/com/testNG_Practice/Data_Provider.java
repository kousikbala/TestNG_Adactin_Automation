package com.testNG_Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation_Project.Adactin_Runner;

public class Data_Provider {     
	
	@Test(dataProvider = "test_data")
	private void Adactin_Runner(String username, int password) {
		
        System.out.println("Username : " + username);
		
		System.out.println("Password : " + password);
		
	}
	
	@DataProvider
    private Object [] [] test_data() {
		
		return new Object [][] {
			
			{ "starc", 123},
			
			{ "smith", 2345},
			   
			{ "watson", 345}
			
	};
	
	}
	
	@Test(dataProvider = "test_data")
	
	private void automation_runner(String username, int password) {
		
		 System.out.println("Username in automatin : " + username);
			
			System.out.println("Password in automaton : " + password);
			
	}
	
}
	
	
	
	
	
	

