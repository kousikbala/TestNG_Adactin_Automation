package com.testNG_Practice;

import org.testng.annotations.Test;
 

public class Group_Concept {
	
	@Test(groups = "Books")
	 private void books() {
		 
		System.out.println("Books");

	}
	
	@Test(groups = "social media")
	private void whatsapp() {
		
		System.out.println("whatsapp");

	}
	
	@Test(groups = "social media")
	private void instagram() {
		
		System.out.println("instagram");

	}
	@Test(groups = "music")
	private void spotify() {
		
		System.out.println("Spotify");

	}
	@Test(groups = "music")
	private void wynkMusic() {
       
		System.out.println("wynk music");

	}

}
