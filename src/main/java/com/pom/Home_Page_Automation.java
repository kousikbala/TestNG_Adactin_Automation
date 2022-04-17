package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Automation {
	
	public WebDriver driver;   // --------> null
	
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement signin_btn ;

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	private WebElement signout_btn;
	
	
	
	public WebElement getSignout_btn() {
		return signout_btn;
	}



	public Home_Page_Automation(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin_btn() {
		
		return signin_btn;
	}
	
	

	}

