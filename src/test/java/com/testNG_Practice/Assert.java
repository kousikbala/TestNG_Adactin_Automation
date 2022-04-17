package com.testNG_Practice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {    //heard assert - validation
	
	@Test
	private void username() {        //heard assert - validation
		
		String Exp_username = "Starc";
		
		String Actual_username = "Starc123";

		assertEquals(Actual_username, Exp_username);
		
		System.out.println("Assert validation");
		
		
	}
	
	@Test
	private void user() {

        String Exp_username = "Starc";
		
		String Actual_username = "Starc123";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(Actual_username, Exp_username);

		System.out.println("soft Assert validation");
	}
	

} 




