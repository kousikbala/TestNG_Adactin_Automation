package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_Automation {
	
	public WebDriver driver; 
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	private WebElement sign_btn;

	public Login_page_Automation(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getsign_btn() {
		return sign_btn;
	}
	
	

}
