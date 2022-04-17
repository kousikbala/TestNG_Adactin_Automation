package com.testNG_Practice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters({"username", "password"})
	private void credentials( String username, String password) {
		
		System.out.println("Username : " + username);
		
		System.out.println("Password : " + password);
		
	}
	
	//optional
//	@Test
//	@Parameters({"username", "password"})
//	private void credentials(@Optional ("Smith") String username, String password) {
//		
//		System.out.println("Username : " + username);
//		
//		System.out.println("Password : " + password);
//		
	}

	
	
	
	



