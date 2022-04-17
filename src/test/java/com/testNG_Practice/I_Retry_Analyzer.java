package com.testNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Retry_Analyzer {
	
	@Test(retryAnalyzer = Retry_Class.class)
	private void username() {

		String expected_username = "Starc123" ;
				
		String actual_username = "Starc";
		
        Assert.assertEquals(actual_username, expected_username);
	}

}
