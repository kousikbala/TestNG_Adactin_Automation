package com.testNG_Practice;

import org.testng.annotations.Test;

public class Innocation_Count {
	
	@Test(priority = -1)
	private void browser_launch() {
		
		System.out.println("browser_launch");

	}
	@Test
    private void launch_url() {
	
	 System.out.println("launch_url");

}
	@Test(priority = 0,invocationCount = 3)
	private void refresh() {
		System.out.println("refresh");

	}
	@Test(priority = 2)
	private void Credential() {
		
		System.out.println("credential");
	}
	
}
