package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Purchase_Automation {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/div[2]/div[2]/form")
	private WebElement printeddrs;
	
	@FindBy(xpath = "(//a[@itemprop='url'])[2]")
	private WebElement more;
	
	@FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
	private WebElement quantity;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	private WebElement addtocard;

	public Dress_Purchase_Automation(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getPrinteddrs() {
		return printeddrs;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddtocard() {
		return addtocard;
	}
	
	

}
