package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page_Automation {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	private WebElement checkout1;
	
	@FindBy(xpath = "//*[@id=\"order_step\"]/li[1]/span")
	private WebElement summary;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement checkout2;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement proceed;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement checkout3;
	
	@FindBy(id ="cgv")
	private WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	private WebElement checkout4;

	public Checkout_page_Automation(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout1() {
		return checkout1;
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getCheckout2() {
		return checkout2;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getCheckout3() {
		return checkout3;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCheckout4() {
		return checkout4;
	}
	
	
	

}
