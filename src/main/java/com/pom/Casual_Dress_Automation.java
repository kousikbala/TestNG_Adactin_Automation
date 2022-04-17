package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dress_Automation {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	               
	private WebElement dress3;
	
	@FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
	               
	private WebElement casuldrs;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	private WebElement printdrs3;
	
	@FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
	private WebElement addqnty;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	private WebElement addcard;

	
	
	 public Casual_Dress_Automation (WebDriver driver2) {
			
			this.driver = driver2;
			
			PageFactory.initElements(driver, this);
	   }
	
	
	
	public WebElement getDress3() {
		return dress3;
	}

	public WebElement getCasuldrs() {
		return casuldrs;
	}

	public WebElement getPrintdrs3() {
		return printdrs3;
	}

	public WebElement getAddqnty() {
		return addqnty;
	}

	public WebElement getAddcard() {
		return addcard;
	}
	
	
	
	

}
