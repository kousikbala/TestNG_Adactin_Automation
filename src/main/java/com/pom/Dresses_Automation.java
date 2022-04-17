package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Automation {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresstype;
	
	@FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
	private WebElement evedress;

	public Dresses_Automation(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresstype() {
		return dresstype;
	}

	public WebElement getEvedress() {
		return evedress;
	}
	
	
	

}
