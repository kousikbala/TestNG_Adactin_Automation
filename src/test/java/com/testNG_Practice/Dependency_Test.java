package com.testNG_Practice;

import org.testng.annotations.Test;

public class Dependency_Test {
	
	@Test
	private void mobile() {
		System.out.println("mobile");
	
	}
	
	@Test(dependsOnMethods = "watch")
	private void offer() {
		System.out.println("offer");

	}
	
	@Test
	private void watch() {
 
		System.out.println("watch");

	}

}
