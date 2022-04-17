package com.testNG_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Practice {
	
	@BeforeTest
	private void browse_Launch() {
		
		System.out.println("Browse launch");

	}
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");

	}
	
	@BeforeClass
	private void getUrl() {
		System.out.println("url");

	}
	
	@Test
	private void women() {
		System.out.println("women");

	}
	@BeforeMethod
	private void signin() {
		System.out.println("signin");

	}
	@AfterMethod
	private void signout() {
		System.out.println("signout");

	}
	@Test
	private void children() {
		System.out.println("chidren");

	}
	
	@AfterClass
	private void verify_homepage() {
		System.out.println("assert");

	}
	@AfterTest
	private void close() {
		System.out.println("close");

	}
	@AfterSuite
	private void deleteallcookies() {
		System.out.println("Delete All Cookies");

	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
