package com.testNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Annotation_Transformer {
	
	@Test(priority = -1)
	private void username() {

		String expected_username = "Starc123" ;
				
		String actual_username = "Starc";
		
        Assert.assertEquals(actual_username, expected_username);
	}
	
	@Test
	private void password() {

		String expected_password = "bala123";
		
		String actual_password = "bala";
		
		Assert.assertEquals(actual_password, expected_password);
		
	}

}
