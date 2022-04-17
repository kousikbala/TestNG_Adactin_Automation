package com.testNG_Practice;

import org.testng.annotations.Test;


public class Priority_Concept {
	
	@Test(priority = -1)
	private void username() {
		
		System.out.println("username");

	}
	@Test
	private void password() {
		
		System.out.println("password");
		

	}
	@Test(priority = 1)
    private void login() {
		
		System.out.println("login");

	}

}
