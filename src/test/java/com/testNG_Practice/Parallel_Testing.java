package com.testNG_Practice;

import org.testng.annotations.Test;

public class Parallel_Testing {      //multi threading
	
	@Test
	private void username() {

		System.out.println("username");
		
	}
	
	@Test
   private void password() {

	   System.out.println("password");
}

	
}
