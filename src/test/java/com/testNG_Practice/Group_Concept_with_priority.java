package com.testNG_Practice;

import org.testng.annotations.Test;

public class Group_Concept_with_priority {
	
	@Test(priority = 1,groups = "books")
	 private void books() {
		 
		System.out.println("Books");

	}
	
	@Test(priority = 5,groups = "social media")
	private void whatsapp() {
		
		System.out.println("whatsapp");

	}
	
	@Test(priority = 7,groups = "social media")
	private void instagram() {
		
		System.out.println("instagram");

	}
	@Test(priority = -1,groups = "music")
	private void spotify() {
		
		System.out.println("Spotify");

	}
	@Test(priority = -2,groups = "music")
	private void wynkMusic() {
      
		System.out.println("wynk music");

	}
 

}
